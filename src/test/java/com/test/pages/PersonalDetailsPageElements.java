package com.test.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.testBase.BaseClass;

public class PersonalDetailsPageElements {
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement profilePic;
	
	
	@FindBy(xpath = "//a[text()='11866']")
	public WebElement id11866;

	@FindBy(id = "btnSave")
	public WebElement editAndSave;

	@FindBy(id = "personal_txtLicenNo")
	public WebElement licenseNumber;

	@FindBy(id = "personal_txtLicExpDate")
	public WebElement licenseExpire;

	@FindBy(id = "ui-datepicker-month")
	public WebElement selectlicenseExpMonth;

	@FindBy(id = "ui-datepicker-year")
	public WebElement selectlicenseExpYear;

	@FindBy(id = "personal_txtNICNo")
	public WebElement SSN;

	@FindBy(id = "personal_txtSINNo")
	public WebElement SIN;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> maleOrFemale;

	@FindBy(id = "personal_cmbMarital")
	public WebElement selectMartialStatus;

	@FindBy(id = "personal_cmbNation")
	public WebElement selectNationalityDD;
	@FindBy(id = "personal_DOB")
	public WebElement clickBirth;

	@FindBy(id = "ui-datepicker-year")
	public WebElement selectMonthYear;

	@FindBy(id = "ui-datepicker-month")
	public WebElement selectMonthBirth;

	@FindBy(id = "personal_txtEmpNickName")
	public WebElement nickName;

	@FindBy(id = "personal_chkSmokeFlag")
	public WebElement smoker;

	@FindBy(id = "personal_txtMilitarySer")
	public WebElement militaryService;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
