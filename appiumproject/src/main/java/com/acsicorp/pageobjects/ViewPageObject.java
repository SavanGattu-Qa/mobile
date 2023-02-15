package com.acsicorp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;


public class ViewPageObject {
	AndroidDriver driver;
	@FindBy(xpath="//android.widget.TextView[@content-desc='Views']")
	public	WebElement	view;
	
	@FindBy(xpath ="//android.widget.TextView[@content-desc='Expandable Lists']")
	public	WebElement	expandablelists;
	@FindBy(xpath ="//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
	public	WebElement	customadapter;
	@FindBy (xpath = "//android.widget.ExpandableListView/android.widget.TextView[1]")
	public	WebElement	peoplenames;
	@FindBy (xpath = "//android.widget.TextView[@content-desc='Drag and Drop']")
	public	WebElement	draganddrop;
	@FindBy (xpath = "//android.widget.TextView[@content-desc='Visibility']")
	public 	WebElement visibility;
	@FindBy (xpath = "//android.widget.TextView[@content-desc='Gallery']")
	public	WebElement	gallery;
	@FindBy (xpath = "//android.widget.TextView[@content-desc='1. Photos']")
	public	WebElement photos;
	public ViewPageObject(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
