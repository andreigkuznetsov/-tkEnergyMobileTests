package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import pages.components.CalendarComponent;
import pages.components.NotificationComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.appVersion;
import static tests.TestData.settingsText;

public class SettingsScreensSteps {
    private final SelenideElement
            headerTextArea = $(byClassName("android.widget.TextView")),
            gamburgerMenu = $(byClassName("android.widget.ImageView")),
            settingsTitle = $(MobileBy.id("ru.nrg_tk.mobileclient:id/title")),
            appVersionArea = $(MobileBy.id("android:id/summary"));

    public CalendarComponent calendarComponent = new CalendarComponent();
    public NotificationComponent notificationComponent = new NotificationComponent();

    public SettingsScreensSteps checkSettingsGamMenu() {
        step("Активируем гамбургер-меню", () ->
                gamburgerMenu.click());
        return this;
    }

    public SettingsScreensSteps checkSettingsLink() {
        step("Переходим на экран Настроек", () ->
                settingsTitle.shouldHave(text(settingsText)).click());
        return this;
    }

    public SettingsScreensSteps checkSettingsText() {
        step("Проверяем, что перешли на экран Настроек", () ->
                headerTextArea.shouldHave(text(settingsText)));
        return this;
    }

    public SettingsScreensSteps checkSettingsAppVerText() {
        step("Проверяем, что указана правильная версия приложения", () ->
                appVersionArea.shouldHave(text(appVersion)));
        return this;
    }
}
