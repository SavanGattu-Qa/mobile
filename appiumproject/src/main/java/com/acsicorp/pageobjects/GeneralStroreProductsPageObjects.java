package com.acsicorp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStroreProductsPageObjects {

	AndroidDriver driver;
	@FindBy(id="com.androidsample.generalstore:id/toolbar_title")
	public WebElement productstitle;
	@FindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement cartbutton;
	@FindBy(id="com.androidsample.generalstore:id/appbar_btn_back")
	public WebElement backbutton;
	@FindBy(xpath="//android.widget.TextView[@text='ADD TO CART']")
	public WebElement addtocartbutton;
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productPrice']")
	public WebElement productprice;
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName']")
	public WebElement productname;
	@FindBy(xpath="//android.widget.ImageView[@resource-id='com.androidsample.generalstore:id/productImage']")
	public WebElement productImage;
	@FindBy(id="com.androidsample.generalstore:id/counterText")
	public WebElement addedproductcount;
	public GeneralStroreProductsPageObjects(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
