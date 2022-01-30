import org.openqa.selenium.WebDriver;

public class BasketPage {

    private final WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/products/basket.html")) {
            throw new IllegalStateException("This is not a Basket page");
        }
    }
}
