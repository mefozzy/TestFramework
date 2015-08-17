package com.mefozzy.projectcalculator;

import org.openqa.selenium.WebDriver;

/* *@author Alex ilnitsky
   * Определение методов и полей, которые будут общими для всех объектов 
страниц (поэтому называется абстрактным, т.к. подходит для всех объектов 
страниц)
   * Здесь будет конструктор, устанавливающий экземпляр веб-драйвера, 
переданный из теста и дополнительный выбор экземпляра веб-драйвера (getDriver())
*/
public abstract class AbstractPage {

    AbstractPage(WebDriver driver){
    this.driver =  driver;
    }
    
    final WebDriver driver;
    private String URL;
   
    public void setUrl(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return this.URL;
    }
}
