package smava.pages;


import org.openqa.selenium.WebDriver;
import smava.panels.landing.LoanSelection;

public class LandingPage extends CommonPage {
    private static final String LOAN_SELECTION_PANEL = "//div[@class='loan-selection__right']";

    public LoanSelection getLoanSelectionPanel(){
        return new LoanSelection();
    }

}
