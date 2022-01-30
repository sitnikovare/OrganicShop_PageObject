import org.openqa.selenium.WebDriver;

public class AuthorizationPage {

    private final WebDriver driver;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/users/")) {
            throw new IllegalStateException("This is not a Authorization page.");
        }
    }
}
