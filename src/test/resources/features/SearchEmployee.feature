Feature: Employee Search

  Background: 
    And user is logged with valid admin credentials
    And user navigates Employee list page

  @smoke
  Scenario: Search Employee by id
    # Given user is navigated to HRMS                   // This step runs from Hook class(@Before @After
     # And user is logged with valid admin credentials  // This two steps we move them to Backgroung and ->
    #And user navigates Employee list page              // -> run from Background coz tepete multiple timse  
    When user enters valid employee id
    And clicks on search button
    Then user see employee informatin is displayed

  @regression
  Scenario: Search employee by name
    # Given user is navigated to HRMS
     # And user is logged with valid admin credentials
   # And user navigates Employee list page
    When user enters valid employee name and lastname
    And clicks on search button
    Then user see employee informatin is displayed
