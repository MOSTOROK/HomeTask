package smava.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.CommonPage;

public class CommonPageSteps extends ScenarioSteps {
    CommonPage commonPage;

    @Step
    public String getCurrentUrl(){
        return commonPage.getCurrentURL();
    }
}
