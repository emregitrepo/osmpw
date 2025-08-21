@login
Feature: Osmanli Yatirim Term Page

  @termprofitlossreport
  Scenario: Scenarios for term profit and loss report
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click term profit and loss report
    And check if position status option is in filters


  @termstatement
  Scenario: Scenarios for term profit and loss report
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click term statement
    And user should check if seven days option is selected by default
    And click 2024 quick filter option
    And check table if number of contracts option is in column

  @termorderentry
  Scenario: Scenarios for term entry
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click term entry
    And select asset
    And select support type
    And enter quantity
    And click take long button
    And click confirm button

  @termordertrackingcorrection
  Scenario: Scenarios for term order tracking correction
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click term order tracking correction
    And check agreement option if it is in filter type
    And click occured tab
    And click canceled tab

  @viopfxcollateraltransfer
  Scenario: Scenarios for viop fx collateral transfer (for viop tab from cari to viop option)
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click viop fx collateral transfer
    And select collateral type as cash
    And enter collateral amount
    And click submit request button
    And click confirm button

  @termcashtransactions
  Scenario: Scenarios for term cash transactions
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click term cash transaction
    And check if seven days option is selected by default in quick filter options