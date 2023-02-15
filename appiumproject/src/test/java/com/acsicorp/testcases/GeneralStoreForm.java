package com.acsicorp.testcases;

import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pages.GeneralStoreHomePage;


public class GeneralStoreForm extends ApplicationSetup{
	public static GeneralStoreHomePage homepage =new  GeneralStoreHomePage(driver);
	
	public static void fillform() throws InterruptedException {
		homepage.fillhompageform();
	}
	

}
