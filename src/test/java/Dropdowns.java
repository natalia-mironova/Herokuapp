import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
/*
Dropdown - Взять все элементы дроп-дауна и проверить их наличие.
Выбрать первый, проверить, что он выбран, выбрать второй, проверить, что он выбран
 */

public class Dropdowns extends BeforeAfter {
    @Test
    public void dropdown1() {
        browser.get("http://the-internet.herokuapp.com/dropdown");

        WebElement element = browser.findElement(By.id("dropdown"));

        Select option = new Select(element);
        option.selectByVisibleText("Option 1"); //по тексту Option 1
        option.selectByIndex(2); //по индексу Option2

        //как проверить, выбрана ли опция?

    }
}
