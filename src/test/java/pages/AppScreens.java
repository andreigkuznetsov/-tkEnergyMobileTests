package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import pages.components.CalendarComponent;
import pages.components.NotificationComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.*;

public class AppScreens {

    private final SelenideElement
            forgetPasswordLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_forget_password"));
    private final SelenideElement headerTextArea = $(byClassName("android.widget.TextView"));
    private final SelenideElement registrationLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_reg"));
    private final SelenideElement headerBackButton = $(byClassName("android.widget.ImageButton"));
    private final SelenideElement skipLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_skip"));
    private final SelenideElement searchStartAction = $(MobileBy.id("ru.nrg_tk.mobileclient:id/action_search"));
    private final SelenideElement InvoiceSearchArea = $(MobileBy.id("ru.nrg_tk.mobileclient:id/search_src_text"));
    private final SelenideElement gamburgerMenu = $(byClassName("android.widget.ImageView"));
    private final SelenideElement settingsTitle = $(MobileBy.id("ru.nrg_tk.mobileclient:id/title"));
    private final SelenideElement appVersionArea = $(MobileBy.id("android:id/summary"));

    public CalendarComponent calendarComponent = new CalendarComponent();
    public NotificationComponent notificationComponent = new NotificationComponent();

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

    public AppScreens checkSkipLink() {
        step("Переходим на основную группу экранов", () ->
                skipLink.click());

        return this;
    }

    public AppScreens checkInvoiceSearchField() {
        step("Открываем поле поиска накладной", () ->
                searchStartAction.click());

        return this;
    }

    public AppScreens checkInvoiceSearchText() {
        step("Проверяем, что поле поиска накладной активно", () ->
                InvoiceSearchArea.shouldHave(text(invoiceSearchText)));

        return this;
    }

    public AppScreens checkSettingsGamMenu() {
        step("Активируем гамбургер-меню", () ->
                gamburgerMenu.click());

        return this;
    }

    public AppScreens checkSettingsLink() {
        step("Переходим на экран Настроек", () ->
                settingsTitle.shouldHave(text(settingsText)).click());

        return this;
    }

    public AppScreens checkSettingsText() {
        step("Проверяем, что перешли на экран Настроек", () ->
                headerTextArea.shouldHave(text(settingsText)));

        return this;
    }

    public AppScreens checkSettingsAppVerText() {
        step("Проверяем, что указана правильная версия приложения", () ->
                appVersionArea.shouldHave(text(appVersion)));

        return this;
    }
}
