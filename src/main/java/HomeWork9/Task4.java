package HomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.annotations.Test;


import static org.junit.Assert.assertTrue;

public class Task4 {
    static WebDriver driver;

    @BeforeClass
    public void prepare() {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.foxtrot.com.ua/");
    }

    @DataProvider(name = "searchData")
    public Object[][] provideSearchData() {
        return new Object[][] {
                {"Машина", "Машина", "//div/h1"}, // успішний пошук "//div/h1"
                {"Input", "Input", "//div/h1"}, // успішний пошук "//div/h1"
                {"Смисл", "Смисл", "//div[3]/div//div//div/div[1]/div[1]/label"} // неуспішний пошук "//div[3]/div//div//div/div[1]/div[1]/label"
        };
    }

    @Test(dataProvider = "searchData")
    public void checkSearch(String query, String expectedText, String elementXPath) {
        assertTrue(driver.findElement(By.xpath("//div[2]/input[1]")).isDisplayed());
        WebElement search = driver.findElement(By.xpath("//div[2]/input[1]"));
        search.sendKeys(query);
        search.sendKeys(Keys.ENTER);
        WebElement resultElement = driver.findElement(By.xpath(elementXPath));
        String resultText = resultElement.getText();
        assertTrue(resultText.contains(expectedText));
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}

