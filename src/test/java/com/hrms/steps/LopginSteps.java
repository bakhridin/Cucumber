package com.hrms.steps;

import org.junit.Assert;

import com.test.utils.CommonMethods;
import com.test.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LopginSteps extends CommonMethods  {
	

@When("user enter valid username")
public void user_enter_valid_username() {
	sendText(login.username, ConfigsReader.getProperty("username"));
   
}

@When("user enter valid password")
public void user_enter_valid_password() {
    sendText(login.password, ConfigsReader.getProperty("password"));
}

@When("user click on login button")
public void user_click_on_login_button() {
    click(login.loginBtn);
}

@Then("admin is successfully logged in")
public void admin_is_successfully_logged_in() {
    String expected="Welcome Admin";
    String actual=dashboard.welcome.getText();
    Assert.assertEquals("Welcome message is not displayed or not correct", expected, actual);
   
   
}

@When("user enters valid username")
public void user_enters_valid_username() {
  sendText(login.username, ConfigsReader.getProperty("username"));
}

@When("user enters invalid password")
public void user_enters_invalid_password() {
   sendText(login.password, "Sohil");
}

@When("clicks on login button")
public void clicks_on_login_button() {
	 click(login.loginBtn);
    
}

@Then("user see “Invalid credentials” error message")
public void user_see_Invalid_credentials_error_message() {
	String expectedErrorMsg=login.errorMsg.getText();
	String actualErrorMsg="Invalid credentials";
	Assert.assertEquals("User see Invalid credentials", expectedErrorMsg, actualErrorMsg);
   

}

@When("user enters empty password")
public void user_enters_empty_password() {
	sendText(login.password, "");
}

@Then("user see “Password cannot be empty” error message")
public void user_see_Password_cannot_be_empty_error_message() {
	String expectedErrorMsg=login.errorMsg.getText();
	String actualErrorMsg="Password cannot be empty";
	Assert.assertEquals("User see Password cannot be empty", expectedErrorMsg, actualErrorMsg);
   
}

@When("user enters empty username")
public void user_enters_empty_username() {
    sendText(login.username, "");
}

@Then("user see “Username cannot be empty” error message")
public void user_see_Password_can_not_be_empty_error_message() {
	String expectedErrorMsg=login.errorMsg.getText();
	String actualErrorMsg="Username cannot be empty";
	Assert.assertEquals("User see Username cannot be empty", expectedErrorMsg, actualErrorMsg);
}


}
