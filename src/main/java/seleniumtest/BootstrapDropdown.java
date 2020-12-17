package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://mdbootstrap.com/docs/jquery/components/dropdowns/");
	WebElement dropButton=driver.findElement(
			By.xpath("//button[@class='btn btn-primary dropdown-toggle mr-4 waves-effect waves-light']"));
	Thread.sleep(2000);
	//dropButton.click();
	List<WebElement> findElements = dropButton.findElements(By.xpath("//section[@class='section-preview']/button/following::div[1]/a"));
	for (WebElement options : findElements) {
		String attribute = options.getAttribute("innerHTML");
		System.out.println(attribute);
	}*/
	driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
	List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='dropdownMenuButton']/following::div[1]/a"));
	System.out.println(findElements.size());
	for (WebElement opt : findElements) {
		String text = opt.getAttribute("innerHTML");
		System.out.println(text);
	}
	
	
	
}
}
