package com.acsicorp.commonutilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class AppiumGestures extends ApplicationSetup {
	public static void longpress(WebElement element) {
	
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(), "duration",5000
			));
	}

	public static void scrollintoviewwithtext(String stringvalue) {
		driver.findElement(AppiumBy.androidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(25)" +
		         ".scrollIntoView(new UiSelector().text(\""+stringvalue+"\"))"));
	}

	public static void scrolltillend(String direction) {

		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", direction, "percent", 3.0));
		} while (canScrollMore);
	}

	public static void doubleclickaction(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 5000));
	}

	public static void clickaction(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: clickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 5000));
	}

	public static void draganddropaction(WebElement element, long endX, long endY) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "endX", endX, "endY", endY));
	}

	public static void pinchOpenction(WebElement element, long percent) {
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "percent", percent));
	}

	public static void swipeacionwithelement(WebElement element, String direction, double percent) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) element).getId(), "direction", direction, "percent", percent));
	}

	public static void swipeactionwithcords(WebElement element, String direction, long percent) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
				"width", 200, "height", 200, "direction", "left", "percent", 0.75));
	}

	public static void pinchcloseactionwithcords(WebElement element, long percent) {
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "percent", percent));
	}

	public static void flinggestureaction(WebElement element, String direction, long speed) {

		@SuppressWarnings("unused")
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "direction", direction, "speed",
						speed));

	}

}