package Prerequesite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicSetUp {
	public static WebDriver driver;
	static Properties property;

	public static Properties agetProperties() throws IOException {
		String s = "D:\\yuvasri_revision\\LearningMaven\\src\\main\\java\\Prerequesite\\Ninja.properties";
		FileInputStream f = new FileInputStream(s);
		property = new Properties();
		property.load(f);
		return property;

	}

	@BeforeClass
	public static void launchBrowser() throws IOException {
		agetProperties();

		String url = property.getProperty("url");
		System.out.println(url);
		String bName = property.getProperty("browser");
		System.out.println(bName);
		if (bName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
		}
	}

	@AfterClass
	public static void tearDown() throws Exception {
		System.out.println("done");
		//driver.quit();
	}
}
