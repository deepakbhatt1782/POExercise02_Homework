package org.example;
import org.openqa.selenium.By;
public class RegisterPage extends Utils{
    private By _firstName = By.id("FirstName" );
    private By _lastname = By.id("LastName");
    private By _dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    private By _dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerSubmitButton = By.id("register-button");
    public void enterRegistrationDetails(){
        //type firstname
        typeText(_firstName,"TestFirstName");
        //type lastname
        typeText(_lastname, "TestLastName");
        //select day of birth
        selectElementByValue(_dateOfBirth,"11");
        //select birth month
        selectElementByText(_dateOfBirthMonth,"January");
        //select birth year
        selectElementByText(_dateOfBirthYear,"2011");
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
