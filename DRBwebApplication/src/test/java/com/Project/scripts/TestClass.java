package com.Project.scripts;

import org.testng.Assert;

import org.testng.annotations.Test;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.Project.Pages.Login;
import com.Project.Pages.Signup;
import com.Project.Constants.AutomationConstants;
import com.Project.utilities.ExcelUtility;


public class TestClass extends TestBase {
	
Login objlogin;


// website link check
@Test
public void websitecheck() throws InterruptedException {
	objlogin=new Login(driver);
	
	Thread.sleep(1000);
	String expectedTitle=com.Project.Constants.AutomationConstants.HOMEPAGETITLE;
    String actualTitle=driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
}

// valid user login
@Test
public void loginuser() throws IOException, InterruptedException{
	
	objlogin=new Login(driver);
		
	objlogin.clickloginhomebutton();
	
	String username= ExcelUtility.getCellData(2, 0);
    String password= ExcelUtility.getCellData(2, 1);
    
	objlogin.setusername(username);
	Thread.sleep(1000);
	objlogin.setPassword(password);
	Thread.sleep(1000);
	objlogin.checkBox();
	
	objlogin.clicklogin();
	
	String expectedUrl=com.Project.Constants.AutomationConstants.HOMEPAGEURL;
    String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(expectedUrl,actualUrl);
	
	
}


//login with correct username and pasword
@Test
public void loginadmin() throws IOException, InterruptedException{
	
	objlogin=new Login(driver);
		
	objlogin.clickloginhomebutton();
	
	String username= ExcelUtility.getCellData(0, 0);
    String password= ExcelUtility.getCellData(0, 1);
    
	objlogin.setusername(username);
	Thread.sleep(1000);
	objlogin.setPassword(password);
	Thread.sleep(1000);
	objlogin.checkBox();
	
	objlogin.clicklogin();
	
	String expectedUrl=com.Project.Constants.AutomationConstants.HOMEPAGEURL;
    String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(expectedUrl,actualUrl);
	
	
}

//login with wrong username and password
@Test
public void loginwrong() throws IOException, InterruptedException {
	objlogin=new Login(driver);
	
	objlogin.clickloginhomebutton();
	
	String username= ExcelUtility.getCellData(1, 0);
    String password= ExcelUtility.getCellData(1, 1);
    
	objlogin.setusername(username);
	Thread.sleep(1000);
	objlogin.setPassword(password);
	Thread.sleep(1000);
	
	
	objlogin.clicklogin();
	
	String expectedUrl=com.Project.Constants.AutomationConstants.HOMEPAGEURL;
    String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(expectedUrl,actualUrl);
	
}


}






