package haroon_selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalNumberOfLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//find total number of links
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int linkCount = allLinks.size();
		System.err.println("Total links count : " + linkCount);
		// Print text of each elements
		
		for(int i = 0; i<linkCount; i++) { 
			
			String LinkText = allLinks.get(i).getText();
			
			System.out.println(LinkText);
			
			
		}
		

	}

}
 