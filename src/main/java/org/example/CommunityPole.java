package org.example;
import org.openqa.selenium.By;
public class CommunityPole extends Utils{
    private By _goodVoteButton = By.xpath("//input[@id='pollanswers-2']");
    private By _voteButton = By.id("vote-poll-1");
    public void votingForCommunityPole(){
        //click on good radio button
        clickOnElement(_goodVoteButton);
        //click on vote button
        clickOnElement(_voteButton);
    }
}

