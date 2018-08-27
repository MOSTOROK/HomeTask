package smava.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.landing.CreditRequestLandingPage;

public class CreditRequestPageSteps extends ScenarioSteps {
   private CreditRequestLandingPage creditRequestPage;

    @Step
    public String getResultPageURL(){
     return creditRequestPage.getCreditRequestPageURL();
    }

    @Step
    public boolean isCreditRequestPageLoaded(){
        creditRequestPage.waitForPageToLoad(10);
        return creditRequestPage.isContactInfoPanelPresent() &&
               creditRequestPage.isCustomerReviewPanelPresent() &&
               creditRequestPage.isSideHelpPresent();
    }

}
