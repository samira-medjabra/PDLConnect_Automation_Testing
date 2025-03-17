package com.pdl.step_definitions;

import com.pdl.pages.PageObjectM_Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepD_Login2 {
	
	PageObjectM_Login ob=new PageObjectM_Login();
	
	
	
	@Given("Navigate to login page")
	public void navigate_to_login_page() {
	   ob.verify_home_page_navigation();
	}

	@Given("click on login button")
	public void click_on_login_button() {
	 
	  ob.verify_login_button_is_clickable();
	}
	@When("click on First Name and insert valuee  {string} as first name")
	public void click_on_first_name_and_insert_valuee_as_first_name(String first) {
	  ob.verify_fields();
	  ob.verify_fields(first);
	}

	@When("click on Last Name and insert valuee  {string} as last name")
	public void click_on_last_name_and_insert_valuee_as_last_name(String last) {
	  ob.verify_lastname();
	  ob.verify_lastname_clickable(last);
	}

	@Then("click on E-Mail and insertt {string} as email")
	public void click_on_e_mail_and_insertt_as_email(String emaill) {
	  ob.verify_email();
	  ob.verify_email_clickable(emaill);
	}

	@Then("click on Telephone and insertt {string} as telephone number")
	public void click_on_telephone_and_insertt_as_telephone_number(String tel) {
	  ob.verify_phone();
	  ob.verify_phone_clickable(tel);
	}

	@When("clicking on Password and insertt {string} as password")
	public void clicking_on_password_and_insertt_as_password(String paass) {
	   ob.verify_passconfirm();
	   ob.verify_passconfirm_clickable(paass);
	}

	@When("click on confirm password and insertt {string} as password")
	public void click_on_confirm_password_and_insertt_as_password(String paass) {
		 ob.verify_passconfirm_clickable(paass);
	}

	@Then("click on privacy buttonn")
	public void click_on_privacy_buttonn() {
	   ob.verify_privacy();
	   
	}

	@Then("click on Continue button to registerr")
	public void click_on_continue_button_to_registerr() {
	   ob.verify_continue();
	}

	
	
	@Given("click on email address and insert {string}")
	public void click_on_email_address_and_insert(String email) {
	   ob.verify_email();
	   ob.verify_email_clickable(email);
	}

	@When("click on password an insert {string}")
	public void click_on_password_an_insert(String pass) {
	ob.verify_pass();
	ob.verify_pass_clickable(pass);
	}

	@Then("click on loginbutton")
	public void click_on_loginbutton() {
	 ob.verify_login();
	}
	@Given("click on login buttonn")
	public void click_on_login_buttonn() {
	  ob.veerify_login();
	}

	@Given("click on email address and insertt {string}")
	public void click_on_email_address_and_insertt(String eemail) {
	   ob.veerify_emailddd();
	   ob.verify_email_clickable(eemail);
	}

	@When("click on password an insertt {string}")
	public void click_on_password_an_insertt(String string) {
	ob.veerifyy_password();
	ob.veerifyy_password();
	}

	@Then("click on loginbuttonn")
	public void click_on_loginbuttonn() {
	   ob.veerify_login();
	}
	

}
