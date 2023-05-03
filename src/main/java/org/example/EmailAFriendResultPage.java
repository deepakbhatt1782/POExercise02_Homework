package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils{

    private By _referAFriendErrorMessage = By.xpath("//*[@class='message-error validation-summary-errors']");
    private By _actualEmailAFriendMessage = By.xpath("//div[@class='result']");

    public void verifyUserShouldNotReferProductToFriendWithoutRegistration(){
        String actualErrorMessage = getTextFromElement(_referAFriendErrorMessage);
        String expectedErrorMessage = "Only registered customers can use email a friend feature";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
        System.out.println("My message:" + actualErrorMessage);
    }
    public void verifyUserShouldReferProductToFriendWithRegistration(){
        String actualMessage = getTextFromElement(_actualEmailAFriendMessage);
        String expectedMessage = "Your message has been sent.";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}

