package sharingbox_webapp.SeleniumTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdministratorSeleniumTest {
	@Test
	public void contextLoad() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","E:\\Tools\\SeleniumChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.localhost:8080");
		
		WebElement inputusername;
		inputusername = driver.findElement(By.id("username"));
		inputusername.sendKeys("admin@test.com");
		
		WebElement inputpassword;
		inputpassword = driver.findElement(By.id("password"));
		inputpassword.sendKeys("test");
		
		WebElement loginbutton;
		loginbutton = driver.findElement(By.id("submit"));
		loginbutton.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Persoon Toevoegen")).click();
		
		Thread.sleep(2000);
		
		WebElement voornaam;
		voornaam = driver.findElement(By.id("voornaam"));
		voornaam.sendKeys("test");
		
		WebElement familienaam;
		familienaam = driver.findElement(By.id("familienaam"));
		familienaam.sendKeys("test");
		
		WebElement emailadres;
		emailadres = driver.findElement(By.id("emailadres"));
		emailadres.sendKeys("test@test.com");
		
		WebElement paswoord;
		paswoord = driver.findElement(By.id("paswoord"));
		paswoord.sendKeys("test");
		
		Thread.sleep(2000);
		
		paswoord.submit();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Home")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
