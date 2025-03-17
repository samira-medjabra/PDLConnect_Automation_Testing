
Feature:   Registration page Mandatory field 02
  
  
  
  @TC_02
  
   Scenario: TC_02 Verify unsuccessful Registration by filling out the fields incorrectly
    Given Navigate to the Registration home pagee
    When click on First Name and insert the value  "samiraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" as first name
    And click on Last Name and insert the value  "medjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" as last name 
    Then click on E-Mail and insert the value  "abcgmail.com" as email
    And click on Telephone and insert the value  "434345eeeeeeeeee5" as telephone number
    Then click on continue button
  
  
  
  
  
