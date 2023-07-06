package haroon_selenium_practice;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class WaitTest {

private WebDriver driver;
private String baseUrl;
private WebElement element;

@BeforeMethod
public void setUp() throws Exception {
driver = new ChromeDriver();
baseUrl = "http://www.google.com";
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void testUntitled() throws Exception {
driver.get(baseUrl);
element = driver.findElement(By.id("lst-ib"));
element.sendKeys("Selenium WebDriver Interview questions");
element.sendKeys(Keys.RETURN);
List<WebElement> list = driver.findElements(By.className("_Rm"));
System.out.println(list.size());

}

@AfterMethod
public void tearDown() throws Exception {
driver.quit();
}
}