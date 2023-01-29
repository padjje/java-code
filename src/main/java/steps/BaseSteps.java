package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.Selenide.switchTo;


public class BaseSteps {


    public void waitAndClick(SelenideElement element) {
        element.shouldBe(Condition.enabled).click();
    }

    public SelenideElement waitForVisible(SelenideElement element) {
        return element.shouldBe(Condition.visible);
    }

    @Step
    public void refreshPage() {
        refresh();
    }

    @Step
    public void switchToNewTab() {
        switchTo().window(1);
    }

    @Step
    public void switchToParentTab() {
        switchTo().window(0);
    }
}
