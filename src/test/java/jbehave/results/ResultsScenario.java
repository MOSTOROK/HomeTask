package jbehave.results;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import smava.steps.CommonPageSteps;
import smava.steps.ResultPageSteps;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class ResultsScenario {
    @Steps
    private CommonPageSteps commonPageSteps;
    @Steps
    private ResultPageSteps resultPageSteps;


    @Then("result page is displayed")
    public void resultPageDisplayed(){
       assertThat(commonPageSteps.getCurrentUrl(), containsString(resultPageSteps.getResultPageURL()));
    }
}
