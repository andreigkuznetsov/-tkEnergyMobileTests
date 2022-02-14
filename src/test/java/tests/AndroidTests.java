package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AndroidTests extends TestBase {

    @Test
    @DisplayName("Тестирование мобильного приложения ТК Энергия")
    void checkContentTest() {
            AppScreens.checkForgetPassLink()
                    .checkForgetPassScreen()
                    .returnToMainScreen()
                    .checkRegistrationLink()
                    .checkRegistrationScreen()
                    .returnToMainScreen();

    }

}
