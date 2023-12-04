package com.tutorialsninja.reports;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsClass {
	
	public static ExtentSparkReporter Spark = null;
	public static ExtentReports extent = null;
	public static ExtentTest logger=null;
	
	@BeforeSuite(alwaysRun=true)
	public static void setupReport() {
		Spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\AutomationTestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(Spark);
		extent.setSystemInfo("Project Name", "Tutorialsninja");
		extent.setSystemInfo("Company Name", "Tutorialsninja");
		Spark.config().setDocumentTitle("Automation Report");
		Spark.config().setReportName("Automation Test Results By Brijesh");
	}
	
	public static void startReporting(String testMethod) {
		logger = extent.createTest(testMethod);
	}
		
	public static void stopReporting() {
		extent.flush();
	}

}
