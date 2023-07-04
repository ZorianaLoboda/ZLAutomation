package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        Actions actions = new Actions(driver);

        //кнопка 1
        //Thread.sleep(2000);
        //actions.moveToElement(driver.findElement(By.cssSelector("span._wtDownloadButton_y7414 a[data-test='dropdown-button-link']"))).perform();
        //Thread.sleep(4000);
        //driver.quit();

        //кнопка 2
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.cssSelector("#download-block > section:nth-child(3) div.wt-css-content-switcher:nth-child(3)"))).perform();
        Thread.sleep(4000);
        driver.quit();
    }
}
