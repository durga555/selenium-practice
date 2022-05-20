package seleniumi1.test;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() throws Exception {
		FileInputStream input = new FileInputStream("C:\\Users\\durga prasad\\eclipse-workspace\\seleniumi1\\configuration\\read.properties");
		prop = new Properties();
		prop.load(input);
	}
	
	public String getbrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		String url = prop.getProperty("url");
		return url;
	}

}
