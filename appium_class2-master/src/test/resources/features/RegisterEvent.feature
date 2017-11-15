@RegressionAndroid @EventTest
Feature: Like a user registers on a event

 #Scenario 1
  Scenario Outline: The user registers on a event
    Given I login with my "<username>" and my "<password>"
    And I'm on my profile page
    When I click on Events Tab
    And I click on halloween event
    And I register on halloween event
      And I back on event details to Logout of APP
      And I finally Logout of App
    
     Examples:
      | username  | password | 
      | jexebio   | test  	 |