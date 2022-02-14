package helpers;

import java.net.MalformedURLException;
import java.net.URL;

import static config.ProjectData.realConfig;

public class RealHelper {
    public static URL getRealServerUrl() {
        try {
            return new URL(realConfig.realServerUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
