@tag
Feature: Login
  I want to use this template for my feature file

  @smoke
  Scenario: To verify login functionality of facebook
    Given User had launched the browser
    And Navigate to the valid url
    When User enters email ID and password credentials
    And User clicks on login button
    Then Error message should be displayed
