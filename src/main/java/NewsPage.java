import org.openqa.selenium.WebDriver;

public class NewsPage {

    private final WebDriver driver;

    public NewsPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/novosti.html")) {
            throw new IllegalStateException("This is not a News page");
        }
    }
}
