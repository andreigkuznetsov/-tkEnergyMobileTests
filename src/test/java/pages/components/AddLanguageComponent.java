package pages.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class AddLanguageComponent {

    private SelenideElement addOrEditLangButton = $(MobileBy.id("org.wikipedia.alpha:id/addLangContainer")),
            editLangButton = $(byClassName("android.widget.ImageView")),
            activateSearchButton = $(MobileBy.id("org.wikipedia.alpha:id/menu_search_language")),
            typeTheSearchWord = $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")),
            foundTheLanguage = $(MobileBy.id("org.wikipedia.alpha:id/language_subtitle")),
            returnToMainScreenButton = $(byClassName("android.widget.ImageButton"));

    private ElementsCollection
            listOfInstalledLanguages = $$(MobileBy.id("org.wikipedia.alpha:id/option_label"));

    public void setRuLang(String RuLang) {
        step("Открываем экран добавления или редактирования языков", () ->
                addOrEditLangButton.click());

        step("Открываем экран добавления языков", () ->
                editLangButton.click());

        step("Переходим в поле поиска нового языка", () ->
                activateSearchButton.click());

        step("Вводим в поле поиска Russian", () ->
                typeTheSearchWord.sendKeys(RuLang));

        step("Выбираем в результатах поиска русский язык", () ->
                foundTheLanguage.click());

        step("Возвращаемся на основной экран", () ->
                returnToMainScreenButton.click());

        step("Проверяем, что отображаются английский и русский языки", () ->
                listOfInstalledLanguages.shouldHave(texts("1.\t\tEnglish", "2.\t\tРусский")));
    }
}
