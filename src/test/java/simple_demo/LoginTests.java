package simple_demo;

import org.testng.annotations.Test;

public class LoginTests {

	@Test (groups = {"Positive Scenario", "Smoke Test"})
	public void logIn() {
		System.out.println("I am logging in to the account");
	}
	
	@Test (groups = {"Positive Scenario", "Smoke Test"})
	public void logOut() {
		System.out.println("I am logging out of the account");
	}
	
	@Test (groups = {"Negative Scenario"})
	public void wrongPasswordLogin() {
		System.out.println("Trying to login using wrong password");
	}
	
	@Test (groups = {"Negative Scenario"})
	public void blankPasswordLogin() {
		System.out.println("Trying to login without password");
	}
	
	@Test (groups = {"Negative Scenario"})
	public void wrongUsernameLogin() {
		System.out.println("Trying to login using wrong username");
	}
	
	@Test (groups = {"Negative Scenario"})
	public void blankUsernameLogin() {
		System.out.println("Trying to login without username");
	}
	
	@Test (groups = {"Negative Scenario"})
	public void blankCredentialsLogin() {
		System.out.println("Trying to login without password or username");
	}
}
