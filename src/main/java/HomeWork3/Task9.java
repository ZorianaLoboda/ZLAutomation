package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.jetbrains.com/idea/");

        Thread.sleep(2000);
        driver.findElement(By.xpath( "//a[@class = 'wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary']")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
