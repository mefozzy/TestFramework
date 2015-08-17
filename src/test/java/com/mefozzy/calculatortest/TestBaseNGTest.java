/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mefozzy.calculatortest;

import static com.mefozzy.calculatortest.TestBase.Browser.FIREFOX;
import static com.mefozzy.calculatortest.TestBase.Browser.webDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author admin
 */
public class TestBaseNGTest extends BaseTestCase{
    WebDriver driver = webDriver(FIREFOX); 

    public TestBaseNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Тест метод tearDown, класса TestBase.
     */
    @Test
    public void testTearDown() {
        System.out.println("tearDown");
        TestBase instance = new TestBase();
                try {
            driver.get("http://ya.ru");
        } catch (NullPointerException ex) {
            //System.out.println("Driver lost");
        }
        Assert.assertEquals(driver, null, "Driver lost");
        instance.tearDown();
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        //fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }
    
}
