package org.example;
import org.openqa.selenium.By;
public class RegisterPage extends Utils{
    private By _firstName = By.id("FirstName" );
    private By _lastname = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerSubmitButton = By.id("RegisterSubmitButton");
    public void enterRegistrationDetails(){
        //type firstname
        typeText(_firstName,"TestFirstName");
        //type lastname
        typeText(_lastname, "TestLastName");
        //type email address
        typeText(_email,"testemail+"+timeStamp()+"@gmail.com");
        //type password
        typeText(_password,"test1234");
        //type confirm password
        typeText(_confirmPassword,"test1234");
        //click on register submit button
        clickOnElement(_registerSubmitButton);
    }
}
