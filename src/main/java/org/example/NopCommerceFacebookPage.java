package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.ArrayList;
public class NopCommerceFacebookPage extends Utils{
    private By _declineOptionalCookies = By.xpath("(//*[text()='Decline optional cookies'])[1]");
    private By _emailField = By.xpath("//*[text()='Email address or phone number']");
    private By _passwordField = By.xpath("//span[text()='Password']");
    private By _loginField = By.xpath("(//span[text()='Log in'])[3]");
    private By _forgottenPasswordField = By.xpath("//*[text()='Forgotten password?']");
    private  By _welcomeToStorePage =  By.xpath("//*[text()='Welcome to our store']");
    public void verifyUserOnFacebookPage(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }
    public void verifyUserShouldSeeAllFacebookLoginOptions(){
        clickOnElement(_declineOptionalCookies);
        Assert.assertEquals(getTextFromElement(_emailField),"Email address or phone number");
        Assert.assertEquals(getTextFromElement(_passwordField),"Password");
        Assert.assertEquals(getTextFromElement(_loginField),"Log in");
        Assert.assertEquals(getTextFromElement(_forgottenPasswordField),"Forgotten password?");
    }
    public void verifyUserCanSeeTheMainPageAfterClosingFacebookPage(){
        driver.close();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Assert.assertEquals(getTextFromElement(_welcomeToStorePage),"Welcome to our store");
    }
}
