package smava.utils;

import smava.core.interfaces.Action;

import java.util.function.Supplier;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FrameUtils {

    public static void runInFrame(Action action){
        getDriver().switchTo().frame(0);
        action.perform();
        getDriver().switchTo().defaultContent();

    }
}
