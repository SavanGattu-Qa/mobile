package com.acsicorp.commonutilities;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppiumKeyEvents extends ApplicationSetup {

	public static void navigatehome() {
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}

	public static void navigateback() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public static void navigaterecent() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public static void pressenter() {
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	public static void presspowerbutton() {
		driver.pressKey(new KeyEvent(AndroidKey.POWER));

	}

	public static void pressvolumemute() {

		driver.pressKey(new KeyEvent(AndroidKey.VOLUME_MUTE));
	}

	public static void pressvolumeup() {
		driver.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));
	}

	public static void pressvolumedown() {
		driver.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
	}
}
