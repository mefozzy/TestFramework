package com.mefozzy.projectcalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* @author Alex Ilnitsky */

public class Calculator extends AbstractPage {

    public Calculator(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    // init DSL - CSS locators
    private static Logger log = LoggerFactory.getLogger(Calculator.class);
    private static final String inpRadioPlusLink = "input[ value='plus']";
    private static final String inpRadioMinusLink = "input[ value='minus']";
    private static final String inpRadioMultLink = "input[ value='mult']";
    private static final String inpRadioDivLink = "input[ value='division']";
    private static final String aLink = "input[name='a']";
    private static final String bLink = "input[name='b']";
    private static final String submitLink = "input[name='sub']";
    private static final String resultLink = "div [name='result']";
    //init DSL - link locators to WebElements   
    @FindBy(css = inpRadioPlusLink)
    private static WebElement addOperator;
    @FindBy(css = inpRadioMinusLink)
    private static WebElement subOperator;
    @FindBy(css = inpRadioMultLink)
    private static WebElement multOperator;
    @FindBy(css = inpRadioDivLink)
    private static WebElement divOperator;
    @FindBy(css = aLink)
    private static WebElement aValue;
    @FindBy(css = bLink)
    private static WebElement bValue;
    @FindBy(css = resultLink)
    private static WebElement result;
    @FindBy(css = submitLink)
    private static WebElement submitButton;
    
    //Methods with DSL
    private static void fillAndClick(String a, String b) {
        log.info("Type in TextBox Number A:" + a);
        aValue.sendKeys(a);
        log.info("Type in TextBox Number B:" + b);
        bValue.sendKeys(b);
        submitButton.click();
    }

    public String operResult(String a, String b, String op) {
        String opr, trim;
        switch (op) {
            case "+":
                opr = "of addition";
                addOperator.click();
                break;
            case "-":
                opr = "subtraction";
                subOperator.click();
                break;
            case "*":
                opr = "of multiplication";
                multOperator.click();
                break;
            case "/":
                opr = "division";
                divOperator.click();
                break;
            default:
                opr= "ERROR";
                break;
        }       
        fillAndClick(a, b);
        log.info("The operation " + opr + " for values " + a + " and " + b);
        log.info("Click on 'Submit' button");
        return correctResult(result.getText());
    }

    private String correctResult(String result) {
        if (result.substring(0, result.lastIndexOf(":")).equals("Result")) {
            log.info("Taken result: " 
                    + result.substring(result.lastIndexOf(" ")+1,result.length()));
            return result.substring(result.lastIndexOf(" ")+1,result.length());
        } else {
            log.info("Taken error: " + result);
            return result;
        }
    }


}
