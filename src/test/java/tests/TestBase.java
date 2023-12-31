package tests;

import com.codeborne.selenide.Configuration;
import help.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

import java.util.Map;


public class TestBase extends Attachment {

    Attachment attachment = new Attachment();
    BasePage basePage = new BasePage();
    VacationsPage vacationsPage = new VacationsPage();
    PrivacyPolicePage privacyPolicepage = new PrivacyPolicePage();
    SearchPage searchPage = new SearchPage();
    ContactFormPage contactFormPage = new ContactFormPage();
    ItRecruterPage itRecruterPage = new ItRecruterPage();

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://rockits.ru";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "100.0";
        Configuration.remote = "https://user1:1234@" + System.getProperty("selenoid_url", "selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void attachemts() {
        attachment.browserLogs();
        attachment.attachScreenshot();
        attachment.pageSource();
        attachment.addVideo();
    }

}

