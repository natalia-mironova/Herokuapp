import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ARROW_UP;
import static org.testng.Assert.assertEquals;

/*
Проверить на возможность ввести различные цифровые и нецифровые значения, используя Keys.ARROW_UP  И Keys.ARROW_DOWN
 */
public class Inputs extends BeforeAfter {

    protected void up() {
        browser.findElement(By.cssSelector("input[type='number']")).sendKeys(ARROW_UP);
    }

    protected void down() {
        browser.findElement(By.cssSelector("input[type='number']")).sendKeys(ARROW_DOWN);
    }

    @Test
    public void input() {
        browser.get("http://the-internet.herokuapp.com/inputs");
        WebElement element = browser.findElement(By.cssSelector("input[type='number']"));
        element.click();
        up();
        up();
        down();
        String inputValue = browser.findElement(By.cssSelector("input[type='number']")).getAttribute("value");
        assertEquals(inputValue, "1", "Введено не 1");

    }
}
