package allyTest;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.deque.axe.AXE;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonTest {

    WebDriver driver;
    private static final URL scriptUrl = amazonTest.class.getResource("/axe.min.js");

    @BeforeMethod
    public void setup() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
    }
    @Test
    public void testAccessibilityOnAmazonPage() {
        JSONObject responseJson = new AXE.Builder(driver, scriptUrl).analyze();
        JSONArray violations = responseJson.getJSONArray("violations");
        
        if (violations.length() == 0) {
            System.out.println("No errors");
        } else {
            AXE.writeResults("amazonTest", responseJson);
            Assert.assertTrue(false, AXE.report(violations));
        }
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
