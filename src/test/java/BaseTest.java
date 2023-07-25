import org.example.BasePage;
import org.example.CurrenciesPage;
import org.example.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    static WebDriver driver;
    static HomePage homePage;
    static BasePage basePage;
    static CurrenciesPage currenciesPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://spectrocoin.com");

        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
        currenciesPage = new CurrenciesPage(driver);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}