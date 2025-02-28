package com.pdl.step_definitions;

import java.sql.Driver;

import com.pdl.pages.Contact_UsPage_Quafox;
import com.pdl.pages.LoginPage_Quafox;
import com.pdl.pages.RegistrationPage_Quafox;

import io.cucumber.java.en.*;
 

public class A1_TCS7_21_RegistrationStaticHeader_QA2 {
	RegistrationPage_Quafox RegistrationPage= new RegistrationPage_Quafox();
	Contact_UsPage_Quafox ContactUs=new Contact_UsPage_Quafox();
	LoginPage_Quafox login_page=new LoginPage_Quafox();
 
	
@Given("I Open the Registration Page")
public void i_open_the_registration_page() {
	RegistrationPage.VerifyRegistrationPageIsDisplayed();
     
}

@Then("I Validate that header is displayed at the top of the page")
public void i_validate_that_header_is_displayed_at_the_top_of_the_page() {
	RegistrationPage.VerifyThe_headerDisplayed_At_TheTopOf_ThePage();
    
}

@Then("I scroll down to see if the header remains in place")
public void i_scroll_down_to_see_if_the_header_remains_in_place() {
	RegistrationPage.VerifyTheHeaderRemainInPlaceWhileScrollingDown();
}
@Given("I Open Registration Page.")
public void i_open_registration_page() {
  RegistrationPage.VerifyRegistrationPageIsopened();   
}
 
@Then("I Locate the currency dropdown in the header")
public void i_locate_the_currency_dropdown_in_the_header() {
	RegistrationPage.Verify_theCurrencyDropdown_located_InThe_header();
}   

@Then("I Click the dropdown and verify that it displays a list of valid currency options \\(e.g., USD, EUR).")
public void i_click_the_dropdown_and_verify_that_it_displays_a_list_of_valid_currency_options_e_g_usd_eur() {
	RegistrationPage.VerifyTheCurrency_dropdown_Displays_A_listOf_ValidCurrency_Options();
     
}

@Given("Open the homepage")
public void open_the_homepage() {
	RegistrationPage.HomePage_Opened();
     
}

@And("I Select a different currency from the dropdown \\(e.g., EUR)")
public void i_select_a_different_currency_from_the_dropdown_e_g_eur() {
   RegistrationPage.Verify_the_differentCurrency_fromTheDropdown_Are_displayed();  
}

@Then("I Navigate to the product page and verify that the product prices are displayed in the selected currency.")
public void i_navigate_to_the_product_page_and_verify_that_the_product_prices_are_displayed_in_the_selected_currency() {
  RegistrationPage.Verify_the_product_pageAnd_the_productPricesAreDisplayedIn_The_selected_currency();   
}

@Given("I Open the homepage")
public void i_open_the_homepage() {
	RegistrationPage.HomePage_Opened();
     
}

@Then("I Click the “Contact Us” option in the header")
public void i_click_the_contact_us_option_in_the_header() {
	RegistrationPage.Verify_the_ContactUs_option_in_theHeader();
     
}

@And("I Verify that the user is redirected to the “Contact Us” page")
public void i_verify_that_the_user_is_redirected_to_the_contact_us_page() {
   RegistrationPage.Verify_the_ContactUs_optionShould_Be_ClickableAndRedirect_theUser_ToTheCorrectPage();  
}

@Given("I Navigate to the “Contact Us” page")
public void i_navigate_to_the_contact_us_page() {
	ContactUs.Verify_The_Contact_Us_PageShouldOpen();
}     

@Then("I Locate the email address section.and phone number")
public void i_locate_the_email_address_section_and_phone_number() {
    ContactUs.VerifyThe_physicalAddress_section_andPhoneNumber_should_be_displayed () ;
}

@And("I Verify that the displayed email addressand phone number is valid and correct")
public void i_verify_that_the_displayed_email_addressand_phone_number_is_valid_and_correct() {
	ContactUs.VerifyThe_email_address_and_phone_number_section_should_be_valid();
  
}

@Then("I Locate the physical address section. and contact form")
public void i_locate_the_physical_address_section_and_contact_form() {
    ContactUs.Verify_the_physical_address_sectionAnd_ContactForme_should_Be_Displayed();
}

@And("I Verify that the displayed address is correct and contact form are functional")
public void i_verify_that_the_displayed_address_is_correct_and_contact_form_are_functional() {
	ContactUs.Verify_the_displayed_address_should_be_correct_and_contact_form_should_be_functional();
}

@Given("I Locate the account dropdown in the header")
public void i_locate_the_account_dropdown_in_the_header() {
    RegistrationPage.Verify_MyAccountdropdown_from_header_should_be_located();
}

@Then("I Click the dropdown and verify that “Login” and “Registration” options are displayed")
public void i_click_the_dropdown_and_verify_that_login_and_registration_options_are_displayed() {
	RegistrationPage.Verify_the_Login_and_Registration_options_should_displayed();
	 
}

@Given("I Log in with valid credentials")
public void i_log_in_with_valid_credentials() {
     login_page.LogIn_should_Be_Succesfull();
}

@Then("I Click the “Wishlist” option in the header")
public void i_click_the_wishlist_option_in_the_header() {
    login_page.Verify_Wishlist_option_shouldBeClickable_andRedirect_me_to_the_right_page();
}

@Then("I Verify that the wishlist page displays all the items added by the user")
public void i_verify_that_the_wishlist_page_displays_all_the_items_added_by_the_user() {
     
}
























}