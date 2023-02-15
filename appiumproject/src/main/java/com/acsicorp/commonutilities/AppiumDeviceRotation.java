package com.acsicorp.commonutilities;

import org.openqa.selenium.DeviceRotation;

public class AppiumDeviceRotation extends ApplicationSetup{

	public static void landscapedevice() {
		DeviceRotation lansacpe =new DeviceRotation(0,0,90);
		driver.rotate(lansacpe);
	}
}
