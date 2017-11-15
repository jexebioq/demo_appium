@RegressionAndroid @LoginLogout

Feature: Login with correct values
  #Scenario 1
  Scenario Outline: Login with User and Password
   Given I login with my "<username>" and my "<password>"
      And I'm on my profile page
    Then I see the complete name "<completeName>" in the profile screen
    Then I see the email "<email>" in the profile screen
    Then I see the skypeId "<skypeId>" in the profile screen
    Then I see the location "<location>" in the profile screen
	 And I finally Logout of App

    Examples:
      | username  | password | completeName   | email                  | skypeId      | location |
      | jexebio   | test     | Juan Exebio    | jexebio@belatrixsf.com | jexebioq     | Lima     |