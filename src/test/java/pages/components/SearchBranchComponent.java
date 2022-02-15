package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.citiesText;

public class SearchBranchComponent {

    private SelenideElement    headerMoreScreensTextArea = $(MobileBy.id("ru.nrg_tk.mobileclient:id/action_bar")),
            searchStartAction = $(MobileBy.id("ru.nrg_tk.mobileclient:id/action_search")),
            citiesSearchButton = $(MobileBy.id("ru.nrg_tk.mobileclient:id/button_cities")),
            citiesSearchField = $(MobileBy.id("ru.nrg_tk.mobileclient:id/search_src_text")),
            citiesSearchResultField = $(MobileBy.id("ru.nrg_tk.mobileclient:id/recyclerView_Cities"));

      public void searchCity(String citySearchValue) {
        step("Открываем экран поиска филиалов", () ->
                citiesSearchButton.click());

        step("Проверяем, что открыт экран поиска филиалов", () ->
                headerMoreScreensTextArea.shouldHave(text(citiesText)));

        step("Открываем поле поиска городов", () ->
                searchStartAction.click());

        step("Выполняем поиск города", () ->
                citiesSearchField.sendKeys(citySearchValue));

        step("Проверяем, что результат поиска релевантен", () ->
                citiesSearchResultField.shouldHave(text(citySearchValue)));

    }
}
