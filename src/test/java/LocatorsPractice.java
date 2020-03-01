import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsPractice extends BeforeAfter {
    @Test
    public void searchElements() {

        browser.get("https://jobs.tut.by/account/login");
        browser.findElement(By.name("username"));
        browser.findElement(By.name("password"));
        browser.findElement(By.className("bloko-button"));
        browser.findElement(By.linkText("Получить пароль"));
        browser.findElement(By.partialLinkText("Получить"));
        browser.findElement(By.tagName("input")); //нашли первый инпут

        browser.get("https://jobs.tut.by/");
        browser.findElement(By.name("text"));

        browser.findElement(By.cssSelector(".supernova-search-group__submit")); // .class
        browser.findElement(By.cssSelector(".supernova-button.supernova-button_tinted.supernova-button_secondary")); //element should have all classes
//        browser.findElement(By.cssSelector("#firstname")); //Selects the element with id="firstname"
        browser.findElement(By.cssSelector("*")); // find all elements (кол-во тегов на странице)
        browser.findElement(By.cssSelector("p")); //selects all <p> elements (кол-во тегов p на странице)

        browser.findElement(By.cssSelector("[placeholder]")); //по аттрибуту
        browser.findElement(By.cssSelector("[data-qa=search-input]")); //Selects all elements with data-qa(это аттрибут)="search-input"(это значение)
        browser.findElement(By.cssSelector("[target=_blank]"));

        browser.findElement(By.cssSelector("[data-overlay-name~=area-switcher]"));
//        Selects all elements with a title attribute containing the word "flower"
//        Но НЕ хочет искать по частичному совпадению, только по полному

        browser.findElement(By.cssSelector("[lang|=ru]"));
        browser.findElement(By.cssSelector("a[href^=https]"));

        browser.get("https://vikirblog.wordpress.com/2016/03/06/роман-савин-тестирование-dot-com/");
        browser.findElement(By.cssSelector("a[href$=\".pdf\"]"));


    }
}
