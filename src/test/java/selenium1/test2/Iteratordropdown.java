package selenium1.test2;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iteratordropdown {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

		List<WebElement> option = driver.findElements(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/form[3]/select/option"));
		System.out.println(option.size());
		int select = option.size();
		//		for (WebElement element : option) {
		//			String select1 = element.getText();
		//					if(select1.equalsIgnoreCase("Fiat")) {
		//						element.click();
		//						
		//					}
		//		}
		Iterator<WebElement> select11 = option.iterator();
		while(select11.hasNext()) {

			String select1 = select11.next().getText();
			if(select1.equalsIgnoreCase("Fiat")) {
				select11.next().click();
				//				
				//			}
				System.out.println(select1);	
			}

		}
	}
}



