import org.openqa.selenium.WebDriver;

public class ShopsPage {

    private final WebDriver driver;

    public ShopsPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/spisok_magazinov.html")) {
            throw new IllegalStateException("This is not a Shops page");
        }
    }
}
