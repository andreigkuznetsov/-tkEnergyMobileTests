package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/emulation.properties"
})
public interface EmulationConfig extends Config {
    @Key("emulationServerUrl")
    String emulationServerUrl();

    @Key("platformName")
    String platformName();

    @Key("deviceName")
    String deviceName();

    @Key("version")
    String version();

    @Key("appUrl")
    String appURL();
}



