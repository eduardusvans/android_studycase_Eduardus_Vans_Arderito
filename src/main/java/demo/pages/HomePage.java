package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public static void addFavorite(String itemName){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = 'Green Tea Latte']";
        AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath,itemName))).click();
    }

    public static boolean isOnPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toolbar_bar_favourite")))
                .isDisplayed();
    }

    public static void chargeButton(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("checkoutButton"));
        buttonSubmit.click();
    }

    public static boolean checkOutPopOut(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tablet_title")))
                .isDisplayed();
    }

    public static void clickCashSuggest(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("cash_suggest_lowest"));
        buttonSubmit.click();
    }

    public static void chargeButton2(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("tablet_ok_button"));
        buttonSubmit.click();
    }

    public static void noThankYouButton(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("no_send_button"));
        buttonSubmit.click();
    }

    public static void libraryClick(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("tool_bar_library_img"));
        buttonSubmit.click();
    }

    public static void itemLatte(String itemName){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'item_name') and @text = 'Latte']";
        AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath,itemName))).click();
    }

    public static void clickItemShopCart(){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'name_text_view') and @text = 'Green Tea Latte']";
        AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath))).click();
    }

    public static boolean onPageItemDetail(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fragment_container")))
                .isDisplayed();
    }

    public static void add(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("choose_item_variant_plus"));
        buttonSubmit.click();
    }

    public static void subtract(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("choose_item_variant_minus"));
        buttonSubmit.click();
    }

    public static void saveButton(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("tablet_ok_button"));
        buttonSubmit.click();
    }

    public static void enterEmail(){
        String email = "zodiacfleut@gmail.com";
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("emailOrPhoneEditText"));
        buttonSubmit.sendKeys(email);
    }
    public static void enterPassword(){
        String pw = "vans123";
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("passwordEditText"));
        buttonSubmit.sendKeys(pw);
    }
    public static void signIn(){
        AndroidElement buttonSubmit = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("signInButton"));
        buttonSubmit.click();
    }
}
