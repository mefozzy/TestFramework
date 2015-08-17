package com.mefozzy.calculatortest;

import static com.mefozzy.calculatortest.TestBase.Browser.FIREFOX;
import static com.mefozzy.calculatortest.TestBase.Browser.webDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* @author Alex ilnitsky  */
public class SmokeTests extends BaseTestCase {

    WebDriver driver = webDriver(FIREFOX);

    @BeforeClass
    public void SetUp() {

    }

    @Test
    public void Test1() {
        try {
            driver.get("http://ya.ru");
        } catch (NullPointerException ex) {
            System.out.println("Driver lost");
        }
    }

}
