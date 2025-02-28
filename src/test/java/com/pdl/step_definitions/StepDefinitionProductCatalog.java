package com.pdl.step_definitions;

import com.pdl.pages.PageObjectM_ProductCtalog;

import io.cucumber.java.en.*;


public class StepDefinitionProductCatalog {
	PageObjectM_ProductCtalog ob=new PageObjectM_ProductCtalog();
	@Given("Navigate to the home page")
	public void navigate_to_the_home_page() {
	   ob.verify_home_page_navigation();
	}

	@When("Locate and click on the Product Catalog option in the static top menu.")
	public void locate_and_click_on_the_product_catalog_option_in_the_static_top_menu() {
	   ob.verify_the_static_top_menu();
	}

	@And("Enter the keyword of the product selection")
	public void enter_the_keyword_of_the_product_selection() {
	ob.verify_validation_of_product();
	}

	@Then("Click enter option")
	public void click_enter_option() {
	  ob.verify_validation_of_product_iphone();
	  
	}
	  @When("Navigate to the top menu option")
	  public void navigate_to_the_top_menu_option() {
	    ob.verify_Navigate_to_the_top_menu_option(); 
	  }

	  @When("Verify the product catalog option if its clickable")
	  public void verify_the_product_catalog_option_if_its_clickable() {
	   ob.Verify_the_product_catalog_option_if_its_clickable();  
	  }

	  @Then("Enter a product keyword {string} to see a list of products selected")
	  public void enter_a_product_keyword_to_see_a_list_of_products_selected(String product) {
		  ob.verify_product_keyword_is_clickable(product);
		  ob.verify_keyword_called(product);
	  }
	  @When("Navigate to the product catalog option and locate desktops")
	  public void navigate_to_the_product_catalog_option_and_locate_desktops() {
	     ob.verify_Navigate_to_the_product_catalog_option_and_locate_desktops();
	  }

	  @When("Enter the product selection MacBook Proclick on the button.")
	  public void enter_the_product_selection_mac_book_proclick_on_the_button() {
	      ob.verify_click_on_macbook();
	  }

	  @Then("Navigate to the product catalog and locate tablets")
	  public void navigate_to_the_product_catalog_and_locate_tablets() {
	    ob.verify_Navigate_to_the_product_catalog_and_locate_tablets();
	  }

	  @Then("Enter the product selection Samsung Galaxy Tab click on the button")
	  public void enter_the_product_selection_samsung_galaxy_tab_click_on_the_button() {
	     ob.verify_Navigate_to_the_product_catalog_and_locate_tablets();
	  }

	  @When("Navigate to the product catalog and locate phones&PDA's")
	  public void navigate_to_the_product_catalog_and_locate_phones_pda_s() {
	      ob.verify_Navigate_to_the_product_catalog_and_locate_phones_PDA();
	  }

	  @When("Enter the product selection Palm Treo Pro")
	  public void enter_the_product_selection_palm_treo_pro() {
	  ob.verify_tablet();
	  }
	  @Then("Navigate to the Tablets")
	  public void navigate_to_the_tablets() {
	     ob.verify_tablet();
	  }
	 

	  @Then("Enter the product selection Samsung Galaxy Tab")
	  public void enter_the_product_selection_samsung_galaxy_tab() {
	      ob.verify_Enter_the_product_selection_Samsung_Galaxy_Tab_click_on_the_button();
	  }




}



