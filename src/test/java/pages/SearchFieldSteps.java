package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.invoiceSearchText;

public class SearchFieldSteps {
    private final SelenideElement
            searchStartAction = $(MobileBy.id("ru.nrg_tk.mobileclient:id/action_search")),
            invoiceSearchArea = $(MobileBy.id("ru.nrg_tk.mobileclient:id/search_src_text"));

    public SearchFieldSteps checkInvoiceSearchField() {
        step("Открываем поле поиска накладной", () ->
                searchStartAction.click());
        return this;
    }

    public SearchFieldSteps checkInvoiceSearchText() {
        step("Проверяем, что поле поиска накладной активно", () ->
                invoiceSearchArea.shouldHave(text(invoiceSearchText)));
        return this;
    }
}
