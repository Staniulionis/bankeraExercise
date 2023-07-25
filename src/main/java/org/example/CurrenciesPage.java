package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CurrenciesPage extends BasePage {

    @FindBy(id = "react-select-currency-select-listbox")
    private WebElement currency;
    @FindBy(id = "currency-select")
    private WebElement currencyDropDown;
    @FindBy(css = ".css-1836tev")
    private WebElement currencyText;
    @FindBy(css = ".DesktopTable_percentageChange__ch5cN")
    private WebElement oneInchPercentChange;
    @FindBy(css = ".css-1bac1wu-menu")
    private WebElement dropDownCurrenciesField;

    public CurrenciesPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnCurrencyDropDown() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.
                visibilityOfElementLocated(By.cssSelector(".LiveRates_referenceCurrency__WsAqh")));
        currencyDropDown.click();
    }
    public void clickCurrencyListField() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.
                visibilityOfElementLocated(By.cssSelector(".LiveRates_referenceCurrency__WsAqh")));
        currency.click();
    }
    public String getDropDownText() {
        return currencyText.getText();
    }
    public void getPercentColor() {
        oneInchPercentChange.getCssValue("color");
    }
    public String is1InchPercentChangePositiveByClass() {
        if(oneInchPercentChange.getDomAttribute("class").contains("green")) {
            System.out.println("Rate is positive");
        } else {
            System.out.println("Rate is negative");
        }
        return null;
    }
    public String is1InchPercentChangePositiveByColor() {
        if (oneInchPercentChange.getCssValue("color").equals("rgba(221, 75, 100, 1)")) {
            System.out.println("Rate is negative");
        } else {
            System.out.println("Rate is positive");
        }
        return null;
    }
}