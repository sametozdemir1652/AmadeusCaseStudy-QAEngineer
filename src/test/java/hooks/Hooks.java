package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.Driver;
import utilities.ReusableMethods;

public class Hooks {

    @After
    public void after(Scenario scenario){
        if (scenario.isFailed()){
            ReusableMethods.takeScreenShot();
            Driver.closeDriver();
        }
    }

}
