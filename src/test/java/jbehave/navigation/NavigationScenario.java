package jbehave.navigation;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import smava.steps.NavigationSteps;

public class NavigationScenario {

   @Steps
    private NavigationSteps navigationSteps;

    @Given("user is on landing page")
    public void openLanding(){
    navigationSteps.openLandingPage();
    }
}
