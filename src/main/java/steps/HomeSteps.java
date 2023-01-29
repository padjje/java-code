package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.HomePage;

public class HomeSteps extends BaseSteps{
    private final HomePage homePage = new HomePage();

    @Step
    public void assertUserMenu(Condition expectedCondition) {
        homePage.getUserMenu().as("User menu on Home page").shouldBe(expectedCondition);
    }

    @Step
    public void logoutInUserMenu(){
        homePage.getUserMenu().click();
        homePage.getUserMenuLogOut().click();
    }
}