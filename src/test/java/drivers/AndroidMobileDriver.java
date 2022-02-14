package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.DeviceHost;
import helpers.EmulationHelper;
import helpers.BrowserStackHelper;
import helpers.RealHelper;
import helpers.SelenoidHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;

import java.net.MalformedURLException;
import java.net.URL;

import static config.ProjectData.*;
import static utils.FileUtils.getAbsolutePath;

public class AndroidMobileDriver implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        if (deviceHost().equals(DeviceHost.BROWSERSTACK)) {
            return getBrowserStackMobileDriver(desiredCapabilities);
        }

        if (deviceHost().equals(DeviceHost.EMULATION)) {
            return getEmulationMobileDriver(desiredCapabilities);
        }

        if (deviceHost().equals(DeviceHost.REAL)) {
            return getRealMobileDriver(desiredCapabilities);
        }

        return getSelenoidMobileDriver(desiredCapabilities);
    }

    public AndroidDriver<WebElement> getEmulationMobileDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("platformName", emulationConfig.platformName());
        desiredCapabilities.setCapability("deviceName", emulationConfig.deviceName());
        desiredCapabilities.setCapability("version", emulationConfig.version());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "ru.nrg_tk.mobileclient");
        desiredCapabilities.setCapability("appActivity",
                "ru.nrg_tk.mobileclient.activities.SplashActivity");
        desiredCapabilities.setCapability("app", getAbsolutePath(emulationConfig.appURL()));

        return new AndroidDriver<>(EmulationHelper.getEmulationServerUrl(), desiredCapabilities);
    }

    public AndroidDriver<WebElement> getRealMobileDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("platformName", realConfig.platformName());
        desiredCapabilities.setCapability("deviceName", realConfig.deviceName());
        desiredCapabilities.setCapability("version", realConfig.version());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "ru.nrg_tk.mobileclient");
        desiredCapabilities.setCapability("appActivity",
                "ru.nrg_tk.mobileclient.activities.SplashActivity");
        desiredCapabilities.setCapability("app", getAbsolutePath(realConfig.appURL()));

        return new AndroidDriver<>(RealHelper.getRealServerUrl(), desiredCapabilities);
    }

    public AndroidDriver<WebElement> getBrowserStackMobileDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("browserstack.user", browserStackConfig.browserStackUsername());
        desiredCapabilities.setCapability("browserstack.key", browserStackConfig.browserStackPassword());

        desiredCapabilities.setCapability("project", "TK Energy Mobile Client Testing");
        desiredCapabilities.setCapability("build", "Android");
        desiredCapabilities.setCapability("name", "Java Android");
        desiredCapabilities.setCapability("autoGrantPermissions", "true");

        desiredCapabilities.setCapability("device", browserStackConfig.device());
        desiredCapabilities.setCapability("osVersion", browserStackConfig.os_version());
        desiredCapabilities.setCapability("app", browserStackConfig.app());

        return new AndroidDriver<>(BrowserStackHelper.getBrowserstackUrl(), desiredCapabilities);
    }

    public AndroidDriver<WebElement> getSelenoidMobileDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("platformName", selenoidConfig.platformName());
        desiredCapabilities.setCapability("deviceName", selenoidConfig.deviceName());
        desiredCapabilities.setCapability("version", selenoidConfig.version());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "ru.nrg_tk.mobileclient");
        desiredCapabilities.setCapability("appActivity",
                "ru.nrg_tk.mobileclient.activities.SplashActivity");
        desiredCapabilities.setCapability("app", selenoidConfig.appURL());

        desiredCapabilities.setCapability("enableVNC", true);
        desiredCapabilities.setCapability("enableVideo", true);

        return new AndroidDriver<>(SelenoidHelper.getSelenoidServerUrl(), desiredCapabilities);

    }

}
