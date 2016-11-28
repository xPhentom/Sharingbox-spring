package sharingbox_webapp.SeleniumTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerhuurderSeleniumTestAanvraagWeigeren {

	@Test
	public void contextLoads() throws InterruptedException {
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
		
		driver.findElement(By.partialLinkText("Aanvraag Weigeren")).click();	
	
		Thread.sleep(2000);
		
		WebElement aanvraag;
		aanvraag = driver.findElement(By.name("id"));
		aanvraag.click();
		
		Thread.sleep(200);
		
		WebElement bevestig;
		bevestig = driver.findElement(By.id("btnNext"));
						
	}
}
