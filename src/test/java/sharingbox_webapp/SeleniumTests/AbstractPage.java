package sharingbox_webapp.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String getPageText(){
		return driver.findElement(By.tagName("body")).getText();
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
}
