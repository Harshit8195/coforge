package CoreJavaPac;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.orhrm.utilities.screenshotutil;

public class ExtraTestCaseProject {
	
//	@Test
//	public void LivingRoomDesign() throws InterruptedException, IOException {
//		  ExtentTest test=extent.createTest("Living Room");
//
//		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
//		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		 
//		    WebElement livingRoom = wait.until(
//		        ExpectedConditions.presenceOfElementLocated(
//		            By.xpath("//a[contains(@href,'living-room')]")
//		        )
//		    );
//		 
//		    // Scroll to center
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript(
//		        "arguments[0].scrollIntoView({block:'center'});", livingRoom
//		    );
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		    // Small buffer for animation
//		    try { Thread.sleep(500); } catch (Exception e) {}
//		 
//		    // JavaScript click (IMPORTANT)
//		    js.executeScript("arguments[0].click();", livingRoom);
//		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
//		    
//		    for (int i = 0; i < scrollHeight; i += 200) {
//		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
//		        Thread.sleep(200); // controls speed
//		    }
//		    String ss = screenshotutil.captureScreenshot(driver);
//	        test.pass("Test passed").addScreenCaptureFromPath(ss);
//		    extent.flush();
//		 
//	}
//	
//	
//	@Test
//	public void DiningRoom() throws InterruptedException, IOException {
//		  ExtentTest test=extent.createTest("Dining Room");
//
//		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
//		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		 
//		    WebElement diningroom = wait.until(
//		        ExpectedConditions.presenceOfElementLocated(
//		            By.xpath("//a[contains(@href,'dining-room')]")
//		        )
//		    );
//		 
//		    // Scroll to center
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript(
//		        "arguments[0].scrollIntoView({block:'center'});", diningroom
//		    );
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		    // Small buffer for animation
//		    try { Thread.sleep(500); } catch (Exception e) {}
//		 
//		    // JavaScript click (IMPORTANT)
//		    js.executeScript("arguments[0].click();", diningroom);
//		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
//		    
//		    for (int i = 0; i < scrollHeight; i += 200) {
//		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
//		        Thread.sleep(200); // controls speed
//		    }
//		    String ss = screenshotutil.captureScreenshot(driver);
//	        test.pass("Test passed").addScreenCaptureFromPath(ss);
//		    extent.flush();
//		 
//	}
//	
//	
//	@Test
//	public void BathRoom() throws InterruptedException, IOException {
//		  ExtentTest test=extent.createTest("Bathroom");
//
//		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
//		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		 
//		    WebElement bathroom = wait.until(
//		        ExpectedConditions.presenceOfElementLocated(
//		            By.xpath("//a[contains(@href,'bathroom')]")
//		        )
//		    );
//		 
//		    // Scroll to center
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript(
//		        "arguments[0].scrollIntoView({block:'center'});", bathroom
//		    );
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		    // Small buffer for animation
//		    try { Thread.sleep(500); } catch (Exception e) {}
//		 
//		    // JavaScript click (IMPORTANT)
//		    js.executeScript("arguments[0].click();", bathroom);
//		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
//		    
//		    for (int i = 0; i < scrollHeight; i += 200) {
//		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
//		        Thread.sleep(200); // controls speed
//		    }
//		    String ss = screenshotutil.captureScreenshot(driver);
//	        test.pass("Test passed").addScreenCaptureFromPath(ss);
//		    extent.flush();
//	}
//	
//	@Test
//	public void ModularKitchenDesign() throws InterruptedException, IOException {
//		  ExtentTest test=extent.createTest("Modular Kitchen");
//
//		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
//		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		 
//		    WebElement modularkitchen = wait.until(
//		        ExpectedConditions.presenceOfElementLocated(
//		            By.xpath("//a[contains(@href,'modular-kitchen')]")
//		        )
//		    );
//		 
//		    // Scroll to center
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript(
//		        "arguments[0].scrollIntoView({block:'center'});", modularkitchen
//		    );
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		    // Small buffer for animation
//		    try { Thread.sleep(500); } catch (Exception e) {}
//		 
//		    // JavaScript click (IMPORTANT)
//		    js.executeScript("arguments[0].click();", modularkitchen);
//		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
//		    
//		    for (int i = 0; i < scrollHeight; i += 200) {
//		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
//		        Thread.sleep(200); // controls speed
//		    }
//		    String ss = screenshotutil.captureScreenshot(driver);
//	        test.pass("Test passed").addScreenCaptureFromPath(ss);
//		    extent.flush();
//	}
//	
//	@Test
//	public void homeDesign() throws InterruptedException {
//		  ExtentTest test=extent.createTest("Home Design");
//
//		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
//		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
//		extent.flush();
//	}
	
//	@Test
//	public void BedroomDesign() throws InterruptedException, IOException {
//		  ExtentTest test=extent.createTest("Bedroom Design");
//
//		driver.get("https://www.beautifulhomes.asianpaints.com/weatherseal.html");
//		driver.findElement(By.xpath("//*[@id=\"imageModaltarget\"]/div/a/picture/img")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.navigate().back();
//		driver.findElement(By.xpath("//*[@id=\"container-85cb039bb9\"]/div/div[3]/header[1]/div[2]/div/ul/li[7]/a")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		 
//		    WebElement bedroom = wait.until(
//		        ExpectedConditions.presenceOfElementLocated(
//		            By.xpath("//a[contains(@href,'bedroom')]")
//		        )
//		    );
//		 
//		    // Scroll to center
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript(
//		        "arguments[0].scrollIntoView({block:'center'});", bedroom
//		    );
//		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		    // Small buffer for animation
//		    try { Thread.sleep(500); } catch (Exception e) {}
//		 
//		    // JavaScript click (IMPORTANT)
//		    js.executeScript("arguments[0].click();", bedroom);
//		    //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		    long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
//		    
//		    for (int i = 0; i < scrollHeight; i += 200) {
//		        js.executeScript("window.scrollTo(0, arguments[0]);", i);
//		        Thread.sleep(200); // controls speed
//		    }
//		    String ss = screenshotutil.captureScreenshot(driver);
//	        test.pass("Test passed").addScreenCaptureFromPath(ss);
//		    extent.flush();
//	}
	
	
}
