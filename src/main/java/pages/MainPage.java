package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage {

    private final SelenideElement loginButton = $x("//a[@data-value='signIn']");
    private final SelenideElement userMenuDropDown = $x("//div[@data-value='dropdown_profile']");


    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public SelenideElement getUserMenuDropDown() {
        return userMenuDropDown;

    }

}
