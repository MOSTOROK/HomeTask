package smava.pages.landing;


import smava.pages.CommonLandingPage;

public class CreditRequestLandingPage extends CommonLandingPage {
    private static final String CREDIT_REQUEST_PAGE_URL = "https://www.smava.de/kreditanfrage/kreditantrag.html";
    private static final String CONTACT_INFO_PANEL = "//form[@id='form_LeadStep2Kreditnehmer']";
    private static final String CUSTOMER_REVIEW_PANEL = "//div[@class='ekomi-rating']";
    private static final String SIDE_HELP = "//div[@class='block side-help']";

    public String getCreditRequestPageURL(){
        return CREDIT_REQUEST_PAGE_URL;
    }

    public boolean isContactInfoPanelPresent(){
        return isPanelPresent(CONTACT_INFO_PANEL);
    }
    public boolean isCustomerReviewPanelPresent(){
        return isPanelPresent(CUSTOMER_REVIEW_PANEL);
    }
    public boolean isSideHelpPresent(){
       return findBy(SIDE_HELP).isPresent();
    }
}
