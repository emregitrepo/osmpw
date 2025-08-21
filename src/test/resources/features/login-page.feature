@login
Feature: Osmanli Yatirim Login Page

  @smoke
  Scenario: Open the login page
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code

