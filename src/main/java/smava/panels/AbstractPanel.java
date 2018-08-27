package smava.panels;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public abstract class AbstractPanel {
    private WebElementFacade panel;

    public void initPanel(String panelLocator) {
        WebElement el = getDriver().findElement(By.xpath(panelLocator));
        panel = WebElementFacadeImpl.wrapWebElement(getDriver(), el,8000);
    }

    public WebElementFacade findBy(String xpathOrCss){
        return panel.findBy(xpathOrCss);
    }

    public List<WebElementFacade> findAll(String xpathOrCss){
        return panel.thenFindAll(xpathOrCss);
    }
    public String getValueFromTextField(String fieldLocator){
        return findBy(fieldLocator).then().getAttribute("value");
    }
}
