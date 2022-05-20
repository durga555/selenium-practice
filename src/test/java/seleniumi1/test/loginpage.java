package seleniumi1.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public  class loginpage {
	
	 public static WebDriver driver;
	 static By email = By.xpath("//input[contains(@placeholder,'Username')]");
	 
	 static By paswrd = By.xpath("//input[@placeholder='Password']");
	 static By button = By.xpath("//input[@class='submit-button btn_action']");
	 

	 public static void enterEmail() {
		 
		 driver.findElement(email).sendKeys("standard_user");
		
	 }
	 
	 
	 public static void enterpswrd() {
		 driver.findElement(paswrd).sendKeys("sauce");
		 
	 }
	 public static void enterbutton() {
		 driver.findElement(button).click();
	 }

		
	}
	 

	   
   

