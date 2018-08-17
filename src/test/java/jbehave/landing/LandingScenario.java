package jbehave.landing;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import smava.dto.LoanSelectorDTO;
import smava.steps.LandingSteps;

public class LandingScenario {

    @Steps
   private LandingSteps landingSteps;

    @When("user fills loan selector with next data:$table")
    public void fillLoanSelector(ExamplesTable table){
        LoanSelectorDTO loanSelectorDTO = table.getRowsAs(LoanSelectorDTO.class).get(0);
        landingSteps.setAmount(loanSelectorDTO.getAmount());
        landingSteps.setUsage(loanSelectorDTO.getUsage());
        landingSteps.setPeriod(loanSelectorDTO.getPeriod());
    }

    @When("{user|}clicks Next button")
    public void clickNextButton(){
        landingSteps.clickNextButton();
    }
}
