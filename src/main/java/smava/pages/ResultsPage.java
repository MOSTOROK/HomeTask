package smava.pages;

import lombok.Getter;


public class ResultsPage extends CommonPage {
    private static final String resultURL = "https://www.smava.de/kreditanfrage/kreditantrag.html";

    public String getResultPageURL(){
        return resultURL;
    }

}
