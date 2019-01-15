package com.reloadbet;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.close;

public class BaseClass {
    @BeforeEach
    void mockWebDriver() {
        WebDriverRunner.setProxy(null);
        Configuration.reopenBrowserOnFail = true;
        Configuration.browserSize = null;
        Configuration.startMaximized = true;

    }

    @AfterEach
    void resetSetting() {
        Configuration.reopenBrowserOnFail = true;
        Configuration.browser = "firefox";
    }

    @AfterEach
    void tearDown() {
        WebDriverRunner.setProxy(null);
        close();
    }
}
