@regression
Feature: F01_Register | users could register with new accounts

  @smokeTest
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    And   user select gender type
    And   user enter first name and last name
    And   user enter date of birth
    And   user enter email
    And   user fills Password fields
    And   user clicks on register button
    Then  success message is displayed
