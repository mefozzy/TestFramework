package com.mefozzy.calculatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

/* @author Alex Ilnitsky 

В классе должен быть только выбор браузера
Все приготовления браузеров должны быть в текущем классе
Любое обращение к экземпляру класса должно быть осуществлено через 
метод, в который передается выбранный в тестах экземпляр

*/
public class TestBase {

    WebDriver driver;

    public enum Browser {

        FIREFOX, IE, CHROME, OPERA, EDGE, SAFARI;

        public static WebDriver webDriver(Browser browser) {
            //Нужен трай-кетч
            try {
                switch (browser) {
                    case FIREFOX:
                        return new FirefoxDriver();
                    case IE:
                        return new InternetExplorerDriver();
                    case CHROME:
                        return new ChromeDriver();
                    case OPERA:
                        return new OperaDriver();
                    case EDGE:
                        return new EdgeDriver();
                    case SAFARI:
                        return new SafariDriver();
                    default:
                        return null;
                }
            } catch (Exception ex) {
                return null;
            }

        }

    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
        }
    }

}
