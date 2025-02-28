package com.pdl.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class RegistrationPage_Quafox extends CommonMethods {
	WebDriver driver = Driver.getDriver();
	
	public RegistrationPage_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

//Locate Elements:
	@FindBy(xpath="//nav[@id='top']")
	public WebElement header_located;
	
	@FindBy(xpath=" //form[@id='form-currency']//button[contains(@class, 'dropdown-toggle')]")
	public WebElement CurrencyDropDown;
	
	@FindBy(xpath="//button[text()='€Euro']")
	public WebElement select_Currency;
	
	@FindBy(xpath="//ul[contains(@class, 'navbar-nav')]//a[text()='Tablets']")
	public WebElement tablets_product;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	public WebElement contactUS_button;
	
	@FindBy(xpath=" //span[text()='My Account']")
	public WebElement MyAccount_DropDown;
	
	@FindBy(xpath=" //a[text()='Register']")
	public WebElement Register_In_The_DropDown;
	
	@FindBy(xpath=" //a[text()='Login']")
	public WebElement Login_In_The_DropDown;
	
public void VerifyRegistrationPageIsDisplayed() {
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/register";
		Assert.assertEquals(expectedURL,actualURL);
		
	}
public void VerifyThe_headerDisplayed_At_TheTopOf_ThePage() {
	 Assert.assertTrue(header_located.isDisplayed());
	 int headerPosition = header_located.getLocation().getY();
     Assert.assertEquals(0, headerPosition);
}

public void VerifyTheHeaderRemainInPlaceWhileScrollingDown() {
	int initialPosition = header_located.getLocation().getY();
    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 waitFor(10);
	 int positionAfterScroll = header_located.getLocation().getY();
	 Assert.assertEquals(initialPosition, positionAfterScroll);
	}

public void VerifyRegistrationPageIsopened(){ 
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/register";
	Assert.assertEquals(expectedURL,actualURL);      
          }

public void Verify_theCurrencyDropdown_located_InThe_header() {
	 Assert.assertTrue(CurrencyDropDown.isDisplayed());
	 }

public void VerifyTheCurrency_dropdown_Displays_A_listOf_ValidCurrency_Options() {
	waitFor(10);
	CurrencyDropDown.click();
}

public void Verify_the_differentCurrency_fromTheDropdown_Are_displayed() {
	waitFor(10);
	CurrencyDropDown.click();
	select_Currency.click();
	
}
public void Verify_the_product_pageAnd_the_productPricesAreDisplayedIn_The_selected_currency() {
	tablets_product.click();
	waitForElement(tablets_product);
}
public void HomePage_Opened() { 
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/register";
	Assert.assertEquals(expectedURL,actualURL);
	}

public void Verify_the_ContactUs_option_in_theHeader() {
	 Assert.assertTrue(contactUS_button.isDisplayed());
	
}
public void Verify_the_ContactUs_optionShould_Be_ClickableAndRedirect_theUser_ToTheCorrectPage() {
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	waitFor(10);
	contactUS_button.click();
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://tutorialsninja.com/demo/index.php?route=information/contact";
	Assert.assertEquals(expectedURL,actualURL);
}

public void Verify_MyAccountdropdown_from_header_should_be_located() {
	Assert.assertTrue(MyAccount_DropDown.isDisplayed());
}

public void Verify_the_Login_and_Registration_options_should_displayed() {
	MyAccount_DropDown.click();
	
}



}
	 
