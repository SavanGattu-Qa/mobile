package com.acsicorp.commonutilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {

	    public static  ExtentReports extentReports = new ExtentReports();

	    public static void createExtentReports() {
	        ExtentSparkReporter reporter = new ExtentSparkReporter("target/Spark.html");
	        reporter.config().setReportName("Appium Frame Work Report");
	        reporter.config().setTheme(Theme.DARK);
	        reporter.config().setReportName("Savan Gattu");
	        reporter.config().setCss(".node.level-1  ul{ display:none;} .node.level-1.active ul{display:block;}  .card-panel.environment  th:first-child{ width:30%;}");
	        extentReports.attachReporter(reporter);
	        extentReports.setSystemInfo("Author", "savan");
	       }
	    public static void flushreport() {
	    	extentReports.flush();
	    }
	}

