package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ContactFormPage {
    private SelenideElement
        buttonMagic = $x("//*[@id='sbs-377928782-1628440568448']//a[text()='ХОЧУ МАГИИ!']"),
        phoneNumber = $x("//*[@id='input_1629407477016']"),
        firstName = $x("//*[@id='input_1495810359387']"),
        email = $x("//*[@id='input_1495810354468']"),
        companyName = $x("//*[@id='input_1495810410810']"),
        sendForm = $x("//*[@id='form356040550']//button[text()='ОТПРАВИТЬ']"),
        messageForm = $x("//*[@id='input_1629407498743']");

    public ContactFormPage buttonMagic() {
        step("Открытие формы для заполнения контактных данных", () -> {
            buttonMagic.click();
        });
        return this;
    }
    public ContactFormPage phoneNumber() {
        step("Заполенение поля Телефон * (или имя пользователя в WhatsApp/Telegram)", () -> {
            phoneNumber.setValue("414513216321313651");
        });
        return this;
    }
    public ContactFormPage firstName() {
        step("Заполенение поля Ваше имя", () -> {
            firstName.setValue("Иван");
        });
        return this;
    }
    public ContactFormPage email() {
        step("Заполенение поля Ваш e-mail", () -> {
            email.setValue("242134autotest24353234@gmail.com");
        });
        return this;
    }
    public ContactFormPage companyName() {
        step("Заполенение поля Компания", () -> {
            companyName.setValue("RandomCompany");
        });
        return this;
    }
    public ContactFormPage messageForm() {
        step("Заполенение поля Компания", () -> {
            messageForm.setValue("autotest");
        });
        return this;
    }
    public ContactFormPage sendForm() {
        step("Нажатие на кнопку отправить", () -> {
            sendForm.click();
        });
        return this;
    }
}
