package com.org.gpay.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.org.gpay.base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentManager extends BasePage {

	private static ExtentReports extent;
	public static String fileName;


	public static ExtentReports createInstance(String fileName) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);


		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(fileName);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Hariprasad Guditi");
		extent.setSystemInfo("Organization", "Guditi Solutions");
		extent.setSystemInfo("Build no", "G 1.0");
		return extent;
	}

	public static void captureScreenshot() throws IOException {

		Date d = new Date();
		fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		File screeshot = ((TakesScreenshot)  BasePage.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screeshot, new File(".//reports//"+fileName));
	}

	public static void captureElementScreenshot(WebElement element) throws IOException {

		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		File screeshot = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screeshot, new File(".//screenshot//"+"Element_"+fileName));
	}

}
