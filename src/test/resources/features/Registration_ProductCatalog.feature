
@tag
Feature: Registration_Page Product catalog

  @TC_04 
  
  Scenario: Validate View static top menu
    Given Navigate to the home page
    When Locate and click on the Product Catalog option in the static top menu.
    And Enter the keyword of the product selection
    Then Click enter option 
   

 @TC_05
  Scenario: Validate product catalog option on the top menu option
    Given Navigate to the home page
    When Navigate to the top menu option 
    And Verify the product catalog option if its clickable 
    Then Enter a product keyword "MacBook" to see a list of products selected
    
  @Tc_06 
  Scenario: Verify that the browse through the product catalog  is easy.
    Given Navigate to the home page
    And Navigate to the top menu option
    When Navigate to the product catalog option and locate desktops 
    And Enter the product selection MacBook Proclick on the button.
     Then Navigate to the product catalog and locate tablets
     And Enter the product selection Samsung Galaxy Tab click on the button
     When Navigate to the product catalog and locate phones&PDA's
     And Enter the product selection Palm Treo Pro
     Then Navigate to the Tablets
     And Enter the product selection Samsung Galaxy Tab
    
    
    