package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class registration {
	
	@Given("User launch website {string}")
	public void user_launch_website(String string) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		WebDriver driver = new ChromeDriver(options);
		driver.get(string);
		
	}

	@Given("User verify that home page is visible successfully")
	public void user_verify_that_home_page_is_visible_successfully() {
		
	}

	@Given("User click on {string} button")
	public void user_click_on_button(String string) {
		
	}

	@Given("User verify {string} is visible")
	public void user_verify_is_visible(String string) {
	}

	@Given("User enter name and email address")
	public void user_enter_name_and_email_address() {
	}

	@Then("User verify that {string} is visible")
	public void user_verify_that_is_visible(String string) {
	}


}
