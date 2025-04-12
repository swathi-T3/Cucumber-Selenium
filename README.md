# Cucumber-Selenium Simple Form Automation Project
### Description : 
This project demonstrates the use of Cucumber, Selenium WebDriver, and TestNG to automate the form submission process on a simple form webpage. It follows the Behavior-Driven Development (BDD) methodology, utilizing Cucumber to define the test scenarios in Gherkin language and Selenium for the actual browser interactions.
<hr>

# Project Overview
The objective of the project is to automate filling and submitting a form on a webpage using the following technologies:
- Selenium WebDriver: Used for automating browser interactions.
- Cucumber (BDD): Used for writing test scenarios in Gherkin language.
- TestNG: Used for running and managing tests.
- Java: The primary programming language used for writing test code.
- Maven: Used for managing dependencies and building the project.
<hr>

# Simple Form Automation Project

This project automates the form submission on [Simple Form Page](https://v1.training-support.net/selenium/simple-form) using:

- **Selenium WebDriver**
- **Cucumber (BDD)**
- **TestNG**
- **Java**
- **Maven**

## Project Structure

    simple-form-bdd/
      ├── src/
      │   └── test/
      │       ├── java/
      │       │   ├── stepDefinitions/
      │       │   └── runners/
      │       └── resources/
      │           └── features/
      ├── pom.xml
      └── README.md
<hr>

## Tools Used

- Java 8+
- Maven
- Selenium WebDriver
- Cucumber JVM
- TestNG
- IntelliJ IDEA / Eclipse

## How to Run

1. **Install Dependencies**

Make sure Maven is installed, then run:

```mvn clean install```

2. **Run the Test**

You can run the test using TestNG:

```mvn test```

Or directly through the TestNG runner class.
<hr>

## Test Scenario

The test automates filling and submitting a simple form with:

- First Name
- Last Name
- Email
- Contact Number
 <hr>

 ## Feature File

 ```
Feature: Submit Simple Form

  Scenario: Submit the simple form with valid details
    Given User launches the simple form webpage
    When User enters First Name as "Swathi"
    And User enters Last Name as "Thoorpati"
    And User enters Email as "swathi@example.com"
    And User enters Contact Number as "1234567890"
    And User clicks on the Submit button
    Then Form should be submitted successfully
```
<hr>

## Conclusion


This project convey how to implement Behavior-Driven Development (BDD) using Cucumber and Selenium WebDriver with TestNG. It showcases a simple and effective approach to automate form submissions, helping build a strong foundation in BDD-based automation testing.





