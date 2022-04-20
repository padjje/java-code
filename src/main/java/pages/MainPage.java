package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage {

    private final SelenideElement loginButton = $x("//a[@data-value='signIn']");
    private final SelenideElement socialButtonWrapper = $x("//div[contains(@class,'socialButtons')]");

    public SelenideElement getLoginButton() {
        return loginButton;
    }

    public SelenideElement getSocialButtonWrapper() {
        return socialButtonWrapper;
    }

}
