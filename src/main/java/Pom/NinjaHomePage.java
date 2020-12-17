package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaHomePage {
	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Desktops']")
	public static WebElement desktop;

	public static WebElement getDesktop() {
		return desktop;
	}

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	public static WebElement allDesktop;

	public static WebElement getAllDesktop() {
		return allDesktop;
	}

	@FindBy(xpath = "//p[@class='price']/span[1]")
	public static List<WebElement> allPrice;

	public static List<WebElement> getAllPrice() {
		return allPrice;
	}

	@FindBy(id = "button-cart")
	public static WebElement addToCart;
	
	public static WebElement getAddToCart() {
		return addToCart;
	}
	public NinjaHomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}
