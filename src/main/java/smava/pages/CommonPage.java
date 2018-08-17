package smava.pages;


import net.thucydides.core.pages.PageObject;

public class CommonPage extends PageObject {

    public void openPage(String page){
        getDriver().get(page);
    }

    public String getCurrentURL(){
        return getDriver().getCurrentUrl();
    }

}
