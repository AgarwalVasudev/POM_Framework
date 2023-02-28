package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

public class BaseClass {
//driver reference
	public static WebDriver driver;
//openApplication
public static void openApplication() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\vasudev.agarwal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application opened");
}
//CloseApplication
public static void closeApplication() {
	driver.close();
	Reporter.log("Application closed");
}
}
