#Author: rahul_nalawade
#Registration 

Feature: User Registertion on Automation exercise 
 
  @Registration
  Scenario: User signup 
    Given User launch website "https://automationexercise.com/"
    And User verify that home page is visible successfully
    And User click on 'Signup / Login' button
    And User verify 'New User Signup!' is visible
    And User enter name and email address
    Then User click on 'Signup' button
    And User verify that 'ENTER ACCOUNT INFORMATION' is visible
    And User close site
 