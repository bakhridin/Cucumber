#Author: La-team
Feature: Sauce Demo login

Description: Us-3421 The purpose of this feature file is
             to automate sauce demo login feature with valid and invalid credentials
             
Acceptance Creteria: I want to automate sauce demo login functionality  


Scenario: invalid login

Given user is on login page
When user enter invalid username
And user enter invalid password
And click on login button
Then user should see the error message 


