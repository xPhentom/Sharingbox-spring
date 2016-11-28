package sharingbox_webapp.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class KlantSeleniumTest {
	
	@Test
	public void contextLoads() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tools\\SeleniumChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.localhost:8080");
		
		WebElement inputusername;
		inputusername = driver.findElement(By.id("username"));
		inputusername.sendKeys("klant@test.com");
		
		WebElement inputpassword;
		inputpassword = driver.findElement(By.id("password"));
		inputpassword.sendKeys("test");
		
		WebElement loginbutton;
		loginbutton = driver.findElement(By.id("submit"));
		loginbutton.click();
		
		WebElement datumpicker;
		datumpicker = driver.findElement(By.id("datum"));
		datumpicker.sendKeys("11/08/2016 9:00 PM");
		
		WebElement inputadres;
		inputadres = driver.findElement(By.id("adres"));
		inputadres.sendKeys("Warmoesberg 26, 1000 Brussel");
		inputadres.submit();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Go to Home")).click();	
		
		
		Thread.sleep(2000);
		driver.quit();
	}
		
		
		
		
		
	
	

}
