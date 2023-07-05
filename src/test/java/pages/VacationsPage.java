package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class VacationsPage {
    private SelenideElement
            actualVacation = $x("//*[contains(@class, 'tn-elem__3560405271628414205009')]//a[text()='Кого ищем']"),
            vacationQA = $x("//div[text()='QA инженер (тестировщик)']"),
            JavaQA = $x("//div[text()='QA инженер (тестировщик)']");

    public VacationsPage actualVacation() {
        step("Открытие вкладки вакансии", () -> {
            actualVacation.click();
        });
        return this;
    }

    public VacationsPage vacationQA() {
        step("Проверка наличия вакансии", () -> {
            vacationQA.shouldHave(Condition.visible);
        });
        return this;
    }

    public VacationsPage JavaQA() {
        step("Проверка языка програмированния для вакансии", () -> {
            JavaQA.shouldHave(Condition.visible);
        });
        return this;
    }
}
