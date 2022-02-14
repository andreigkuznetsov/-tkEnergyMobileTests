package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/browserstack.properties"
})
public interface BrowserStackConfig extends Config {
    @Key("browserStackURL")
    String browserStackURL();

    @Key("browserStackVideoURL")
    String browserStackVideoURL();

    @Key("browserStackUsername")
    String browserStackUsername();

    @Key("browserStackPassword")
    String browserStackPassword();

    @Key("app")
    String app();

    @Key("device")
    String device();

    @Key("osVersion")
    String os_version();
}





