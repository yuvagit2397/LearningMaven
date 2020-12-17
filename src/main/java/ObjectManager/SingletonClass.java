package ObjectManager;

import org.openqa.selenium.WebDriver;

import Pom.NinjaHomePage;
import Prerequesite.BasicSetUp;

public class SingletonClass {
	public static WebDriver driver =BasicSetUp.driver;
	private static  NinjaHomePage hp;
	private SingletonClass() {
		
	}
	public static NinjaHomePage getInstance() {
		if(hp==null) {
			hp=new NinjaHomePage(driver);
		}
		return hp;
	}

}
