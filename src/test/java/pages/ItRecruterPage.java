package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ItRecruterPage {
    private SelenideElement
    itRecrutmentOpenPage = $x("//a[text()='Школа IT-рекрутмента']"),
    aboutCourse = $x("//div[text()='О курсе']"),
    itRecrutmentCourceCheck = $x("//span[text()=\"курс={ 'IT–РЕКРУТЕР' }\"]");

    public ItRecruterPage itRecrutmentOpenPage() {
        step("Открытие страницы Школа IT-рекрутмента", () -> {
            itRecrutmentOpenPage.click();
            switchTo().window(1);
        });
        return this;
    }
    public ItRecruterPage aboutCourse() {
        step("Открытие страницы О курсе", () -> {
            aboutCourse.click();
        });
        return this;
    }
    public ItRecruterPage itRecrutmentCourceCheck() {
        step("Проверка заголовка курса", () -> {
            itRecrutmentCourceCheck.shouldBe(Condition.text("курс={ 'IT–РЕКРУТЕР' }"));
            closeWindow();
            switchTo().window(0);
        });
        return this;
    }
}
