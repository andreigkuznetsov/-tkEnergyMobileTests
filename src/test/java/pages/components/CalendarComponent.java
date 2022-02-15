package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.calendarHeaderFromText;
import static tests.TestData.calendarHeaderToText;

public class CalendarComponent {

    private SelenideElement     calendarLink = $(MobileBy.id("ru.nrg_tk.mobileclient:id/Button_sending_date_ranges")),
            calendarWidgetHeader = $(MobileBy.id("ru.nrg_tk.mobileclient:id/mdtp_date_picker_header")),
            calendarOkButton = $(MobileBy.id("ru.nrg_tk.mobileclient:id/mdtp_ok"));

      public void setCalendarWidget(String calendarHeaderFromText, String calendarHeaderToText) {

          step("Открываем каледарь для редактирования", () ->
                  calendarLink.click());

          step("Проверяем, что первый календарь открылся", () ->
                  calendarWidgetHeader.shouldHave(text(calendarHeaderFromText)));

          step("Выбираем первую дату и переходим ко второй дате", () ->
                  calendarOkButton.click());

          step("Проверяем, что второй календарь открылся", () ->
                  calendarWidgetHeader.shouldHave(text(calendarHeaderToText)));

          step("Выбираем вторую дату и закрываем календарь", () ->
                  calendarOkButton.click());

          step("Проверяем, что введенные даты сохранились", () ->
                  calendarLink.shouldBe(visible));
    }
}



