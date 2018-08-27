package smava.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.landing.HomeLandingPage;

import static smava.utils.FrameUtils.runInFrame;

public class LandingHomepageSteps extends ScenarioSteps {
   private HomeLandingPage homePage;

    @Step
    public void setUsage(String usage){
        runInFrame(() -> homePage.getLoanSelectionPanel().setUsage(usage));
    }

    @Step
    public void setAmount(String amount){
        runInFrame(() -> homePage.getLoanSelectionPanel().setAmount(amount));
    }

    @Step
    public void setPeriod(String period){
        runInFrame(() -> homePage.getLoanSelectionPanel().setPeriod(period));
    }

    @Step
    public void clickNextButton(){
        runInFrame(() -> homePage.getLoanSelectionPanel().clickNextButton());
    }

    @Step
    public void clickLogInButton(){homePage.clickLogInButton();}

    @Step
    public void typeLoginInLoginPopup(String text){
        homePage.getLoginPopup().typeLogin(text);
    }

    @Step
    public void typePassInLoginPopup(String text){
        homePage.getLoginPopup().typePassword(text);
    }

    @Step
    public String getTextFromLoginField(){
       return homePage.getLoginPopup().getTextFromLoginField();
    }

    @Step
    public String getTextFromPassField(){
        return homePage.getLoginPopup().getTextFromPassField();
    }

    @Step
    public void clickLoginButtonOnLogInPopup(){
        homePage.getLoginPopup().clickLogInButton();
    }

    @Step
    public String getErrorMessageFromLogInField(){
       return homePage.getLoginPopup().getLogInFieldErrorMessage();
    }

    @Step
    public String getErrorMessageFromPasswordField(){
        return homePage.getLoginPopup().getPasswordFieldErrorMessage();
    }

}
