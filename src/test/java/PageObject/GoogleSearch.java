package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearch {

    private static SelenideElement googleSearchInput = $(By.id("APjFqb"));
    private static ElementsCollection googleResults = $$("div[role='presentation']");
    private static SelenideElement acceptCookiesButton = $(By.xpath(("//*[@id='L2AGLb']")));

    public void acceptCookiesIfNeeded() {
        if (acceptCookiesButton.exists()) {
            acceptCookiesButton.click();
        }
    }
    public void search(String query){
        acceptCookiesIfNeeded();
        googleSearchInput.shouldBe(visible).setValue(query).pressEnter();
    }
    public void verifyResultsMoreThan(int minimumResults) {
        googleResults.shouldHave(sizeGreaterThan(minimumResults));
    }
}
