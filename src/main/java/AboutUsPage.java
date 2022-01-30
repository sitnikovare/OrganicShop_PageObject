import org.openqa.selenium.WebDriver;

public class AboutUsPage {

    private final WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/o_nas.html")) {
            throw new IllegalStateException("This is not a About Us page.");
        }
    }
}
