package com.orhrm.tests;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
 
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orhrm.base.base_test;
import com.orhrm.base.base_test_project;
import com.orhrm.pages.Login_POM_Project;
import com.orhrm.utilities.configreader;
import com.orhrm.utilities.extentmanager;
import com.orhrm.utilities.screenshotutil;
 
import SeleniumPack.Login_POM;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class logintest_project extends base_test_project{
	
	ExtentReports extent=extentmanager.getReport();
	
	static String projectpath=System.getProperty("user.dir");

	@Test
	public void HomeOffice() throws InterruptedException, IOException {
		  ExtentTest test=extent.createTest("Home Office");
		  
		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		    WebElement homeoffice = wait.until(
		        ExpectedConditions.presenceOfElementLocated(
		            By.xpath("//a[contains(@href,'home-office-design')]")
		        )
		    );
		 
		    // Scroll to center
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript(
		        "arguments[0].scrollIntoView({block:'center'});", homeoffice
		    );
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    // Small buffer for animation
		    try { Thread.sleep(500); } catch (Exception e) {}
		 
		    // JavaScript click (IMPORTANT)
		    js.executeScript("arguments[0].click();", homeoffice);
		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
		    
		    for (int i = 0; i < scrollHeight; i += 200) {
		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
		        Thread.sleep(200); // controls speed
		    }
		    String ss = screenshotutil.captureScreenshot(driver);
	        test.pass("Test passed").addScreenCaptureFromPath(ss);
	        test.info("Open Website");
	        test.info("Click on Design Ideas");
	        test.info("Click on Home Office");
	        test.info("Scroll Down to Explore");
		    extent.flush();
	}
	
	
	@Test
	public void DiningRoom() throws InterruptedException, IOException {
		  ExtentTest test=extent.createTest("Dining Room");

		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		    WebElement diningroom = wait.until(
		        ExpectedConditions.presenceOfElementLocated(
		            By.xpath("//a[contains(@href,'dining-room')]")
		        )
		    );
		 
		    // Scroll to center
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript(
		        "arguments[0].scrollIntoView({block:'center'});", diningroom
		    );
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    // Small buffer for animation
		    try { Thread.sleep(500); } catch (Exception e) {}
		 
		    // JavaScript click (IMPORTANT)
		    js.executeScript("arguments[0].click();", diningroom);
		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
		    
		    for (int i = 0; i < scrollHeight; i += 200) {
		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
		        Thread.sleep(200); // controls speed
		    }
		    String ss = screenshotutil.captureScreenshot(driver);
	        test.pass("Test passed").addScreenCaptureFromPath(ss);
	        test.info("Open Website");
	        test.info("Click on Design Ideas");
	        test.info("Click on Dining Room");
	        test.info("Scroll Down to Explore");
		    extent.flush();
		 
	}
	
	@Test
	public void BedroomDesign() throws InterruptedException, IOException {
		  ExtentTest test=extent.createTest("Bedroom Design");

		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		    WebElement bedroom = wait.until(
		        ExpectedConditions.presenceOfElementLocated(
		            By.xpath("//a[contains(@href,'bedroom')]")
		        )
		    );
		 
		    // Scroll to center
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript(
		        "arguments[0].scrollIntoView({block:'center'});", bedroom
		    );
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    // Small buffer for animation
		    try { Thread.sleep(500); } catch (Exception e) {}
		 
		    // JavaScript click (IMPORTANT)
		    js.executeScript("arguments[0].click();", bedroom);
		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
		    
		    for (int i = 0; i < scrollHeight; i += 200) {
		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
		        Thread.sleep(200); // controls speed
		    }
		    String ss = screenshotutil.captureScreenshot(driver);
	        test.pass("Test passed").addScreenCaptureFromPath(ss);
	        test.info("Open Website");
	        test.info("Click on Design Ideas");
	        test.info("Click on Bedroom Design");
	        test.info("Scroll Down to Explore");
		    extent.flush();
	}
	
	

	
	
	 @DataProvider
	  public Object[][] logindata() throws InvalidFormatException, IOException {
		  
		 	    return new Object[][] {
		 	    	{
		 	    	configreader.getproperty("url") 
		 	    }	
		 	    };
	 }
 
}