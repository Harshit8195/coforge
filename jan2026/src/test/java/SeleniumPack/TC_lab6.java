package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_lab6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String username="Harsh123@gmail.com";
		String Password = "12345";
		driver.get("https://tutorialsninja.com/demo/index.php?");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		Thread.sleep(1000);

		//components and moniter
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-limit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-limit\"]/option[2]")).click();
		
		//Add to cart
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();

		//click Specification
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")).click();
		
		//verify
		String spec= driver.findElement(By.xpath("//*[@id=\"tab-specification\"]/table/thead/tr/td/strong")).getText();
		System.out.println(spec);
		
		//Add to wishlist
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
		//verify message
		String verify = driver.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
		System.out.println(verify);
		
		//Enter Mobile
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("Mobile");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
		Thread.sleep(1000);
		//search in product desc
		driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
		Thread.sleep(1000);
		//HTC click
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
		Thread.sleep(1000);
		//Step 14
		driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("3");
		Thread.sleep(1000);
		//Add to cart
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		
		String cnf2= driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();//successmsg
		System.out.println(cnf2);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();//viewcart
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();//
		String mob = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")).getText();
		System.out.println(mob);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();//checkout
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();//dropdown account
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();//logout
		Thread.sleep(1000);
		String logout = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		System.out.println(logout);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	}

}
