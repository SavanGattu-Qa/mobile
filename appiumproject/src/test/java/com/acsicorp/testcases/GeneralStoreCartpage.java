package com.acsicorp.testcases;

import com.acsicorp.commonutilities.ApplicationSetup;
import com.acsicorp.pages.GeneralStoreCart;

public class GeneralStoreCartpage extends	ApplicationSetup{
	public static GeneralStoreCart cart= new GeneralStoreCart(driver);
	public static void verifychekout() throws InterruptedException {
		cart.verifyproductdeatils();
		cart.continuecheckout();
	}
	
}
