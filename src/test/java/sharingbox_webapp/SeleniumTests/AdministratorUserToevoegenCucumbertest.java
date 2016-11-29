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

public class AdministratorUserToevoegenCucumbertest {

	WebDriver driver;

	LoginPage loginpage;
	LijstVanPersonenPage lijstvanpersonenpage;
	NieuwePersoonToevoegenPage nieuwepersoontoevoegenpage;
	
	 @Given("^I am on the administrator page$")
	    public void i_am_on_the_administrator_page() throws Throwable {
		 	System.setProperty("webdriver.chrome.driver","E:\\Tools\\SeleniumChromeDriver\\chromedriver.exe");
		 	driver = new ChromeDriver();
		 	loginpage = new LoginPage(driver);
		 	
		 	loginpage.GoToLogin();
		 	loginpage.enterEmailAddress("admin@test.com");
		 	loginpage.enterPassword("test");
			loginpage.ClickSubmit();			
			
	    }

	    @And("^I click on Persoon Toevoegen$")
	    public void i_click_on_persoon_toevoegen() throws Throwable {
	    	lijstvanpersonenpage = new LijstVanPersonenPage(driver);
	    	lijstvanpersonenpage.klikPersoonToevoegen();
	    	
	    }

	    @And("^I am relocated to the persoon toevoegen page$")
	    public void i_am_relocated_to_the_persoon_toevoegen_page() throws Throwable {
	    	nieuwepersoontoevoegenpage = new NieuwePersoonToevoegenPage(driver);
	    }

	    @And("^I give in \"([^\"]*)\" as first name$")
	    public void i_give_in_something_as_first_name(String strArg1) throws Throwable {
	    	nieuwepersoontoevoegenpage.VoornaamInvullen(strArg1);
	    }

	    @And("^I give in \"([^\"]*)\" as last name$")
	    public void i_give_in_something_as_last_name(String strArg1) throws Throwable {
	    	nieuwepersoontoevoegenpage.AchternaamInvullen(strArg1);	    	
	    }

	    @And("^I five in \"([^\"]*)\" as mailadres$")
	    public void i_five_in_something_as_mailadres(String strArg1) throws Throwable {
	    	nieuwepersoontoevoegenpage.EmailInvullen(strArg1);
	    }

	  
	    
	    @And("^I give in \"([^\"]*)\" as password$")
	    public void i_give_in_something_as_password(String strArg1) throws Throwable {  	
	    	nieuwepersoontoevoegenpage.PaswoordInvullen(strArg1);
	    }

	    @When("^I press Submit on the Persoon Toevoegen page$")
	    public void i_press_submit_on_the_persoon_toevoegen_page() throws Throwable {
	    	nieuwepersoontoevoegenpage.Save();
	    }
	
	    @Then("^I should see the information of the created user on the screen$")
	    public void i_should_see_the_information_of_the_created_user_on_the_screen() throws Throwable {
	    	Thread.sleep(5000);
	    	nieuwepersoontoevoegenpage.stop();
	    }
	    
}
