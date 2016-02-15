import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 10.02.16.
 */
public class LoginPage {

    @FindBy(css = "a[href='/login']")
    private WebElement buttonLogin;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".radius")
    private WebElement buttonLogon;

    @FindBy(css = "a[href='/logout']")
    private WebElement buttonLogout;

    @FindBy(css = "div.error")
    private WebElement error;

    public void setButtonLogin(){
        buttonLogin.click();
    }

    public void setNameInput(String name){
        usernameInput.sendKeys(name);
    }

    public void setPasswordInput(String password){
        passwordInput.sendKeys(password);
    }

    public void setButtonLogon(){
        buttonLogon.click();
    }

    public void setButtonLogout(){
        buttonLogout.click();
    }

    public boolean error(){
        return error.isDisplayed();
    }
}
