 @RegistartionPageStaticHeader
 Feature: Registration Page-Static Heade 
       I want to use this template for my feature file 

  @TC_007  @Verify_the_header_Functionality_On_HomePage
  Scenario: Verify the header Functionality on HomePage
  Given I Open the Registration Page 
  Then  I Validate that header is displayed at the top of the page
  Then I scroll down to see if the header remains in place
     
  @TC_008  @Verify_clickingTheCurrencyOption-inTheheader_displays_AT_DropdownWith_ValidCurrencyOptions  
  Scenario: Verify clicking the currency option in the header displays a dropdown with valid currency options
  Given I Open Registration Page.
  Then I Locate the currency dropdown in the header
  Then I Click the dropdown and verify that it displays a list of valid currency options (e.g., USD, EUR).
  
   @TC_009 @VerifySelecting_A_CurrencyUpdatesProductPricesAcross_all_pages
   Scenario: Verify selecting a currency updates product prices across all pages
   Given Open the homepage  
   And I Select a different currency from the dropdown (e.g., EUR)
   Then I Navigate to the product page and verify that the product prices are displayed in the selected currency. 
    
  @TC_0010 @Verify_clickingTthe_“ContactUs”_link_navigates_to_TheCorrect_page 
  Scenario: Verify clicking the “Contact Us” link navigates to the correct page 
  Given I Open the homepage 
  Then I Click the “Contact Us” option in the header 
  And I Verify that the user is redirected to the “Contact Us” page
      
  @TC_0011 @Verify_the_ContactUs_page_displays_an_accurate_email_addressAndPhoneNumber
  Scenario: Verify the “Contact Us” page displays an accurate email address and phone number
  Given I Navigate to the “Contact Us” page
  Then I Locate the email address section.and phone number
  And I Verify that the displayed email addressand phone number is valid and correct    
  
  @TC_0012 @VerifyThe_ContactUs_pageDisplaysThe_physicalAddress_of_the_store_and_functional_contact_form
  Scenario: Verify the “Contact Us” page displays the physical address of the store and  a functional contact form
  Given I Navigate to the “Contact Us” page
  Then I Locate the physical address section. and contact form
  And I Verify that the displayed address is correct and contact form are functional
  
  @TC_0013 @Verify_clicking_the_account_dropdown_displays_“Login”_and_“Registration”_options
  Scenario: Verify clicking the account dropdown displays “Login” and “Registration” options
  Given I Locate the account dropdown in the header
  Then I Click the dropdown and verify that “Login” and “Registration” options are displayed   
 
 @TC_0014 @Verify_wishlist_option_displays_in_the_header_and_after_clicking_the_wishlist_the_user_can_see_user's_wishlist 
 Scenario: Verify wishlist option displays in the header and after clicking the wishlist the user can see user's wishlist 
 Given I Log in with valid credentials
 Then I Click the “Wishlist” option in the header
 And I Verify that the wishlist page displays all the items added by the user
 
 @TC_0015 @Verify_adding_a_product_to_the_wishlist_updates_the_wishlist_with_the_correct_product_details
 Scenario: Verify adding a product to the wishlist updates the wishlist with the correct product details
 Given I Navigate to a product page
 Then I Click the “Add to Wishlist” button
 And I Open the wishlist and verify that the product is displayed with the correct name, image, and price.