package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class VistaLoginPage extends BasePage{

    private final SelenideElement emailInput = $x("//input[@id='sign-in-email']");
    private final SelenideElement passwordInput = $x("//input[@id='signInPassword']");
    private final SelenideElement loginButton = $x("//button[@data-testid='submit']");

    public SelenideElement getEmailInput() {
        return emailInput;
    }

    public SelenideElement getPasswordInput() {
        return passwordInput;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }
}
