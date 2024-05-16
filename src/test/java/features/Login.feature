Feature: Login feature
  I want to use this template for login module

  @SmokeTest
  Scenario: Validate the login functionality using valid credentials
    Given user is on the home page
    When user clicks on login link 
    Then login component should be displayed
    When user enters username and password
    And clicks on submit button
    Then user should be logged in 

  @Regression
  Scenario Outline: Validate user registration process
		Given user is on the home page
    When user clicks on register link 
    Then registration page is displaed
    When user enters "<Firsname>" and "<Lastname>" and "<email>" and "<password>"

    Examples: 
     | Firsname| Lastname  | email             | password     |
     | Tony    |  Bruce    | Toni325@testng1.com| YouKnowMe111 |
     | Yuvaraj |  Singh    | yuvi12@testng1.com | YouKnowMe111 |
     | Surya   |  Kumar    | sky231@testng1.com | YouKnowMe111 |
