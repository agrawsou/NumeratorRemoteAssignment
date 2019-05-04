Feature: Login Feature

Scenario Outline: Login test

Given user is on login page
When User logins by using the "<username>" and "<password>" as credentials
Then User verifies that login is successful
When User selects the desired "<account>" from the user accounts list
Then User verifies that the selected "<account>" exists in the database
Examples:
|username                   |password|account           |
|vishal.jadhav@numerator.com|Test1234|QA Testing - Promo|