package smava.pages.landing;


import smava.pages.CommonLandingPage;
import smava.panels.landing.homepage.LoanSelection;
import smava.panels.landing.homepage.LoginPopup;

public class HomeLandingPage extends CommonLandingPage {
    private static final String LOAN_SELECTION_PANEL = "//div[@class='loan-selection__right']";
    private static final String LOG_IN_BUTTON = "//div[contains(@class, 'login-button')]";
    private static final String LOG_IN_POPUP_PANEL = "//form[contains(@class, 'LoginForm__form')]";

    public LoanSelection getLoanSelectionPanel(){
        return new LoanSelection(LOAN_SELECTION_PANEL);
    }

    public void clickLogInButton(){
        findBy(LOG_IN_BUTTON).then().click();
    }

    public LoginPopup getLoginPopup(){
        return new LoginPopup(LOG_IN_POPUP_PANEL);
    }

}
