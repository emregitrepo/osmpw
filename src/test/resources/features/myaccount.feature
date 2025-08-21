@login
Feature: Osmanli Yatirim My Account Page

  @accountstatement
  Scenario: Scenarios for account statement
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click account statement
    And user should check if seven days filter is selected
    And user should click 2024 quick filter


  @taxmonitoring
  Scenario: Scenarios for tax monitoring
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click tax monitoring
    And user should check if vergi grubu is in filter options

  @comission
  Scenario: Scenarios for comission/ fund
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click comission page
    And check headers of the page