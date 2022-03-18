package com.Project.Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    //web element for login button
    @FindBy(xpath="//*[@id=\"navbar-wd\"]/ul/li[7]/a")
    private WebElement loginButton;
    
    //web element for username field
    @FindBy(xpath="//input[@formcontrolname='Username']")
    private WebElement username;
  
    //web element for password field
    @FindBy(xpath="//input[@formcontrolname='pass']")
    private WebElement password;
       
    //login button
    @FindBy(xpath="//button[@class='login100-form-btn']")
    private WebElement login;
   
    //remember me button
      @FindBy(xpath="//label[@class='label-checkbox100']")
      private WebElement rememberMe;
    
    // constructor 
    public Login(WebDriver driver) {
	 	this.driver=driver;
	 	PageFactory.initElements(driver, this);
	}
    
    //signup button on homepage click
	public void clickloginhomebutton() {
    	loginButton.click();
    }
	//setting username
	public void setusername(String strUserName) {
		username.sendKeys(strUserName);
	}
	//setting password
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	//remember me check box
	public void checkBox() {
		// TODO Auto-generated method stub
		rememberMe.click();
	}

	//login button click
	public void clicklogin() {
		login.click();
	}

	
    


}
