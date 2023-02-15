package com.acsicorp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreHomePageObjects {
	
	AndroidDriver driver;
	@FindBy(id="com.androidsample.generalstore:id/toolbar_title")
	public WebElement generalstoretitle;
	@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	public WebElement spinnercountry;
	@FindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement namefield;
	@FindBy(id="com.androidsample.generalstore:id/radioMale")
	public WebElement radiomale;
	@FindBy(id="com.androidsample.generalstore:id/radioFemale")
	public WebElement radiofemale;
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement btnletsshop;
	@FindBy(xpath="//android.widget.TextView[@text='India']")
	public WebElement dropdownoptionindia;
	public GeneralStoreHomePageObjects(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
