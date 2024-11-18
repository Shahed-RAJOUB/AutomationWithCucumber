package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {
    @Given("User is on Netbanking landing page")
    public void user_is_on_netbanking_landing_page() {
        // Write code here that turns the phrase above into concrete actions with Selenium, APIs..etc
        System.out.println("landing");
    }
    @When("User login into application")
    public void user_login_into_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login");
    }
    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("page displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards displayed");
    }

/*   @When("User login into application with {string} and password {string}")
  public void userLoginIntoApplicationWithAndPassword(String userName, String userPass) {
  System.out.println(userName + "  +  " + userPass);
  }*/


    // rewrite it with regex to accept any data type (.+) is a refer to any data type
    @When("^User login into application with (.+) and password (.+)$")
    public void userLoginIntoApplicationWithAndPassword(String userName, String userPass) {
        System.out.println(userName + "  +  " + userPass);
    }

    @Given("User is on Practice landing page")
    public void userIsOnPracticeLandingPage() {
        System.out.println( " hello from practice");
        
    }

    // expects DataTable but could be replaceable with lists
    @When("User signup into application")
    public void userSignupIntoApplication(List<String> data) {
        //With Selenium: driver.findElement(sendKeys(data.get(0)));
        System.out.println(data.getFirst());
    }

    @Given("Setup the entries in database")
    public void setupTheEntriesInDatabase() {
        System.out.println("Setup the enteries in database");
    }

    @And("hit the home page url of banking site")
    public void hitTheHomePageUrlOfBankingSite() {
        System.out.println("hit the home page url of banking site");
        
    }

    @When("launch the browser from config variables")
    public void launchTheBrowserFromConfigVariables() {
        System.out.println("launch the browser from config variables");
    }
}
