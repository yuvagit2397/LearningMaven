package seleniumtest;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShotExample {
	static WebDriver driver;
	@Test
	public  void screenShot() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\yuvasri_revision\\TnstcAutomation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*TakesScreenshot tc=(TakesScreenshot)driver;
		File source=tc.getScreenshotAs(OutputType.FILE);
		File des=new File("paanai.png");
		FileUtils.copyFile(source, des);*/
	}
}
