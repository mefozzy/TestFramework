package com.mefozzy.calculatortest;

import static com.mefozzy.projectcalculator.AbstractPage.getDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @author Alex Ilnitsky
 */
public class BaseTestCaseNGTest extends BaseTestCase {

    private static Logger log = LoggerFactory.getLogger(BaseTestCase.class);

    @Test
    public void TC1() {
        int TC = 0;
        while (TestCases.length != iteration) {
            Assert.assertEquals(homePage.operResult(TestCases[iteration++].toString().trim()
                    , TestCases[iteration++].toString().trim()
                    , TestCases[iteration++].toString().trim())
                    , TestCases[iteration++].toString().trim());
            log.info("Test#" + ++TC + " PASS");
        }
    }

    @AfterMethod
    public void tesrDown() {
        if (getDriver() != null) {
            getDriver().close();
            getDriver().quit();
        }
    }
}
