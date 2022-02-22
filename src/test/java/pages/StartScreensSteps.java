package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.forgot_password_screen_title;
import static tests.TestData.registration_screen_title;

public class StartScreensSteps {
    private final SelenideElement
            forgetPasswordLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_forget_password")),
            headerTextArea = $(byClassName("android.widget.TextView")),
            registrationLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_reg")),
            headerBackButton = $(byClassName("android.widget.ImageButton")),
            skipLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_skip"));

    public StartScreensSteps checkForgetPassLink() {
        step("Переходим на экран с формой восстановления пароля", () ->
                forgetPasswordLink.click());
        return this;
    }

    public StartScreensSteps checkForgetPassScreen() {
        step("Проверяем, что совершен переход на форму восстановления пароля", () ->
                headerTextArea.shouldHave(text(forgot_password_screen_title)));
        return this;
    }

    public StartScreensSteps returnToMainScreen() {
        step("Возвращаемся на основной экран", () ->
                headerBackButton.click());
        return this;
    }

    public StartScreensSteps checkRegistrationLink() {
        step("Переходим на экран с формой регистрации", () ->
                registrationLink.click());
        return this;
    }

    public StartScreensSteps checkRegistrationScreen() {
        step("Проверяем, что совершен переход на форму регистрации", () ->
                headerTextArea.shouldHave(text(registration_screen_title)));
        return this;
    }

    public StartScreensSteps checkSkipLink() {
        step("Переходим на основную группу экранов", () ->
                skipLink.click());
        return this;
    }
}
