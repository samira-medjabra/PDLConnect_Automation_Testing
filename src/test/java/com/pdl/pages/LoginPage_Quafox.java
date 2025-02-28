package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class LoginPage_Quafox extends CommonMethods {
	
	WebDriver driver = Driver.getDriver();


public LoginPage_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

@FindBy(xpath="(//input[@type='text'])[2]")
public WebElement EmailAdresseField;
@FindBy(xpath="//input[@type='password']")
public WebElement Password_field;
@FindBy(xpath="//input[@type='submit']")
public WebElement submit_button;
@FindBy(xpath=" //span[text()='Wish List (1)']")
public WebElement wishlist_option;
@FindBy(xpath="//table[@class='table table-bordered table-hover']")
public WebElement Wishlist_table;



public void LogIn_should_Be_Succesfull() {
	    String actualURL=driver.getCurrentUrl();
		String expectedURL="https://tutorialsninja.com/demo/index.php?route=account/login";
		Assert.assertEquals(expectedURL,actualURL);
		waitFor(10);
		EmailAdresseField.sendKeys("tina.anita999@gmail.com");
		Password_field.sendKeys("aaaaaa6");
		submit_button.click();
	}

public void Verify_Wishlist_option_shouldBeClickable_andRedirect_me_to_the_right_page() {
	wishlist_option.click();
	waitFor(10);
	EmailAdresseField.sendKeys("tina.anita999@gmail.com");
	Password_field.sendKeys("aaaaaa6");
	submit_button.click();
	
}

public void Verify_the_wishlist_page_displays_all_the_items_added_by_the_user() {
	int expectedItems = 1;
	Assert.assertEquals(expectedItems, Wishlist_table.getSize());

 

	
	
	
}
}
