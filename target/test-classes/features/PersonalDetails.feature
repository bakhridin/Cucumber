#Autor:bakhridin.bakhridin76@gmail.com
Feature: Personal details page

  Background: 
    Given user is logged with valid admin credentials
    And user navigates Employee list page
    
@hw
  Scenario: Modifying personal employee page
  
  When user clicks on specific employee id
  Then user is able to modify employee personal details from Excel "PersonalEmployee"
