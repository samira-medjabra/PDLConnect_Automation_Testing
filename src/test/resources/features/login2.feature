
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @TC-39
  Scenario: Login Page - New Customer 
    Given Navigate to login page 
    And click on login button
  
  @TC-40
  Scenario: Login Page - New Customer 
    Given Navigate to login page 
    And click on continue button
   When click on First Name and insert valuee  "salima" as first name
  And click on Last Name and insert valuee  "medjab" as last name 
  Then click on E-Mail and insertt "ahelm@gmail.com" as email
  And click on Telephone and insertt "43434555" as telephone number
  When clicking on Password and insertt "luqmn123" as password 
  And click on confirm password and insertt "luqmn123" as password
  Then click on privacy buttonn
  Then click on Continue button to registerr 
  
    @TC-41
    Scenario: Login Page - Returning Customer 
     Given Navigate to login page 
        And click on login button
     And click on email address and insert "samira@gmail.com"
     When click on password an insert "luq123"
     Then click on loginbutton
     @tagTC-42
     Scenario: Login Page - Returning Customer 
     Given Navigate to login page 
        And click on login buttonn
     And click on email address and insertt "samira@gmail.com"
     When click on password an insertt "luq123"
     Then click on loginbuttonn
     
      
     