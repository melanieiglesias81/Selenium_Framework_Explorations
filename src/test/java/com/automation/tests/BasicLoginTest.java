package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Sa Selenium 4+, awtomatiko nang inaayos ng driver ang sarili nitong executables
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://herokuapp.com");
    }

    @Test
    public void testValidLogin() {
        // Paghahanap sa Username field at pag-input ng data
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");

        // Paghahanap sa Password field at pag-input ng data
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        // Pag-click sa Submit/Login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        // Pag-verify ng tagumpay gamit ang TestNG Assertion
        WebElement successAlert = driver.findElement(By.id("flash"));
        String alertText = successAlert.getText();

        Assert.assertTrue(alertText.contains("You logged into a secure area!"),
                "MALI: Hindi tumugma o hindi lumabas ang login success message.");
    }

    @AfterMethod
    public void tearDown() {
        // Palaging isasara ang browser window pagkatapos ng test
        if (driver != null) {
            driver.quit();
        }
    }
}
