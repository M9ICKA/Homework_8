package TestCasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;


public class Lesson_12_Selenium {
    @Test
    public static void Selenium_test_register() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://godville.net/");

        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.xpath(
                "//*[@class='additional']//*[@href='/login/register']"));
        actions.click(element).perform();
        element = driver.findElement(By.xpath("//*[text()='Имя бога:']"));

        assert driver.getCurrentUrl().equals("https://godville.net/login/register");

        assert element.getText().equals("Имя бога:");

        element = driver.findElement(By.xpath("//*[text()='Я буду:']"));

        assert element.getText().equals("Я буду:");

        driver.quit();
    }

    @Test
    public static void Selenium_test_I_want_to_become_a_god() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://godville.net/");

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(
                By.xpath("//div[@class='wellcome clearfix']//*[@class='go']"));

        actions.click(element).perform();
        element = driver.findElement(By.xpath("//div[text()='Кто вы?']"));

        assert driver.getCurrentUrl().equals("https://godville.net/login/register");
        assert element.getText().equals("Кто вы?");
        element = driver.findElement(
                By.xpath("//div[@class='h_cell']//div[@class='h_capt' and text()='Кто ваш герой?']"));
        assert element.getText().equals("Кто ваш герой?");

        driver.quit();
    }

    @Test
    public static void Selenium_test_forgot_password() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://godville.net/");

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='reset_pwd_toggle']"));

        actions.click(element);

        assert driver.getCurrentUrl().equals("https://godville.net/");

        element = driver.findElement(By.xpath("//div[@id='pwd_reset_submit_wrap']//*"));

        assert element.getAttribute("value").equals("Напомнить");
        element = driver.findElement(By.xpath(
                "//*[@class='rc-anchor-center-item rc-anchor-checkbox-label']//*"));
        System.out.println(element.getText());
        driver.quit();
    }
}
