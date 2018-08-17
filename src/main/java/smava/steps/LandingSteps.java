package smava.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import smava.pages.LandingPage;
import smava.utils.FrameUtils;

public class LandingSteps extends ScenarioSteps {
   private LandingPage landingPage;

    @Step
    public void setUsage(String usage){
        FrameUtils.runInFrame(() -> landingPage.getLoanSelectionPanel().setUsage(usage));
    }

    @Step
    public void setAmount(String amount){
        FrameUtils.runInFrame(() -> landingPage.getLoanSelectionPanel().setAmount(amount));
    }

    @Step
    public void setPeriod(String period){
        FrameUtils.runInFrame(() -> landingPage.getLoanSelectionPanel().setPeriod(period));
    }

    @Step
    public void clickNextButton(){
        FrameUtils.runInFrame(() -> landingPage.getLoanSelectionPanel().clickNextButton());
    }

}
