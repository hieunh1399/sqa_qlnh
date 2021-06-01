package testSelenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/dong99/Downloads/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/SQA_QLNH/home");
		
	}
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test 
	public void TestLogoutChuan() {
		driver.findElement(By.id("logoutsubmit")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/logout";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestLogoutException() {
		driver.findElement(By.id("logoutsubmit")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/checklogin";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
}
