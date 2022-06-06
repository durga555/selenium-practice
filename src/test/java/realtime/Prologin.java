package realtime;




import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Prologin extends ProHealth{

	public void lauchpage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[contains(@id,'facility')]")));
		dropdown1.selectByIndex(2);
		Select dropdown2 = new Select(driver.findElement(By.xpath("//select[contains(@name,'roles')]")));
		dropdown2.selectByIndex(1);
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'LOGIN')]")).click();
		WebElement element =  driver.findElement(By.xpath("(//img[contains(@width,'25px')])[5]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		WebElement element1 = driver.findElement(By.xpath("//a[@href='/DomainValues']"));
		element1.click();
		List<WebElement> list= driver.findElements(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/ul/li/button"));
		int size=list.size();
		for(int i=1;i<=size;i++) {
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/ul/li["+i+"]")).click();
			//	boolean value=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/ul/li["+i+"]")).isDisplayed();
			JavascriptExecutor js;

			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,50)", "");

			try {
				driver.findElement(By.xpath("(//span[@class='close-icon'])[2]")).click();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}JavascriptExecutor js;

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)", "");
		driver.findElement(By.xpath("//button[contains(.,'Address Type')]")).click();
		
		driver.findElement(By.xpath("//button[contains(.,'Adjustment Remark Code')]")).click();
		//driver.findElement(By.xpath("//input[contains(@name,'add')]")).click();
		//driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();

	}






}





