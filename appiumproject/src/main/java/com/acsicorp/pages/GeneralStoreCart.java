package com.acsicorp.pages;

import java.sql.Time;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.acsicorp.commonutilities.AppiumGestures;
import com.acsicorp.commonutilities.AppiumKeyEvents;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pageobjects.GeneralStoreCartPageObjects;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreCart extends ApplicationSetup {
	public static SoftAssert assertion = new SoftAssert();
	public static GeneralStoreCartPageObjects cart;

	public GeneralStoreCart(AndroidDriver driver) {
		cart = new GeneralStoreCartPageObjects(driver);
	}

	public void verifyproductdeatils() {
		Boolean displayed = cart.product.isDisplayed();
		if (displayed) {
			assertion.assertEquals(cart.productprice.getText(),
					GeneralStroreProducts.productdeatils.get("productprice"));
			assertion.assertEquals(cart.productname.getText(), GeneralStroreProducts.productdeatils.get("productname"));
		}
	}

	public void continuecheckout() throws InterruptedException {
		assertion.assertEquals(cart.productstotalamount.getText(), cart.productprice.getText());
		AppiumGestures.longpress(driver.findElement(By.id("com.androidsample.generalstore:id/termsButton")));
		cart.closebutton.click();
		cart.checkbox.click();
		cart.proceedbutton.click();
		Thread.sleep(6000);
		Set<String> context = driver.getContextHandles();
		for (String contextname : context) {
			System.out.println(contextname);
		}
		Thread.sleep(6000);
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("www.nike.com");
		AppiumKeyEvents.pressenter();
	}

}
