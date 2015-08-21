package com.mefozzy.calculatortest;

import static com.mefozzy.calculatortest.TestBase.Browser.*;
import com.mefozzy.projectcalculator.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;

/* @author Alex Ilnitsky  */
public class BaseTestCase extends TestBase {

    //init Browser

    String bin = "C:\\Program Files (x86)\\Firefox\\firefox.exe";
    String URL = "http:/darom.kharkov.ua/calculator.php";
    Calculator homePage = new Calculator(webDriverWithPath(FIREFOX, bin));
    //init auxiliary variables
    private static Logger log = LoggerFactory.getLogger(BaseTestCase.class);
    static Object[] TestCases;
    int iteration = 0;

    @BeforeClass
    public void StartUp() throws Exception {

        //init Test Case values
        WorkWithDBF wDBF = new WorkWithDBF("TestCases.dbf");
        wDBF.DBFread();
        TestCases = wDBF.Cases.toArray();
        //open browser
        homePage.setUrl(URL);

    }

}
