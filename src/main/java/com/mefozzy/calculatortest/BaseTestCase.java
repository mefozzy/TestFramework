/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mefozzy.calculatortest;

import static com.mefozzy.calculatortest.TestBase.Browser.*;
import static com.mefozzy.calculatortest.TestBase.Browser.webDriver;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author admin
 * Это клас с которого начинается выполнение всех тестов
 * Здесь целесообразно разместить  @BeforeClass/@BeforeMethod
 * Здесь же фабрика (под аннотацией ) в которую передаются названия классов, 
 * содержащих объекты страниц PageFactory.initElements (getDriver(), Calculator.class)
 */
public class BaseTestCase extends TestBase {

    public void PageFactory (WebDriver webDriver, Object classPage){
    }
}
