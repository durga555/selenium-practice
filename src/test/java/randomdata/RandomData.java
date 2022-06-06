package randomdata;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class RandomData {
	@Test
	void random() {
		for (int i = 1; i < 10; i++) {
			String generatedstring = RandomStringUtils.randomAlphabetic(9);
			String email = generatedstring + "@gmail.com";
			String phone = RandomStringUtils.randomNumeric(10);
			String name = RandomStringUtils.randomAlphabetic(10);
			String panNumber = RandomStringUtils.randomNumeric(10)+RandomStringUtils.randomAlphabetic(4);
			String adhar = RandomStringUtils.randomNumeric(16);
			System.out.println("name:" +name+ "  "+  "phone:" +phone+"  "+ "email:" +email+"  "+ "panNumber:" +panNumber+"  "+ "adhar:"  +adhar);
			
			
			
		}
		
	}
}
