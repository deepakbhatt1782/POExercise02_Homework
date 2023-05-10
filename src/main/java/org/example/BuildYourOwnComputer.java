package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils{
    private By _addToCartButton = By.xpath("(//*[text()='Add to cart'])[1]");
    private By _drpProcessorButton =By.xpath("//select[@id='product_attribute_1']");
    private By _drpRamButton = By.xpath("//select[@id='product_attribute_2']");
    private By _hddRadioButton = By.xpath("//input[@id='product_attribute_3_6']");
    private By _osRadioButton = By.xpath("//input[@id='product_attribute_4_8']");
    private By _microsoftOfficeCheckBox =By.xpath("//input[@id='product_attribute_5_10']");
    private By _acrobatReaderCheckBox = By.xpath("//*[@id='product_attribute_5_11']");
    private By _totalCommanderCheckBox = By.xpath("//*[@id='product_attribute_5_12']");
    private By _addToCartButtonForCustomiseProduct = By.xpath("//*[@id='add-to-cart-button-1']");

    public void buildYourOwnComputer() {
        selectElementByIndex(_drpProcessorButton, 1);
        selectElementByIndex(_drpRamButton, 3);
        clickOnElement(_hddRadioButton);
        clickOnElement(_osRadioButton);
        clickOnElement(_acrobatReaderCheckBox);
        clickOnElement(_totalCommanderCheckBox);
        clickOnElement(_addToCartButtonForCustomiseProduct);
    }
}
