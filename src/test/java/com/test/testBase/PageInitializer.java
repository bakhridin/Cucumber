package com.test.testBase;




import com.test.pages.DashBoardPageElements;
import com.test.pages.LoginPageElements;
import com.test.pages.PersonalDetailsPageElements;
import com.test.pages.SauceDemoLoginPage;
import com.test.pages.addEmplopyeePage;
import com.test.pages.employeeListPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static addEmplopyeePage employeeAddPage;
	public static employeeListPage employeeListPage;
	public static SauceDemoLoginPage sauceLogin;
	
	
	
	public static void initialize() {
		 login=new LoginPageElements();
		 dashboard=new DashBoardPageElements();
		 pdetails=new PersonalDetailsPageElements();
		 employeeAddPage = new addEmplopyeePage();
		 employeeListPage=new employeeListPage();
		 sauceLogin=new SauceDemoLoginPage();
	}

}
