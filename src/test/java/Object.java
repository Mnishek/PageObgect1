import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marina on 10.02.16.
 */
public class Object {
    private final By usernameInput =By.id("username");
    private final By buttonLogin =By.cssSelector("a[href='/login']");
    private final By passwordInput  =By.id("password");
    private final By buttonLogon =By.cssSelector(".radius");
    private final By buttonLogout =By.cssSelector("a[href='/logout']");
    private final By error =By.cssSelector("div.error");

    WebDriver driver;

    public Object (WebDriver driver){
        this.driver = driver;
    }

    public void setButtonLogin(){
        driver.findElement(buttonLogin).click();
    }

    public void setUsernameInput(String name){
        driver.findElement(usernameInput).sendKeys(name);
    }

    public void setPasswordInput(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void setButtonLogon(){
        driver.findElement(buttonLogon);
    }

    public void setButtonLogout(){
        driver.findElement(buttonLogout);
    }

    public boolean Error(){
        return driver.findElement(error).isDisplayed();
    }

}
