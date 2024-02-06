package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class RubberDucksOpeningOfTheSite {
    @Test
    public static void seleniunTests() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement siteMenu = driver.findElement(xpath(".//nav[@id='site-menu']/ul/li[@class= 'category-1']"));
        WebElement siteMenuSub = driver.findElement(xpath
                (".//nav[@id='site-menu']/ul/li[@class= 'category-1']/ul/li[@class= 'category-2']"));
        Actions mouseAction = new Actions(driver);
        mouseAction.moveToElement(siteMenu).pause(1000).perform();
        mouseAction.moveToElement(siteMenuSub).pause(1000).click().perform();
        String pagetitle = driver.getTitle();
        assert pagetitle.equals("Subcategory | My Store");
        WebElement listWertikal = driver.findElement(xpath(".//*[@class = 'category-2 active']/a"));
        assert listWertikal.getText().equals("Subcategory");
        String listHorizontal = driver.findElement(xpath(".//*[@class = 'list-horizontal']")).getText();
        System.out.println(listHorizontal);
        assert listHorizontal.endsWith("» Subcategory");
        driver.quit();
    }
}

