package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	
	ChromeDriver driver;
	
	By txt_username = By.id("username");
	By txt_password = By.id("password");
	By btn_login = By.id("submit");
	By btn_logout = By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a");
	
	public loginPage(ChromeDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void Login() {
		driver.findElement(btn_login).click();
	}
	
	public void Logout() {
		driver.findElement(btn_logout).isDisplayed();
	}
	

}
