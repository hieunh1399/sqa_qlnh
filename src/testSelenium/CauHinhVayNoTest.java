package testSelenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CauHinhVayNoTest {

	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/dong99/Downloads/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/SQA_QLNH/listCH");
		
	}
	@After
	public void tearDown() {
//		driver.close();
	}
	
	@Test 
	public void TestChuan() {
		driver.findElement(By.id("detailCHV")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/chitietCH?id=1";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
}
