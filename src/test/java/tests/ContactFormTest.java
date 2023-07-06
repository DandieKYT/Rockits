package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class ContactFormTest extends TestBase {
    @Tag("RokitTest")
    @Tag("ContactFormTest")
    @Test
    @Owner("Kudryavtsev")
    @Feature("Проверка формы для отправки контактов")
    @Story("Заполнение формы для отправки контактов")
    public void contactForm() {
        basePage.openPage();
        contactFormPage.buttonMagic();
        contactFormPage.phoneNumber();
        contactFormPage.firstName();
        contactFormPage.email();
        contactFormPage.companyName();
        contactFormPage.messageForm();
        contactFormPage.sendForm();
    }
}
