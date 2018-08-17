package smava.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.LandingPage;
import smava.utils.FrameUtils;

import static smava.utils.FrameUtils.runInFrame;

public class LandingSteps extends ScenarioSteps {
   private LandingPage landingPage;

    @Step
    public void setUsage(String usage){
        runInFrame(() -> landingPage.getLoanSelectionPanel().setUsage(usage));
    }

    @Step
    public void setAmount(String amount){
        runInFrame(() -> landingPage.getLoanSelectionPanel().setAmount(amount));
    }

    @Step
    public void setPeriod(String period){
        runInFrame(() -> landingPage.getLoanSelectionPanel().setPeriod(period));
    }

    @Step
    public void clickNextButton(){
        runInFrame(() -> landingPage.getLoanSelectionPanel().clickNextButton());
    }

}
