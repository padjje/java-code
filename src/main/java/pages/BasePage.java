package pages;

import com.codeborne.selenide.Configuration;

import java.time.Duration;


public class BasePage {

    public BasePage() {
        Configuration.timeout = Duration.ofSeconds(5).toMillis();
    }
}
