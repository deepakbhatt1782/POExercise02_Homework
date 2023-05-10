package org.example;

import org.openqa.selenium.By;

public class NopCommerceNewRelease extends Utils{
    private By _enterTitle = By.xpath("//input[@id='AddNewComment_CommentTitle']");
    private  By _enterComment = By.xpath("//textarea[@id='AddNewComment_CommentText']");
    private By _sendNewCommentButton = By.xpath("//*[text()='New comment']");
    private  By _enterTitle1 = By.xpath("//input[@id='AddNewComment_CommentTitle']");
    private  By _enterComment1 = By.xpath("//textarea[@id='AddNewComment_CommentText']");
    private  By get_sendNewCommentButton1 = By.xpath("//*[text()='New comment']");
    public void enterFirstCommentInNopCommerceNewRelease(){
        //type title
        typeText(_enterTitle,"Sky is blue");
        //type comment
        typeText(_enterComment, "Rose is red");
        //click on new comment button
        clickOnElement(_sendNewCommentButton);
    }
    public void enterSecondCommentInNopCommerceNewRelease(){
        //type title
        typeText(_enterTitle1,"Iphone is good");
        //type comment
        typeText(_enterComment1,"Samsung is better");
        //click on new comment button
        clickOnElement(_sendNewCommentButton);
    }
}
