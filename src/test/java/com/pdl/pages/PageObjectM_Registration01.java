package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PageObjectM_Registration01 {

	
	 WebDriver driver=Driver.getDriver();

	 public  PageObjectM_Registration01 () {
		 PageFactory.initElements(Driver.getDriver(), this);
		 System.out.println("samira is a new Tester");
	 }
	 @FindBy(xpath = "//input[@id='input-firstname']")
		public WebElement incorrectfirst;
	
	 @FindBy(xpath = "//input[@id='input-lastname']")
		public WebElement incorrectlast;
	 
	 @FindBy(xpath = " //input[@name='email']")
		public WebElement incorrectemail; 
	 
	 @FindBy(xpath = "//input[@id='input-telephone']")
		public WebElement incorrectphone; 
	
	 @FindBy(xpath = "//input[@value='Continue'] ")
		public WebElement continuee; 
	 
	 
	 
	 
	 
	 
	 
	 
	public void  verify_Navigate_to_the_Registration_home_pagee() {
		String actualURL=driver.getCurrentUrl();
    	String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/register";
    	
   	Assert.assertEquals("verify user is on home page",expectedURL,actualURL);
	}
	public void verify_click_on_first_name_insert_incorrect_value(String value){
		 incorrectfirst.click();
		 incorrectfirst.sendKeys("samiraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
	}
	
	 public void verify_first_name_inserting_incorrectly(String firstvalue ) {
	    	String actualvalue= incorrectfirst.getAttribute(firstvalue);
	 }
	
	public void verify_click_on_last_name_insert_incorrect_value(String value){
		 incorrectlast.click();
		 incorrectlast.sendKeys("medjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
}
	 public void verify_last_name_inserting_incorrectly(String lastvalue ) {
	    	String actualvalue=   incorrectlast.getAttribute(lastvalue);
}
	 
	 
	 public void verify_incorrect_email(String email) {
		 incorrectemail.click();
		 incorrectemail.sendKeys("abcgmail.com");
	 }
	 public void verify_incorrect_email_inserted(String emailvalue) {
		 String actualvalue=   incorrectemail .getAttribute(emailvalue);
	 }
	 public void verify_incorrect_phone_number(String phone){
		 incorrectphone.click();
		 incorrectphone.sendKeys("434345eeeeeeeeee5");
	 }
	 public void verify_incorrect_phone_inserting(String Phonevalue){
		 String actualvalue=   incorrectphone .getAttribute(Phonevalue);
	 }
	 public void verify_click_on_continue_button() {
		 continuee.click();
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
}