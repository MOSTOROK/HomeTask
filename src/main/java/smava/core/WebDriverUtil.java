package smava.core;

import lombok.extern.slf4j.Slf4j;
import smava.utils.PathUtils;


import static java.lang.System.setProperty;
import static org.apache.commons.lang3.SystemUtils.IS_OS_LINUX;
import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
import static smava.core.UserProperties.getUserDisplayHeight;
import static smava.core.UserProperties.getUserDisplayWidth;
import static smava.utils.PathUtils.getPathToBrowsers;
import static smava.utils.PathUtils.pathSeparator;

@Slf4j
public class WebDriverUtil {

    public static void initProperties() {
        String driverPath;
        if (IS_OS_WINDOWS) {
        driverPath = getPathToBrowsers()+ "windows" + pathSeparator + "chromedriver.exe";
        } else if (IS_OS_LINUX) {
        driverPath = getPathToBrowsers()+ "linux" + pathSeparator + "chromedriver";
        } else {
            throw new IllegalArgumentException("This browser not supported");
        }
        log.info("Browser path set to "+ driverPath);
        setProperty("webdriver.chrome.driver", driverPath);
        setProperty("serenity.browser.height", getUserDisplayHeight());
        setProperty("serenity.browser.width" , getUserDisplayWidth());
        log.info("Browser path set to "+ driverPath);
        log.info(String.format("Display settings set to %s x %s",getUserDisplayHeight(), getUserDisplayWidth()));
    }


}
