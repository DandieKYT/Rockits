package tests;

import org.junit.jupiter.api.Test;

public class VacationsTest extends TestBase {
    @Test
    public void qaVacation() {
        basePage.openPage();
        vacationsPage.actualVacation();
        vacationsPage.vacationQA();
        vacationsPage.JavaQA();
    }
}
