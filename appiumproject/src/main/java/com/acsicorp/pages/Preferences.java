package com.acsicorp.pages;

import com.acsicorp.commonutilities.AppiumCopyPaste;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pageobjects.PreferencePageObjects;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class Preferences extends ApplicationSetup {
	public static PreferencePageObjects preference;

	public Preferences(AndroidDriver driver) {
		Activity act = new Activity("io.appium.android.apis",
				"io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(act);
		preference = new PreferencePageObjects(driver);
	}

	public void setwifiname() {
		preference.wificheckbox.click();
		preference.wifisetting.click();
		AppiumCopyPaste.settoclipbordtext("savan's wifi");
		preference.wifisettingtext.sendKeys(AppiumCopyPaste.getclipbordtext());
		preference.wifisettingok.click();
	}
}
