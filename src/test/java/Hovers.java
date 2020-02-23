import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/*
Сделать цепочку из действий: наведение на профиль, проверка имени, клик по ссылке, проверка 404 ошибки.
Повторить для каждого из профилей. Использовать класс Actions и
https://stackoverflow.com/questions/17293914/how-to-perform-mouseover-function-in-selenium-webdriver-using-java
 */
public class Hovers extends BeforeAfter {

    @Test
    public void hover1() {
        browser.get("http://the-internet.herokuapp.com/hovers");

        // ПЕРВЫЙ ПРОФИЛЬ
        //Hover
        Actions builder = new Actions(browser);
        Action mouseover1 = builder.moveToElement(browser.findElement(By.cssSelector(".example .figure:nth-child(3) [alt]"))).build();
        mouseover1.perform();

        //Проверка, сработал ли hover
        WebElement userIsHovered1 = browser.findElement(By.cssSelector(".example .figure:nth-child(3) h5"));
        assertTrue(userIsHovered1.getText().contains("name: user1"), "Не наведено");

        //Проверка имени
        String user1 = browser.findElement(By.cssSelector(".example .figure:nth-child(3) h5")).getText();
        assertEquals(user1, "name: user1", "Вы навели не на user1");

        //Click по ссылке
        WebElement link1 = browser.findElement(By.cssSelector("[href='\\/users\\/1']"));
        link1.click();

        //Проверка 404
        String newPage1 = browser.findElement(By.xpath("/html//h1[.='Not Found']")).getText();
        assertEquals(newPage1, "Not Found", "Нет такого текста на странице");

    }

    @Test
    public void hover2() {
        browser.get("http://the-internet.herokuapp.com/hovers");
        // ВТОРОЙ ПРОФИЛЬ
        Actions builder = new Actions(browser);
        Action mouseover2 = builder.moveToElement(browser.findElement(By.cssSelector(".example .figure:nth-child(4) [alt]"))).build();
        mouseover2.perform();

        WebElement userIsHovered2 = browser.findElement(By.cssSelector(".example .figure:nth-child(4) h5"));
        assertTrue(userIsHovered2.getText().contains("name: user2"), "Не наведено");

        String user2 = browser.findElement(By.cssSelector(".example .figure:nth-child(4) h5")).getText();
        assertEquals(user2, "name: user2", "Вы навели не на user2");

        WebElement link2 = browser.findElement(By.cssSelector("[href='\\/users\\/2']"));
        link2.click();

        String newPage2 = browser.findElement(By.xpath("/html//h1[.='Not Found']")).getText();
        assertEquals(newPage2, "Not Found", "Нет такого текста на странице");

    }

    @Test
    public void hover3() {
        browser.get("http://the-internet.herokuapp.com/hovers");
        // ТРЕТИЙ ПРОФИЛЬ
        Actions builder = new Actions(browser);
        Action mouseover2 = builder.moveToElement(browser.findElement(By.cssSelector(".example .figure:nth-child(5) [alt]"))).build();
        mouseover2.perform();

        WebElement userIsHovered2 = browser.findElement(By.cssSelector(".example .figure:nth-child(5) h5"));
        assertTrue(userIsHovered2.getText().contains("name: user3"), "Не наведено");

        String user2 = browser.findElement(By.cssSelector(".example .figure:nth-child(5) h5")).getText();
        assertEquals(user2, "name: user3", "Вы навели не на user3");

        WebElement link2 = browser.findElement(By.cssSelector("[href='\\/users\\/3']"));
        link2.click();

        String newPage2 = browser.findElement(By.xpath("/html//h1[.='Not Found']")).getText();
        assertEquals(newPage2, "Not Found", "Нет такого текста на странице");

    }
}
