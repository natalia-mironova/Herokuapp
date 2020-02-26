import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class AddRemoveElement extends BeforeAfter {
    @Test
    public void addElement() {

        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement buttonAdd = browser.findElement(By.xpath("//button[text()='Add Element']"));
        buttonAdd.click();
        buttonAdd.click();
        WebElement buttonDelete = browser.findElement(By.className("added-manually"));
        buttonDelete.click();

        List<WebElement> elements = browser.findElements(By.className("added-manually"));
        assertEquals(elements.size(), 1, "Должна остаться 1 кнопка DELETE");

        buttonAdd.click();
        elements = browser.findElements(By.className("added-manually"));
        assertEquals(elements.size(), 2, "Должна быть 2 кнопки DELETE");

    }

}
