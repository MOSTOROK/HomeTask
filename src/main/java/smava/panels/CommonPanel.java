package smava.panels;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Abstract panel implementation for regular page usage
 */
public class CommonPanel extends  AbstractPanel{

    public CommonPanel (String panelLocator){
        initPanel(panelLocator);
    }

}
