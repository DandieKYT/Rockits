package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {
    @Tag("RokitTest")
    @Tag("SearchTest")
    @Test
    @Owner("Kudryavtsev")
    @Feature("Проверка поиска на странице ")
    @Story("Проверка содержимого по запросу QA")
    public void searchQa() {
        basePage.openPage();
        searchPage.blog();
        searchPage.searchField();
        searchPage.checkResult();
    }
}
