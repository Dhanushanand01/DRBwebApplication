package com.Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileCreation {
	
	WebDriver driver;
	
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
      
      
      
      //-------------------
      
      @FindBy(xpath="//a[@routerlink='/profilehome']")
      private WebElement myProfile;
      
      @FindBy(xpath="//button[@class='btn-get-started animate__animated animate__fadeInUp scrollto']")
      private WebElement createNew;
      
      //-----------------------
      
      @FindBy(xpath="//input[@id='name']")
      private WebElement fullName;
      
      @FindBy(id="date")
      private WebElement dob;
      
      @FindBy(xpath="//input[@value='male']")
      private WebElement male;
      
      @FindBy(xpath="//input[@value='female']")
      private WebElement female;
      
      @FindBy(xpath="//input[@name='email_id']")
      private WebElement email;

      @FindBy(xpath="//input[@id='phone']")
      private WebElement phone;
    
      @FindBy(xpath="//select[@name='edu_title']")
      private WebElement eduSelect;
    
      @FindBy(xpath="//option[@value='Board of Public Examination']")
      private WebElement eduop1;
      
      @FindBy(xpath="//option[@value='CBSC']")
      private WebElement eduop2;
      
      @FindBy(xpath="//option[@value='others']")
      private WebElement eduop3;
      
      @FindBy(xpath="//table[@formarrayname='skills']//child::th//child::button")
      private WebElement addSkill;
      
      @FindBy(xpath="//table[@formarrayname='skills']//child::td//child::input")
      private WebElement typeSkill;
      
      @FindBy(xpath="//table[@formarrayname='languages']//child::tr//child::th//child::button")
      private WebElement addLanguage;
      
      @FindBy(xpath="//table[@formarrayname='languages']//child::td//child::input")
      private WebElement typeLanguage;
      
      @FindBy(xpath="//textarea[@id='yourself']")
      private WebElement yourself;
      
      @FindBy(xpath="//input[@name='image']")
      private WebElement image;
      
      @FindBy(xpath="//input[@type='checkbox']")
      private WebElement accept;
      
      @FindBy(xpath="//button[@type='submit']")
      private WebElement createProfBtn;
    
      
      
      
      
      
      
      //----------------------
      
      // constructor 
      public ProfileCreation(WebDriver driver) {
  	 	this.driver=driver;
  	 	PageFactory.initElements(driver, this);
  	  }
      
      //-----------------------------
      
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
  	
  	
  	//-----------------------------------------------
  	
  	public void clickMyProf() {
  		myProfile.click();
  	}
  	public void clickCreateNew() {
  		createNew.click();
  	}
  	//------------------------------------------------
  	
  	
  	public void setFullname(String str1) {
  		fullName.sendKeys(str1);
  		
  	}
  	public void clickDOB(String str2) {
  		dob.sendKeys(str2);
  	}
  	public void clickMale() {
  		male.click();
  	}
  	public void clickFemale() {
  		female.click();
  	}
  	public void setEmail(String str3) {
  		email.sendKeys(str3);
  	}
  	public void setPhone(String str4) {
  		phone.sendKeys(str4);
  	}
  	public void setEduPublic() {
  		eduSelect.click();
  		eduop1.click();
  	}
  	public void setEduCBSE() {
  		eduSelect.click();
  		eduop2.click();
  	}  
  	public void setEduOther() {
  		eduSelect.click();
  		eduop3.click();
  	}
  	public void addSkill(String str5) {
  		addSkill.click();
  		typeSkill.sendKeys(str5);
  	}
  	public void addLang(String str6) {
  		addLanguage.click();
  		typeLanguage.sendKeys(str6);
  	}
	public void setYourself(String str7) {
		yourself.sendKeys(str7);
	}
	public void setImage(String str8) {
		image.sendKeys(str8);
	}
	public void tickAccept(String str7) {
		accept.click();
	}
	public void clickCreateProfButn() {
		createProfBtn.click();
	}

}
