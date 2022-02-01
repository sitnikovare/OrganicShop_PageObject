import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage {

    private final WebDriver driver;

    By usernameLocator = By.id("lablogin");
    By passwordLocator = By.id("labpassword");
    By registerButton = By.xpath("//a[contains(text(), 'Регистрация')]");
    By loginButton = By.xpath("//input[@value='Войти']");
    By forgotPasswordLink = By.xpath("//a[contains(@href, 'remember.html')]");

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;

        if (!driver.getCurrentUrl().equals("https://organic-shops.ru/users/")) {
            throw new IllegalStateException("This is not a Authorization page.");
        }
    }

    public RegisterPage register() {
        driver.findElement(registerButton).click();
        return new RegisterPage(driver);
    }

     public AuthorizationPage setUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
         return this;
     }

    public AuthorizationPage setPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public AuthorizationPage logIn() {
        driver.findElement(loginButton).click();
        return this;
    }

    public RememberPasswordPage goToRememberPasswordPage() {
        driver.findElement(forgotPasswordLink).click();
        return new RememberPasswordPage(driver);
    }
}
