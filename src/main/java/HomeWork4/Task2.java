package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoo.kiev.ua/");

        WebElement element1 = driver.findElement(By.id("header"));
        WebElement element2 = driver.findElement(By.id("main"));

        // отримання розмірів
        int height1 = element1.getSize().getHeight();
        int width1 = element1.getSize().getWidth();
        int height2 = element2.getSize().getHeight();
        int width2 = element2.getSize().getWidth();

        // отримання позицій
        int top1 = element1.getLocation().getY();
        int top2 = element2.getLocation().getY();
        int left1 = element1.getLocation().getX();
        int left2 = element2.getLocation().getX();

        if (top1 < top2) {
            System.out.println("Елемент " + element1 + " розташовується вище за елемент " + element2);
        } else {
            System.out.println("Елемент " + element2 + " розташовується вище за елемент " + element1);
        }

        if (left1 < left2) {
            System.out.println("Елемент " + element1 + " розташовується ліворуч від елемента " + element2);
        } else {
            System.out.println("Елемент " + element2 + " розташовується ліворуч від елемента " + element1);
        }

        // порівняння площ
        int area1 = height1 * width1;
        int area2 = height2 * width2;

        if (area1 > area2) {
            System.out.println("Елемент " + element1 + " займає більшу площу, ніж елемент " + element2);
        } else if (area2 > area1) {
            System.out.println("Елемент " + element2 + " займає більшу площу, ніж елемент " + element1);
        } else {
            System.out.println("Елементи " + element1 + " і " + element2 + " займають однакову площу");
        }

        driver.quit();
    }
}
