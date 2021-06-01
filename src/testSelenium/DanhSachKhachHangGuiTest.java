package testSelenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Model.Customer_Loan;

public class DanhSachKhachHangGuiTest {

	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/dong99/Downloads/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/SQA_QLNH/listKHG");
		
	}
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test 
	public void TestSearchChuan() {
		WebElement txtSearchTen= driver.findElement(By.id("searchinput"));
		txtSearchTen.sendKeys("NHD123");
		driver.findElement(By.id("searchbutton")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/searchKHG?key=NHD123";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestSearchSai() {
		WebElement txtSearchTen= driver.findElement(By.id("searchinput"));
		txtSearchTen.sendKeys("NHD234");
		driver.findElement(By.id("searchbutton")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/searchKHG?key=NHD234";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestSearchGanDung() {
		WebElement txtSearchTen= driver.findElement(By.id("searchinput"));
		txtSearchTen.sendKeys("NHD12");
		driver.findElement(By.id("searchbutton")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/searchKHG?key=NHD123";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestDetailChuan() {
		Customer_Loan customer_Loan = new Customer_Loan();
		driver.findElement(By.id("detailKHG")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/chitietKHG?id=1";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
}
