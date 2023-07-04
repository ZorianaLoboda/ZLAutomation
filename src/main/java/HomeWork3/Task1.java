package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Task1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://uhomki.com.ua/koshki/1074/");


          // Локатор 1 з атрибутом className
       /* WebElement button1 = driver.findElement(By.className("userbar__button-text"));
        button1.click();
        Thread.sleep(4000);
        driver.quit();

        // Локатор 2 XPath з атрибутом "class"
        WebElement button2 = driver.findElement(By.xpath("//*[contains(@class, 'userbar__button-text')]"));
        button2.click();
        Thread.sleep(4000);
        driver.quit();

        // Локатор 3 з допомогою css selector
        WebElement button3 = driver.findElement(By.cssSelector("body > div.container > div.header > div > div.header__top > div > div > div.header__column.header__column--right > div:nth-child(4) > div > div > a > span") );
        button3.click();
        Thread.sleep(4000);
        driver.quit();

      // Локатор 4 з атрибутом linkText
        WebElement button4 = driver.findElement(By.linkText("Вход"));
        button4.click();
        Thread.sleep(4000);
        driver.quit();
        */
        }
    }


