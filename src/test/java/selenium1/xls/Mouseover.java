package selenium1.xls;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement element = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"));
	element1.click();
	Thread.sleep(5000);
	
	driver.close();
	
	}


}
