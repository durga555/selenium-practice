package properties.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadConfig1 {
	static WebDriver driver;
	
   
	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(); 
		driver.get("https://amazon.com");
		
		FileInputStream fi = new FileInputStream("C:\\Users\\durga prasad\\eclipse-workspace\\seleniumi1\\configuration\\configuration1\\read1.properties");
		Properties p = new Properties();
		p.load(fi); 
		String name = p.getProperty("browser");
	
		switch(name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		}
		System.out.println (p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
		
		
   }
}
	


