package com.pdl.step_definitions;

import com.pdl.pages.PageObjectM_Login2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_2 {
	
	PageObjectM_Login2 ob=new PageObjectM_Login2();
	
	
	
	
	@Given("click on loginn button")
	public void click_on_loginn_button() {
	   ob.verify_home_page_navigation();
	}

	@Given("click on email addresss and insertt {string}")
	public void click_on_email_addresss_and_insertt(String email) {
ob.verify_emaildd();
ob.verify_email_clickablee(email);
	}

	@When("click on passwordd an insertt {string}")
	public void click_on_passwordd_an_insertt(String pass) {
	ob.verify_emaildd();
	ob.verify_email_clickablee(pass);
	}

	@Then("click on loginbuttonnn")
	public void click_on_loginbuttonnn() {
	  ob.verify_login();
	}



}
