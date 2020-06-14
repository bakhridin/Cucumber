Feature: Login Functionality

  @test
  Scenario: Login with valid username and valid password
    # Given user is navigated to HRMS
    When user enter valid username
    And user enter valid password
    And user click on login button
    Then admin is successfully logged in

  @test
  Scenario: Login with valid username and invalid password
    #Given user navigated to HRMS
    When user enters valid username
    And user enters invalid password
    And clicks on login button
    Then user see “Invalid credentials” error message

  @test
  Scenario: Login with valid username and without password
    #Given user navigated to HRMS
    When user enters valid username
    And user enters empty password
    And clicks on login button
    Then user see “Password cannot be empty” error message

  @regression
  Scenario: Login with empty username and valid password
    #Given user navigated to HRMS
    When user enters empty username
    And user enters empty password
    And clicks on login button
    Then user see “Username cannot be empty” error message
