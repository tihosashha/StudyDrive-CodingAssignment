package base

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.After
import org.junit.Before
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.time.Duration

abstract class AbstractChromeWebDriverTest {

    protected lateinit var driver: WebDriver

    @Before
    fun beforeTest() {
        // Download the web driver executable
        WebDriverManager.chromedriver().setup()
        // Create an instance of your web driver - chrome
        driver = ChromeDriver()

        // Setup default wait timeout for element search
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
    }

    @After
    fun afterTest() {
        driver.quit()
    }
}