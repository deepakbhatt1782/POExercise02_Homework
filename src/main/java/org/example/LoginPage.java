package org.example;
import org.openqa.selenium.By;
public class LoginPage extends Utils{
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _loginButton = By.xpath("//button[@class='button-1 login-button']");
    public void enterLoginDetails(){
        //type email adderss
        typeText(_email,"abc123@gmail.com");
        //type password
        typeText(_password, "abc123");
        //click on login button
        clickOnElement(_loginButton);
    }

}
