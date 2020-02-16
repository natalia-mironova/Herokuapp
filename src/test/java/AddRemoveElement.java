import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddRemoveElement {
    @Test
    public void addElement(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement buttonAdd = browser.findElement(By.xpath("//button[text()='Add Element']"));
        buttonAdd.click();
        buttonAdd.click();
        WebElement buttonDelete = browser.findElement(By.xpath("//button[text()='Delete']"));
        buttonDelete.click();

        browser.quit();
        //        How to calculate number of elements?

    }

}
