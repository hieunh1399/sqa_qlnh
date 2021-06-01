package testSelenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaoCaoVayNo {

	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/dong99/Downloads/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/SQA_QLNH/customer-loan-report");
		
	}
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test 
	public void TestDetailBaoCaoVay() {
		driver.findElement(By.id("detailBCV")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/chitietKHV?id=3";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestXuatBaoCao() {
		driver.findElement(By.id("xuatBCV")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/customer-loan-report";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
}
