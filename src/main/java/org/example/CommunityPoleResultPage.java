package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
public class CommunityPoleResultPage extends Utils{
    private By _actualErrorMessage = By.xpath("//*[@id='block-poll-vote-error-1']");
    private By _actualCommunityPoleResultMessage = By.xpath("//*[@id='block-poll-vote-error-1']");
    public  void verifyUserShouldNotVoteWithoutRegistration(){
        String actualErrorMessage = getTextFromElement(_actualErrorMessage);
        String expectedCommunityPoleErrorMessage = "Only registered users can vote.";

        waitForVisibilityOfElement(_actualErrorMessage,20);
        Assert.assertEquals(actualErrorMessage,expectedCommunityPoleErrorMessage);
    }
    public  void verifyUserShouldVoteWithRegistration(){
        String actualCommunityPoleResultMessage = getTextFromElement(_actualCommunityPoleResultMessage);
        //user should see pole results
        Assert.assertTrue(elementIsDisplayed(_actualCommunityPoleResultMessage));
        //user should not see error message
        Assert.assertFalse(elementIsDisplayed(_actualErrorMessage));
    }
    public void verifyUserShouldSeeAlertMessage(){
        Alert alert =  driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Please select an answer");
        alert.accept();
    }
}

