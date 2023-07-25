package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(css = "a[href$=\"bitcoin-price-rates.html\"]")
    private WebElement allCurrenciesButton;
    @FindBy(xpath = "//*[@data-cy=\"accept-btn\"]")
    private WebElement cookiesAcceptButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickCookiesAcceptButton() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[@data-cy=\"accept-btn\"]")));
        cookiesAcceptButton.click();
        Thread.sleep(1000);
    }
    public void clickAllCurrenciesButton() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.
                visibilityOfElementLocated(By.cssSelector("a[href$=\"bitcoin-price-rates.html\"]")));
        allCurrenciesButton.click();
    }
}