
import org.junit.jupiter.api.Test;
import steps.LoginSteps;
import steps.MainSteps;


public class LoginTest extends BaseTest {

    private final MainSteps mainPage = new MainSteps();
    private final LoginSteps loginPage = new LoginSteps();

    @Test
    public void verifyOpenLoginForm(){
        mainPage.openMainPage();
        mainPage.clickOnLoginButton();
        loginPage.assertLoginPageIsOpen();
    }

    @Test
    public void verifyUserLogin(){
      mainPage.openMainPage();
      mainPage.clickOnLoginButton();
      loginPage.enterEmail("demipot197@svcache.com");
      loginPage.enterPassword("qwerty1234");
      loginPage.clickLoginButton();
      mainPage.assertUserMenuIsDisplayed();
    }
}
