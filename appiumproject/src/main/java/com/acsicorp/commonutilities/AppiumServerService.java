package com.acsicorp.commonutilities;

import java.io.File;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServerService {
	public static	AppiumDriverLocalService service;
	public static void startservice() {
		AppiumServiceBuilder builder = new AppiumServiceBuilder ();
	      
		builder.withIPAddress ("127.0.0.1")
	        .usingPort (4723)
	        .withAppiumJS (
	            new File ("C:/Users/savan.gattu/AppData/Roaming/npm/node_modules/appium/build/lib/main.js"))
	        .usingDriverExecutable (new File ("C:\\Program Files\\nodejs\\node.exe"))
	        .withArgument (GeneralServerFlag.SESSION_OVERRIDE).
	        withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
	        .withArgument (GeneralServerFlag.LOG_LEVEL, "debug");

		service = AppiumDriverLocalService.buildService (builder);
	    service.start ();
	}
	  
	public static void stopservice() {
		service.stop();
	}
	  
	  
}
