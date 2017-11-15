package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class EventDetailPage extends ParentPage{

	public EventDetailPage(AppiumDriver driver) {
        super(driver);
    }
	
	By BTN_REGISTER = By.id("com.belatrixsf.connect:id/btn_register");
	By BTN_BACK = By.xpath("//android.widget.ImageButton[@content-desc='Navegar hacia arriba']");
	
	public void ClickRegister()
	{
		handlingWaitToElement(BTN_REGISTER);
		click(BTN_REGISTER);
	}
	
	public void clickBackButton()
	{
		handlingWaitToElement(BTN_BACK);
		click(BTN_BACK);
	}
}
