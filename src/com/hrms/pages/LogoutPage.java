package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass {
//objects and functions related to logout page
	static By link_logout=By.linkText("Logout");
	
	public static void logout() {
		driver.findElement(link_logout).click();
		Reporter.log("Logout complted");
	}
}
