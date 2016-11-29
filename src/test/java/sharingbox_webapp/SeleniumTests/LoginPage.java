package sharingbox_webapp.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public LoginPage GoToLogin(){
		driver.navigate().to("http://localhost:8080/login");
		return new LoginPage(driver);
	}
	
	public LoginPage enterEmailAddress(String email){
		WebElement inputusername;
		inputusername = driver.findElement(By.id("username"));
		inputusername.sendKeys(email);
		return this;
		
	}
	
	public LoginPage enterPassword(String password){
		WebElement inputpassword;
		inputpassword = driver.findElement(By.id("password"));
		inputpassword.sendKeys(password);
		return this;
	}
	
	public LoginPage ClickSubmit(){
		WebElement loginbutton;
		loginbutton = driver.findElement(By.id("submit"));
		loginbutton.click();
		return this;
	}
	
	public void stop(){
		driver.quit();
	}

	
}
