package HomeWork5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://www.ashortjourney.com/");

        Thread.sleep(10000);
        WebElement element = driver.findElement(By.cssSelector("circle:nth-child(7)"));
        WebElement targetElement = driver.findElement(By.cssSelector("circle:nth-child(4)"));
        // координати центра другого кола
        int targetX = targetElement.getLocation().getX() + targetElement.getSize().getWidth() / 2;
        int targetY = targetElement.getLocation().getY() + targetElement.getSize().getHeight() / 2;
        actions.clickAndHold(element).moveByOffset(targetX, targetY).perform();
        actions.release().perform();
        Thread.sleep(6000);

        WebElement element1 = driver.findElement(By.cssSelector("circle:nth-child(7)"));
        WebElement targetElement1 = driver.findElement(By.cssSelector("circle:nth-child(4)"));
        int targetX1 = targetElement1.getLocation().getX() - element1.getLocation().getX();
        int targetY1 = targetElement1.getLocation().getY() - element1.getLocation().getY();
        actions.clickAndHold(element1).moveByOffset(targetX1, targetY1).perform();
        actions.release().perform();
        Thread.sleep(6000);

        WebElement element2 = driver.findElement(By.cssSelector("circle:nth-child(7)"));
        WebElement targetElement2 = driver.findElement(By.cssSelector("circle:nth-child(4)"));
        int targetX2 = targetElement2.getLocation().getX() - element2.getLocation().getX();
        int targetY2 = targetElement2.getLocation().getY() - element2.getLocation().getY();
        actions.clickAndHold(element2).moveByOffset(targetX2, targetY2).perform();
        actions.release().perform();
        Thread.sleep(6000);

        WebElement element3 = driver.findElement(By.cssSelector("circle:nth-child(7)"));
        WebElement targetElement3 = driver.findElement(By.cssSelector("circle:nth-child(4)"));
        actions.clickAndHold(element3).moveToElement(targetElement3).perform();
        actions.release().perform();
        Thread.sleep(6000);

        WebElement element4 = driver.findElement(By.cssSelector("circle:nth-child(7)"));
        WebElement targetElement4 = driver.findElement(By.cssSelector("circle:nth-child(4)"));
        actions.clickAndHold(element4).moveToElement(targetElement4).perform();
        actions.release().perform();
        Thread.sleep(6000);

        WebElement element5 = driver.findElement(By.cssSelector("circle:nth-child(7)"));
        WebElement targetElement5 = driver.findElement(By.cssSelector("circle:nth-child(4)"));
        actions.clickAndHold(element5).moveToElement(targetElement5).perform();
        actions.release().perform();
        Thread.sleep(6000);

        WebElement element6 = driver.findElement(By.cssSelector("circle:nth-child(7)"));
        WebElement targetElement6 = driver.findElement(By.cssSelector("circle:nth-child(4)"));
        actions.clickAndHold(element6).moveToElement(targetElement6).perform();
        actions.release().perform();
        Thread.sleep(8000);
        WebElement card = driver.findElement(By.cssSelector("#postcard-back-content > textarea"));
        card.sendKeys("Завдання виконано!");
        Thread.sleep(3000);
        driver.quit();
    }
}
