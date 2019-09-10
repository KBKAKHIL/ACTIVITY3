import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class McD {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCase1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.mcdonalds.com/ca/en-ca.html";
		driver.get(baseUrl);
		WebElement heading = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[3]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/h2"));
		String actualheading = heading.getText();
		assertEquals("Subscribe to My McD’s®",actualheading);
		System.out.println("Title : " + actualheading);
		Thread.sleep(1000);
		
		if (actualheading.contentEquals("Subscribe to My McD’s®")){
				 System.out.println("Test Passed!");
				} else {
				 System.out.println("Test Failed");
				 }
		driver.close();
	
	}
	
}
