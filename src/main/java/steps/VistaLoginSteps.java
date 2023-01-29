package steps;

import io.qameta.allure.Step;
import pages.VistaLoginPage;

public class VistaLoginSteps extends BaseSteps {

    private final VistaLoginPage vistaLoginPage = new VistaLoginPage();

    @Step
    public void setEmail(String email) {
        vistaLoginPage.getEmailInput().as("Email input on VistaLogin page").setValue(email);
    }

    @Step
    public void setPassword(String password) {
        vistaLoginPage.getPasswordInput().as("Password input on VistaLogin page").setValue(password);
    }

    @Step
    public void clickOnLoginButton() {
        vistaLoginPage.getLoginButton().as("Login button VistaLogin page").click();
    }

}
