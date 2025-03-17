package com.pdl.pages;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codoid.products.fillo.Select;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;
import com.sun.tools.javac.main.Option;

public class PageObjectM_search extends CommonMethods{
	private static final int Z = 0;
	private static final int A = 0;
	WebDriver driver=Driver.getDriver();

	 public PageObjectM_search  () {
		 PageFactory.initElements(Driver.getDriver(), this);
		 System.out.println("samira is a new Testerr");
	 }
	 @FindBy(xpath = "//input[@name='search']")
		public WebElement search;
	 @FindBy(xpath = "//input[@class='form-control input-lg']")
		public WebElement searchh;            //a[text()='PC (0)']
	 
	 @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1] ")
		public WebElement laptop;
	 
	 @FindBy(xpath = "public WebElement laptop;")
		public WebElement pc;
	
	 @FindBy(xpath = " (//button[@type='button'])[1] ")
		public WebElement search4;
	 @FindBy(xpath = " (//a[@class='dropdown-toggle'])[1] ")
	 	public WebElement laptopnotbooks;  
	 @FindBy(xpath = " (//a[@class='dropdown-toggle'])[1]")
	 	public WebElement components;
     
	 @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1] ")
	  	public WebElement MP3Playaers;
	
	 @FindBy(xpath = " //input[@class='btn btn-primary']")
	  	public WebElement clicklogin;
			 
	 @FindBy(xpath = " (//a[@class='list-group-item'])[1] ")
		public WebElement login;
			 
			
      @FindBy(xpath = " //input[@id='input-email']")
		public WebElement email;
   
      @FindBy(xpath = "  //input[@id='input-password'] ")
		public WebElement pass;
      
	 @FindBy(xpath = " (//a[@class='dropdown-toggle'])[1]")
	 	public WebElement component2;
	 @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1] ")
	  	public WebElement monitor;
      
	
 
	 @FindBy(id = " input-sort")                          
	  	public WebElement  A_Z;        
	
	 
	 @FindBy(id = " //button[@class='btn btn-default btn-lg'] ")                          
	  	public WebElement searchbutton ;
    
	 @FindBy(id = " (//label[@class='input-group-addon'])[1]")                          
	  	public WebElement sortby ;
	
	 
			  
	 @FindBy(id = " (//select[@class='form-control'])[1] ")                          
			  	public WebElement name ;
	 
	 @FindBy(id = "(//select[@class='form-control'])[1] ")                          
			  	public WebElement  AZ ;
		
	 @FindBy(xpath = " (//a[@class='dropdown-toggle'])[1]")
	 	public WebElement component3;
	 @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1] ")
	  	public WebElement monitor3;	 
	
	 @FindBy(xpath = " //select[@id='input-sort']")
	  	public WebElement dropdown;	 
	 @FindBy(xpath = "//option[text()='Price (High > Low)'] ")
	  	public WebElement price;
	
	
	 @FindBy(xpath = "//a[text()='Mac'] ")
	  	public WebElement mac;
	
			 @FindBy(xpath = " (//select[@class='form-control'])[1]")
			  	public WebElement sortbyy;
 		
	                
	
		
		 
	 
	 
			 
        public void verify_home_page_accessibility() {
        	String actualURL=driver.getCurrentUrl();
        	String expectedURL=" https://tutorialsninja.com/demo/index.php?route=product/category&path=20_27";
        	
}
        public void verify_login() {
        	login.click();
        	email.click();
        	pass.click();
        	clicklogin.click();
        }
      
        
        
        
         public void verify_click_on_search_and_insert_value(String searchh) {
        	search.click();
        	search.sendKeys("pc");
         }
        public void verify_validate_keyword(String value) {
        	String actualvalue=search.getAttribute(value);
        }
        public void verify_keyword_inserted() {
        	searchh.click();
        }
        
        public void verify_navigation_to_the_product_catalog_and_ensert_keyword(String desktop) {
        	laptop.click();
        	laptop.sendKeys("pc");
        	
        }
        public void verify_inserted_keyword(String value) {
        	String actualvalue=laptop.getAttribute(value);
        }
       
        public void verify_laptop_notebooks(String lap) {
        	laptopnotbooks.click();
        	laptopnotbooks.sendKeys("windows");
        }
        public void verify_keyword_inserted(String keywordvalue) {
        	String actualvalue=laptopnotbooks.getAttribute(keywordvalue);
        }
        
        public void verify_components(String component) {
        	 components.click();
        	 components.sendKeys("monitors");
        }
        public void verify_monitor_inserted(String monitorvalue) {
        	 String actualvalue= components.getAttribute(monitorvalue);
        }
        public void verify_M3Players(String MP3) {
        	MP3Playaers.click();
        	MP3Playaers.sendKeys("test18");
        }
        public void verify_MP3_inserted(String MP3value) {
        	String actualvalue=MP3Playaers.getAttribute(MP3value);
        }
        
        
        
        
        
        public void verify_navigation_to_components(String monitors) {
        	component2.click();
        	
        }
        public void verify_navigation_to_monitors(String monitors) {
        	monitor.click();
        	
        }
     
        
        
        public void verify_navigation_to_components_and_monitors() {
        	component3.click();
        	monitor3.click();
        }
        public void verify_drop_down() {
        	dropdown.click();
        	
        }
        
       public void verify_mac_option() {
    	mac.click();
       }
    	public void verify_sortby() {
    		sortbyy.click();
    	}
    	 
    
		
		}
		
        

        
        
        
        
        
    	   
       
        
        
        
        

