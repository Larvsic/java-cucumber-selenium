package steps;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

public class Configurations {
	
	public WebDriver driver;
	
	
	@Before
	public void Setup() throws InterruptedException { 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
		System.setProperty("webdriver.chrome.driver",
	            "/Users/luisramirez/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	
	@Before(value = "@customTagHooks", order = 1)
	public void customHooks() throws InterruptedException { 
		System.out.println("This is only executed for a custom tag from hooks");
	    Thread.sleep(3000);
	}
	
	@After(order = 0 ) // order help you to decide which hooks execute 
	public void Teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1);
	}
	
	public WebDriver getDriver() {
		return driver;
	}


}
