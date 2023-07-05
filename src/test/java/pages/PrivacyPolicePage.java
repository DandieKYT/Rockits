package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class PrivacyPolicePage {
    private SelenideElement
            privacyPoliceOpenPage = $x("//a[text()='Политика конфиденциальности']"),
            privacyPoliceCheckTitle = $x("//*[contains(@class, 't795__title')]/div/strong");

    public PrivacyPolicePage privacyPolicePage() {
        step("Открытие страницы Политика конфиденциальности", () -> {
            privacyPoliceOpenPage.click();
        });
        return this;
    }

    public PrivacyPolicePage privacyPoliceTitle() {
        step("Проверка заголовка страницы", () -> {
            privacyPoliceCheckTitle.shouldBe(Condition.text("ПОЛИТИКА ОБЩЕСТВА С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"БИ-ВАН КЕНОБИ\" В ОТНОШЕНИИ ОБРАБОТКИ ПЕРСОНАЛЬНЫ"));
        });
        return this;
    }
}
