import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/*
кликнуть на кнопку, дождаться появления нотификации, проверить соответствие текста ожиданиям
 */
public class Notifications {
    @Test
    public void notification(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/notification_message_rendered");
        browser.findElement(By.linkText("Click here")).click();

        String message = browser.findElement(By.id("flash-messages")).getText();
        System.out.println(message);
        assertEquals(message, "Action unsuccesful, please try again\n" + "×", "в тексте сейчас что-то другое");

        browser.quit();

        //Непонятно как проверять результат
    }
}
