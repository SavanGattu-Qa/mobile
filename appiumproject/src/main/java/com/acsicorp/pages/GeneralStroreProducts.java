package com.acsicorp.pages;

import java.util.HashMap;
import java.util.Map;

import com.acsicorp.commonutilities.AppiumGestures;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pageobjects.GeneralStroreProductsPageObjects;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStroreProducts extends ApplicationSetup{
	public static GeneralStroreProductsPageObjects products;
	public static Map<String, String> productdeatils;
	public GeneralStroreProducts(AndroidDriver driver) {
		products = new GeneralStroreProductsPageObjects(driver);
	}
	public  void selectproduct(String prductname) {
		AppiumGestures.scrollintoviewwithtext(prductname);
		products.addtocartbutton.click();
	}
	public  void getdetailsoftheproduct() {
		productdeatils = new HashMap<String,String>();
		productdeatils.put("productname", products.productname.getText());
		productdeatils.put("productprice", products.productprice.getText());	
	}
	public void clickoncart() {
		products.cartbutton.click();
	}
}
