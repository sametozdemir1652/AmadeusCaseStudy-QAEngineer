package stepDefinitions.ui_StepDefs;

import hooks.Hooks;
import io.cucumber.java.en.And;
import pages.FlightsPage;

public class TC02_UIStepDefs {


    FlightsPage flightsPage = new FlightsPage();

    @And("Enter the same value into the To input field")
    public void enterTheSameValueIntoTheToInputField() {

        flightsPage.toMenu.click();
        flightsPage.iST.click();
    }
}
