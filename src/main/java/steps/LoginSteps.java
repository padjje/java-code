package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage = new LoginPage();

    @Step
    public void clickOnLoginButton() {
       loginPage.getLoginButton().as("Login button on Login page").click();
    }
}
