package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class LoginPage extends BasePage{

    private final SelenideElement loginButton = $x("//button[@data-test='cimpress']");

    public SelenideElement getLoginButton() {
        return loginButton;
    }

}
