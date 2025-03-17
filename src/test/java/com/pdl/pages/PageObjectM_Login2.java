package com.pdl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.Driver;

import junit.framework.Assert;

public class PageObjectM_Login2 {
	 WebDriver driver=Driver.getDriver();
		

	 public  PageObjectM_Login2 () {
		 PageFactory.initElements(Driver.getDriver(), this);
		 System.out.println("samira2 is a new Tester");
}
	 @FindBy(xpath = "(//a[@class='list-group-item'])[1]")
		public WebElement login;
	 
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

}