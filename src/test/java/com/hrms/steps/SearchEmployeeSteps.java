package com.hrms.steps;

import org.junit.Assert;

import com.test.utils.CommonMethods;
import com.test.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeSteps extends CommonMethods {
	
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		sleep(3);
	 
	}

	@Given("user navigates Employee list page")
	public void user_navigates_Employee_list_page() {
	   employeeListPage.navigateToEmployeeList();
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	   sendText(employeeListPage.empId, "12746");
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
	  click(employeeListPage.searchBtn);
	}

	@Then("user see employee informatin is displayed")
	public void user_see_employee_informatin_is_displayed() {
	   String expected=employeeListPage.Id.getText();
	   String actual="12746";
	   Assert.assertEquals("Text is not displayed", expected, actual);

	}

	@When("user enters valid employee name and lastname")
	public void user_enters_valid_employee_name_and_lastname() {
	   sendText(employeeListPage.empName, "Selma S");
	}

}
