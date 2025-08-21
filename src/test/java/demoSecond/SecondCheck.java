package demoSecond;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SecondCheck 
{
	public WebDriver driver;
	@Test(priority=1)
	public void f() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




	}

	@Test(priority=2)
	public void f2()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
