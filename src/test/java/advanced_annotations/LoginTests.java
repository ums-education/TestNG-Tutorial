package advanced_annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {
	
	@BeforeClass
	public void beforeLogin() {
		System.out.println("BeforeClass inside LoginTests");
	}
	@AfterClass
	public void afterLogin() {
		System.out.println("AfterClass inside LoginTests");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod inside LoginTests");
	}
	
	@Test ()
	@Parameters({"username", "password"})
	public void login(String username, String password) {
		Setup.driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		Setup.driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
		Setup.driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
		Setup.driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}
	
	@Test
	public void anotherTest() {
		System.out.println("this is to demo how Before&After methods act");
	}
	
	@AfterMethod
	public void holdOn() {
		System.out.println("AfterMethod inside LoginTests");
		System.out.println("waiting for 3 seconds before quitting");
		try {
			Thread.sleep(3000);
		}catch (Exception e) {
			
		}
	}

}
