package helpers;

import java.net.MalformedURLException;
import java.net.URL;

import static config.ProjectData.emulationConfig;

public class EmulationHelper {
    public static URL getEmulationServerUrl() {
        try {
            return new URL(emulationConfig.emulationServerUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
