package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class HomePage extends Utils {
    private By _registerButton = By.className("ico-register");
    private By _loginButton = By.className("ico-login");
    private By _searchButton = By.cssSelector("button.search-box-button");
    private By _currencyDropDownButton = By.id("customerCurrency");
    private By _facebookIcon = By.xpath("//li[@class='facebook']");
    private By _detailsButton = By.xpath("(//*[text()='details'])[2]");
    private By _buildYourOwnComputer = By.xpath("//*[text()='Build your own computer']");
    private By _searchField = By.xpath("//input[@id='small-searchterms']");
    private By _searchProductButton = By.xpath("(//*[text()='Search'])[1]");

    public static void sleep(int time) {
        try {
            Thread.sleep((time * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(_registerButton);
    }

    public void clickOnLoginButton() {
        //click on login button
        clickOnElement(_loginButton);
    }

    public void printProductNames() {
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }
    }
    public void closeAlert(){
            clickOnElement(_searchButton);
            Alert alert =  driver.switchTo().alert();
            Assert.assertEquals(alert.getText(),"Please enter some search keyword");
            alert.accept();
    }
    public void checkProductCurrencyInDollar() {
        Boolean present = false;
        List<WebElement> productCurrency = driver.findElements(By.cssSelector("div.prices span"));
        for (WebElement e : productCurrency) {
            //printing all product prices
            System.out.println(e.getText());
            String str = e.getText();
            for ( int i =0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '$') {
                    present = true;
                }
                Assert.assertTrue(present);
            }
        }
    }
    public void checkProductCurrencyInEuro() {

        clickOnElement(_currencyDropDownButton);
        selectElementByIndex(_currencyDropDownButton,1);
        Boolean present1 =false;
        List<WebElement> productCurrency = driver.findElements(By.cssSelector("div.prices span"));
        for (WebElement e : productCurrency) {
            //printing all product prices
            System.out.println(e.getText());
            String str = e.getText();
            for ( int i =0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if (ch != '$') {
                    present1 = true;
                }
                Assert.assertTrue(present1);
            }
        }
    }
    public void clickOnFacebookIcon(){
        clickOnElement(_facebookIcon);
    }
    public void openNopCommerceNewReleaseDetailsButton(){
        clickOnElement(_detailsButton);
    }
    public void buildYourOwnComputer(){
        //click on build your own product link
        clickOnElement(_buildYourOwnComputer);
    }

    public void searchProduct() {

        // kept all these unused code for my reference

        /* Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Product name : ");
       String productName = scanner.nextLine();
        System.out.println("Enter Product name : ");
       typeText(_searchField,productName);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String productSearch;
        System.out.println("Please Enter the user password :: ");
        productSearch= br.readLine();
        typeText(_searchField,productSearch); */

        //enter Nike in search box
        typeText(_searchField,"Nike");
        //click on search button
        clickOnElement(_searchButton);
        //save all search product in list
        List<WebElement> nikeProducts = driver.findElements(By.xpath("//*[@class='product-title']"));
        System.out.println("Total items displayed : "+ nikeProducts.size());
        for (WebElement e: nikeProducts){
            //read name on all products
            String productName = e.getText();
            //print all product name
            System.out.println(productName);

            //check all products name contain Nike or not
            if(productName.contains("Nike")){
                System.out.println("Product search has been completed successfully");
            }
            else{
                System.out.println("Product search has not been completed successfully");
            }
        }
    }
}
