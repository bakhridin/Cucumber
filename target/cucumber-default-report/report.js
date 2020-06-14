$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Dashbord.feature");
formatter.feature({
  "name": "Dashboard",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Dashboard menu view for admin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.SearchEmployeeSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see dashboard menu is displayed",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.DashboardSteps.user_see_dashboard_menu_is_displayed(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Dashboard menu view for admin");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/DatatableTest.feature");
formatter.feature({
  "name": "Data Table Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid username and password and see error message",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.InvalidLoginSteps.user_enter_invalid_username_and_password_and_see_error_message(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Login with invalid credentials");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid username",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enter_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid password",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enter_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.admin_is_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Login with valid username and valid password");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enters_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enters_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see “Invalid credentials” error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_see_Invalid_credentials_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Login with valid username and invalid password");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid username and without password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enters_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters empty password",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enters_empty_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see “Password cannot be empty” error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_see_Password_cannot_be_empty_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Login with valid username and without password");
formatter.after({
  "status": "passed"
});
});