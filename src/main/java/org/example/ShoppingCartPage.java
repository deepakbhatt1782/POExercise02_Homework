package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    private By _shoppingCart = By.xpath("(//a[contains(@href,'/cart')])[1]");
    private By _productFeatures = By.xpath("(//*[@class='attributes'])[2]");
    private By _termsOfServiceCheckBox = By.xpath("//input[@id='termsofservice']");
    private By _checkoutButton = By.xpath("//button[@id='checkout']");

    public void shoppingCartFunctions() {
        manageTimeouts(10);
        clickOnElement(_shoppingCart);
        String actualProductFeatures = getTextFromElement(_productFeatures);
        String expectedProductFeatures= "Processor: 2.2 GHz Intel Pentium Dual-Core E2200\n" +
                "RAM: 8GB [+$60.00]\n" +
                "HDD: 320 GB\n" +
                "OS: Vista Home [+$50.00]\n" +
                "Software: Microsoft Office [+$50.00]\n" +
                "Software: Acrobat Reader [+$10.00]\n" +
                "Software: Total Commander [+$5.00]";
        System.out.println(actualProductFeatures);

        Assert.assertEquals(actualProductFeatures,expectedProductFeatures);
        clickOnElement(_termsOfServiceCheckBox);
        clickOnElement(_checkoutButton);
    }
}
