package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SwitchPrivateDataSendComponent {

    private SelenideElement switchView = $(MobileBy.id("org.wikipedia.alpha:id/switchView"));

    public void switchPrivateDataSend(String PrivateDataSend) {

        step("Выключаем анонимную передачу пользовательских данных", () ->
                switchView.click());

        step("Проверяем, что анонимная передача данных выключена", () ->
                switchView.shouldHave(text(PrivateDataSend)));
    }
}