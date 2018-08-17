package smava.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.CommonPage;

public class NavigationSteps extends ScenarioSteps {
    private CommonPage commonPage;

    @Step
    public void openLandingPage(){
        commonPage.openPage("https://www.smava.de/v2?version=landingpage");
    }

}
