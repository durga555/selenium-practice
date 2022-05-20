package selenium1.xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readsheet {
	static WebDriver driver;
 static By email = By.xpath("//input[contains(@placeholder,'Username')]");
	 
	 static By paswrd = By.xpath("//input[@placeholder='Password']");
	 static By button = By.xpath("//input[@class='submit-button btn_action']");
	 
	public static void main(String[] args) throws Exception {
		File svr = new File("C:\\Users\\durga prasad\\eclipse-workspace\\seleniumi1\\createsheet\\test.xlsx");
		FileInputStream fis = new FileInputStream(svr);
        XSSFWorkbook prasad = new XSSFWorkbook(fis);
        XSSFSheet sheet = prasad.getSheetAt(0);
        String username = sheet.getRow(0).getCell(0).getStringCellValue();
        String paswd = sheet.getRow(0).getCell(1).getStringCellValue();
        
        
		System.out.println(username);     
       prasad.close();
       fis.close();
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(email).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(paswrd).sendKeys(paswd);
        Thread.sleep(3000);
        driver.findElement(button).click();
        Thread.sleep(3000);
        driver.close();
        
}
}
