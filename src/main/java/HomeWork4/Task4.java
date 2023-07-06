package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        driver.get("https://uhomki.com.ua/koshki/1074/");

        WebElement searchField = driver.findElement(By.className("search__input"));
        searchField.sendKeys("Тхір");
        Thread.sleep(2000);
        searchField.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(), 'Вітаміни Беафар ПАСТА')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'Порівняти')]")).click();
        Thread.sleep(2000);
        searchField = driver.findElement(By.className("search__input"));
        searchField.sendKeys("Ведмідь");
        Thread.sleep(2000);
        searchField.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(), 'Білий ведмідь')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'Порівняти')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("comparison-view__button-text")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".compare-close.j-close")).click();
        driver.quit();
    }
}
