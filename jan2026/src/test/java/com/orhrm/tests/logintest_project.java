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

	@Test(dataProvider = "logindata")
	public void color(String url) throws InterruptedException, IOException {
		  Login_POM_Project obj=new Login_POM_Project(driver);
		  ExtentTest test=extent.createTest("Verify the color");
		
		driver.get(url);
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"box-1\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"box-1\"]/ul/li[1]/ul/li[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"box-2\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"box-2\"]/ul/li[3]/ul/li[1]/a")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"box-3\"]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/header/div[4]/nav/ul[2]/li[3]/ul/li/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"container-c5f20ec573\"]/div/div[3]/header[1]/div[2]/div/ul/li[3]/a")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		String ss = screenshotutil.captureScreenshot(driver);
        test.pass("Test passed").addScreenCaptureFromPath(ss);
		extent.flush();	
		
		
		
	}

	
	@Test
	public void HomeOffice() throws InterruptedException, IOException {
		  Login_POM_Project obj=new Login_POM_Project(driver);

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
		    extent.flush();
	}
	
	@Test
	public void LivingRoomDesign() throws InterruptedException, IOException {
		  ExtentTest test=extent.createTest("Living Room");

		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		    WebElement livingRoom = wait.until(
		        ExpectedConditions.presenceOfElementLocated(
		            By.xpath("//a[contains(@href,'living-room')]")
		        )
		    );
		 
		    // Scroll to center
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript(
		        "arguments[0].scrollIntoView({block:'center'});", livingRoom
		    );
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    // Small buffer for animation
		    try { Thread.sleep(500); } catch (Exception e) {}
		 
		    // JavaScript click (IMPORTANT)
		    js.executeScript("arguments[0].click();", livingRoom);
		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
		    
		    for (int i = 0; i < scrollHeight; i += 200) {
		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
		        Thread.sleep(200); // controls speed
		    }
		    String ss = screenshotutil.captureScreenshot(driver);
	        test.pass("Test passed").addScreenCaptureFromPath(ss);
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
		    extent.flush();
		 
	}
	
	
	@Test
	public void BathRoom() throws InterruptedException, IOException {
		  ExtentTest test=extent.createTest("Bathroom");

		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		    WebElement bathroom = wait.until(
		        ExpectedConditions.presenceOfElementLocated(
		            By.xpath("//a[contains(@href,'bathroom')]")
		        )
		    );
		 
		    // Scroll to center
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript(
		        "arguments[0].scrollIntoView({block:'center'});", bathroom
		    );
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    // Small buffer for animation
		    try { Thread.sleep(500); } catch (Exception e) {}
		 
		    // JavaScript click (IMPORTANT)
		    js.executeScript("arguments[0].click();", bathroom);
		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
		    
		    for (int i = 0; i < scrollHeight; i += 200) {
		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
		        Thread.sleep(200); // controls speed
		    }
		    String ss = screenshotutil.captureScreenshot(driver);
	        test.pass("Test passed").addScreenCaptureFromPath(ss);
		    extent.flush();
	}
	
	@Test
	public void ModularKitchenDesign() throws InterruptedException, IOException {
		  ExtentTest test=extent.createTest("Modular Kitchen");

		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 
		    WebElement modularkitchen = wait.until(
		        ExpectedConditions.presenceOfElementLocated(
		            By.xpath("//a[contains(@href,'modular-kitchen')]")
		        )
		    );
		 
		    // Scroll to center
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript(
		        "arguments[0].scrollIntoView({block:'center'});", modularkitchen
		    );
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    // Small buffer for animation
		    try { Thread.sleep(500); } catch (Exception e) {}
		 
		    // JavaScript click (IMPORTANT)
		    js.executeScript("arguments[0].click();", modularkitchen);
		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
		    
		    for (int i = 0; i < scrollHeight; i += 200) {
		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
		        Thread.sleep(200); // controls speed
		    }
		    String ss = screenshotutil.captureScreenshot(driver);
	        test.pass("Test passed").addScreenCaptureFromPath(ss);
		    extent.flush();
	}
	
	@Test
	public void homeDesign() throws InterruptedException {
		  ExtentTest test=extent.createTest("Home Design");

		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
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