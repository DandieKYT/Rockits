package tests;

import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {
    @Test
    public void searchQa() {
        basePage.openPage();
        searchPage.blog();
        searchPage.searchField();
        searchPage.checkResult();
    }
}
