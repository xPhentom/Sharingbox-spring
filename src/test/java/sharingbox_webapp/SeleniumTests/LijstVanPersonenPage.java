package sharingbox_webapp.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LijstVanPersonenPage extends AbstractPage{

	public LijstVanPersonenPage(WebDriver driver){
		super(driver);
	}
	
	public LijstVanPersonenPage klikPersoonToevoegen(){
		driver.findElement(By.partialLinkText("Persoon Toevoegen")).click();
		return this;
	}
	
}
