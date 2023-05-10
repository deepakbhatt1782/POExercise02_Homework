package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NopCommerceNewReleaseResultPage extends Utils{
    private By _actualmessage = By.xpath("//*[text()='News comment is successfully added.']");

    public void verifyUserAddedCommentSuccessfully(){
        String actualMessage = getTextFromElement(_actualmessage);
        String expectedMessage = "News comment is successfully added.";
        //asserting comment is added successfully
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
