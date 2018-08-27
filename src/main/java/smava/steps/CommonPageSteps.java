package smava.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.CommonLandingPage;

public class CommonPageSteps extends ScenarioSteps {
    private CommonLandingPage commonLandingPage;

    @Step
    public String getCurrentUrl(){
        return commonLandingPage.getCurrentURL();
    }
}
