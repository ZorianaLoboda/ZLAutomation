package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/");
        driver.findElement(By.xpath("//a[contains(text(), 'Українська')]")).click();
        WebElement element = driver.findElement(By.xpath("//section[2]/div/ul/li[1]/p[1]/../../parent::div/div/ul/li[3]"));
        System.out.println("Текст элемента: " + element.getText());
        driver.quit();
    }
}
