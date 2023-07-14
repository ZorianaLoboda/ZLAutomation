package HomeWork6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/zorianaloboda/Desktop/apache-maven-3.9.3/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("https://www.guinnessworldrecords.com/account/register?");
        searchInput.submit();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.guinnessworldrecords.com/account/register']")));
        WebElement registerLink = driver.findElement(By.xpath("//a[@href='https://www.guinnessworldrecords.com/account/register']"));

        String linkUrl = registerLink.getAttribute("href"); //URL елемента
        String script = "window.open('" + linkUrl + "', '_blank')";//нове вікно в фоновому режимі з URL
        ((JavascriptExecutor) driver).executeScript(script);

        driver.switchTo().window(driver.getWindowHandle()); //назад на сторінку пошуку
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement search = driver.findElement(By.name("q"));
        search.clear();
        search.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        search.sendKeys(Keys.ENTER);

        WebElement alertsLink = driver.findElement(By.xpath("//a[@href='https://www.hyrtutorials.com/p/alertsdemo.html']"));
        String alertslinkUrl = alertsLink.getAttribute("href"); //URL елемента
        String newscript = "window.open('" + alertslinkUrl + "', '_blank')";//нове вікно в фоновому режимі з URL
        ((JavascriptExecutor) driver).executeScript(newscript);
        driver.switchTo().window(driver.getWindowHandle());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

        driver.switchTo().frame("iframeResult");// переключитись на фрейм
        WebElement inputName = driver.findElement(By.id("fname"));
        inputName.clear();
        inputName.sendKeys("Zoriana");
        WebElement inputSurname = driver.findElement(By.id("lname"));
        inputSurname.clear();
        inputSurname.sendKeys("Loboda");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.switchTo().defaultContent(); // назад на основний фрейм
        driver.switchTo().frame("iframeResult");
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/p")).getText());
        driver.switchTo().defaultContent();

        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.findElement(By.id("LastName")).sendKeys("Loboda");
        driver.findElement(By.id("FirstName")).sendKeys("Zoriana");
        driver.findElement(By.id("DateOfBirthDay")).sendKeys("01");
        driver.findElement(By.id("DateOfBirthMonth")).sendKeys("02");
        driver.findElement(By.id("DateOfBirthYear")).sendKeys("1994");
        WebElement country = driver.findElement(By.id("Country"));
        Select countrySelect = new Select(country);
        countrySelect.selectByValue("UA");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("State")).sendKeys("Lviv");
        driver.findElement(By.id("EmailAddress")).sendKeys("email@email.ua");
        driver.findElement(By.id("ConfirmEmailAddress")).sendKeys("email@email.ua");
        driver.findElement(By.id("Password")).sendKeys("12345678");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456" + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println(driver.findElement(By.xpath("//span[@for='ConfirmPassword']")).getText());


        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/alertsdemo.html?")) {
                break;
            }
        }

        driver.findElement(By.id("alertBox")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait5.until(ExpectedConditions.visibilityOfElementLocated(By.id("output")));
        WebElement outputElement = driver.findElement(By.id("output"));
        String outputText = outputElement.getText();
        System.out.println(outputText);

        driver.findElement(By.id("confirmBox")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait6.until(ExpectedConditions.visibilityOfElementLocated(By.id("output")));
        WebElement outputElement2 = driver.findElement(By.id("output"));
        String outputText2 = outputElement.getText();
        System.out.println(outputText2);

        driver.findElement(By.id("promptBox")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("Final step of this task");
        alert2.accept();
        WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait7.until(ExpectedConditions.visibilityOfElementLocated(By.id("output")));
        WebElement outputElement3 = driver.findElement(By.id("output"));
        String outputText3 = outputElement.getText();
        System.out.println(outputText3);
        driver.quit();
    }
}
