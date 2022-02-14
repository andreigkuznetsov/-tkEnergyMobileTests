package config;

import org.aeonbits.owner.Config;

@Config.Sources({"system:properties"})
public interface DeviceHostConfig extends Config {

    @Key("deviceHost")
    @DefaultValue("local")
    String deviceHost();
}
