package com.pdl.step_definitions;

import com.pdl.pages.PageObjectM_Registration2;

import io.cucumber.java.en.*;


public class Step_Registration_MandatoryField_02 {
	
	
	PageObjectM_Registration2 homeP=new PageObjectM_Registration2();


	@Given("Navigate to the Registration home page")
	public void navigate_to_the_registration_home_page() {
		homeP.verify_user_is_on_home_page();
	}
	@When("click on First Name and insert value  {string} as first name")
	public void click_on_first_name_and_insert_value_as_first_name(String firstname) {
		homeP.Verify_and_click_on_first_name_and_insert_value(firstname);
		homeP.verify_first_name_is_correctly_inserted(firstname);
	}

	@And("click on Last Name and insert value  {string} as last name")
	public void click_on_last_name_and_insert_value_as_last_name(String lastname) {
		homeP.Verify_click_on_Last_Name_and_insert_value(lastname);
		homeP.verify_last_name_is_correctly_inserted(lastname);
	}

	@Then("click on E-Mail and insert {string} as email")
	public void click_on_e_mail_and_insert_as_email(String emailfield) {
		homeP.verify_click_on_E_Mail_and_insert(emailfield);
		homeP.Verify_email_correctly_insertimg(emailfield);
	}

	@And ("click on Telephone and insert {string} as telephone number")
	public void click_on_telephone_and_insert_as_telephone_number(String phonenumber) {
		homeP.verify_click_on_Telephone_and_insert(phonenumber);
		homeP.Verify_phonrNumber_correctly_insertimg(phonenumber);
	}

	@When("clicking on Password and insert {string} as password")
	public void clicking_on_password_and_insert_as_password(String passw) {
	    homeP.verify_click_on_password_and_click(passw);
	    homeP.Verify_password_correctly_inserted(passw);
	}

	@And("click on confirm password and insert {string} as password")
	public void click_on_confirm_password_and_insert_as_password(String passcon) {
	    homeP.verifi_click_0n_confirm_password(passcon);
	    homeP.verify_confirm_pass_inserting(passcon);
	}
	@Then("click on privacy button")
	public void click_on_privacy_button() {
	    homeP.verify_privacy_button();
	}
	@Then("click on Continue button to register")
	public void click_on_continue_button_to_register() {
	    homeP.verify_click_on_continue_button();
	}

}

