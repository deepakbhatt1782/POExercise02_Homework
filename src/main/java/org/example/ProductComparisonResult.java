package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class ProductComparisonResult extends Utils{
    private By _productOneName = By.xpath("//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]");
    private By _productTwoName =By.xpath("//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    public void verifyProductsInTheBasket(){
        //verifying both products are in compare list
        Assert.assertTrue(elementIsDisplayed(_productOneName));
        Assert.assertTrue(elementIsDisplayed(_productTwoName));
    }
}
