package cucmberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class TestCucumber {

	public static WebDriver driver;
	public static String baseUrl = "https://mail.126.com";
	
	@Test
	public void testLoginAndLogout() throws Exception {
		driver.get(baseUrl);
		driver.get("https://www.gmail.com/");
		System.out.println("driver.get('https://www.gmail.com/');");	
		
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("***@gmail.com");
		System.out.println("Email");
		WebElement next = driver.findElement(By.xpath(".//*[@id='next']"));
		next.click();
		
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("Passwd"));
		password.sendKeys("***");
		System.out.println("Passwd");
		WebElement loginButton = driver.findElement(By.xpath(".//*[@id='signIn']"));
		
		loginButton.click();
		Thread.sleep(5000);
		
		assertTrue(driver.getPageSource().contains("Inbox"));
		System.out.println("Login successfully");
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Download\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
	
}
