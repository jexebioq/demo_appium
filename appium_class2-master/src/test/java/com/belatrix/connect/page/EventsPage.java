package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class EventsPage extends ParentPage {

	  public EventsPage(AppiumDriver driver) {
	        super(driver);
	    }
	  
	  By HALLOWEEN_EVENT = By.xpath("*//android.widget.TextView[contains(@text, 'Halloween')]");
	  By CONTAINER_PAGE = By.id("com.belatrixsf.connect:id/swipeRefreshLayout");
	  
	  public void clickEvent()
	  {
		  click(HALLOWEEN_EVENT);
	  }
	  
	  public void loadPageSucessfully()
	    {
	        handlingWaitToElement(CONTAINER_PAGE);
	    }
}
