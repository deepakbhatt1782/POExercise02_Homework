package org.example;
import org.testng.annotations.Test;
public class TestSuit extends BaseTest {
    static String expectedCommunityPoleErrorMessage = "Only registered users can vote.";
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    LoginResultPage loginResultPage = new LoginResultPage();
    CommunityPole communityPole = new CommunityPole();
    CommunityPoleResultPage communityPoleResultPage = new CommunityPoleResultPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    ProductComparison productComparison = new ProductComparison();
    ProductComparisonResult productComparisonResult = new ProductComparisonResult();
    AddProductToShoppingCart addProductToShoppingCart = new AddProductToShoppingCart();
    AddProductToShoppingCartResultPage addProductToShoppingCartResultPage = new AddProductToShoppingCartResultPage();
    @Test
    public void verifyUserShouldNotBeRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        // fill registration details
        registerPage.enterRegistrationDetails();
        //verify register success or not
        registerResultPage.verifyUserShouldNotRegisteredSuccessfully();
    }
    @Test
    public void verifyUserShouldBeRegisterSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        // fill registration details
        registerPage.enterRegistrationDetails();
        //verify register success or not
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Test
    public void verifyUserShouldLoginSuccessfully(){
        //click on login button
        homePage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();
        //verify login is success
        loginResultPage.verifyUserLoginSuccessfully();
    }
    @Test
    public  void verifyUserShouldNotVoteWithoutRegistration(){
        //verify user should vote
        communityPole.votingForCommunityPole();
        //verify user should not vote
        communityPoleResultPage.verifyUserShouldNotVoteWithoutRegistration();
    }
    @Test
    public  void verifyUserShouldVoteWithRegistration() {
        //click on login button
        homePage.clickOnLoginButton();
        //enter login details
        loginPage.enterLoginDetails();
        //verify user should vote
        communityPole.votingForCommunityPole();
        //verify user should not vote
        communityPoleResultPage.verifyUserShouldVoteWithRegistration();
    }
        @Test
        public void verifyUserShouldNotEmailAFriendWithoutRegistration() {
            //email a friend
            emailAFriend.referProductToFriendWithoutRegistration();
            //email a friend resultpage
            emailAFriendResultPage.verifyUserShouldNotReferProductToFriendWithoutRegistration();
        }
        @Test
        public void verifyUserShouldEmailAFriendWithRegistration(){
            //click on login button
            homePage.clickOnLoginButton();
            //enter login details
            loginPage.enterLoginDetails();
            //email a friend
            emailAFriend.referProductToFriendWithoutRegistration();
            //email a friend resultpage
            emailAFriendResultPage.verifyUserShouldReferProductToFriendWithRegistration();
    }
    @Test
    public void verifyUserShouldCompareTwoProducts(){
        //compare two products
        productComparison.comparetwoproducts();
        //compare two products results
        productComparisonResult.verifyProductsInTheBasket();
    }
    @Test
    public void verifyUserShouldSeeProductInShoppingCart(){
        //add product to shopping cart
        addProductToShoppingCart.verifyUserShouldAbleToAddProductsToShoppingCart();
        //verify product in cart
        addProductToShoppingCartResultPage.verifyUserShouldSeeProductInShoppingCart();
    }
}