package com.orhrm.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotutil {
	public static String captureScreenshot(WebDriver driver) throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		String dest="./Screenshots/"+"Screenshot"+"_"+timestamp+".png";
		File destfile=new File(dest);
		FileUtils.copyFile(src, destfile);
		return dest;
	}
}

 
//public class screenshotutil {
// 
//    public static String captureScreenshot(WebDriver driver) {
// 
//        String timestamp =
//                new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
// 
//        String screenshotDir =
//                System.getProperty("user.dir") + "/Screenshots/";
// 
//        String screenshotPath =
//                screenshotDir + "Screenshot_" + timestamp + ".png";
// 
//        try {
//            File src =
//                ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// 
//            File dest = new File(screenshotPath);
// 
//            // Create folder if not exists
//            new File(screenshotDir).mkdirs();
// 
//            FileUtils.copyFile(src, dest);
// 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
// 
//        return screenshotPath;
//    }
//}
