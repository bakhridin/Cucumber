package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.testBase.BaseClass;
import com.test.utils.CommonMethods;

public class employeeListPage extends CommonMethods {
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListBtn;
	
	@FindBy(id="empsearch_id")
	public WebElement empId;
	
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement empName;
	
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//a[text()='12746']")
	public WebElement Id;
	
	
	
	
	public employeeListPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToEmployeeList() {
		jsClick(PIM);
		jsClick(empListBtn);
		
	}

}
