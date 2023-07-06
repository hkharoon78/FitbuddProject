package haroon_selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsNotPresent {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver =  new ChromeDriver();
		 
		 
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By logoImg = By.className("img-responsive111");
		By search = By.name("search");
		boolean flagImg = driver.findElement(logoImg).isDisplayed();
		System.out.println(flagImg);
		
		// findElement throw NoSuchElementException
		
		

	}

}
