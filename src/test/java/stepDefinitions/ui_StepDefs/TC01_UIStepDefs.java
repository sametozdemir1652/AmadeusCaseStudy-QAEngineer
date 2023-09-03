package stepDefinitions.ui_StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FlightsPage;
import utilities.Driver;

public class TC01_UIStepDefs {

    FlightsPage flightsPage = new FlightsPage();

    @Given("Go to the {string} url")
    public void go_to_the_url(String url) {

        Driver.getDriver().get(url);
    }
    @When("Enter the value into the From input field")
    public void enter_the_value_into_the_from_input_field() {

        flightsPage.fromMenu.click();
        flightsPage.iST.click();
    }



    @When("Enter the value into the To input field")
    public void enter_the_value_into_the_to_input_field() {

        flightsPage.toMenu.click();
        flightsPage.lAX.click();
    }

    @Then("Verify that From and To input values are not same")
    public void validateThatFromAndToInputValuesAreNotSame() {

        flightsPage.fromMenu.click();
        String from = flightsPage.selectedCity.getText();

        flightsPage.toMenu.click();
        String to = flightsPage.selectedCity.getText();

        Assert.assertNotEquals(from, to);
    }

    @And("Close the page")
    public void closeThePage() {

        Driver.closeDriver();
    }


}




