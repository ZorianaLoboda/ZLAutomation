package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoo.kiev.ua/");

        WebElement element = driver.findElement(By.id("header"));
        printElementInfo(element);

        driver.quit();
    }

    public static void printElementInfo(WebElement element) {

        String elementId = element.getAttribute("id");
        String elementTag = element.getTagName();
        String elementClass = element.getAttribute("class");
        String elementName = element.getAttribute("name");
        String elementText = element.getText();

        // координати
        int centerX = element.getLocation().getX() + element.getSize().getWidth() / 2;
        int centerY = element.getLocation().getY() + element.getSize().getHeight() / 2;


        System.out.println("ID: " + elementId);
        System.out.println("Тег: " + elementTag);
        System.out.println("Клас: " + elementClass);
        System.out.println("Атрибут name: " + elementName);
        System.out.println("Текст: " + elementText);
        System.out.println("Координати центра контейнера элемента: X=" + centerX + ", Y=" + centerY);
    }
}
