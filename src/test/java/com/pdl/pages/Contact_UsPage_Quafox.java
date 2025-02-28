package com.pdl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;
import org.openqa.selenium.support.FindBy;

public class Contact_UsPage_Quafox extends CommonMethods {
	WebDriver driver = Driver.getDriver();


public Contact_UsPage_Quafox() {
	PageFactory.initElements(Driver.getDriver(), this);
}

 
@FindBy(xpath="//a[text()='Contact Us']")
public WebElement contactUS_button;

@FindBy(xpath=" //div[@id='information-contact']//div[@class='col-sm-3']/address")
public WebElement address_forme;

@FindBy(xpath=" //form[@class='form-horizontal']//legend")
public WebElement ContactForme;

@FindBy(xpath=" //input[@id='input-name']")
public WebElement name_field;

@FindBy(xpath=" //input[@id='input-email']")
public WebElement email_field;

@FindBy(xpath=" //textarea[@id='input-enquiry']")
public WebElement message_Form;

@FindBy(xpath=" //input[@type='submit']")
public WebElement submit_Button;

@FindBy(xpath="( //div[@class='col-sm-3']//strong)[2]")
public WebElement phoneNumber;

@FindBy(xpath="//div[@id='information-contact']//div[@class='col-sm-3']/strong)[1]")
public WebElement email_adresse;

public void Verify_The_Contact_Us_PageShouldOpen() {
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	contactUS_button.click();
	String actualURL=driver.getCurrentUrl();
	String ExpectedUrl="https://tutorialsninja.com/demo/index.php?route=information/contact";
	Assert.assertEquals(ExpectedUrl,actualURL);
	}
public void VerifyThe_physicalAddress_section_andPhoneNumber_should_be_displayed () {
	Assert.assertTrue(email_adresse.isDisplayed());
	Assert.assertTrue(phoneNumber.isDisplayed());
}

public void VerifyThe_email_address_and_phone_number_section_should_be_valid() {
	String actualEmail_Address = email_adresse.getText();
	String expectedEmail_Address = "Qafox.com";
    Assert.assertEquals(expectedEmail_Address, actualEmail_Address);
	System.out.println("Verified: email Address is displayed correctly as " + actualEmail_Address);
	
	String actualPhoneNumber = phoneNumber.getText();
	String expectedPhoneNumber = "Telephone";   
    Assert.assertEquals(expectedPhoneNumber, actualPhoneNumber);
	System.out.println("Verified: Phone number is displayed correctly as " + actualPhoneNumber);
	}

public void Verify_the_physical_address_sectionAnd_ContactForme_should_Be_Displayed() {
	Assert.assertTrue(address_forme.isDisplayed());
	Assert.assertTrue(ContactForme.isDisplayed());
	}

public void Verify_the_displayed_address_should_be_correct_and_contact_form_should_be_functional() {
	String actualAddress = address_forme.getText();
	String expectedAddress = "Address 1";
    Assert.assertEquals(expectedAddress, actualAddress);
	System.out.println("Verified: Address is displayed correctly as " + actualAddress);
	
	name_field.sendKeys("Tinhinane");
	email_field.sendKeys("abc123@gmail.com");
	message_Form.sendKeys("this is the message for contactUs");
	submit_Button.click();
}

}