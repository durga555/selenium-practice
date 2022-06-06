package realtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class ProHealth {
	WebDriver driver;
	@BeforeTest
	
	public void launchpage() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://183.82.123.57:3000/login");
 	driver.findElement(By.xpath("//input[@name='practice']")).sendKeys("test");
	driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123qwe");
	driver.findElement(By.xpath("//button[contains(.,'LOGIN')]")).click();
	
	
		
	}

}
