@tag
Feature: Booking Flight

  @smoke
  Scenario: Successful flight booking
    Given user is on the booking page
    When user enters flight details and submits
    Then booking confirmation message is displayed
