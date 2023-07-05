package tests;


import org.junit.jupiter.api.Test;


public class ContactFormTest extends TestBase {
    @Test
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
