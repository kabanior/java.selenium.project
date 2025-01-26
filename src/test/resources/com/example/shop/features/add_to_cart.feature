Feature: Add items to cart in Sauce Demo Application

  Scenario: Add bike light to cart
    Given I am on the inventory page
    When I add a bike light to the cart
    Then the bike light should be in the cart