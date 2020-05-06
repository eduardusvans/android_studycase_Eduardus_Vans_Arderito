package demo.steps_definition;

import demo.pages.HomePage;
import demo.pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStepDefinition {
    HomePage homePage = new HomePage();
    StartPage startPage = new StartPage();
    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        startPage.clikSignInButton();
        homePage.enterEmail();
        homePage.enterPassword();
        homePage.signIn();
    }

    @When("User click {string}")
    public void userClick(String itemName) {
        homePage.addFavorite(itemName);
    }

    @When("User click charge button on shopping cart")
    public void userClickChargeButtonOnShoppingCart() {
        homePage.chargeButton();
    }

    @When("User see checkout pop up")
    public void userSeeCheckoutPopUp() {
        boolean result = homePage.checkOutPopOut();
        Assert.assertTrue(result);
    }

    @When("User Choose Cash suggest")
    public void userChooseCashSuggest() {
        homePage.clickCashSuggest();
    }

    @When("User click charge button on checkout pop up")
    public void userClickChargeButtonOnCheckoutPopUp() {
        homePage.chargeButton2();
    }

    @When("User click no, thank you button")
    public void userClickNoThankYouButton() {
        homePage.noThankYouButton();
    }

    @Then("User redirect to Home Page")
    public void userRedirectToHomePage() {
        boolean result = homePage.isOnPage();
        Assert.assertTrue(result);
    }

    @When("User click Library toolbar")
    public void userClickLibraryToolbar() {
        homePage.libraryClick();
    }

    @When("User click category {string} on library page")
    public void userClickCategoryOnLibraryPage(String itemName) {
        homePage.itemLatte(itemName);
    }

    @When("User click see checkout pop up")
    public void userClickSeeCheckoutPopUp() {
        boolean result = homePage.checkOutPopOut();
        Assert.assertTrue(result);
    }

    @When("User click item on shopping cart")
    public void userClickItemOnShoppingCart() {
        homePage.clickItemShopCart();
    }

    @When("User will see item detail pop up")
    public void userWillSeeItemDetailPopUp() {
        boolean result = homePage.onPageItemDetail();
        Assert.assertTrue(result);
    }

    @When("User add one item quantity")
    public void userAddOneItemQuanity() {
        homePage.add();
    }

    @When("User subtract one item quantity")
    public void userSubtractOneItemQuantity() {
        homePage.subtract();
    }

    @When("User click save button")
    public void userClickSaveButton() {
        homePage.saveButton();
    }
}
