package TestCasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lesson_13_5_tests {

        @Test
    public static void test_1_only_incorrect_email() {
    // Проверяем работу логин формы при попытке отправить только не рабочий email
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/");

        Actions actions = new Actions(driver);

        WebElement mail_element = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement login_button = driver.findElement(By.xpath(
                "//*[@class='button-set']//button[@value='Login']"));

        actions.click(mail_element).perform();

        actions.sendKeys("Wrong mail").perform();

        actions.click(login_button).perform();
        WebElement login_notice_errors = driver.findElement(By.xpath(
                "//*[text()=' You must provide both email address and password.']"));
        assert driver.getCurrentUrl().equals("https://litecart.stqa.ru/en/login");
        assert login_notice_errors.getText().equals("You must provide both email address and password.");


        driver.quit();
    }

    @Test
    public static void test_2_add_to_cart_test() {
    // Проверяем работу функции "добавить в корзину"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/yellow-duck-p-1");

        WebElement add_to_cart = driver.findElement(By.xpath(
                "//button[@type='submit'][@value='Add To Cart']"));
        WebElement select_size = driver.findElement(By.xpath(
                "//select[@name='options[Size]']"
        ));

        select_size.click();
        WebElement select_small = driver.findElement(By.xpath(
                "//select[@name='options[Size]']//*[@value='Small']"
        ));
        select_small.click();
        add_to_cart.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement quantity_in_cart = driver.findElement(By.xpath(
                "//*[@href='https://litecart.stqa.ru/en/checkout'][@class='content']"
        ));

        assert quantity_in_cart.getText().equals("Cart:\n" + "1 item(s) - $18"); // Проверяем что добавился 1 товар.
        driver.quit();
    }

    @Test
    public static void test_3_most_popular_red_duck() {
    // Проверяем работу плитки из раздела "most popular"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/");

        WebElement most_popular_red_duck = driver.findElement(By.xpath(
                "//div[@id='box-most-popular']//a[@title='Red Duck']//span[@class='price']"));

        most_popular_red_duck.click();

        WebElement acme_corp_logo = driver.findElement(By.xpath(
                "//*[@title='ACME Corp.']"
        ));

        assert driver.getCurrentUrl().equals("https://litecart.stqa.ru/en/rubber-ducks-c-1/red-duck-p-3");
        assert acme_corp_logo.getAttribute("title").equals("ACME Corp.");
        WebElement information_tab = driver.findElement(By.xpath("//a[@href='#tab-information']"));
        assert information_tab.getText().equals("Information");


        driver.quit();
    }
    @Test
    public static void test_4_catalog_work() {
    // Тест работы кнопки "catalog"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/");

        WebElement catalog = driver.findElement(By.xpath(
                "//aside[@id='navigation']//a[text()='Rubber Ducks']"));

        catalog.click();
        assert driver.getCurrentUrl().equals("https://litecart.stqa.ru/en/rubber-ducks-c-1/");

        WebElement active_button = driver.findElement(By.xpath(
                "//*[@class='button active']"));
        assert active_button.getText().equals("Price");

        WebElement subcategory_button = driver.findElement(By.xpath(
                "//*[@class='list-vertical']//*[@class='category-2']//a"));
        assert subcategory_button.isDisplayed();

        driver.quit();
    }

    @Test
    public static void test_5_search_bar_work() {
    // Тест работы строки поиска
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://litecart.stqa.ru/en/");
        Actions actions = new Actions(driver);

        WebElement search_field = driver.findElement(By.xpath(
                "//input[@type = 'search']"));

        search_field.click();
        actions.sendKeys("Green Duck").sendKeys(Keys.ENTER).perform();

        WebElement subcategory_button = driver.findElement(By.xpath(
                "//*[@class='category-2 active']"));

        assert subcategory_button.isDisplayed();

        WebElement green_duck_pege_title = driver.findElement(By.xpath(
                "//h1[@class='title']"));
        assert green_duck_pege_title.getAccessibleName().equals("Green Duck");

        WebElement product_code = driver.findElement(By.xpath(
                "//div[@class='codes']//*"));
        assert product_code.getText().equals("RD002");
        driver.quit();
    }
}
