package com.pdl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.Driver;

import junit.framework.Assert;

public class PageObjectM_Login {
	 WebDriver driver=Driver.getDriver();
		

	 public  PageObjectM_Login () {
		 PageFactory.initElements(Driver.getDriver(), this);
		 System.out.println("samira2 is a new Tester");
	 }
	 
	 @FindBy(xpath = "(//a[@class='list-group-item'])[1]")
		public WebElement login;
	 @FindBy(xpath = "(//input[@class='form-control'])[1] ")
		public WebElement firstname;
	 
	 @FindBy(xpath = "(//input[@class='form-control'])[1] ")
		public WebElement lastname; 
	 
	 @FindBy(xpath = "(//input[@class='form-control'])[1]  ")
		public WebElement email; 
	 @FindBy(xpath = " (//input[@class='form-control'])[1] ")
		public WebElement telephone; 
	 @FindBy(xpath = " (//input[@class='form-control'])[1] ")
		public WebElement pass; 
	 @FindBy(xpath = " (//input[@class='form-control'])[1] ")
		public WebElement passconfirm; 
	
	 @FindBy(xpath = "//input[@name='agree'] ")
		public WebElement privacy;
	 @FindBy(xpath = " //input[@class='btn btn-primary']")
		public WebElement continuee;
	 @FindBy(xpath = " (//input[@class='form-control'])[1] ")
		public WebElement emailaddress; 
	 
	 @FindBy(xpath = " (//input[@class='form-control'])[1] ")
		public WebElement passaddress; 
	 @FindBy(xpath = " //input[@class='btn btn-primary']")
		public WebElement loginn; 
	 
	 
	 
		 public void verify_home_page_navigation() {
			 String actualURL=	 driver.getCurrentUrl();
			String expectedurl="https://tutorialsninja.com/demo/index.php?route=account/login";
			Assert.assertEquals("verify user is on home page",expectedurl,actualURL);
	 }
	 
	
	
	public void verify_login_button_is_clickable() {
	JavascriptExecutor joj=	(JavascriptExecutor)driver;
	joj.executeScript("arguments[0].click()", login);
	login.click();
	}
	 
	public void verify_fields() {
		firstname.click();
		firstname.sendKeys("salima");
	}
	public void verify_fields(String name) {
		String actualvalue=firstname.getAttribute(name);
	}
	public void verify_lastname() {
		lastname.click();
		lastname.sendKeys("medjab");
	}
	public void verify_lastname_clickable(String last) {
		String actualvalue=lastname.getAttribute(last);
	}
	public void verify_email() {
		email.click();
		email.sendKeys("ahelm@gmail.com");
	}
	public void verify_email_clickable(String emaill) {
		String actualvalue=email.getAttribute(emaill);
	}
	public void verify_phone() {
		telephone.click();
		telephone.sendKeys("43434555");
	}
	public void verify_phone_clickable(String phone) {
		String actualvalue=telephone.getAttribute(phone);
		
	}
	public void verify_pass() {
		pass.click();
		pass.sendKeys("luqmn123");
		
	}
	public void verify_pass_clickable(String passs) {
		String actualvalue=pass.getAttribute(passs);
	}
	public void verify_passconfirm() {
		passconfirm.click();
		passconfirm.sendKeys("luqmn123");
	}
	public void verify_passconfirm_clickable(String passsconfirm) {
		String actualvalue=passconfirm.getAttribute(passsconfirm);
	}
	public void verify_privacy() {
		privacy.click();
	}
	public void verify_privacy_clickabl(String privacyy) {
		String actualvalue=privacy.getAttribute(privacyy);
	}
	public void verify_continue() {
		continuee.click();
	}
	public void verify_emaildd() {
		emailaddress.click();
		emailaddress.sendKeys("samira@gmail.com ");
	}
	public void verify_email_clickablee(String emailll) {
		String actualemail=emailaddress.getAttribute(emailll);
	}
	public void verify_password() {
		passaddress.click();
		passaddress.sendKeys("luq123");
	}	
	public void verify_pass_clickablee(String passwordd) {
		String actualpass=passaddress.getAttribute(passwordd);
	}
	public void verify_login() {
		loginn.click();
	
	}

	public void verify_login_button_is_clickablee() {
	JavascriptExecutor joj=	(JavascriptExecutor)driver;
	joj.executeScript("arguments[0].click()", login);
	login.click();
	}
	public void veerify_emailddd() {
		emailaddress.click();
		emailaddress.sendKeys("samira@gmail.com ");
	}
	public void veerify_emaill_clickablee(String emailll) {
		String actualemail=emailaddress.getAttribute(emailll);
	}
	public void veerifyy_password() {
		passaddress.click();
		passaddress.sendKeys("luq123");
	}	
	public void veerify_pass_clickablee(String passwordd) {
		String actualpass=passaddress.getAttribute(passwordd);
	}
	public void veerify_login() {
		loginn.click();
	
	}	
}