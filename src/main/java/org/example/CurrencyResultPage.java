package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CurrencyResultPage extends Utils {
    private By _dollarCurrency = By.xpath("//*[text()='US Dollar']");
    private By _euroCurrency = By.xpath("//*[text()='Euro']");

    public void verifySelectedCurrencyIsDollar(){
        Assert.assertEquals(getTextFromElement(_dollarCurrency),"US Dollar");
        System.out.println("Selected products currency is Dollar");
    }
    public void verifySelectedCurrencyIsEuro(){
        Assert.assertEquals(getTextFromElement(_euroCurrency),"Euro");
        System.out.println("Selected products currency is Euro");
    }
}
