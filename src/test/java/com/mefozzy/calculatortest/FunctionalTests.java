package com.mefozzy.calculatortest;

import org.testng.annotations.BeforeClass;
/* @author Alex ilnitsky  */
public class FunctionalTests extends BaseTestCase{
    
    String URL = "http:/darom.kharkov.ua/calculator.php";
    String inpRadioPlusLink = "input[ value='plus']";
    String inpRadioMinusLink = "input[ value='minus']";
    String inpRadioMultLink = "input[ value='mult']";
    String inpRadioDivLink = "input[ value='division']";
    String aLink = "input[name='a']";
    String bLink = "input[name='b']";
    String submitLink = "input[name='sub']";
    String resultLink = "div [name='result']";
    /*
    Тесты это аннотация фреймворка по выполнению тестов
    в @BeforeClass выбираем, с каким браузером будем работать.
    Определить структуру тестовых классов, название тестовых методов  - реализация
    и связывание с вспомогательными классами
    */
    @BeforeClass
    public void SetUp(){
    
    }
    
    /*PageFactory.initElements(driver,PageName.class);
            @FindBy (id="inptElement")
            private WebElement inputElement;*/
}
