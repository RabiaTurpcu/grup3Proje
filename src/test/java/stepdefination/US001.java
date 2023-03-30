package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {
    @Given("User goes to page")
    public void userGoesToPage() {

        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));
    }

    @When("User goes to registerpage and user is logged in SSN")
    public void userGoesToRegisterpageAndUserIsLoggedInSSN() {
    }



}
