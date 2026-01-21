package SeleniumPack;

import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TC_FindElements {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement link: links)
		{
			System.out.println(link.getText());
		}
	}
 
}
