package selenium1.test2;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumi1.test.loginpage;

public class testcase1 extends loginpage {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.saucedemo.com/";
    WebDriverManager.firefoxdriver().setup();
    
    driver = new FirefoxDriver ();
    driver.get("https://www.saucedemo.com/");
    enterEmail();
    Thread.sleep(4000);
    
    
    enterpswrd();
    Thread.sleep(4000);
    enterbutton();
    
	
	if(url.equals("https://www.saucedemo.com/inventory.html")) {
		System.out.println("user able to login");
	}else {
		System.out.println("user unable to login");
	
	}
	}
}
	
		
	
	


