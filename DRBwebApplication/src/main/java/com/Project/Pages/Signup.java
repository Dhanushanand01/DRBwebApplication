package com.Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	

	public Signup(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	//web element for login button
    @FindBy(xpath="//a[@routerlink='login']")
    private WebElement loginButton;
    
    //web element for sign up button
    @FindBy(xpath= "//a[@href='/signup']")
    private WebElement signUpButton;
    
    //webelement for contact us
    @FindBy(xpath="//a[@href='contact.html']")
    private WebElement contactus;
    
    
   @FindBy(xpath="//input[@placeholder='Username']")
   private WebElement username;
    
   @FindBy(xpath="//input[@placeholder='Phone Number']")
   private WebElement phone; 
   
   @FindBy(xpath="//input[@placeholder='Mail']")
   private WebElement mail;
   
   @FindBy(xpath="//input[@placeholder='Password']")
   private WebElement password;
   
   @FindBy(xpath="//input[@placeholder='Confirm Password']")
   private WebElement password2;
   
   @FindBy(xpath="//span[text()='Register']")
   private WebElement register;
    
    
    
    
    
    
    //signup button on homepage
  	public void clickloginhomebutton() {
      	loginButton.click();
    }
  	
  	//clikcing sign up button
  	public void clickSignUp() {
  		signUpButton.click();
  	}
  	//enter username
  	public void setusername(String strusername) {
  		username.sendKeys(strusername);
  	}
	//enter phone
  	public void setphone(String strphone) {
  		phone.sendKeys(strphone);
  	}
	//enter mail
  	public void setmail(String strmail) {
  		mail.sendKeys(strmail);
  	}
	//enter password
  	public void setpassword(String strpword) {
  		password.sendKeys(strpword);
  	}
	//enter usernmae
  	public void setpassword1(String strpword1) {
  		password2.sendKeys(strpword1);
  	}
    
  	public void registerclick() {
  		register.click();
  	}
  	
	public void contactusclick() {
  		contactus.click();
  	}
  	
  	
  	
  	
  	
  	
  	
	
}
