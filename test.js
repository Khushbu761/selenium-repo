import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {
    public static void main(String[] args) {
        // Set path to Chrome driver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Configure ChromeOptions for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Initialize ChromeDriver with the configured options
        WebDriver driver = new ChromeDriver(options);

        // Your test code here

        // Close the browser
        driver.quit();
    }
}
