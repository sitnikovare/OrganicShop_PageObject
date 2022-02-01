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
        Assert.assertEquals("https://organic-shops.ru/", driver.getCurrentUrl());
    }

    @Test
    public void getBrandListTest() {
        mainPage.getBrandList();
        Assert.assertEquals("https://organic-shops.ru/", driver.getCurrentUrl());
    }

    @Test
    public void searchLineTest() {
        mainPage.searchLine();
        Assert.assertEquals("https://organic-shops.ru/", driver.getCurrentUrl());
    }

    @Test
    public void goToNewsPageTest() {
        mainPage.goToNewsPage();
        Assert.assertEquals("https://organic-shops.ru/novosti.html", driver.getCurrentUrl());
    }

    @Test
    public void goToShopsPageTest() {
        mainPage.goToShopsPage();
        Assert.assertEquals("https://organic-shops.ru/spisok_magazinov.html", driver.getCurrentUrl());
    }

    @Test
    public void goToCertificatesPageTest() {
        mainPage.goToCertificatesPage();
        Assert.assertEquals("https://organic-shops.ru/sertifikaty.html", driver.getCurrentUrl());
    }

    @Test
    public void goToAboutUsPageTest() {
        mainPage.goToAboutUsPage();
        Assert.assertEquals("https://organic-shops.ru/o_nas.html", driver.getCurrentUrl());
    }

    @Test
    public void goToDeliveryPageTest() {
        mainPage.goToDeliveryPage();
        Assert.assertEquals("https://organic-shops.ru/delivery/", driver.getCurrentUrl());
    }

    @Test
    public void goToPromotionsPageTest() {
        mainPage.goToPromotionsPage();
        Assert.assertEquals("https://organic-shops.ru/products/result.html?favorite=Y", driver.getCurrentUrl());
    }

    @Test
    public void goToNoveltiesPageTest() {
        mainPage.goToNoveltiesPage();
        Assert.assertEquals(
                "https://organic-shops.ru/products/result.html?new=Y&sort=id+DESC",
                        driver.getCurrentUrl());
    }

    @Test
    public void goToAuthorizationPageTest() {
        mainPage.goToAuthorizationPage();
        Assert.assertEquals("https://organic-shops.ru/users/", driver.getCurrentUrl());
    }

    @Test
    public void goToBasketPageTest() {
        mainPage.goToBasketPage();
        Assert.assertEquals("https://organic-shops.ru/products/basket.html", driver.getCurrentUrl());
    }

    @After
    public void close() {
        driver.quit();
    }
}
