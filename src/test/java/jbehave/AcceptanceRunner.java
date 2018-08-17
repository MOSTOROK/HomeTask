package jbehave;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.runners.SerenityReportingRunner;
import org.junit.runner.RunWith;
import smava.core.WebDriverUtil;


@RunWith(SerenityReportingRunner.class)
public class AcceptanceRunner extends SerenityStories {

  public AcceptanceRunner(){
        WebDriverUtil.initProperties();
    }
}
