import org.openqa.selenium.WebDriver;

public class PromotionsPage {

    private final WebDriver driver;

    public PromotionsPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/products/result.html?favorite=Y")) {
            throw new IllegalStateException("This is not a Promotions page");
        }
    }
}
