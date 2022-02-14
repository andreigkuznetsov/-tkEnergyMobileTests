package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AppScreens {

    private final String forgot_password_screen_title = "Сброс пароля",
            registration_screen_title = "Регистрация по телефону";

    private SelenideElement
            forgetPasswordLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_forget_password")),
            headerTextArea = $(byClassName("android.widget.TextView")),
            registrationLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_reg")),
            headerBackButton = $(byClassName("android.widget.ImageButton"));

    //public AddLanguageComponent addLanguage = new AddLanguageComponent();
    //public SwitchPrivateDataSendComponent SwitchPrivateDataSend = new SwitchPrivateDataSendComponent();


    public AppScreens checkForgetPassLink() {
        step("Переходим на экран с формой восстановления пароля", () ->
                forgetPasswordLink.click());

        return this;
    }

    public AppScreens checkForgetPassScreen() {
        step("Проверяем, что совершен переход на форму восстановления пароля", () ->
                headerTextArea.shouldHave(text(forgot_password_screen_title)));

        return this;
    }

    public AppScreens returnToMainScreen() {
        step("Возвращаемся на основной экран", () ->
                headerBackButton.click());

        return this;
    }

    public AppScreens checkRegistrationLink() {
        step("Переходим на экран с формой регистрации", () ->
                registrationLink.click());

        return this;
    }

    public AppScreens checkRegistrationScreen() {
        step("Проверяем, что совершен переход на форму регистрации", () ->
                headerTextArea.shouldHave(text(registration_screen_title)));

        return this;
    }



}
