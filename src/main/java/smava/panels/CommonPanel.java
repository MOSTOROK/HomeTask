package smava.panels;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smava.pages.CommonPage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class CommonPanel{

   private WebElementFacade panel;

    public CommonPanel(String panelLocator){
        WebElement el = getDriver().findElement(By.xpath(panelLocator));
        panel = WebElementFacadeImpl.wrapWebElement(getDriver(), el,8000);
    }

    public WebElementFacade findBy(String xpathOrCss){
       WebElement el = panel.findElement(By.xpath(xpathOrCss));
      return WebElementFacadeImpl.wrapWebElement(getDriver(), el,8000);
    }
}
