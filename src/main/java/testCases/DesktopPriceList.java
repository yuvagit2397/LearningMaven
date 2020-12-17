package testCases;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ObjectManager.SingletonClass;
import Pom.NinjaHomePage;
import Prerequesite.BasicSetUp;

public class DesktopPriceList extends BasicSetUp {
	List<Integer> li = new ArrayList<Integer>();
	static String val = "";

	@Test(priority=1)
	public void Desktop() throws InterruptedException, AWTException {
		PageFactory.initElements(driver, NinjaHomePage.class);
		// driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		Actions a = new Actions(driver);
		WebElement desktop = SingletonClass.getInstance().getDesktop();
		a.moveToElement(desktop).build().perform();
		Thread.sleep(2000);
		SingletonClass.getInstance().allDesktop.click();
	}

	@Test(priority=2)
	public void toGetLowestPrice() {
		List<WebElement> allPrice = SingletonClass.getInstance().allPrice;
		for (WebElement price : allPrice) {
			String text = price.getText();
			String temp = "";
			for (int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				if (Character.isDigit(c)) {

					temp = temp + c;
				}

			}
			li.add(Integer.parseInt(temp));

		}
		Integer min = Collections.min(li);
		String valueOf = String.valueOf(min);
		int length = (valueOf.length() - 2);

		for (int i = 0; i < valueOf.length(); i++) {
			if (i == length) {
				val = val.concat(".");
				val = val + (valueOf.charAt(i));
			} else {
				char c1 = valueOf.charAt(i);
				val = val + c1;
			}
		}
		System.out.println("min value " + val);

	}

	@Test(priority=3)
	public void toGetProductName() {
		//driver.findElement(By.xpath("//span[text()='$98.00']/preceding::h4[1]/a")).click();
		List<WebElement> allPrice = SingletonClass.getInstance().allPrice;
		for (WebElement price : allPrice) {
			String text = price.getText();
			if (text.contains(val)==true) {
				System.out.println("start");
				driver.findElement(By.xpath("//span[text()='"+text+"']/preceding::h4[1]/a")).click();
			System.out.println("end");
			}
				
		}

	}
	/*@Test(priority=4)
	public void cartItems() throws InterruptedException {
     SingletonClass.getInstance().addToCart.click();
     WebElement option = driver.findElement(By.xpath("//div[text()='Select required!']"));
	String toolTipVal=option.getText();
	System.out.println(toolTipVal);
	////select[@id='input-option226']/following::div[1]
	}*/
}
