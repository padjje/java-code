package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import pages.MainPage;

public class MainSteps {
    private final MainPage mainPage = new MainPage();
    private final String baseUrl = "https://create.vista.com/uk/";

    public void openMainPage() {
        Selenide.open(baseUrl);
    }

    public void clickOnLoginButton() {
        mainPage.getLoginButton().click();
    }

    public void assertUserMenuIsDisplayed(){
        mainPage.getUserMenuDropDown().as("User menu dropDown is not displayed").shouldBe(Condition.appear);
    }

}
