package org.example;
import org.openqa.selenium.By;
public class EmailAFriend extends Utils{
    private By _appleAddToCartButton = By.xpath("(//button[text()='Add to cart'])[2]");
    private By _emailAFriendButton = By.xpath("//button[text()='Email a friend']");
    private By _enterFriendEmailAddress = By.id("FriendEmail");
    private By _enterYourEmailAddress = By.id("YourEmailAddress");
    private By _enterPersonalMessage = By.id("PersonalMessage");
    private By _sendEmailButton = By.name("send-email");
    public void referProductToFriendWithoutRegistration(){
        //click on apple add to cart button
        clickOnElement(_appleAddToCartButton);
        //click on email a friend button
        clickOnElement(_emailAFriendButton);
        //enter friend email address
        typeText(_enterFriendEmailAddress,"xyz@gmail.com");
        //enter your email address
        typeText(_enterYourEmailAddress,"abc123@gmail.com");
        //enter personal message
        typeText(_enterPersonalMessage,"Price of Apple McBook.");
        //click on send email button
        clickOnElement(_sendEmailButton);
    }
}
