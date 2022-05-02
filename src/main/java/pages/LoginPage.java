package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement socialButtonWrapper = $x("//div[contains(@class,'socialButtons')]");
    private final SelenideElement passwordInput = $x("//input[@name='password']");
    private final SelenideElement emailInput = $x("//input[@name='email']");
    private final SelenideElement loginButton = $x("//button[@data-categ='logInPage'][@type='submit']");

    public SelenideElement getEmailInput() {
        return emailInput;
    }

    public SelenideElement getPasswordInput() {
        return passwordInput;
    }

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public SelenideElement getSocialButtonWrapper() {
        return socialButtonWrapper;
    }
}
