import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/")) {
            throw new IllegalStateException("This is not a Main page.");
        }
    }

    //Actions action = new Actions(driver);
    //action.moveToElement(element).build().perform();

    public MainPage getCatalogList() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Каталог')]"));
        element.click();

        return this;
    }

    public MainPage getBrandList() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Бренд')]"));
        element.click();

        return this;
    }

    public MainPage searchLine() {
//        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Новинки')]"));
//        element.click();

        return this;
    }

    public NewsPage goToNewsPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Новости')]"));
        element.click();

        return new NewsPage(driver);
    }

    public ShopsPage goToShopsPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Магазины')]"));
        element.click();

        return new ShopsPage(driver);
    }

    public CertificatesPage goToCertificatesPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Сертификаты')]"));
        element.click();

        return new CertificatesPage(driver);
    }

    public AboutUsPage goToAboutUsPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'О нас')]"));
        element.click();

        return new AboutUsPage(driver);
    }

    public DeliveryPage goToDeliveryPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Доставка')]"));
        element.click();

        return new DeliveryPage(driver);
    }

    public PromotionsPage goToPromotionsPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Акции')]"));
        element.click();

        return new PromotionsPage(driver);
    }

    public NoveltiesPage goToNoveltiesPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Новинки')]"));
        element.click();

        return new NoveltiesPage(driver);
    }

    public AuthorizationPage goToAuthorizationPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'users')]"));
        element.click();

        return new AuthorizationPage(driver);
    }

    public BasketPage goToBasketPage() {
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'basket')]"));
        element.click();

        return new BasketPage(driver);
    }
}
