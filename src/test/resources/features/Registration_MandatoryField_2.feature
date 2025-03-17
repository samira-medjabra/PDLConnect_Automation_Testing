@Registration
Feature: Registration mandatory field 01




 @TC_01  @Validate_successful_Registration
  Scenario: 01 Validate Registration webpage with mandatory field
  Given Navigate to the Registration home page
  When click on First Name and insert value  "samira" as first name
  And click on Last Name and insert value  "medj" as last name 
  Then click on E-Mail and insert "samira@gmail.com" as email
  And click on Telephone and insert "4343455" as telephone number
  When clicking on Password and insert "luq123" as password 
  And click on confirm password and insert "luq123" as password
  Then click on privacy button
  Then click on Continue button to register 

