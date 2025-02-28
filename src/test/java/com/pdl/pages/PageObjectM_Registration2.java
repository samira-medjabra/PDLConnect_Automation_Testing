package com.pdl.pages;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import junit.framework.Assert;

public class PageObjectM_Registration2 extends CommonMethods {
 WebDriver driver=Driver.getDriver();

 public PageObjectM_Registration2() {
	 PageFactory.initElements(Driver.getDriver(), this);
	 System.out.println("samira is a new Tester");
 }
 @FindBy(xpath = "//input[@id='input-firstname']")
	public WebElement firstnameField;
 
 @FindBy(xpath = "//input[@id='input-lastname']")
	public WebElement lastnameField;
 
 @FindBy(xpath = "//input[@id='input-email']")
	public WebElement emailField;
 @FindBy(xpath = "//input[@id='input-telephone']")
	public WebElement phonelField;
 
 @FindBy(xpath = "//input[@id='input-password']")
	public WebElement password;
 
 @FindBy(xpath = "//input[@id='input-confirm']")
	public WebElement confirmpassword;
 
 @FindBy(xpath = "//input[@type='checkbox']")
	public WebElement privacy;

 @FindBy(xpath = "//input[@class='btn btn-primary']")
	public WebElement continuebutton;
 
    public void  verify_user_is_on_home_page() {
    	String actualURL=driver.getCurrentUrl();
    	String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/register";
    	
   	Assert.assertEquals("verify user is on home page",expectedURL,actualURL);
    	
    }
    public void Verify_and_click_on_first_name_and_insert_value(String first_name) {
    	firstnameField.click();
    	firstnameField.sendKeys(first_name);
    
    }

    public void verify_first_name_is_correctly_inserted(String firstnamevalue) {
    	String actualvalue=firstnameField.getAttribute("value");
    	//Assert.assertEquals(actualvalue,firstnamevalue,"first name is inserted correctly " );
    }
    public void Verify_click_on_Last_Name_and_insert_value(String last_name){
    	lastnameField.click();
    	lastnameField.sendKeys(last_name);
    }
    public void verify_last_name_is_correctly_inserted(String lastnamevalue) {
    	String actualvalue=lastnameField.getAttribute("value");
    	//Assert.assertEquals(actualvalue,firstnamevalue,"first name is inserted correctly " );
 }
    public void verify_click_on_E_Mail_and_insert (String email){
    	emailField.click();
    	emailField.sendKeys(email);
    	
    }
    public void Verify_email_correctly_insertimg(String emailvalue) {
    	String actualvalue=emailField.getAttribute(emailvalue);
    }
    public void verify_click_on_Telephone_and_insert(String telephone) {
    	phonelField.click();
    	phonelField.sendKeys(telephone);
    	}
    public void Verify_phonrNumber_correctly_insertimg(String phonevalue) {
    	String actualvalue=phonelField.getAttribute(phonevalue);
} 
    public void verify_click_on_password_and_click(String pass) {
    	password.click();
    	password.sendKeys(pass);
    }
    public void Verify_password_correctly_inserted(String passvalue) {
    	String actualvalue=password.getAttribute(passvalue);
    }
    public void verifi_click_0n_confirm_password(String passwo) {
    	confirmpassword.click();
    	confirmpassword.sendKeys(passwo);
    }
    
    public void verify_privacy_button() {
    	privacy.click();
    	 	
    }
    public void verify_confirm_pass_inserting(String passvalue ) {
    	String actualvalue=confirmpassword.getAttribute(passvalue);
    }
    public void verify_click_on_continue_button() {
    	 continuebutton.click();
    }
}