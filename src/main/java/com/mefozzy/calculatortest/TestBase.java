package com.mefozzy.calculatortest;

import static com.mefozzy.projectcalculator.AbstractPage.getDriver;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;


/* @author Alex Ilnitsky */
public class TestBase {

    private static Logger log = LoggerFactory.getLogger(TestBase.class);

    public enum Browser {

        FIREFOX, IE, CHROME, OPERA, EDGE, SAFARI;
    }
        public static WebDriver webDriver(Browser browser) {
            log.info("Starting browser " + browser);
            try {
                switch (browser) {
                    case FIREFOX:
                        return new FirefoxDriver();
                    case IE:
                        return new InternetExplorerDriver();
                    case CHROME:
                        return new ChromeDriver();
                    case OPERA:
                        return new OperaDriver();
                    case EDGE:
                        return new EdgeDriver();
                    case SAFARI:
                        return new SafariDriver();
                    default:
                        return null;
                }
            } catch (Exception ex) {
                log.info("Catch exeption: " + ex.getMessage());
                return null;
            }

        }

    
    public static WebDriver webDriverWithPath(Browser browser, String locationOfBrowser) {
        log.info("Starting browser " + browser);
        try {
            switch (browser) {
                case FIREFOX:
                    FirefoxProfile profile = new FirefoxProfile();
                    FirefoxBinary binary = new FirefoxBinary(new File(locationOfBrowser));
                    return new FirefoxDriver(binary, profile);
                case IE:
                    System.setProperty("webdriver.ie.driver", locationOfBrowser);
                    return new InternetExplorerDriver();
                case CHROME:
                    ChromeOptions options = new ChromeOptions();
                    options.setBinary(new File(locationOfBrowser));
                    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                    return new ChromeDriver(capabilities);
                case OPERA:
                    System.setProperty("webdriver.opera.driver", locationOfBrowser);
                    return new OperaDriver();
                case EDGE:
                    System.setProperty("webdriver.edge.driver", locationOfBrowser);
                    return new EdgeDriver();
                case SAFARI:
                    System.setProperty("webdriver.safari.driver", locationOfBrowser);
                    return new SafariDriver();
                default:
                    log.info("Wrong parameter");
                    return null;
            }
        } catch (Exception ex) {
            log.info("Catch exeption" + ex.getMessage());
            return null;
        }

    }

    @AfterTest
    public void tearDown() {
        log.info("Test Complited");
    }
}
