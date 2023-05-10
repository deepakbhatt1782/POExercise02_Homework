package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutPage extends Utils{
    private By _checkoutASguestButton = By.xpath("//*[text()='Checkout as Guest']");
    private By _firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    private By _lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    private By _emailAddress = By.xpath("//input[@id='BillingNewAddress_Email']");
    private By _countryBox = By.xpath("//*[@id='BillingNewAddress_CountryId']");
    private By _cityTextField = By.xpath("//input[@id='BillingNewAddress_City']");
    private By _address1TextField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    private By _zipPostalCodeTextField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private By _phoneNumberTextField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private By _continueButton = By.xpath("(//*[text()='Continue'])[1]");
    private  By _nextDayAirRadioButton = By.xpath("//input[@id='shippingoption_1']");
    private By _continue1Button = By.xpath("(//*[text()='Continue'])[3]");
    private By _creditCardRadioButton = By.xpath("//input[@id='paymentmethod_1']");
    private By _creditCardContinueButton1 = By.xpath("(//*[text()='Continue'])[4]");
    private By _creditCardTypeTextField = By.xpath("//select[@id='CreditCardType']");
    private By _cardholderNameTypeField = By.xpath("//input[@id='CardholderName']");
    private By _cardNumberTypeField = By.xpath("//input[@id='CardNumber']");
    private By _expirationDateBox = By.xpath("//select[@id='ExpireMonth']");
    private By _expirationYearBox = By.xpath("//select[@id='ExpireYear']");
    private By _cardCodeBox = By.xpath("//input[@id='CardCode']");
    private By _creditCardContinueButton2 = By.xpath("//*[@id='payment-info-buttons-container']/button");

    private By _confirmOrderButton = By.xpath("//*[@id='confirm-order-buttons-container']/button");
    public void verifyCheckoutPage(){

        clickOnElement(_checkoutASguestButton);
        typeText(_firstName,"Aman");
        typeText(_lastName,"Patel");
        typeText(_emailAddress,"abc123@gmail.com");
        selectElementByText(_countryBox,"United Kingdom");
        typeText(_cityTextField,"Watford");
        typeText(_address1TextField,"25,Apple lane");
        typeText(_zipPostalCodeTextField,"HA0 2AB");
        typeText(_phoneNumberTextField,"07557234567");
        clickOnElement(_continueButton);
        clickOnElement(_nextDayAirRadioButton);
        clickOnElement(_continue1Button);
        clickOnElement(_creditCardRadioButton);
        clickOnElement(_creditCardContinueButton1);
        selectElementByText(_creditCardTypeTextField,"Visa");
        typeText(_cardholderNameTypeField,"A M Johnson");
        typeText(_cardNumberTypeField,"4556417766897587");
        selectElementByIndex(_expirationDateBox,4);
        selectElementByIndex(_expirationYearBox,0);
        typeText(_cardCodeBox,"167");
        clickOnElement(_creditCardContinueButton2);
        clickOnElement(_confirmOrderButton);
    }
    }

