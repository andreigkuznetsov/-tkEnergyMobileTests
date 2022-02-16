package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.settingsText;

public class NotificationComponent {

    private SelenideElement   gamburgerMenu = $(byClassName("android.widget.ImageView")),
            settingsTitle = $(MobileBy.id("ru.nrg_tk.mobileclient:id/title")),
            headerTextArea = $(byClassName("android.widget.TextView")),
            switchWidget = $(MobileBy.id("ru.nrg_tk.mobileclient:id/switchWidget"));

    public void setNotificationSwitcher(String notificationsWidgetOn, String notificationsWidgetOff) {

        step("Активируем гамбургер-меню", () ->
                gamburgerMenu.click());

        step("Переходим на экран Настроек", () ->
                settingsTitle.shouldHave(text(settingsText)).click());

        step("Проверяем, что перешли на экран Настроек", () ->
                headerTextArea.shouldHave(text(settingsText)));

        step("Проверяем, что виджет Получать уведомления включен", () ->
                switchWidget.shouldHave(text(notificationsWidgetOn)));

        step("Переключаем виджет Получать уведомления в состояние выключен", () ->
                switchWidget.click());

        step("Проверяем, что виджет Получать уведомления выключен", () ->
                switchWidget.shouldHave(text(notificationsWidgetOff)));
    }
}

