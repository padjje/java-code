package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class MainSteps extends BaseSteps {
    private final MainPage mainPage = new MainPage();

    @Step
    public void openMainPage() {
        String baseUrl = "https://create.vista.com/uk/";
        open(baseUrl);
    }

    @Step
    public void clickOnLoginButton() {
        mainPage.getLoginButton().as("Login button on Main page").shouldBe(Condition.enabled).click();
    }

    @Step
    public void assertLoginPageIsOpen() {
        mainPage.getSocialButtonWrapper().shouldBe(Condition.visible);
    }
}
