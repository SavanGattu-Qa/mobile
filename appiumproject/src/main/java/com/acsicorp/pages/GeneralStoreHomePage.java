package com.acsicorp.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acsicorp.commonutilities.AppiumGestures;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.commonutilities.Syncronization;
import com.acsicorp.pageobjects.GeneralStoreHomePageObjects;


import io.appium.java_client.android.AndroidDriver;


public class GeneralStoreHomePage extends ApplicationSetup {
	public static GeneralStoreHomePageObjects homepage;
	public GeneralStoreHomePage(AndroidDriver driver) {
		homepage = new GeneralStoreHomePageObjects(driver);
	}
	public void fillhompageform() throws InterruptedException {
		Syncronization.waituntillelementtobevisible(homepage.spinnercountry,10 );
		homepage.spinnercountry.click();
		AppiumGestures.scrollintoviewwithtext("India");
		homepage.dropdownoptionindia.click();
		homepage.namefield.sendKeys("Savan Gattu");
		homepage.radiomale.click();
		homepage.btnletsshop.click();		
	}
}
