package com.acsicorp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PreferencePageObjects {
	AndroidDriver driver;
	@FindBy(id="android:id/checkbox")
	public WebElement wificheckbox;
	@FindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement wifisetting;
	@FindBy(id="android:id/button1")
	public WebElement wifisettingok;
	@FindBy(id="android:id/edit")
	public WebElement wifisettingtext;
	public PreferencePageObjects(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
