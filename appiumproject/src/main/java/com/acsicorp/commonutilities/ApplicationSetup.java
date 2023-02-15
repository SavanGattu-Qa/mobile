package com.acsicorp.commonutilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ApplicationSetup {
	public static UiAutomator2Options options;
	public static AndroidDriver driver;
	public static void SetOptions(String apppath) throws MalformedURLException {
		options = new UiAutomator2Options();
		options.setChromedriverExecutable("C:\\Users\\savan.gattu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		options.setDeviceName("Pixel 6 Pro API 33");
		options.setApp(apppath);  
	}
	public static void launchapplication() throws MalformedURLException {
		driver	= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		  
	}
	public static void closeapp() {
		driver.quit();
	}
}
