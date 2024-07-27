@tag @FunctionalTest
Feature: Checking the orange hrm application login functionality

	Background:
		Given user present on the orange hrm application
		
@tag1 @SmokeTest
  Scenario: Login Functionality testing 
    When user enters username and password
    And user clicks on the login button
    Then user navigates to the home page
    
@tag2 @End2EndTest
  Scenario: Login Functionality testing with values
    When user enters "Admin" and "admin123"
    And user clicks on the login button
    Then user navigates to the home page
    
@tag3 @RegressionTest
  Scenario: Login Functionality testing with datatable
    When user enters username and password from datatable
    |Admin|admin123|
    And user clicks on the login button
    Then user navigates to the home page
    
@tag4 @End2EndTest
  Scenario: Login Functionality testing with datatable1
    When user enters username and password from datatable1
    |Admin|admin231|
    |Admin|admin123|
    And user clicks on the login button
    Then user navigates to the home page
    
@tag5 @RegressionTest
  Scenario: Login Functionality testing with datatable2
    When user enters a username1 and password1 from datatable2
    |username1|password1|
    |Admin|admin321|
    |Admin|admin123|
    And user clicks on the login button
    Then user navigates to the home page
    
@tag6 @End2EndTest
  Scenario Outline: Login Functionality testing with datatable2
    When user1 enters a "<username1>" and "<password1>" from datatable2
    And user clicks on the login button
    Then user navigates to the home page
  Examples:
  	|username1|password1|
    |Admin|admin321|
    |Admin|admin123|
    
