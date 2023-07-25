import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrenciesPageTest extends BaseTest {

    @Test
    void userCanChooseCurrencyTest() throws InterruptedException {
        homePage.clickCookiesAcceptButton();
        homePage.clickAllCurrenciesButton();
        currenciesPage.clickOnCurrencyDropDown();
        currenciesPage.clickCurrencyListField();
        Assertions.assertEquals("GBP", currenciesPage.getDropDownText());
        Assertions.assertEquals(currenciesPage.is1InchPercentChangePositiveByClass(),
                currenciesPage.is1InchPercentChangePositiveByColor());
    }
}