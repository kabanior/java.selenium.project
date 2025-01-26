package com.example.saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions extends Base {

    @Given("I open the Sauce Demo login page")
    public void i_open_the_sauce_demo_login_page() {
        setUp();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();
    }

    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected_to_the_inventory_page() {
        boolean isRedirected = wait.until(ExpectedConditions.urlContains("/inventory.html"));
        assertTrue(isRedirected);
        tearDown();
    }
}