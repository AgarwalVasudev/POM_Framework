package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass {
	//verification functionality
	public static void verifyTitle(String title) {
		if(driver.getTitle().equals(title)) {
			Reporter.log("Title matched");
		}
		else {
			Reporter.log("title not matched");
		}
	}
}
