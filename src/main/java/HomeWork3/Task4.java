package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        driver.get("https://uhomki.com.ua/koshki/1074/");

        actions.moveToElement(driver.findElement(By.linkText("Рыбы"))).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'Аквариумы')]")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
