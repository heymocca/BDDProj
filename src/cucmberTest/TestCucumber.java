package cucmberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCucumber {

	public static WebDriver driver;
	public static String baseUrl = "https://mail.126.com";
	
	@Test
	public void testLoginAndLogout() throws Exception {
		driver.get(baseUrl);
		driver.get("https://mail.google.com");
		WebElement userName = 
	}
	
	
}
