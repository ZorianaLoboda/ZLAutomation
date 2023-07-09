package HomeWork5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");

        WebElement cars = driver.findElement(By.id("Carlist"));
        Select carsSelect = new Select(cars);
        carsSelect.selectByValue("Renault Car");
        Thread.sleep(2000);

        Select countryList = new Select(driver.findElement(By.name("FromLB")));
        List<WebElement> countries = countryList.getOptions();
        countryList.selectByVisibleText("France");
        Thread.sleep(1000);
        countryList.selectByVisibleText("India");
        Thread.sleep(1000);
        countryList.deselectByVisibleText("India");
        Thread.sleep(1000);
        countryList.selectByVisibleText("Germany");
        Thread.sleep(1000);
        countryList.selectByVisibleText("Italy");
        Thread.sleep(1000);
        countryList.selectByVisibleText("Malaysia");
        Thread.sleep(1000);
        countryList.deselectByVisibleText("Malaysia");
        Thread.sleep(1000);
        countryList.selectByVisibleText("Spain");
        Thread.sleep(1000);
        countryList.deselectByIndex(0);

        driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();
        Thread.sleep(1000);

        Select chosencountryList = new Select(driver.findElement(By.name("ToLB")));


        System.out.println("Автомобілі доступні для вибору:");
        List<WebElement> carOptions = carsSelect.getOptions();
        for (WebElement carOption : carOptions) {
            System.out.println(carOption.getText());
        }

        System.out.println("Країни з першої таблиці:");
        List<WebElement> selectedCountryOptions = countryList.getOptions();
        for (WebElement selectedCountryOption : selectedCountryOptions) {
            System.out.println(selectedCountryOption.getText());
        }

        System.out.println("Країни з другої таблиці:");
        List<WebElement> deselectedCountryOptions = chosencountryList.getOptions();
        for (WebElement deselectedCountryOption : deselectedCountryOptions) {
            System.out.println(deselectedCountryOption.getText());
        }

        driver.quit();
    }
}
