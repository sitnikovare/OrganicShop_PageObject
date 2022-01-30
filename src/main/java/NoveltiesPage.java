import org.openqa.selenium.WebDriver;

public class NoveltiesPage {

    private final WebDriver driver;

    public NoveltiesPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/products/result.html?new=Y&sort=id+DESC")) {
            throw new IllegalStateException("This is not a Novelties page");
        }
    }
}
