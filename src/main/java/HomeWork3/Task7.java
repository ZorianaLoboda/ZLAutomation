package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/");
        Actions actions = new Actions(driver);

         /*//перший
        driver.findElement(By.id("loginactioncontainer")).click();
        driver.findElement(By.id("modalusername")).sendKeys("Zoriana");
        Thread.sleep(2000);
        driver.quit();

        //другий
        driver.findElement(By.id("signupbtn_topnav")).click();
        driver.quit();

         //третій
        actions.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).perform();
        Thread.sleep(2000);
        driver.quit();

         //четвертий
        String text = driver.findElement(By.id("myLearningFromDefault")).getText();
        System.out.println("Текст елемента: " + text);
        driver.quit();

         //п'ятий
        WebElement link = driver.findElement(By.id("navbtn_certified"));
        String href = link.getAttribute("href");
        System.out.println("Значення атрибута href: " + href);
        driver.quit();
          */
    }
}
