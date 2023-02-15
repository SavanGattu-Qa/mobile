package com.acsicorp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreCartPageObjects {
	AndroidDriver driver;
	@FindBy(id="com.androidsample.generalstore:id/productImage")
	public WebElement product;
	@FindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
	public WebElement productstotalamount;
	@FindBy(id="com.androidsample.generalstore:id/btnProceed")
	public WebElement proceedbutton;
	@FindBy(id="com.androidsample.generalstore:id/termsButton")
	public WebElement termsbutton;
	@FindBy(id="com.androidsample.generalstore:id/toolbar_title")
	public WebElement carttitle;
	@FindBy(id="com.androidsample.generalstore:id/appbar_btn_back")
	public WebElement backbutton;
	@FindBy(id="com.androidsample.generalstore:id/productName")
	public WebElement productname;
	@FindBy(id="com.androidsample.generalstore:id/productPrice")
	public WebElement productprice;
	@FindBy(xpath="//android.widget.CheckBox")
	public WebElement checkbox;
	@FindBy(id="android:id/button1")
	public WebElement closebutton;
	public GeneralStoreCartPageObjects(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
