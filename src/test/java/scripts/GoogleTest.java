package scripts;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest
{
	WebDriver driver;
	@Test
	public void New2()
	{
		System.setProperty("webdriver.chrome.driver", "src/main/java/scripts/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Test Automation");
		System.out.println("Google Test Completed");
		//driver.close();
		

	}
	

}
