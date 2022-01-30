import org.openqa.selenium.WebDriver;

public class CertificatesPage {

    private final WebDriver driver;

    public CertificatesPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/sertifikaty.html")) {
            throw new IllegalStateException("This is not a Certificates page");
        }
    }
}
