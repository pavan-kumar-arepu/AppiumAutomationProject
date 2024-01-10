
//package org.appium.first;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {

    public static AppiumDriver initializeDriver(String platform) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", platform);
        caps.setCapability("newCommandTimeout", 300);
        
        AppiumDriver driver = null;

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        switch (platform) {
            case "Android":
                caps.setCapability("platformName", platform);
                caps.setCapability("deviceName", "Pixel_5_API_33");
                caps.setCapability("automationName", "UiAutomator2");
                caps.setCapability("udid", "emulator-5554");
//                String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
//                        + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";

                caps.setCapability("appPackage", "io.appium.android.apis");
                caps.setCapability("appActivity", "io.appium.android.ApiDemos");

//                caps.setCapability("app", appUrl);

                driver = new AndroidDriver(url, caps);

            case "iOS":
                caps.setCapability("deviceName", "iPhone 14 - iOS 16.2");
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("udid", "272DE056-263C-4149-8D13-6D871900ACBF");
                String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "FlagHoisting.app";
                caps.setCapability("simulatorStartupTimeout", 180000);
                caps.setCapability("app", appUrl);
                driver =  new IOSDriver(url, caps);
        }
        return driver;
    }
}