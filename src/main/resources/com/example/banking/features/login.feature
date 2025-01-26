Feature: Login to Banking Application

  Scenario: Successful login with valid credentials
    Given I open the login page
    When I enter valid username and password
    And I click the login button
    Then I should be redirected to the account overview