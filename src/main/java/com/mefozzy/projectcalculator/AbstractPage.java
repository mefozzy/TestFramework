package com.mefozzy.projectcalculator;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* @author Alex Ilnitsky */
public abstract class AbstractPage {

    AbstractPage(WebDriver driver){
    this.driver =  driver;
    }
    
    private static WebDriver driver;
    private String URL;
    private static Logger log = LoggerFactory.getLogger(AbstractPage.class);
   
    public static WebDriver getDriver(){
    return AbstractPage.driver ;
    }
    
    public void setUrl(String URL) {
        this.URL = URL;
        log.info("Open URL : " + URL);
        this.driver.get(URL);
        log.info("Page opened");
    }
    
    public String getURL() {
        return this.URL;
    }
    
    
}
