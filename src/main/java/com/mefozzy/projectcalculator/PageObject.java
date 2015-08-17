package com.mefozzy.projectcalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**@author Alex ilnitsky
   наследуется от абстрактной страницы и содержит аннотации @FindBy и методы,
   * написанные с использованием DSL
   * 
   * Класс страницы описывается в PageFactory и в конструкторе передается 
   * обращение к суперклассу
   * 
   * каждый метод будет иметь тип страницы и возвращать будет this
 */
public class PageObject extends AbstractPage{
    public PageObject(WebDriver driver){
        super(driver);
    PageFactory.initElements(driver, this);
    }
    
    @FindBy
}
