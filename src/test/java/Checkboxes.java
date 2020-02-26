import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Checkboxes extends BeforeAfter {
    @Test
    public void isUnchecked() {

        browser.get("http://the-internet.herokuapp.com/checkboxes");

        //первый чекбокс
        WebElement checkbox1 = browser.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
        assertFalse(checkbox1.isSelected(), "чекбокс1 выбран, но не должен быть");
        checkbox1.click();
        assertTrue(checkbox1.isSelected(), "чекбокс1 не выбран, но должен быть выбран");

        //второй чекбокс
        WebElement checkbox2 = browser.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
        assertTrue(checkbox2.isSelected(), "чекбокс2 не выбран");
        checkbox2.click();
        assertFalse(checkbox2.isSelected(), "чекбокс2 почему-то выбран, но не должен");

    }

}
