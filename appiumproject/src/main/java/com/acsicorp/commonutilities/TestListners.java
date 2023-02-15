package com.acsicorp.commonutilities;

import org.openqa.selenium.support.Color;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;

public class TestListners extends ApplicationSetup implements ITestListener {
	Extentreports extent = new Extentreports();
	public static String screenshotPath;
	@Override
	public void onTestStart(ITestResult result) {

		extent.extentReports.createTest(result.getName()).log(Status.INFO, MarkupHelper.createLabel(result.getName() + "started",ExtentColor.BLUE));

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extent.extentReports.createTest(result.getName()).log(Status.PASS, MarkupHelper.createLabel(result.getName() + "succeced",ExtentColor.GREEN));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		try {
			screenshotPath = AppiumCaptureScreenshot.getScreenhot(driver, result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extent.extentReports.createTest(result.getName()).log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extent.extentReports.createTest(result.getName()).log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "skipped",ExtentColor.BLACK));

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {

		extent.createExtentReports();
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flushreport();

	}

}
