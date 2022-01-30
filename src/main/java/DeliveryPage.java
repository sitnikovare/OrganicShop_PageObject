import org.openqa.selenium.WebDriver;

public class DeliveryPage {

    private final WebDriver driver;

    public DeliveryPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/delivery/")) {
            throw new IllegalStateException("This is not a Delivery page");
        }
    }
}
