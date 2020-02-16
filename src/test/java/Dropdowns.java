import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdowns {
    @Test
    public void dropdown1(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/dropdown");
        browser.findElement(By.id("dropdown")).click();

        WebElement element1 = browser.findElement(By.id("dropdown"));
        new Select(element1).selectByValue("1");
        element1.isSelected();
        System.out.println(element1.isSelected());
        //Почему false?

        WebElement element2 = browser.findElement(By.id("dropdown"));
        new Select(element2).selectByValue("2");
        element2.isSelected();
        System.out.println(element2.isSelected());

        browser.quit();

        //Тест не падает, но не работает


    }
}
