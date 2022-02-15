package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import pages.components.SearchBranchComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.*;

public class AppScreens {

    private SelenideElement
            forgetPasswordLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_forget_password")),
            headerTextArea = $(byClassName("android.widget.TextView")),
            registrationLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_reg")),
            headerBackButton = $(byClassName("android.widget.ImageButton")),
            skipLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_skip")),
            headerMainScreensTextArea = $(MobileBy.id("ru.nrg_tk.mobileclient:id/toolbar")),
            calendarLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/Button_sending_date_ranges")),
            calendarWidgetHeader = $(MobileBy.id("ru.nrg_tk.mobileclient:id/mdtp_date_picker_header")),
            calendarCloseLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/mdtp_cancel")),
            moreButtonArea = $(byClassName("android.support.v7.app.ActionBar$Tab")),
            searchStartAction = $(MobileBy.id("ru.nrg_tk.mobileclient:id/action_search")),
            InvoiceSearchArea = $(MobileBy.id("ru.nrg_tk.mobileclient:id/search_src_text")),
            gamburgerMenu = $(byClassName("android.widget.ImageView")),
            settingsTitle = $(MobileBy.id("ru.nrg_tk.mobileclient:id/title")),
            headerMoreScreensTextArea = $(MobileBy.id("ru.nrg_tk.mobileclient:id/action_bar")),
            contactPhonesButton = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_contact_phones"));


    public SearchBranchComponent searchBranch = new SearchBranchComponent();

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

    public AppScreens checkMainScreen() {
        step("Проверяем, что совершен переход на основную группу экранов", () ->
                headerMainScreensTextArea.shouldHave(text(main_screen_title)));

        return this;
    }

    public AppScreens checkCalendarLink() {
        step("Открываем каледарь для редактирования", () ->
                calendarLink.click());

        return this;
    }

    public AppScreens checkCalendarWidget() {
        step("Проверяем, что календарь открылся", () ->
                calendarWidgetHeader.shouldHave(text(calendarHeaderText)));

        return this;
    }

    public AppScreens checkCalendarClose() {
        step("Закрываем виджет календаря", () ->
                calendarCloseLink.click());

        return this;
    }

    public AppScreens checkContactsLink() {
        step("Переходим на экран Контакты", () ->
                headerTextArea.shouldHave(text(contactsTitle)).click());

        return this;
    }

    public AppScreens checkContactsScreen() {
        step("Проверяем, что совершен переход на экран Контакты", () ->
                headerMainScreensTextArea.shouldHave(text(contactsTitle)));

        return this;
    }

    public AppScreens checkCalcLink() {
        step("Переходим на экран Калькулятор", () ->
                headerTextArea.shouldHave(text(calculatorTitle)).click());

        return this;
    }

    public AppScreens checkCalcScreen() {
        step("Проверяем, что совершен переход на экран Калькулятор", () ->
                headerMainScreensTextArea.shouldHave(text(calculatorTitle)));

        return this;
    }

    public AppScreens checkMoreLink() {
        step("Переходим на экран Дополнительно", () ->
                moreButtonArea.click());

        return this;
    }

    public AppScreens checkMoreScreen() {
        step("Проверяем, что совершен переход на экран Дополнительно", () ->
                headerMainScreensTextArea.shouldHave(text(moreTitle)));

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
                headerMoreScreensTextArea.shouldHave(text(settingsText)));

        return this;
    }

    public AppScreens checkPhonesLink() {
        step("Переходим на экран Контактные телефоны", () ->
                contactPhonesButton.click());

        return this;
    }

    public AppScreens checkPhonesScreen() {
        step("Проверяем, что совершен переход на экран Контактные телефоны", () ->
                headerMoreScreensTextArea.shouldHave(text(contactPhoneTest)));

        return this;
    }

}






