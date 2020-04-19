package com.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateExtentRepor {
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest test;
	public static void main(String[] args) {
		htmlReporter = new ExtentHtmlReporter("<<path>>\\TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		test= extent.createTest("Test123");
		test.pass("pass");
		test.fail("fail");
		test.info("info");
		extent.flush();
		System.out.println("Done");
		
	}

}
