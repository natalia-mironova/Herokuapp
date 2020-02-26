import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
кликнуть на кнопку, дождаться появления нотификации, проверить соответствие текста ожиданиям
 */
public class Notifications extends BeforeAfter {
    @Test
    public void notification() {

        browser.get("http://the-internet.herokuapp.com/notification_message_rendered");
        browser.findElement(By.linkText("Click here")).click();

        String message = browser.findElement(By.id("flash-messages")).getText();
        assertEquals(message, "Action successful\n" + "×", "в тексте сейчас что-то другое");
        //или assertEquals(message, "Action unsuccessful, please try again\n" + "×", "в тексте сейчас что-то другое");

    }
}
