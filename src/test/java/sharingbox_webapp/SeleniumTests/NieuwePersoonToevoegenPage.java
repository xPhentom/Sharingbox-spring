package sharingbox_webapp.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NieuwePersoonToevoegenPage extends AbstractPage {

	public NieuwePersoonToevoegenPage(WebDriver driver){
		super(driver);
	}
	
	public NieuwePersoonToevoegenPage VoornaamInvullen(String Voornaam){
		WebElement voornaam;
		voornaam = driver.findElement(By.id("voornaam"));
		voornaam.sendKeys(Voornaam);
		return this;
	}
	
	public NieuwePersoonToevoegenPage AchternaamInvullen(String Familienaam){
		WebElement familienaam;
		familienaam = driver.findElement(By.id("familienaam"));
		familienaam.sendKeys(Familienaam);
		return this;
	}
	
	public NieuwePersoonToevoegenPage EmailInvullen(String Email){
		WebElement emailadres;
		emailadres = driver.findElement(By.id("emailadres"));
		emailadres.sendKeys(Email);
		return this;
	}
	
	WebElement paswoord;
	
	public NieuwePersoonToevoegenPage PaswoordInvullen(String Paswoord){
		
		paswoord = driver.findElement(By.id("paswoord"));
		paswoord.sendKeys(Paswoord);
		return this;
	}
	
	public NieuwePersoonToevoegenPage Save(){
		paswoord.submit();
		return this;
	}
	
	public void stop(){
		driver.quit();
	}
	
	
}
