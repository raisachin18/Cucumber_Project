package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import java.time.Duration;

public class config {
    public static WebDriver driver;

    public static WebDriver setupBrowser(String driverType) {
        if (driverType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("safari")) {
            SafariOptions options = new SafariOptions();
            options.setUseTechnologyPreview(true);
            driver = new SafariDriver(options);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
