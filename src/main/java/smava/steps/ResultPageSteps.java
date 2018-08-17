package smava.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.ResultsPage;

public class ResultPageSteps extends ScenarioSteps {
    ResultsPage resultsPage;

    @Step
    public String getResultPageURL(){
     return resultsPage.getResultPageURL();
    }

}
