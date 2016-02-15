import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Marina on 10.02.16.
 */
public class Tests {
    public WebDriver driver;
    public LoginPage loginPage;

    @BeforeTest
    private void setup(){
        driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com");
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @org.testng.annotations.Test
    public void loginTest(){
        loginPage.setButtonLogin();
        loginPage.setNameInput("tomsmith");
        loginPage.setPasswordInput("SuperSecretPassword!");
        loginPage.setButtonLogon();
        loginPage.setButtonLogout();
    }

    @org.testng.annotations.Test
    public void failLogin(){
        loginPage.setButtonLogin();
        loginPage.setNameInput("tomsmiths");
        loginPage.setPasswordInput("SuperSecretPassword!");
        loginPage.setButtonLogon();
        Assert.assertTrue(loginPage.error());
    }

    @org.testng.annotations.Test
    public void failPassword(){
        loginPage.setButtonLogin();
        loginPage.setNameInput("tomsmith");
        loginPage.setPasswordInput("Super!");
        loginPage.setButtonLogon();
        Assert.assertTrue(loginPage.error());
    }
    

    @AfterTest
    public void testDown(){
        driver.close();
    }
}
