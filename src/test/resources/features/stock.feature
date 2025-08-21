@login
Feature: Osmanli Yatirim Stock Page

  @stockportfolio
  Scenario: Scenarios for stock portfolio
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click my stock portfolio
    And user should check if my portfolio is selected
    And user should check column name for portfolio tab
    And user should click stock portfolio analysis tab
    And user should check column name for portfolio analysis tab
    And user should click BYF portfolio tab
    And user should check column name for byf portfolio tab

  @byffiltering
  Scenario: Scenarios for byf filtering
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click byf filtering
    And user should check if byf searching is in filter options
    And user should check column name for byf filtering page


  @dividendstatement
  Scenario: Scenarios for divident statement
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click divident statement
    And user should check if seven days option is selected by default


  @stockstatement
  Scenario: Scenarios for stock statement
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click stock statement
    And user should check if seven days option is selected by default

  @stockorderentry
  Scenario: Scenarios for stock order entry for buy tab
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click stock order entry
    And select code
    And enter quantity
    And enter price
    And click buy button
    And click confirm button


  @parkingorder
  Scenario: Scenarios for parking order
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click park order
    And select symbol
    And select order type
    And enter quantity
    And click forward all button
    And click confirm button

  @stockordercorrection
  Scenario: Scenarios for stock order correction
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click stock order monitoring and correction
    And user should see code in filter options

  @publicofferingentering
  Scenario: Scenarios for public offering entering
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click public offering entering
    And user should see demand collection and from the stock market

  @fractionalsharesales
  Scenario: Scenarios for fractional share sales
    Given Open the Osmanli Yatirim login page
    And enter account no
    And enter password
    And click login button
    And enter sms code
    And click fractional share sales

