package tests;

import annotations.JiraIssue;
import annotations.JiraIssues;
import annotations.Layer;
import annotations.Microservice;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static tests.TestData.*;

@Tag("Mobile")
@JiraIssues({@JiraIssue("HOMEWORK-338")})
@DisplayName("Тестирование мобильного приложения \"ТК Энергия\"")
public class AndroidTests extends TestBase {

    @Test
    @DisplayName("Проверка доступности экрана с формой восстановления пароля")
    @Layer("UI Mobile Tests")
    @Tags({@Tag("High"), @Tag("Smoke"), @Tag("Regress")})
    @Microservice("Mobile")
    @Owner("Andrei Kuznetsov")
    @Feature("Экран восстановления пароля")
    @Story("Экраны авторизации и регистрации в приложении")
    @Severity(SeverityLevel.BLOCKER)
    void passRecoveryScreenTest() {
            AppScreens.checkForgetPassLink()
                    .checkForgetPassScreen()
                    .returnToMainScreen();

    }

    @Test
    @DisplayName("Проверка доступности экрана с формой регистрации")
    @Tags({@Tag("High"), @Tag("Smoke"), @Tag("Regress")})
    @Layer("UI Mobile Tests")
    @Microservice("Mobile")
    @Owner("Andrei Kuznetsov")
    @Feature("Экран регистрации")
    @Story("Экраны авторизации и регистрации в приложении")
    @Severity(SeverityLevel.BLOCKER)
    void userRegistrationScreenTest() {
        AppScreens.checkRegistrationLink()
                .checkRegistrationScreen()
                .returnToMainScreen();

    }

    @Test
    @DisplayName("Проверка доступности и работы календаря на экране \"Накладные\"")
    @Layer("UI Mobile Tests")
    @Tags({@Tag("Low"), @Tag("Regress")})
    @Microservice("Mobile")
    @Owner("Gleb Danilov")
    @Feature("Выбор в календаре периода отображения накладных")
    @Story("Поиск накладных на перевозку")
    @Severity(SeverityLevel.NORMAL)
    void calendarScreenTest() {
        AppScreens.checkSkipLink();
        AppScreens.calendarComponent.setCalendarWidget(calendarHeaderFromText, calendarHeaderToText);

    }

    @Test
    @DisplayName("Проверка доступности строки поиска накладной на перевозку")
    @Layer("UI Mobile Tests")
    @Tags({@Tag("High"), @Tag("Smoke"), @Tag("Regress")})
    @Microservice("Mobile")
    @Owner("Andrei Kuznetsov")
    @Feature("Поиск накладной на перевозку по номеру")
    @Story("Поиск накладных на перевозку")
    @Severity(SeverityLevel.CRITICAL)
    void searchInvoiceTest() {
        AppScreens.checkSkipLink()
                .checkInvoiceSearchField()
                .checkInvoiceSearchText()
                .returnToMainScreen();

    }

    @Test
    @DisplayName("Проверка доступности экрана \"Настройки\"")
    @Layer("UI Mobile Tests")
    @Tags({@Tag("High"), @Tag("Regress")})
    @Microservice("Mobile")
    @Owner("Andrei Kuznetsov")
    @Feature("Доступность экрана \"Настройки\"")
    @Story("Раздел \"Настройки\"")
    @Severity(SeverityLevel.CRITICAL)
    void settingsScreenTest() {
        AppScreens.checkSkipLink()
                .checkSettingsGamMenu()
                .checkSettingsLink()
                .checkSettingsText()
                .checkSettingsAppVerText();

    }

    @Test
    @DisplayName("Проверка переключателя отправки уведомлений")
    @Layer("UI Mobile Tests")
    @Tags({@Tag("Low"), @Tag("Regress")})
    @Microservice("Mobile")
    @Owner("Gleb Danilov")
    @Feature("Отправка уведомлений клиенту")
    @Story("Раздел \"Настройки\"")
    @Severity(SeverityLevel.NORMAL)
    void setNotificationsReceiveTest() {
        AppScreens.checkSkipLink();
        AppScreens.notificationComponent.setNotificationSwitcher(notificationsWidgetOn, notificationsWidgetOff);

    }

}
