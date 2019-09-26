package advanced_annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void settingUpDriver(String browser) {
		String browserChrome = "chrome";
		String browserFireFox = "firefox";
		//WebDriver driver;
		if (browser.equals(browserChrome)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		}
	}
	
	@AfterTest
	public void destroyDriver() {
		driver.quit();
	}

}
