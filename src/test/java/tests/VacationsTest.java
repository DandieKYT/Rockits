package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class VacationsTest extends TestBase {
    @Tag("RokitTest")
    @Tag("VacationTest")
    @Test
    @Owner("Kudryavtsev")
    @Feature("Открытие вакансии тестировщик ")
    @Story("Проверка наличия вакансии тестировщик со знанием Java")
    public void qaVacation() {
        basePage.openPage();
        vacationsPage.actualVacation();
        vacationsPage.vacationQA();
        vacationsPage.JavaQA();
    }
}
