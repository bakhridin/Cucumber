package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.test.utils.CommonMethods;
import com.test.utils.Constans;
import com.test.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	
	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmployee();
	}
	@When("user enters employees {string} and {string}")
	public void user_enters_employees_first_name_and_last_name(String firstName,String lastName) {
		sendText(employeeAddPage.firstName, firstName);
		sendText(employeeAddPage.lastName, lastName);
	}
	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(employeeAddPage.saveButton);
	}
	@Then("{string} is added successfully")
	public void employee_is_added_successfully(String expectedName) {
		String actual = pdetails.profilePic.getText();
	
		Assert.assertEquals(expectedName, actual);
		
	}
	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		employeeAddPage.employeeId.clear();
	}
	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		click(employeeAddPage.credentialButton);
	}
	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		employeeAddPage.createEmpLoginCR();
		
	}
	
	@When("user enter employees {string}, {string} and {string}")
	public void enteringEmployee(String fName, String mName, String lName) {
		sendText(employeeAddPage.firstName, fName);
		sendText(employeeAddPage.middleName, mName);
		sendText(employeeAddPage.lastName, lName);
	}

	@Then("{string}, {string} and {string} is added successfully")
	public void and_is_added_successfully(String fname, String middleName, String laName) {
		System.out.println("I added the employee !!!!!!!!!!!!!!!!!!!!!!!");
		sleep(2);
	}
	
	@When("user enters employee details and click on save then employee is added")
	public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {
		List<Map<String, String>> addEmployeeList=dataTable.asMaps();
		
		for(Map<String, String> map:addEmployeeList) {
			
			String fname=map.get("FirstName");
			String mname=map.get("MiddleName");
			String lname=map.get("LastName");
			
			sendText(employeeAddPage.firstName, fname);
			sendText(employeeAddPage.middleName, mname);
			sendText(employeeAddPage.lastName, lname);
			click(employeeAddPage.saveButton);
			sleep(1);
			//adding assertion
			
			String actual=pdetails.profilePic.getText();
			String expected=fname+" "+mname+" "+lname;
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);
			sleep(4);
		}
	}
	
	@Then("employee is added")
	public void employee_is_added() {
		System.out.println("-----Employee is added using datatable");
	}
	
	@When("user enters employee data from {string}  excel sheet then employee is added")
	public void user_enters_employee_data_from_excel_sheet_then_employee_is_added(String sheetName) {
	
		List<Map<String,String>>excelList=ExcelUtility.getDataFromListOfMaps(Constans.TESTDATA_FILEPATH, sheetName);
		
		for (Map<String, String> data : excelList) {
			String fname = data.get("FirstName");
			String mname = data.get("MiddleName");
			String lname = data.get("LastName");

			sendText(employeeAddPage.firstName, fname);
			sendText(employeeAddPage.middleName, mname);
			sendText(employeeAddPage.lastName, lname);
			click(employeeAddPage.saveButton);

			String actual = pdetails.profilePic.getText();
			String expected = fname + " " + mname + " " + lname;
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);

		}
		
	}
	

}
