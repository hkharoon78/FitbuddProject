package JavaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalBlankLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";		
		driver.get(url);
		driver.manage().window().maximize();
		String actualPageTigle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String expPageTitle = driver.getTitle();
		
		if(actualPageTigle.equals(expPageTitle)) {
			
			System.out.println("Expected page Title is : " + expPageTitle);
			
			
		}
		else {
			
			System.out.println("This is not expected title " + actualPageTigle );
		}
		
		
		
		System.out.println(actualPageTigle);
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		int count = ele.size();
		System.out.println("Totla links count : " + count);
		
		/*
		 * for(int i = 0; i<count; i++) {
		 * 
		 * String linkTitle = ele.get(i).getText(); if(linkTitle.length()>0)
		 * 
		 * System.out.println(i + ":" + linkTitle);
		 * 
		 * }
		 */
		int count1 = 0;
		for(WebElement e : ele ) {
			
			String s1 = e.getText();
			if (s1.length()>0) {
				
			}
			System.out.println(count1 + ":" + s1);
		}
		count1++;
		
		Thread.sleep(4000);
		
		driver.quit();
	
		
	}
			
			
	}
	


