
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import steps.HomeSteps;
import steps.LoginSteps;
import steps.MainSteps;
import steps.VistaLoginSteps;

@ExtendWith({TextReportExtension.class})
public class LoginTest extends BaseTest {

    private final MainSteps mainPage = new MainSteps();
    private final LoginSteps loginPage = new LoginSteps();
    private final VistaLoginSteps vistaLoginPage = new VistaLoginSteps();
    private final HomeSteps homePage = new HomeSteps();

    @Test
    public void verifyMainPage() {
        mainPage.openMainPage();
        homePage.assertUserMenu(Condition.not(Condition.visible));
    }

    @Test
    public void verifyLoginByCredentials() {
        mainPage.openMainPage();
        homePage.assertUserMenu(Condition.not(Condition.visible));
        mainPage.clickOnLoginButton();
        loginPage.clickOnLoginButton();
        loginPage.switchToNewTab();
        vistaLoginPage.setEmail("ira.test.212@gmail.com");
        vistaLoginPage.setPassword("ira.test.21@gmail.coM");
        vistaLoginPage.clickOnLoginButton();
        vistaLoginPage.switchToParentTab();
        homePage.assertUserMenu(Condition.visible);
        homePage.logoutInUserMenu();
    }
}
