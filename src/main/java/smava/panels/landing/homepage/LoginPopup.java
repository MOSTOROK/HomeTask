package smava.panels.landing.homepage;

import smava.panels.CommonPanel;

public class LoginPopup extends CommonPanel {
    private static final String EMAIL_FIELD = ".//input[@name='email']";
    private static final String PASSWORD_FIELD = ".//input[@name='password']";
    private static final String LOG_IN_BUTTON = ".//button";
    private static final String LOG_IN_FIELD_ERROR_MESSAGE = ".//input[@name='email']/ancestor::div[1]//following-sibling::div[contains(@class,'error-message')]";
    private static final String PASSWORD_FIELD_ERROR_MESSAGE = ".//input[@name='password']/ancestor::div[1]//following-sibling::div[contains(@class,'error-message')]";

    public LoginPopup(String panelLocator) {
        super(panelLocator);
    }

    public void typeLogin(String text){
        findBy(EMAIL_FIELD).type(text);
    }

    public void typePassword(String text){
        findBy(PASSWORD_FIELD).type(text);
    }

    public String getTextFromLoginField(){
       return getValueFromTextField(EMAIL_FIELD);
    }

    public String getTextFromPassField(){
        return getValueFromTextField(PASSWORD_FIELD);
    }

    public void clickLogInButton(){
        findBy(LOG_IN_BUTTON).then().click();
    }

    public String getLogInFieldErrorMessage(){
        return findBy(LOG_IN_FIELD_ERROR_MESSAGE).then().getText();
    }

    public String getPasswordFieldErrorMessage(){
        return findBy(PASSWORD_FIELD_ERROR_MESSAGE).then().getText();
    }
}
