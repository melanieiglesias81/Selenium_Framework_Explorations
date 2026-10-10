# Selenium_Framework_Explorations

# Selenium Automation Framework

A robust and scalable test automation framework built using **Selenium WebDriver**. This repository contains the source code, setup instructions, and best practices for writing and executing automated UI tests.

https://www.selenium.dev/documentation

## 🚀 Key Features

* **Page Object Model (POM):** Enhances code maintainability and reduces duplication.
* **Cross-Browser Testing:** Supports Chrome, Firefox, Edge, and Safari.
* **Parallel Execution:** Speeds up test suites by running tests concurrently.
* **Detailed Reporting:** Generates comprehensive HTML test reports with screenshots on failure.
* **CI/CD Ready:** Configured for seamless integration with tools like Jenkins or GitHub Actions.

---

## 🛠️ Prerequisites

Before setting up the project, ensure you have the following installed on your system:

* **Language Runtime:** [Java JDK 11+](https://oracle.com) OR [Python 3.8+](https://python.org) *(Choose based on your framework language)*
* **Build Tool:** [Apache Maven](https://apache.org) *(For Java)* OR `pip` *(For Python)*
* **IDE:** [IntelliJ IDEA](https://jetbrains.com), [Eclipse](https://eclipse.org), or [VS Code](https://visualstudio.com)
* **Version Control:** [Git](https://git-scm.com)

---

## ⚙️ Installation & Setup

Follow these steps to get your local development environment up and running:

### 1. Clone the Repository
```bash
git clone https://github.com
cd your-repo-name
```

### 2. Install Dependencies

#### For Java (Maven)
If your framework uses Maven, run the following command to download all required dependencies specified in the `pom.xml`:
```bash
mvn clean install
```

#### For Python
If your framework uses Python, it is recommended to use a virtual environment:
```bash
# Create a virtual environment
python -m venv venv

# Activate the virtual environment
# On Windows:
venv\Scripts\activate
# On macOS/Linux:
source venv/bin/activate

# Install required packages
pip install -r requirements.txt
```

### 3. WebDriver Management
This framework utilizes **WebDriverManager** (or Selenium 4's built-in Manager). You **do not** need to manually download or set paths for `chromedriver` or `geckodriver`. The framework will automatically fetch the correct driver version matching your installed browser.

---

## 🏃 Running the Tests

You can trigger the test suites directly from your command line:

### Using Maven (Java)
```bash
# Run all tests
mvn test

# Run a specific test suite via testng.xml
mvn test -DsuiteXmlFile=testng.xml

# Run tests on a specific browser
mvn test -Dbrowser=firefox
```

### Using Pytest (Python)
```bash
# Run all tests
pytest

# Run tests and generate an HTML report
pytest --html=report.html

# Run tests on a specific browser
pytest --browser chrome
```

---

## 📁 Project Structure

```text
├── .github/workflows/    # CI/CD pipeline configurations
├── src/
│   ├── main/             # Framework utilities and Page Objects
│   │   └── java/pages/   # Page classes (UI selectors & actions)
│   └── test/             # Test scripts and test data
│       └── java/tests/   # Test cases
├── config/               # Environment configuration files (URLs, credentials)
├── reports/              # Test execution reports and screenshots (Generated)
├── pom.xml / req.txt     # Dependency management file
└── README.md             # Project documentation
```

---

## 📑 Reporting & Artifacts

* **HTML Reports:** Saved automatically in the `reports/` directory after every test run.
* **Screenshots:** If a test case fails, a screenshot is automatically captured and embedded into the HTML report for easier debugging.
