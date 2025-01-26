package com.example.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\48794\\Desktop\\java.selenium.project\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void login() {
        driver.get("https://www.saucedemo.com/");
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();
        wait.until(ExpectedConditions.urlContains("/inventory.html"));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
