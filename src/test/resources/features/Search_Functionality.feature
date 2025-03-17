@tag

Feature: Search functionality 
  
  @TC_43
  Scenario: TC_0135 Searching for a product by keyword
    Given Navigate to search home page 
    Then click on search button Enter an appropriate keyword "Laptop"
    And Click on search button to validate the existing product
    

  @TC-44
  Scenario: TC-136 Validate Searching for a product by category.
    Given Navigate to search home page
    When Navigate to the drop-down menu on desktop button and Enter a product keyword "laptop".
    Then Click the search button.
    And Navigate to the drop-down menu on laptops&notebooks button and Enter a product keyword "windows".
    Then Navigate to the drop-down menu on components button and Enter a product keyword "monitors".
    When Navigate to the drop-down menu on  button MP3 playersand Enter a product keyword "test18".
    
    @TC-45
    Scenario: TC-0137 Validate " Sorting the search results by name"
    Given Navigate to search home page 
    When navigate to components and insert "monitors" and click on it
    Then Click on the drop-down button And enter name Name A-Z
    @TC-46
     Scenario: TC-46Verify the search result Sorted By price 'High-Low' Option is displaying as expected.
    Given Navigate to search home page
    And navigate to components and click on monitors and click on it
    Then Click on the drop down button and enter price high-Low
    @TC-46
    
    Scenario: TC-0140 Verify the search result Sorted By Name (Z-A) Option is displaying correctly.
    Given Navigate to search home page
    When Click on search button.
    And Enter the product name "PC".
    Then Click on sort  by 'Z to A' button.
     
     
     