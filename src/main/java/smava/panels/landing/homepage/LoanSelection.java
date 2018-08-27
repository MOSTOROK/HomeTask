package smava.panels.landing.homepage;


import smava.panels.CommonPanel;

import static java.lang.String.format;


public class LoanSelection extends CommonPanel{
  private final static String USAGE_DROPDOWN = ".//select[@id='applicant0.loan.selection.category']";
  private final static String AMOUNT_DROPDOWN = ".//select[@id='applicant0.loan.selection.amount']";
  private final static String PERIOD_DROPDOWN = ".//div[@class='Select-value']";
  private final static String PERIOD_OPTION = ".//div[@class='Select-menu-outer']//span[contains(text(),'%s')]";
  private final static String NEXT_BUTTON = ".//button[@id='cta_btn_1']";

  public LoanSelection(String panelLocator) {
    super(panelLocator);
  }

  public void setUsage(String usage){
    findBy(USAGE_DROPDOWN).then().click();
    findBy(USAGE_DROPDOWN).then().selectByVisibleText(usage);
  }

  public void setAmount(String amount){
    findBy(AMOUNT_DROPDOWN).then().click();
    findBy(AMOUNT_DROPDOWN).then().selectByValue(amount);
  }

  public void setPeriod(String period){
      findBy(PERIOD_DROPDOWN).then().click();
      findBy(format(PERIOD_OPTION, period)).click();
  }

  public void clickNextButton(){
      findBy(NEXT_BUTTON).click();
  }

}
