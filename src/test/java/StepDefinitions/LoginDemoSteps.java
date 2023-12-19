package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginDemoSteps {
	
	ChromeDriver driver = null;
	loginPage login;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		
	 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}

	@And("^user is on login page$")
	public void user_is_on_login_page() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		   
	}

	@When("^user enters (.*?) and (.*?)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login = new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		login.Login();
		Thread.sleep(2000);
	    
	}

	@Then("user is naviagted to home page")
	public void user_is_naviagted_to_home_page() {
	
		login.Logout();
		driver.close();
		driver.quit();
	   
	}


}
