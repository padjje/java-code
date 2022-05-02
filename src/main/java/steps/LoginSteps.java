package steps;

import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();

    public void enterEmail(String email) {
        loginPage.getEmailInput().setValue(email);
    }

    public void enterPassword(String password) {
        loginPage.getPasswordInput().setValue(password);
    }

    public void clickLoginButton() {
        loginPage.getLoginButton().click();
    }

    public void assertLoginPageIsOpen() {
        boolean actualResult = loginPage.getSocialButtonWrapper().isDisplayed();
        assertThat(actualResult).as("Login page isn't open.").isTrue();
    }
}
