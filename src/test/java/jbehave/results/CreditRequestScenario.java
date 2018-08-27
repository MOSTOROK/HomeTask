package jbehave.results;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import smava.steps.CommonPageSteps;
import smava.steps.CreditRequestPageSteps;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CreditRequestScenario {
    @Steps
    private CommonPageSteps commonPageSteps;
    @Steps
    private CreditRequestPageSteps creditRequestPageSteps;


    @Then("credit request is displayed")
    public void resultPageDisplayed(){
       assertThat(commonPageSteps.getCurrentUrl(), containsString(creditRequestPageSteps.getResultPageURL()));
    }

    @Then("credit request page completely loaded")
    public void creditRequestPageLoaded(){
        assertThat(creditRequestPageSteps.isCreditRequestPageLoaded(), is(true));
    }
}
