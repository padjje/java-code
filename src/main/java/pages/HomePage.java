package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class HomePage extends BasePage {

    private final SelenideElement userMenu = $x("//div[@data-tooltip='userMenu']");
    private final SelenideElement UserMenuLogOut = $x("//a[@data-value='logOut']");

    public SelenideElement getUserMenu() {
        return userMenu;
    }

    public SelenideElement getUserMenuLogOut() {
        return UserMenuLogOut;
    }
}
