package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddProductToShoppingCartResultPage extends Utils{

    private By _verifyProductInCart = By.xpath("(//a[contains(@href,'/nikon-d5500-dslr-black')])[4]");

    public void verifyUserShouldSeeProductInShoppingCart(){

        Assert.assertTrue(elementIsDisplayed(_verifyProductInCart));
    }
}
