import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public class Base {

    public static void setUpWebDriver() {
//        WebDriverManager.firefoxdriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.startMaximized = true;
        Configuration.headless = false;
    }

    public static void tearDown() {
        Selenide.closeWebDriver();
    }

    public static void setupAllureListener() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true)
                        .includeSelenideSteps(true));
    }
}
