package cucmberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCucumber {

	public static WebDriver driver;
	public static String baseUrl = "https://mail.126.com";
	
	@Test
	public void testLoginAndLogout() throws Exception {
		driver.get(baseUrl);
		driver.get("https://www.gmail.com/");
		WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
		signIn.click();
		WebElement userName = driver.findElement(By.xpath(".//*[@id='Email']"));
		WebElement password = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		WebElement loginButton = driver.findElement(By.xpath(".//*[@id='signIn']"));
		
	}
	
	
}
