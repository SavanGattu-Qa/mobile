package com.acsicorp.testsuite;

import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.acsicorp.commonutilities.AppiumServerService;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.testcases.Performdraganddrop;
import com.acsicorp.testcases.SetPreferences;
import com.acsicorp.testcases.VerifyViews;

import resourse.ApidemoApplicationProperties;


public class ApiDemoTestsuite {
@BeforeSuite
public static void startappiumserver() {
	AppiumServerService.startservice();
}
@BeforeMethod
public static void launchapplication() throws MalformedURLException {
	ApplicationSetup.SetOptions(ApidemoApplicationProperties.path);
	ApplicationSetup.launchapplication();
}
@Test(priority = 2,testName="setwifiname")
public static void setprefences() {
SetPreferences.setwifiname();
}
@Test(testName="verifypeoplename",priority = 0)
public static void verifypeoplename() throws InterruptedException { 
VerifyViews.verifypeoplename();
}
@Test(testName="performdragnaddrop",priority = 1)

public static void perfomdraganddrop() {
	Performdraganddrop.performdragnaddrop();
}
@Test(testName="scrolltillvisibility",priority = 3)
public static void scroll() throws InterruptedException {
	VerifyViews.scrolltillvisibility();
}

@Test(priority = 4,testName="swipethephoto" )
public static void swipethephot() throws InterruptedException {
	VerifyViews.swipethephoto();
	Thread.sleep(5000);
}
@AfterMethod
public static void quitapplicatio() {
ApplicationSetup.closeapp();
}
@AfterSuite
public static void stopappiumserver() {
	AppiumServerService.stopservice();
}
}
