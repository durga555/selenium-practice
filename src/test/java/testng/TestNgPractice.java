package testng;

import org.testng.annotations.Test;

public class TestNgPractice {
	@Test(priority=0)
	public void logintest() {


		System.out.println("login test passed");
	}
	@Test()
	public void logouttest() {
		System.out.println("logout test passed");
	}
}
