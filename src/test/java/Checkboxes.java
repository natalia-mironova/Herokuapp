import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
Checkboxes - проверить, что первый чекбокс unchecked,
отметить первый чекбокс, проверить что он checked.
Проверить, что второй чекбокс checked, сделать unheck, проверить, что он unchecked
 */

public class Checkboxes {
    @Test
    public void isUnchecked(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/checkboxes");

        //первый чекбокс
        WebElement checkbox1 = browser.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkbox1.isSelected());
        checkbox1.click();
        System.out.println(checkbox1.isSelected());

        //второй чекбокс не знаю, как найти
        List<WebElement> checkboxes = browser.findElements(By.xpath("//input[@type='checkbox']"));


        browser.quit();



    }
}
