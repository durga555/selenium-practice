package selenium1.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='post-body-7988417473080013803']/div[1]/center/table/tbody/tr"));
		System.out.println(rows.size());
		int rowsize = rows.size();
		List<WebElement> colums = driver.findElements(By.xpath("//*[@id=\"post-body-7988417473080013803\"]/div[1]/center/table/tbody/tr/th"));

		System.out.println(colums.size());
		int columssize = colums.size();
		for(int i =2;i<=rowsize;i++) {
			for(int j=1;j<=columssize;j++) {


System.out.println(driver.findElement(By.xpath("//*[@id='post-body-7988417473080013803']/div[1]/center/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
			}


		}

	}

}
