package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConfirmationResultPage extends Utils {
    private By _thankyouMessage = By.xpath("//*[text()='Thank you']");
    private By _orderSuccessfullyMessage = By.xpath("//*[text()='Your order has been successfully processed!']");
    private By _orderNumberDetails = By.xpath("//*[@class='order-number']");

    public void verifyProductHasbeenOrderSuccessfully(){
        Assert.assertEquals(getTextFromElement(_thankyouMessage),"Thank you");
        Assert.assertEquals(getTextFromElement(_orderSuccessfullyMessage),"Your order has been successfully processed!");
        Assert.assertTrue(getTextFromElement(_orderNumberDetails).contains("order-number"));
    }
}
