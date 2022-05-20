package selenium1.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtabledynamic {



	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(rows.size());
		int rowsize = rows.size();
		//			System.out.println(colums.size());
		for(int i =1;i<=rowsize;i++) {
			List<WebElement> colums = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i +"]/td"));
			int columsize = colums.size();
			for(int j=1;j<=columsize;j++) {
				System.out.print(driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i +" ]/td[" + j + "]"))
						.getText()+"  ");
			}

			System.out.println();
		}

	}
}