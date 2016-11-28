package sharingbox_webapp.SeleniumTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerhuurderSeleniumTestVerhuringToevoegen {

	@Test
	public void contextLoad() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","E:\\Tools\\SeleniumChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.localhost:8080");
		
		WebElement inputusername;
		inputusername = driver.findElement(By.id("username"));
		inputusername.sendKeys("verhuurder@test.com");
		
		WebElement inputpassword;
		inputpassword = driver.findElement(By.id("password"));
		inputpassword.sendKeys("test");
		
		WebElement loginbutton;
		loginbutton = driver.findElement(By.id("submit"));
		loginbutton.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Verhuring Toevoegen")).click();	
		
		Thread.sleep(2000);
		
		WebElement aanvraag;
		aanvraag = driver.findElement(By.name("aanvraag_id"));
		aanvraag.click();
		
		Thread.sleep(500);
		
		WebElement Bevestigen;
		Bevestigen = driver.findElement(By.id("btnNext"));
		Bevestigen.click();
	
	}
	
}

