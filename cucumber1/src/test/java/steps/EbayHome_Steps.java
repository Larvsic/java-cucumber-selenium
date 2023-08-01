package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	public WebDriver driver;
	
	/*
	 * Constructor from this class, as an argument is the Configurations class where is defined the driver.
	 * Any step / method from this class can reuse the driver.
	 */
	
	public EbayHome_Steps(Configurations configurations) {
		this.driver = configurations.getDriver();
	}
	
	@Given("I open Chrome")
	public void i_launch() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
		System.setProperty("webdriver.chrome.driver",
	            "/Users/luisramirez/Downloads/chromedriver_mac_arm64/chromedriver");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	
	@Given("I am on Ebay home page")
	public void i_am_on_ebay_home_page() {
	   driver.get("https://www.ebay.com");
	}

	@When("I click on advanced link")
	public void i_click_on_advanced_link() {
		driver.findElement(By.xpath("//*[@id='gh-as-a']")).click();
	}

	@Then("I navigate to Advanced search page")
	public void i_navigate_to_advanced_search_page() {
	    String expectedURL = "https://www.ebay.com/sch/ebayadvsearch";
	    String actualURL = driver.getCurrentUrl();
	    assertEquals(expectedURL,actualURL);
	}
	
	/*
	 * This step "I close browser" is not need anymore since on Configuration class is defined the Hooks - After which has the driver.quit and will be executed
	 *  always at the end of the execution
	*/
	
	@Then("I close browser")
	public void quit_driver() {
	    driver.quit();
	    
	}

}
