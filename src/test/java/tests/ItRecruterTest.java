package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class ItRecruterTest extends TestBase {
    @Test
    public void itCourceTest() {
        basePage.openPage();
        itRecruterPage.itRecrutmentOpenPage();
        itRecruterPage.aboutCourse();
        itRecruterPage.itRecrutmentCourceCheck();
    }
}
