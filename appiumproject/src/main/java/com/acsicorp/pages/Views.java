package com.acsicorp.pages;

import org.openqa.selenium.By;

import com.acsicorp.commonutilities.AppiumGestures;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.commonutilities.Syncronization;
import com.acsicorp.pageobjects.ViewPageObject;

import io.appium.java_client.android.AndroidDriver;

public class Views extends ApplicationSetup {
	public static ViewPageObject views;

	public Views(AndroidDriver driver) {

		views = new ViewPageObject(driver);
	}

	public void verifypeoplenames() throws InterruptedException {
		views.view.click();
		views.expandablelists.click();
		views.customadapter.click();
		AppiumGestures.longpress(
				driver.findElement(By.xpath("//android.widget.ExpandableListView/android.widget.TextView[1]")));
		Thread.sleep(2000);
	}

	public void verifyelemetnonthepage() throws InterruptedException {
		Syncronization.waituntillelementtobevisible(views.view, 2);
		views.view.click();
		AppiumGestures.scrollintoviewwithtext("Visibility");
	}

	public void swipephotos() throws InterruptedException {
		Syncronization.waituntillelementtobevisible(views.view, 2);
		views.view.click();
		views.gallery.click();
		views.photos.click();
		AppiumGestures.swipeacionwithelement(driver.findElement(By.xpath("(//android.widget.Imageview)")), "left",
				0.75);

	}

}
