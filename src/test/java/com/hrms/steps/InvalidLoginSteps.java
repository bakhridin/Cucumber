package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.test.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;


public class InvalidLoginSteps extends CommonMethods {
	@When("user enter invalid username and password and see error message")
	public void user_enter_invalid_username_and_password_and_see_error_message(DataTable dataTable) {
		
		
	    List<Map<String,String>>list=dataTable.asMaps();
	    
	 for (Map<String, String> map : list) {
		 String userName = map.get("UserName");
		 String password = map.get("Password");
		 String error = map.get("ErrorMessage");
		 sendText(login.username, userName);
		 sendText(login.password, password);
		 click(login.loginBtn);
		 takeScreenshots(userName);
		 Assert.assertEquals("Eror message do not match",error, login.errorMsg.getText());
		 sleep(1);
		 driver.navigate().refresh();
		 
		
	}
	}

}
