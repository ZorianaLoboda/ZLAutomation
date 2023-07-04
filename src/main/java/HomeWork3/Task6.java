package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/");
        driver.findElement(By.xpath("//a[contains(text(), 'Українська')]")).click();
        System.out.println(driver.findElement(By.xpath("//p[@class='banner-meta__name' and not(normalize-space()='Онлайн')]")).getText());
        Thread.sleep(4000);
        driver.quit();
    }
}
