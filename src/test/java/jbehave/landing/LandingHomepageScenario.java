package jbehave.landing;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import smava.dto.LoanSelectorDTO;
import smava.steps.LandingHomepageSteps;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LandingHomepageScenario {

    @Steps
   private LandingHomepageSteps landingHomepageSteps;

    @When("user fills loan selector with next data:$table")
    public void fillLoanSelector(ExamplesTable table){
        LoanSelectorDTO loanSelectorDTO = table.getRowsAs(LoanSelectorDTO.class).get(0);
        landingHomepageSteps.setAmount(loanSelectorDTO.getAmount());
        landingHomepageSteps.setUsage(loanSelectorDTO.getUsage());
        landingHomepageSteps.setPeriod(loanSelectorDTO.getPeriod());
    }

    @When("{user|}clicks Next button")
    public void clickNextButton(){
        landingHomepageSteps.clickNextButton();
    }

    @When("user click on Anmelden button")
    public void clickOnLoginButton(){
        landingHomepageSteps.clickLogInButton();
    }

    @When("type '$email' in log in field")
    public void typeEmail(String email){
        landingHomepageSteps.typeLoginInLoginPopup(email);
    }

    @When("type '$password' in password field")
    public void typePassword(String password){
        landingHomepageSteps.typePassInLoginPopup(password);
    }

    @When("clicks Anmelden button on LogIn popup")
    public void clickLogInOnLoginPopup(){
        landingHomepageSteps.clickLoginButtonOnLogInPopup();
    }

    @Then("log in field has value '$email'")
    public void verifyLogInFieldValue(String expectedEmail){
       assertThat(expectedEmail, equalTo(landingHomepageSteps.getTextFromLoginField()));
    }

    @Then("password field has value '$password'")
    public void verifyPasswordFieldValue(String expectedPass){
        assertThat(expectedPass, equalTo(landingHomepageSteps.getTextFromPassField()));
    }

    @Then("'$errorMessageLogin' should be displayed under Login field")
    public void verifyErrorMessageLogIn(String expectedError){
        assertThat(expectedError, equalTo(landingHomepageSteps.getErrorMessageFromLogInField()));
    }

    @Then("'$errorMessagePass' should be displayed under Password field")
    public void verifyErrorMessagePass(String expectedError){
        assertThat(expectedError, equalTo(landingHomepageSteps.getErrorMessageFromPasswordField()));
    }

}
