package com.example.saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;

public class AddToCartStepDefinitions extends Base {

    @Given("I am on the inventory page")
    public void i_am_on_the_inventory_page() {
        setUp();
        login();
    }

    @When("I add a bike light to the cart")
    public void i_add_a_bike_light_to_the_cart() {
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bike-light")));
        addToCartButton.click();
    }

    @Then("the bike light should be in the cart")
    public void the_bike_light_should_be_in_the_cart() {
        WebElement cartBadge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_badge")));
        assertTrue(cartBadge.isDisplayed());
        tearDown();
    }
}