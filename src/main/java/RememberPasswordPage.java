import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RememberPasswordPage {

    private final WebDriver driver;

    public RememberPasswordPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/users/remember.html")) {
            throw new IllegalStateException("This is not a Remember password page.");
        }
    }
}
