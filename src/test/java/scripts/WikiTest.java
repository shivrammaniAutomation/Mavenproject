package scripts;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikiTest 
{
	WebDriver driver;
	@Test
	public void New1()
	{
		System.setProperty("webdriver.chrome.driver", "src/main/java/scripts/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.findElement(By.xpath("//a[@id='js-link-box-en']")).click();
		System.out.println("Test Completed");
		

	}
	

}
