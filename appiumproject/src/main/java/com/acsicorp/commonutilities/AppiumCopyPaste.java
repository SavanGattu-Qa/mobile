package com.acsicorp.commonutilities;

public class AppiumCopyPaste extends ApplicationSetup {
	
	public static void settoclipbordtext(String clipbordtext) {
		driver.setClipboardText(clipbordtext);
	}
	public static String getclipbordtext() {
		return driver.getClipboardText();
	}

}
