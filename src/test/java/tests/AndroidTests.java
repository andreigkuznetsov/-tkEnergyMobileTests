package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static tests.TestData.citySearchValue;

@DisplayName("Тестирование мобильного приложения ТК Энергия")
public class AndroidTests extends TestBase {

    @Test
    @DisplayName("Проверка доступности экрана с формой восстановления пароля")
    void passRecoveryScreenTest() {
            AppScreens.checkForgetPassLink()
                    .checkForgetPassScreen()
                    .returnToMainScreen();

    }

    @Test
    @DisplayName("Проверка доступности экрана с формой регистрации")
    void userRegistrationScreenTest() {
        AppScreens.checkRegistrationLink()
                .checkRegistrationScreen()
                .returnToMainScreen();

    }

    @Test
    @DisplayName("Проверка доступности экранов основного меню")
    void mainScreensTest() {
        AppScreens.checkSkipLink()
                .checkMainScreen()
                .checkContactsLink()
                .checkContactsScreen()
                .checkCalcLink()
                .checkCalcScreen()
                .checkMoreLink()
                .checkMoreScreen();

    }

    @Test
    @DisplayName("Проверка доступности календаря на экране Накладные")
    void calendarScreenTest() {
        AppScreens.checkSkipLink()
                .checkCalendarLink()
                .checkCalendarWidget()
                .checkCalendarClose()
                .checkMainScreen();

    }

    @Test
    @DisplayName("Проверка доступности строки поиска накладной на перевозку")
    void searchInvoiceTest() {
        AppScreens.checkSkipLink()
                .checkMainScreen()
                .checkInvoiceSearchField()
                .checkInvoiceSearchText()
                .returnToMainScreen()
                .checkMainScreen();

    }

    @Test
    @DisplayName("Проверка доступности экрана Настройки")
    void settingsScreenTest() {
        AppScreens.checkSkipLink()
                .checkMainScreen()
                .checkSettingsGamMenu()
                .checkSettingsLink()
                .checkSettingsText();

    }

    @Test
    @DisplayName("Проверка доступности экрана Контактные телефоны")
    void contactPhonesScreenTest() {
        AppScreens.checkSkipLink()
                .checkMainScreen()
                .checkMoreLink()
                .checkMoreScreen()
                .checkPhonesLink()
                .checkPhonesScreen();

    }

    @Test
    @DisplayName("Проверка поиска города (филиала компании)")
    void branchSearchTest() {
        AppScreens.checkSkipLink()
                .checkMainScreen()
                .checkMoreLink()
                .checkMoreScreen();
        AppScreens.searchBranch.searchCity(citySearchValue);

    }
}
