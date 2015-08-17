/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mefozzy.calculatortest;

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
public class BaseTestCaseNGTest extends BaseTestCase{
    String URL = "http:/darom.kharkov.ua/calculator.php";
    String inpRadioPlusLink = "input[ value='plus']";
    String inpRadioMinusLink = "input[ value='minus']";
    String inpRadioMultLink = "input[ value='mult']";
    String inpRadioDivLink = "input[ value='division']";
    String aLink = "input[name='a']";
    String bLink = "input[name='b']";
    String submitLink = "input[name='sub']";
    String resultLink = "div [name='result']";   
    
    public BaseTestCaseNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testSomeMethod() {
        // Просмотр списка задач TODO для сгенерированного кода теста и удаление вызова по умолчанию для случаев сбоя.
        //fail("\u042d\u0442\u043e\u0442 \u0442\u0435\u0441\u0442 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u043f\u0440\u043e\u0442\u043e\u0442\u0438\u043f\u043e\u043c.");
    }
    
}
