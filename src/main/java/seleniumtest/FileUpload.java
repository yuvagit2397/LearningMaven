package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://my.monsterindia.com/create_account.html");
	
	
	 Thread.sleep(2000);
	 
	 // This will scroll down the page 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("scroll(0,350)");
	 
	 Thread.sleep(3000);
	 
	// This will click on Browse button
	 driver.findElement(By.xpath("//span[text()='Choose file']")).click();
	 Thread.sleep(3000);

	StringSelection selection=new StringSelection("C:\\Users\\SENTHIL\\Downloads\\testleaf.xlsx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	 Thread.sleep(3000);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
