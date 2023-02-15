package com.acsicorp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.acsicorp.commonutilities.AppiumGestures;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pageobjects.ViewPageObject;

public class DragAndDrop extends ApplicationSetup {
	public static ViewPageObject views;
	public DragAndDrop() {
		views = new ViewPageObject(driver);
	}
	public static void performdraganddrop() {
		views.view.click();
		views.draganddrop.click();
		WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		AppiumGestures.draganddropaction(source, 828, 739);
	}
	
}
