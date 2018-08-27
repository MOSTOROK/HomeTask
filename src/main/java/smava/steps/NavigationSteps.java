package smava.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.CommonLandingPage;

public class NavigationSteps extends ScenarioSteps {
    private CommonLandingPage commonLandingPage;

    @Step
    public void openLandingPage(){
        commonLandingPage.openPage("https://www.smava.de/v2?version=landingpage");
    }

}
