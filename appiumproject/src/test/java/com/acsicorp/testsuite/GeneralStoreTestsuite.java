package com.acsicorp.testsuite;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.acsicorp.commonutilities.AppiumServerService;
import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.testcases.GeneralStoreCartpage;
import com.acsicorp.testcases.GeneralStoreForm;
import com.acsicorp.testcases.GeneralStoreProduct;

import resourse.GeneralStoreApplicationProperties;

public class GeneralStoreTestsuite {

	@BeforeSuite

	public void startappiumserver() {
		AppiumServerService.startservice();
	}

	@BeforeClass
	public void launchapplication() throws MalformedURLException {
		ApplicationSetup.SetOptions(GeneralStoreApplicationProperties.path);
		ApplicationSetup.launchapplication();
	}

	@Test
	public void test1() throws InterruptedException {
		GeneralStoreForm.fillform();
	}
	@Test
	public void test2() throws InterruptedException {
		GeneralStoreProduct.selectproductandgetdeatils();
	}
	@Test
	public void test3() throws InterruptedException {
		GeneralStoreCartpage.verifychekout();
	}
	@AfterClass
	public void quitapplicatio() {
		ApplicationSetup.closeapp();
	}

	@AfterSuite
	public void stopappiumserver() {
		AppiumServerService.stopservice();
	}

}
