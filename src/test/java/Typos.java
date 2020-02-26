import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
/*
Проверить соответствие параграфа орфографии
 */

public class Typos extends BeforeAfter {
    @Test
    public void typos() {
        browser.get("http://the-internet.herokuapp.com/typos");

        String typo = browser.findElement(By.cssSelector(".example p:nth-child(3)")).getText();
        assertEquals(typo, "Sometimes you'll see a typo, other times you won't.", "Сейчас в тексте ошибка");
    }
}
