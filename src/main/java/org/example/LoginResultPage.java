package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class LoginResultPage extends Utils{
    private By _actualMessage = By.xpath("//h2[text()='Welcome to our store']");
    public void verifyUserLoginSuccessfully(){
        //gettext from webelement
        String actualMessage = getTextFromElement(_actualMessage);
        String expectedLoginCompleteMsg = "Welcome to our store";
        System.out.println("My message:"+ actualMessage);
        Assert.assertEquals(actualMessage,expectedLoginCompleteMsg);
    }
}
