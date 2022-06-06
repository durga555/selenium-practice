package testng;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	static WebDriver driver;
	@Test
	public  void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
		Select select = new Select( driver.findElement(By.id("month")));
		ArrayList<String> actualDropdownvalues = new ArrayList<String>();
		
		for(WebElement element : select.getOptions()) {
			actualDropdownvalues.add(element.getText());

		}
		ArrayList<String> expectDropdownvalues = new ArrayList<String>();
		expectDropdownvalues.add("Jan");
		expectDropdownvalues.add("Feb");
		expectDropdownvalues.add("Mar");
		expectDropdownvalues.add("Apr");
		expectDropdownvalues.add("May");
		expectDropdownvalues.add("Jun");
		expectDropdownvalues.add("Jul");
		expectDropdownvalues.add("Aug");
		expectDropdownvalues.add("Sep");
		expectDropdownvalues.add("Oct");
		expectDropdownvalues.add("Nov");
		expectDropdownvalues.add("Dec");
		for(int i=0;i<actualDropdownvalues.size();i++) {
			System.out.println("Actual : " +actualDropdownvalues.get(i) + "& expected : " +expectDropdownvalues.get(i));
			Assert.assertTrue(actualDropdownvalues.get(i).equals(expectDropdownvalues.get(i)));

		}
		driver.close();
	}



}

