
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.AppiumDriver;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
public class CreateDriverSessionUsingOptions {

    public static void main(String[] args) throws MalformedURLException {

      /*
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "FlagHoisting.app";
        XCUITestOptions options = new XCUITestOptions().
                setDeviceName("iPhone 14 - iOS 16.2").
                setAutomationName("XCUITest").
                setUdid("272DE056-263C-4149-8D13-6D871900ACBF").
                setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new IOSDriver(url, options);
*/


      String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("Pixel_5_API_33").
                setAutomationName("UiAutomator2").
                setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new AndroidDriver(url, options);
    }
}