package haroon_selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingFirstScript {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.xpath("//a[text()='My Account']")).click();
		/*
		 * //driver.findElement(By.xpath("//a[text()='Login']")).click(); boolean
		 * flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
		 * if(flagImg)System.out.println("Pass"); boolean flagSrch =
		 * driver.findElement(By.name("search")).isDisplayed();
		 * if(flagSrch)System.out.println("Pass");
		 * driver.findElement(By.name("search")).sendKeys("Search");
		 */
		
		By logoImg = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon = By.cssSelector("#search > span > button");
		By homeClickbtn = By.cssSelector(".fa.fa-home");
		if(doElementIsdisplayed(logoImg)) {
			System.out.println("Image is present  -- Pass");
			
			
		}
		if(doElementIsdisplayed(search)) {
			
			System.out.println("Search is present");
			doSendKeys(search, "Phone");
			doClick(searchIcon);
			
		}
		
		clickHome(homeClickbtn);
		
			
			
		}
			
			
			

	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
		
	}
	public static boolean doElementIsdisplayed(By locator) {
		return getElement(locator).isDisplayed();
		
		
	}
	public static void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
		

		
		
	}
	public static void doClick(By locator) {
		
		getElement(locator).click();
		

		
		
	}
	public static void clickHome(By locator) {
		getElement(locator).click();
		
	}
	

}
