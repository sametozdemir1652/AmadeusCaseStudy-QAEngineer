package stepDefinitions.ui_StepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.FlightsPage;
import utilities.ReusableMethods;

import java.util.List;

public class TC03_UIStepDefs {


    FlightsPage flightsPage = new FlightsPage();

    @Then("Verify that the value of X in -Found X items- is same with number of listed flights")
    public void verifyThatTheValueOfXInElementIsSameWithNumberOfListedFlights() {

        String numOfFlightsText = flightsPage.numOfFlights.getText();
        int numOfFlights = ReusableMethods.removeNunNumeric(numOfFlightsText);

        List<WebElement> listOfFlights = flightsPage.listOfFlights;

        Assert.assertEquals(listOfFlights.size(),numOfFlights);

    }
}
