package org.example;

import org.openqa.selenium.By;

public class AddProductToShoppingCart extends Utils{

    private By _electronics = By.xpath("//div/a[@title='Show products in category Electronics']");
    private By _selectNiconCameraAndPhotos = By.xpath("//div/a[@title='Show products in category Camera & photo']");
    private By _addCameraToCart = By.xpath("//button[@class='button-2 product-box-add-to-cart-button'][1]");
    private By _againAddCameraToCart = By.xpath("//*[@id='add-to-cart-button-14']");
    private By _openShoppingCart = By.xpath("//span[@class='cart-label']");

    public void verifyUserShouldAbleToAddProductsToShoppingCart(){
        //click on electronics
        clickOnElement(_electronics);
        //select Nikon camera and photos
        clickOnElement(_selectNiconCameraAndPhotos);
        //add camera to cart
        clickOnElement(_addCameraToCart);
        //again add camera to cart
        clickOnElement(_againAddCameraToCart);
        //open shopping cart
        clickOnElement(_openShoppingCart);
    }
}
