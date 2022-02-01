import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AuthorizationPageTests {

    private WebDriver driver;

    AuthorizationPage authPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://organic-shops.ru/users/");
        this.authPage = new AuthorizationPage(driver);
    }

    @Test
    public void goToRegisterPage() {
        authPage.register();
        Assert.assertEquals("https://organic-shops.ru/users/register.html", driver.getCurrentUrl());
    }

    @Test
    public void goToUserPage() {
        authPage.setUsername("someUsername");
        authPage.setPassword("somePassword");
        authPage.logIn();

        Assert.assertEquals("https://organic-shops.ru/users/", driver.getCurrentUrl());
    }

    @Test
    public void forgotPasswordLinkTest() {
        authPage.goToRememberPasswordPage();
        Assert.assertEquals("https://organic-shops.ru/users/remember.html", driver.getCurrentUrl());
    }

    @After
    public void close() { driver.quit(); }
}
