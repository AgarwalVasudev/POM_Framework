package com.hrm.testscripts;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.*;
import org.testng.annotations.Test;

public class TC001 {
@Test
public static void tc001() throws Exception {
	BaseClass.openApplication();
	Thread.sleep(3000);
	VerifyPage.verifyTitle("HRMS");
	LoginPage.login("nareshit", "nareshit");
	VerifyPage.verifyTitle("OrangeHRM");
	Thread.sleep(3000);
	LogoutPage.logout();
	BaseClass.closeApplication();
	System.out.println("Gittttt update");
}

}
