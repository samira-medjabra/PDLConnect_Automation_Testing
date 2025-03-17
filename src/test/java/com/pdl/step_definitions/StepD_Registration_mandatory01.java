package com.pdl.step_definitions;


import com.pdl.pages.PageObjectM_Registration01;

import io.cucumber.java.en.*;

public class StepD_Registration_mandatory01 {
	
	PageObjectM_Registration01 ob=new PageObjectM_Registration01();
	
	
	
	
	@Given("Navigate to the Registration home pagee")
	public void navigate_to_the_registration_home_pagee() {
	 ob.verify_Navigate_to_the_Registration_home_pagee();
	}

	@When("click on First Name and insert the value  {string} as first name")
	public void click_on_first_name_and_insert_the_value_as_first_name(String first) {
	    ob.verify_click_on_first_name_insert_incorrect_value(first);
	    ob.verify_first_name_inserting_incorrectly(first);
	}

	@And("click on Last Name and insert the value  {string} as last name")
	public void click_on_last_name_and_insert_the_value_as_last_name(String last) {
	   ob.verify_click_on_last_name_insert_incorrect_value(last);
	   ob.verify_last_name_inserting_incorrectly(last);
	}

	@Then("click on E-Mail and insert the value  {string} as email")
	public void click_on_e_mail_and_insert_the_value_as_email(String email) {
	   ob.verify_incorrect_email(email);
	   ob.verify_incorrect_email_inserted(email);
	}

	@And("click on Telephone and insert the value  {string} as telephone number")
	public void click_on_telephone_and_insert_the_value_as_telephone_number(String phonen) {
	   ob.verify_incorrect_phone_number( phonen);
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
	  ob.verify_click_on_continue_button();
	  
	  
	
	  }

 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}




