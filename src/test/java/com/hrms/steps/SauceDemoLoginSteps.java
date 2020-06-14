package com.hrms.steps;

import com.test.testBase.BaseClass;
import com.test.utils.CommonMethods;
import com.test.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLoginSteps extends CommonMethods {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.driver.get(ConfigsReader.getProperty("url"));
	    
	}

	@When("user enter invalid username")
	public void user_enter_invalid_username() {
		sendText(sauceLogin.userName, "Admin");
	    
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
		sendText(sauceLogin.password, "Admin@123");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    click(sauceLogin.LoginBTN);
	}

	@Then("user should see the error message")
	public void user_should_see_the_error_message() {
	    System.out.println("error message displayed");
	}


}
