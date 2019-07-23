Feature: Sign in with existing paid user
Scenario: Test Sign in existing paid user

Given user is already on sign in page epu
Then user enter email and password epu
Then user click on login button epu
Then user navigate to complete deck from account dashboard page
Then user download any product