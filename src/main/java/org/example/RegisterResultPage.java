package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class RegisterResultPage extends Utils {
    private By _actualErrorMessage = By.xpath("//div[@class='result']");
    private By _actualRegistrationSuccessMessage = By.xpath("//div[@class='result']");
    public void verifyUserShouldNotRegisteredSuccessfully() {
         String expectedRegistrationNotCompleteMsg = "Thanks for registration";
        //gettext from webelement
        String actualMessage = getTextFromElement(_actualErrorMessage);
        System.out.println("My message:" + actualMessage);
        Assert.assertNotEquals(actualMessage, expectedRegistrationNotCompleteMsg, "registration is not completed.");
    }
    public void verifyUserRegisteredSuccessfully() {
        String expectedRegistrationCompleteMsg ="Your registration completed";
        //gettext from webelement
        String actualMessage = getTextFromElement(_actualRegistrationSuccessMessage);
        System.out.println("My message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedRegistrationCompleteMsg, "Thanks for registration");
    }
}
