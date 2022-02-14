package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/real.properties"
})
public interface RealConfig extends Config {
    @Config.Key("realServerUrl")
    String realServerUrl();

    @Config.Key("platformName")
    String platformName();

    @Config.Key("deviceName")
    String deviceName();

    @Config.Key("version")
    String version();

    @Config.Key("appUrl")
    String appURL();
}
