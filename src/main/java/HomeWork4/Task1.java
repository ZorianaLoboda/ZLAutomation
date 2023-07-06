package HomeWork4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Массив ссылок
        String[] urls = {
                "https://uhomki.com.ua/ru/koshki/1074/",
                "https://zoo.kiev.ua/",
                "https://www.w3schools.com/",
                "https://taxi838.ua/ru/dnepr/",
                "https://klopotenko.com/"
        };

        List<String> windowHandles = new ArrayList<>();

        // відкрити перше посилання
        driver.get(urls[0]);

        String currentWindowHandle = driver.getWindowHandle();
        windowHandles.add(currentWindowHandle);


        for (int i = 1; i < urls.length; i++) {
            ((JavascriptExecutor) driver).executeScript("window.open('" + urls[i] + "')");
            Thread.sleep(1000);
            Set<String> handles = driver.getWindowHandles();
            handles.removeAll(windowHandles);
            String newWindowHandle = handles.iterator().next();
            windowHandles.add(newWindowHandle);
        }

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            String pageTitle = driver.getTitle();
            String pageUrl = driver.getCurrentUrl();
            System.out.println("Title: " + pageTitle);
            System.out.println("Url: " + pageUrl);

            if (pageTitle.toLowerCase().contains("зоопарк")) {
                driver.close();
            }
        }

        driver.quit();
    }
}
