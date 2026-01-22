package SeleniumPack;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
 
public class TC_Alert {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriverManager.firefoxdriver().setup();
    WebDriver dr = new FirefoxDriver();
    dr.get("https://letcode.in/alert");
	
	dr.findElement(By.id("accept")).click();
	
	Alert simplealert=dr.switchTo().alert();
	System.out.println("Simple alert text:"+simplealert.getText());
	simplealert.accept();
	Thread.sleep(1000);
	
	dr.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
	
	Alert ar2=dr.switchTo().alert();
	System.out.println("Confirm altert text " + ar2.getText());
	ar2.accept();
	
	Thread.sleep(1000);
	
	dr.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
	Alert ar3= dr.switchTo().alert();
	System.out.println("prompt alter text "+ ar3.getText());
	ar3.accept();
	}
 
}
 