
package com.mefozzy.projectcalculator;

import com.mefozzy.calculatortest.BaseTestCase;
import static com.mefozzy.calculatortest.TestBase.*;
import static com.mefozzy.calculatortest.TestBase.Browser.CHROME;
import static com.mefozzy.calculatortest.TestBase.Browser.EDGE;
import static com.mefozzy.calculatortest.TestBase.Browser.FIREFOX;
import static com.mefozzy.calculatortest.TestBase.Browser.IE;

import static com.mefozzy.projectcalculator.AbstractPage.getDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* @author Alex Ilnitsky */
public class CalculatorNGTest {

    private static Logger log = LoggerFactory.getLogger(BaseTestCase.class);
    String URL = "http://darom.kharkov.ua/calculator.php";

    @AfterMethod
    public void tearDownMethod() throws Exception {
        if (getDriver() != null) {
            getDriver().close();
            //Thread.sleep(1000);
            getDriver().quit();
        }
    }

    @Test
    public void testFireFox() {       
        String bin = "C:\\Program Files (x86)\\Firefox\\firefox.exe";
        Calculator browser = new Calculator(webDriverWithPath(FIREFOX, bin));
        browser.setUrl(URL);
        assertNotEquals(getDriver(), null,"FireFox - PASS");
        log.info("Test FireFox - PASS");
    }

    @Test
    public void testChrome() {
        Calculator browser = new Calculator(webDriver(CHROME));
        browser.setUrl(URL);
        assertNotEquals(getDriver(), null, "Chrome - PASS");
        log.info("Test Chrome - PASS");
    }


    @Test
    public void testIE() {
        Calculator browser = new Calculator(webDriver(IE));
        browser.setUrl(URL);
        assertNotEquals(getDriver(), null, "Internet Explorer - PASS");
        log.info("Testing Internet Explorer - PASS");

    }

}
