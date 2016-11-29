package sharingbox_webapp.SeleniumTests;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.runner.RunWith;

@CucumberOptions(
	      format = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"}
	)

public class AdministratorInloggencucumbertest {
	
	
	WebDriver driver;
	
	LoginPage loginpage;
	
	 @Given("^I am on the login screen$")
	    public void i_am_on_the_login_screen() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver","E:\\Tools\\SeleniumChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 loginpage = new LoginPage(driver);
		 loginpage.GoToLogin();
	      
	    }
	 
	
	    @And("^I use the mailadres \"([^\"]*)\"$")
	    public void i_use_the_mailadres_something(String strArg1) throws Throwable {
	    	loginpage.enterEmailAddress(strArg1);
			
	    }

	    @And("^the password \"([^\"]*)\"$")
	    public void the_password_something(String strArg1) throws Throwable {
			loginpage.enterPassword(strArg1);
	    }


	    @When("^I press submit$")
	    public void i_press_submit() throws Throwable {
	    	loginpage.ClickSubmit();
	    }
	    
	    @Then("^I should be relocated to the administrator page$")
	    public void i_should_be_relocated_to_the_administrator_page() throws Throwable {
	        Thread.sleep(5000);
	    	loginpage.stop();
	    }

	
}
