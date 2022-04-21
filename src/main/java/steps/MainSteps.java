package steps;

import com.codeborne.selenide.Selenide;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class MainSteps {
    private final MainPage mainPage = new MainPage();
    private final String baseUrl = "https://create.vista.com/uk/";

    public void openMainPage() {
        Selenide.open(baseUrl);
    }

    public void clickOnLoginButton() {
        mainPage.getLoginButton().click();
    }

    public void assertLoginPageIsOpen() {
        boolean actualResult = mainPage.getSocialButtonWrapper().isDisplayed();
        assertThat(actualResult).as("Login page isn't open.").isTrue();
    }
}
