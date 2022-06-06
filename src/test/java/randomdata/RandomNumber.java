package randomdata;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class RandomNumber {
	
	@Test
	
	void randomgeneral() {
		for(int i=1;i<10;i++)
		{
		Faker fa = new Faker();
		
		String firstname = fa.name().firstName();
		String lastname = fa.name().lastName();
		String phone = fa.number().digits(10);
		String adhar = fa.number().digits(12);
		String pan = fa.number().digits(6)+fa.expression(lastname);
		
		String email = firstname.toLowerCase()+ "."+ lastname.toLowerCase() +"@yahoo.com";
		
		
		
		System.out.println("firstname:" +firstname+ "  "+ "lastname:" +lastname+ "  "+"email:" +email+" "+"phone:" +phone+" " +"adhar:" +adhar+" "+"pan:" +pan);
				
		
		
		
	}
	}

}
