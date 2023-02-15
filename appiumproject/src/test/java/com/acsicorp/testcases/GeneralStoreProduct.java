package com.acsicorp.testcases;

import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pages.GeneralStroreProducts;

public class GeneralStoreProduct extends ApplicationSetup {

	public static GeneralStroreProducts product = new GeneralStroreProducts(driver);
	public static void selectproductandgetdeatils() throws InterruptedException {
		product.selectproduct("LeBron Soldier 12");
		product.getdetailsoftheproduct();
		product.clickoncart();
		Thread.sleep(5000);
	}
}
