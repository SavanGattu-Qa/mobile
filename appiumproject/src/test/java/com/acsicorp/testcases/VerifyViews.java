package com.acsicorp.testcases;

import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pages.Views;

public class VerifyViews extends ApplicationSetup{
	public static Views	view; 
	public static void verifypeoplename() throws InterruptedException {
		view = new Views(driver);
		view.verifypeoplenames();
	}
	public static void scrolltillvisibility() throws InterruptedException {
		view = new Views(driver);
		view.verifyelemetnonthepage();
	}
	public static void	swipethephoto() throws InterruptedException {
		view = new Views(driver);
		view.swipephotos();
	}
	
	
}
