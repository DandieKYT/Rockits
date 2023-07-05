package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SearchPage {
    private SelenideElement
            blog = $x("//a[text()='Блог']"),
            searchField = $x("//*[contains(@class, 't838__input')]"),
            checkResult = $x("//*[contains(@class, 't-site-search-pu')]/div/a");

    public SearchPage blog() {
        step("Открытие страницы Блог", () -> {
            blog.click();
        });
        return this;
    }

    public SearchPage searchField() {
        step("Заполнение поле поиска значением QA", () -> {
            searchField.setValue("QA").pressEnter();
        });
        return this;
    }

    public SearchPage checkResult() {
        step("Проверка наличия результата", () -> {
            checkResult.shouldBe(Condition.visible);
        });
        return this;
    }
}
