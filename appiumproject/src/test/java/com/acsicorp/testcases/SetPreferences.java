package com.acsicorp.testcases;

import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pages.Preferences;

public class SetPreferences extends ApplicationSetup {

	public static void setwifiname() {
		Preferences pref = new Preferences(driver);
		pref.setwifiname();
	}

}
