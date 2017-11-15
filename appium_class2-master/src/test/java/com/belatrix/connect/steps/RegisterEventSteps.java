package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class RegisterEventSteps extends ParentScenario{

	 @When("^I click on Events Tab$")
	    public void I_click_on_Events_Tab() {
	        mainProfilePage.clickEventTab();
	        System.out.println("I click on event TAB");
	        eventsPage.loadPageSucessfully();
	    }
	 
	 @And("^I click on halloween event$")
	    public void I_click_on_halloween_event() {
	       eventsPage.clickEvent();
	    }
	 
	 @And("^I register on halloween event$")
	 public void I_register_on_halloween_event()
	 {
		 eventDetailPage.ClickRegister();
		 alertMessageTwoOptions.answerYes();
		 alertMessageTwoOptions.waitForContainer();
		 alertMessageTwoOptions.answerYes();
	 }
	 
	 @When("^I back on event details to Logout of APP$")
	 public void i_back_on_event_details_to_Logout_of_APP() throws Throwable {
    	 eventDetailPage.clickBackButton();
     }

}
