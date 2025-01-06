package PageObject;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class GitHubTopics {

    private static SelenideElement topicsButton = $(By.xpath("//button[contains(text(), 'Resources')]"));
    private static ElementsCollection listTopics = $$x("//ul[@aria-labelledby='resources-topics-heading']//a[contains(@href, '/resources/articles')]");

    public void containedListTopics(){
        clickTopicsButton();
        checkListTopics();
    }

    public void clickTopicsButton(){
        topicsButton.shouldBe(visible, Duration.ofSeconds(2)).hover();
    }

    public void checkListTopics(){
        listTopics.shouldHave(CollectionCondition.texts("AI", "DevOps", "Security", "Software Development", "View All"));
    }
}
