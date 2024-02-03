package TestCasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class RubberDucksOpeningOfTheSite {
    @Test
    public static void seleniunTests() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://litecart.stqa.ru/en/create_account");

        WebElement siteMenu = driver.findElement(xpath(".//nav[@id='site-menu']/ul/li[@class= 'category-1']"));
        WebElement siteMenuSub = driver.findElement(xpath
                (".//nav[@id='site-menu']/ul/li[@class= 'category-1']/ul/li[@class= 'category-2']"));
        Actions mouseAction = new Actions(driver);
        mouseAction.moveToElement(siteMenu).perform();
        mouseAction.moveToElement(siteMenuSub).click().perform();
        String pagetitle = driver.getTitle();
        pagetitle.equals("Subcategory | My Store");
        WebElement listWertikal = driver.findElement(xpath(".//*[@class = 'category-2 active']/a"));
        listWertikal.getText().equals("Subcategory");
        System.out.println(driver.findElement(xpath(".//*[@class = 'list-horizontal']")).getText());
        String listHorizontal = driver.findElement(xpath(".//*[@class = 'list-horizontal']")).getText();
        listHorizontal.equals("Home » Categories » Rubber Ducks » Subcategory");
        driver.quit();
    }
}

