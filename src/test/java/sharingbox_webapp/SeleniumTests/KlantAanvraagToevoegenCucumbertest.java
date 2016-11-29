package sharingbox_webapp.SeleniumTests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KlantAanvraagToevoegenCucumbertest {

	WebDriver driver;
	
	@Given("^I am logged in as klant$")
    public void i_am_logged_in_as_klant() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\Tools\\SeleniumChromeDriver\\chromedriver.exe");
	 	driver = new ChromeDriver();
	 	
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
    }

    @When("^I am on the klantscreen$")
    public void i_am_on_the_klantscreen() throws Throwable {
        //TODO
    }

    
    @And("^I type \"([^\"]*)\" as date$")
    public void i_type_something_as_date(String strArg1) throws Throwable {
    	WebElement datumpicker;
		datumpicker = driver.findElement(By.id("datum"));
		datumpicker.sendKeys("11/08/2016 9:00 PM");
    }

    @And("^I give \"([^\"]*)\" as adres$")
    public void i_give_something_as_adres(String strArg1) throws Throwable {
    	WebElement inputadres;
		inputadres = driver.findElement(By.id("adres"));
		inputadres.sendKeys("Warmoesberg 26, 1000 Brussel");
		inputadres.submit();
    }

    @And("^I submit the form$")
    public void i_submit_the_form() throws Throwable {
    	driver.findElement(By.partialLinkText("Go to Home")).click();	
    }
    
    @Then("^I should see the info is confirmed$")
    public void i_should_see_the_info_is_confirmed() throws Throwable {
        //TODO
    	Thread.sleep(5000);
    	driver.quit();
    }

    
	
}
