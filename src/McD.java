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
	@Test
	public void testCase2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.mcdonalds.com/ca/en-ca.html";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[1]/div/a")).click();
		Thread.sleep(1500);
		
		WebElement firstnameBox = driver.findElement(By.id("firstname2"));
		Thread.sleep(2500);
		firstnameBox.sendKeys("kbkakhil");
		Thread.sleep(1000);

		WebElement emailBox = driver.findElement(By.id("email2"));
		emailBox.sendKeys("kbkakhil459@gmail.com");
		Thread.sleep(1000);
		
		
		WebElement postalBox = driver.findElement(By.id("postalcode2"));
		postalBox.sendKeys("  M1H");
		Thread.sleep(2000);

		WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		subscribeButton.click();
		Thread.sleep(3000);

		//driver.close();

		//if (actualTitle.contentEquals(expectedTitle)){
		// System.out.println("Test Passed!");
		//} else {
		// System.out.println("Test Failed");
		// }
		 driver.close();
		 Thread.sleep(5000);
	}
		@Test
		public void testCase3() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
			WebDriver driver = new ChromeDriver();
			String baseUrl = "https://www.mcdonalds.com/ca/en-ca.html";
			driver.get(baseUrl);
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[1]/div/a")).click();
			Thread.sleep(1500);
			
			WebElement firstnameBox = driver.findElement(By.id("firstname2"));
			Thread.sleep(500);
			firstnameBox.sendKeys("");
			Thread.sleep(1000);

			WebElement emailBox = driver.findElement(By.id("email2"));
			emailBox.sendKeys("");
			Thread.sleep(1000);
			
			
			WebElement postalBox = driver.findElement(By.id("postalcode2"));
			postalBox.sendKeys("");
			Thread.sleep(1000);

			WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
			subscribeButton.click();

		
	}
	
}
