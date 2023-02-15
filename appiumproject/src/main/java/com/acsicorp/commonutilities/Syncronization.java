package com.acsicorp.commonutilities;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

;

public class Syncronization extends ApplicationSetup{

	public static Wait wait; 
	
	public static void waituntillelementtobevisible(WebElement element, long seconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitutillelementtobevisiblefluent() {
		wait= new FluentWait(driver)
				.withTimeout(null)
				.pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
	}
}
