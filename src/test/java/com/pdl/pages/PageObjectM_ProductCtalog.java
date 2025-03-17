package com.pdl.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageObjectM_ProductCtalog extends  CommonMethods{
	
	 WebDriver driver=Driver.getDriver();
	

	 public PageObjectM_ProductCtalog () {
		 PageFactory.initElements(Driver.getDriver(), this);
		 System.out.println("samira2 is a new Tester");
	 }
		 @FindBy(xpath = "//nav[@id='menu']")
			public WebElement statictopmenu;	
		 
		 @FindBy(xpath = "//a[@class='list-group-item active']")
			public WebElement phone; 
		 @FindBy(xpath = "//a[text()='iPhone']")
			public WebElement iphone; 

		 @FindBy(xpath = "//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
		 	public WebElement topmenu; 

		 @FindBy(xpath = "(//a[text()='Desktops'])[1] ")
		 	public WebElement desktop; 
		 
		 @FindBy(xpath = "//a[text()='HTC Touch HD'] ")
		 	public WebElement productkey; 
		 
		
		 @FindBy(xpath = "  (//a[@class='dropdown-toggle'])[1]")
		  public WebElement desktopp; 
		
		 @FindBy(xpath = " //a[text()='iMac']")
		  public WebElement mac; 
		 @FindBy(xpath = " //a[text()='Tablets']")
		  public WebElement tablet;
		 
		 @FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1'] ")
		  public WebElement samsunggalaxy;
		
		 @FindBy(xpath = "//a[text()='iPhone']")
		  public WebElement iphonee;
		 
		 @FindBy(xpath = " //a[text()='Tablets']")
		  public WebElement tablett;
		 @FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1'] ")
		  public WebElement samsunggalaxyy;
		 
		 public void verify_home_page_navigation() {
		 String actualURL=	 driver.getCurrentUrl();
		String expectedurl="https://tutorialsninja.com/demo/index.php?route=account/register ";
		
	 }
	 public void verify_the_static_top_menu(){
		 statictopmenu.click();
	 }
	 public void verify_validation_of_product(){
		 phone.click();
		 phone.sendKeys("//a[text()='iPhone']");
		 
	 }
	 public void verify_validation_of_product_iphone(){
		 iphone.click();
		 
	 }
	 public void verify_Navigate_to_the_top_menu_option () {
		 topmenu.click();
		 
	 }
	 public void Verify_the_product_catalog_option_if_its_clickable () {
		 desktop.click();
		 
	 }
	 public void verify_product_keyword_is_clickable(String product) {
		 productkey.click();
		 productkey.sendKeys(" HTC Touch HD");
	 }
	 public void verify_keyword_called(String productvalue) {
		 String actualvalue=  productkey .getAttribute(productvalue);
	 }
	 
	 public void verify_Navigate_to_the_product_catalog_option_and_locate_desktops() {
		 desktopp.click();
	 }
	 public void verify_click_on_macbook() {
		 mac.click();
	 }
	 public void verify_Navigate_to_the_product_catalog_and_locate_tablets(){
		 tablet.click();
	 }
	 public void verify_Enter_the_product_selection_Samsung_Galaxy_Tab_click_on_the_button() {
		 samsunggalaxy.click();
	 }
	public void verify_Navigate_to_the_product_catalog_and_locate_phones_PDA(){
		iphonee.click();
	}
	public void verify_tablet() {
		tablett.click();
	}
	public void verify_validation_galaxy() {
		samsunggalaxyy.click();
	}
	
	
	
}