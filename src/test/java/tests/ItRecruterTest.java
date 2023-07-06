package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ItRecruterTest extends TestBase {
    @Tag("RokitTest")
    @Tag("ItRecruterTest")
    @Test
    @Owner("Kudryavtsev")
    @Feature("Проверка страницы курсов IT-рекрутер")
    @Story("Открытие и проверка страницы IT-рекрутер")
    public void itCourceTest() {
        basePage.openPage();
        itRecruterPage.itRecrutmentOpenPage();
        itRecruterPage.aboutCourse();
        itRecruterPage.itRecrutmentCourceCheck();
    }
}
