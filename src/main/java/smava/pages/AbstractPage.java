package smava.pages;

import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.String.format;


@Slf4j
public abstract class AbstractPage extends PageObject {

    public void openPage(String page){
        getDriver().get(page);
    }

    public String getCurrentURL(){
        return getDriver().getCurrentUrl();
    }

    public boolean isPanelPresent(String panelXpath){
       boolean isPanelPresent = findAll(panelXpath).size() > 0;
       log.info(format("Presence of panel with locator %s is " + isPanelPresent, panelXpath));
       return isPanelPresent;
    }

    public void waitForPageToLoad(int timeoutMs){
        new WebDriverWait(getDriver(), timeoutMs).until(
                webDriver -> evaluateJavascript("return document.readyState").equals("complete"));
    }

    private boolean isPageLoaded(){
    return evaluateJavascript("return document.readyState").equals("complete");
    }

    public String getValueFromTextField(String fieldLocator){
        return findBy(fieldLocator).then().getAttribute("value");
    }
}
