package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseSetup {
    public static WebDriver driver;


    public void startDriver() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
        Logger.getLogger("").setLevel(Level.OFF);
        driver = new ChromeDriver();
    }

    public void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void sleepFor(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
