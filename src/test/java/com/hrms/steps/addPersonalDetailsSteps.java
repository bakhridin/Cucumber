package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import com.test.utils.CommonMethods;
import com.test.utils.Constans;
import com.test.utils.ExcelUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addPersonalDetailsSteps extends CommonMethods {
	

@When("user clicks on specific employee id")
public void user_clicks_on_specific_employee_id() {
	sleep(1);
	sendText(employeeListPage.empId, "11866");
	jsClick(employeeListPage.searchBtn);
	jsClick(pdetails.id11866);
	
    
}

@Then("user is able to modify employee personal details from Excel {string}")
public void user_is_able_to_kodify_employee_personal_details_and_verify_it(String sheetName) {
	List<Map<String,String>> allList=ExcelUtility.getDataFromListOfMaps(Constans.TESTDATA_FILEPATH, sheetName);
	pdetails.editAndSave.click();
	for (Map<String, String> list : allList) {
		sendText(pdetails.licenseNumber,list.get("Driver's License Number") );
		pdetails.licenseExpire.clear();
		pdetails.licenseExpire.sendKeys(list.get("License Expiry Date"),Keys.ENTER);
		sendText(pdetails.SSN, list.get("SSN Number"));
		sendText(pdetails.SIN, list.get("SIN Number"));
		clickRadioOrCheckbox(pdetails.maleOrFemale, list.get("Gender"));
		selectDdValue(pdetails.selectMartialStatus, list.get("Marital Status"));
		selectDdValue(pdetails.selectNationalityDD, list.get("Nationality"));
		pdetails.clickBirth.clear();
		pdetails.clickBirth.sendKeys(list.get("Date of Birth"),Keys.ENTER);
		sendText(pdetails.nickName, list.get("Nick Name"));
		click(pdetails.smoker);
		sendText(pdetails.militaryService, list.get("Military Service"));
		
	}
	
    
}

}
