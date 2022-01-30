import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MainPageTests {

    private WebDriver driver;

    private MainPage mainPage;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://organic-shops.ru/");
        this.mainPage = new MainPage(driver);
    }

    @Test
    public void getCatalogListTest() {
        mainPage.getCatalogList();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/");
    }

    @Test
    public void getBrandListTest() {
        mainPage.getBrandList();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/");
    }

    @Test
    public void searchLineTest() {
        mainPage.searchLine();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/");
    }

    @Test
    public void goToNewsPageTest() {
        mainPage.goToNewsPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/novosti.html");
    }

    @Test
    public void goToShopsPageTest() {
        mainPage.goToShopsPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/spisok_magazinov.html");
    }

    @Test
    public void goToCertificatesPageTest() {
        mainPage.goToCertificatesPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/sertifikaty.html");
    }

    @Test
    public void goToAboutUsPageTest() {
        mainPage.goToAboutUsPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/o_nas.html");
    }

    @Test
    public void goToDeliveryPageTest() {
        mainPage.goToDeliveryPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/delivery/");
    }

    @Test
    public void goToPromotionsPageTest() {
        mainPage.goToPromotionsPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/products/result.html?favorite=Y");
    }

    @Test
    public void goToNoveltiesPageTest() {
        mainPage.goToNoveltiesPage();
        Assert.assertEquals( driver.getCurrentUrl(),
                       "https://organic-shops.ru/products/result.html?new=Y&sort=id+DESC" );
    }

    @Test
    public void goToAuthorizationPageTest() {
        mainPage.goToAuthorizationPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/users/");
    }

    @Test
    public void goToBasketPageTest() {
        mainPage.goToBasketPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://organic-shops.ru/products/basket.html");
    }

    @After
    public void close() {
        driver.quit();
    }
}
