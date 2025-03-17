package com.pdl.step_definitions;

import com.pdl.pages.PageObjectM_search;

import io.cucumber.java.en.*;


public class StepD_search_functionality {
	
	
	PageObjectM_search ob=new PageObjectM_search();
	
	
	@Given("Navigate to search home page")
	public void navigate_to_search_home_page() {
	   ob.verify_home_page_accessibility();
	}

	@Then("click on search button Enter an appropriate keyword {string}")
	public void click_on_search_button_enter_an_appropriate_keyword(String searchvalue) {
	   ob.verify_click_on_search_and_insert_value(searchvalue);
	   ob.verify_validate_keyword(searchvalue);
	}

	@And("Click on search button to validate the existing product")
	public void click_on_search_button_to_validate_the_existing_product() {
	   ob.verify_keyword_inserted();
	}


    @When("Navigate to the drop-down menu on desktop button and Enter a product keyword {string}.")
    public void navigate_to_the_drop_down_menu_on_desktop_button_and_enter_a_product_keyword(String pc) {
   ob.verify_click_on_search_and_insert_value(pc);
   ob.verify_validate_keyword(pc);
   }

     @Then("Click the search button.")
     public void click_the_search_button() {
    	 ob.verify_keyword_inserted();
    
   }

@Then("Navigate to the drop-down menu on laptops&notebooks button and Enter a product keyword {string}.")
public void navigate_to_the_drop_down_menu_on_laptops_notebooks_button_and_enter_a_product_keyword(String laptop) {
   ob.verify_laptop_notebooks(laptop);
   ob.verify_keyword_inserted();
}

@Then("Navigate to the drop-down menu on components button and Enter a product keyword {string}.")
public void navigate_to_the_drop_down_menu_on_components_button_and_enter_a_product_keyword(String component) {
   ob.verify_components(component);
   ob.verify_monitor_inserted(component);
}

@When("Navigate to the drop-down menu on  button MP3 playersand Enter a product keyword {string}.")
public void navigate_to_the_drop_down_menu_on_button_mp3_playersand_enter_a_product_keyword(String MP3) {
  ob.verify_M3Players(MP3);
  ob.verify_MP3_inserted(MP3);
}



@When("navigate to components and insert {string} and click on it")
public void navigate_to_components_and_insert_and_click_on_it(String componenets) {
    ob.verify_navigation_to_components(componenets);
}

@Then("Click on the drop-down button And enter name Name A-Z")
public void click_on_the_drop_down_button_and_enter_name_name_a_z() {
  ob.verify_navigation_to_components(null);
  ob.verify_navigation_to_monitors(null);
 
}

@And("navigate to components and click on monitors and click on it")
public void navigate_to_components_and_click_on_monitors_and_click_on_it() {
   ob.verify_navigation_to_components_and_monitors();
}

@Then("Click on the drop down button and enter price high-Low")
public void click_on_the_drop_down_button_and_enter_price_high_low() {
   ob.verify_drop_down();
}

@When("Click on search button.")
public void click_on_search_button() {
   ob.verify_click_on_search_and_insert_value(null);
}

@When("Enter the product name {string}.")
public void enter_the_product_name(String string) {
  ob.verify_mac_option();
}

@Then("Click on sort  by {string} button.")
public void click_on_sort_by_button(String string) {
   ob.verify_sortby();
}



    





{
   
}

   }
