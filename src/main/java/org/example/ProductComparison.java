package org.example;
import org.openqa.selenium.By;
public class ProductComparison extends Utils{
    private By _addToCompareListButtonForHTCOneM8AndroidL5Lollipop = By.xpath("(//button[@title='Add to compare list'])[3]");
    private By _addToCompareListButtonForAppleMacBookPro13inch = By.xpath("(//button[@title='Add to compare list'])[2]");
    private By _theProductHasBeenAddedToYourProductComparison = By.xpath("(//a[contains(@href,'/compareproducts')])[1]");
    private By _productOneName = By.xpath("//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]");
    private By _productTwoName =By.xpath("//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    public void comparetwoproducts(){
        //click add to compare list button for HTC One M8 Android L 5.0 Lollipop
        clickOnElement(_addToCompareListButtonForHTCOneM8AndroidL5Lollipop);
        //wait until notification disappeared
        waitForInVisibilityOfElement(_theProductHasBeenAddedToYourProductComparison,5);
        //click add to compare list button for Apple MacBook Pro 13-inch
        clickOnElement(_addToCompareListButtonForAppleMacBookPro13inch);
        //click on The product has been added to your product comparison
        clickOnElement(_theProductHasBeenAddedToYourProductComparison);
    }
}
