package smava.core;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;


@Slf4j
public class UserProperties {

    private static int getUserHeight() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return screenSize.height;
    }
    private static int getUserWidth() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return screenSize.width;
    }
    public static String getUserDisplayHeight(){
        return String.valueOf(getUserHeight());
    }
    public static String getUserDisplayWidth(){
        return String.valueOf(getUserWidth());
    }
}
