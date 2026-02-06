package com.orhrm.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentmanager {
	static ExtentReports extent;
		public static ExtentReports getReport() {
			String projectpath=System.getProperty("user.dir");

			if(extent == null) {
				extent=new ExtentReports();
				ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\project.html");
				extent.attachReporter(spark);
			}
			return extent;
		}
}
