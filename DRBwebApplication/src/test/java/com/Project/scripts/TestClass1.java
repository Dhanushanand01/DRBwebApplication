package com.Project.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Project.Pages.Login;
import com.Project.Pages.Signup;
import com.Project.utilities.ExcelUtility;

public class TestClass1 extends TestBase{
	
	Signup objsignup;
	
	//testing functionality of signup button
	@Test
	public void signUpclick() {
		objsignup=new Signup(driver);
		objsignup.clickloginhomebutton();
		objsignup.clickSignUp();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	
	//signup with valid credentials
	@Test
	public void signUp() throws IOException, InterruptedException {
		
		objsignup=new Signup(driver);
		//reach sign up page
		objsignup.clickloginhomebutton();
		Thread.sleep(1000);
		
		objsignup.clickSignUp();
		Thread.sleep(1000);
		
		String username= ExcelUtility.getCellData(0, 3);
	    String phone= ExcelUtility.getCellData(0, 4);
	    String mail=ExcelUtility.getCellData(0, 5);
		String password=ExcelUtility.getCellData(0, 6);
		String confirmpassword=ExcelUtility.getCellData(0, 7);
		
		objsignup.setusername(username);
		objsignup.setphone(phone);
		objsignup.setmail(mail);
		objsignup.setpassword(password);
		objsignup.setpassword1(confirmpassword);
		
		objsignup.registerclick();	
	}
	
	//signup with short mobile number
	public void signup1() throws InterruptedException, IOException {
		
		objsignup=new Signup(driver);
		//reach sign up page
		objsignup.clickloginhomebutton();
		Thread.sleep(1000);
		
		objsignup.clickSignUp();
		Thread.sleep(1000);
		
		String username= ExcelUtility.getCellData(1, 3);
	    String phone= ExcelUtility.getCellData(1, 4);
	    String mail=ExcelUtility.getCellData(1, 5);
		String password=ExcelUtility.getCellData(1, 6);
		String confirmpassword=ExcelUtility.getCellData(1, 7);
		
		objsignup.setusername(username);
		objsignup.setphone(phone);
		objsignup.setmail(mail);
		objsignup.setpassword(password);
		objsignup.setpassword1(confirmpassword);
		
		objsignup.registerclick();	
		
	}
	
	//signup with longer mobile number
	public void signup2() throws InterruptedException, IOException {
		
		objsignup=new Signup(driver);
		//reach sign up page
		objsignup.clickloginhomebutton();
		Thread.sleep(1000);
		
		objsignup.clickSignUp();
		Thread.sleep(1000);
		
		String username= ExcelUtility.getCellData(2, 3);
	    String phone= ExcelUtility.getCellData(2, 4);
	    String mail=ExcelUtility.getCellData(2, 5);
		String password=ExcelUtility.getCellData(2, 6);
		String confirmpassword=ExcelUtility.getCellData(2, 7);
		
		objsignup.setusername(username);
		objsignup.setphone(phone);
		objsignup.setmail(mail);
		objsignup.setpassword(password);
		objsignup.setpassword1(confirmpassword);
		
		objsignup.registerclick();	
			
	}

	//signup with irregular email id
	public void signup3() throws InterruptedException, IOException {
		
		objsignup=new Signup(driver);
		//reach sign up page
		objsignup.clickloginhomebutton();
		Thread.sleep(1000);
		
		objsignup.clickSignUp();
		Thread.sleep(1000);
		
		String username= ExcelUtility.getCellData(3, 3);
	    String phone= ExcelUtility.getCellData(3, 4);
	    String mail=ExcelUtility.getCellData(3, 5);
		String password=ExcelUtility.getCellData(3, 6);
		String confirmpassword=ExcelUtility.getCellData(3, 7);
		
		objsignup.setusername(username);
		objsignup.setphone(phone);
		objsignup.setmail(mail);
		objsignup.setpassword(password);
		objsignup.setpassword1(confirmpassword);
		
		objsignup.registerclick();	
			
	}	
	
	//signup with wrong password format
	public void signup4() throws InterruptedException, IOException {
			
		objsignup=new Signup(driver);
		//reach sign up page
		objsignup.clickloginhomebutton();
		Thread.sleep(1000);
		
		objsignup.clickSignUp();
		Thread.sleep(1000);
		
		String username= ExcelUtility.getCellData(4, 3);
	    String phone= ExcelUtility.getCellData(4, 4);
	    String mail=ExcelUtility.getCellData(4, 5);
		String password=ExcelUtility.getCellData(4, 6);
		String confirmpassword=ExcelUtility.getCellData(4, 7);
		
		objsignup.setusername(username);
		objsignup.setphone(phone);
		objsignup.setmail(mail);
		objsignup.setpassword(password);
		objsignup.setpassword1(confirmpassword);
		
		objsignup.registerclick();	
	}
	
	//signup with mismatched passwords entered
	public void signup5() throws InterruptedException, IOException {
		
		objsignup=new Signup(driver);
		//reach sign up page
		objsignup.clickloginhomebutton();
		Thread.sleep(1000);
		
		objsignup.clickSignUp();
		Thread.sleep(1000);
		
		String username= ExcelUtility.getCellData(5, 3);
	    String phone= ExcelUtility.getCellData(5, 4);
	    String mail=ExcelUtility.getCellData(5, 5);
		String password=ExcelUtility.getCellData(5, 6);
		String confirmpassword=ExcelUtility.getCellData(5, 7);
		
		objsignup.setusername(username);
		objsignup.setphone(phone);
		objsignup.setmail(mail);
		objsignup.setpassword(password);
		objsignup.setpassword1(confirmpassword);
		
		objsignup.registerclick();	
		
			
	}

}
