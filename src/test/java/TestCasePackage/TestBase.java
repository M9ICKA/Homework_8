package TestCasePackage;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static TestCasePackage.Browser.chrome;
import static TestCasePackage.Browser.edge;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    protected static WebDriver driver;
    @BeforeMethod
    public static void setup() {
        Browser browser = Browser.valueOf(System.getProperty("browser", chrome));
        driver = switch (browser) {
            case chrome -> new ChromeDriver();
            case edge -> new EdgeDriver();

        };
        Configuration.browser = System.getProperty("browser","chrome");
        Configuration.browserSize = "1920x1080";
        open("https://belhard.academy/");

    }
    @Test
    public static void browserTest() {

    }
}
