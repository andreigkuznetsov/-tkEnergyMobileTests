package config;

import org.aeonbits.owner.ConfigFactory;

public class ProjectData {
    public static final BrowserStackConfig browserStackConfig =
            ConfigFactory.create(BrowserStackConfig.class, System.getProperties());
    public static final EmulationConfig emulationConfig =
            ConfigFactory.create(EmulationConfig.class, System.getProperties());
    public static final RealConfig realConfig =
            ConfigFactory.create(RealConfig.class, System.getProperties());
    public static final SelenoidConfig selenoidConfig =
            ConfigFactory.create(SelenoidConfig.class, System.getProperties());
    public static final DeviceHostConfig deviceHostConfig =
            ConfigFactory.create(DeviceHostConfig.class, System.getProperties());

    public static DeviceHost deviceHost() {
        return DeviceHost.valueOf(deviceHostConfig.deviceHost().toUpperCase());
    }
}
