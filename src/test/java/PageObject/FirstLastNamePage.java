package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class FirstLastNamePage {
    private static final SelenideElement solutionsButton = $(By.xpath("//button[normalize-space(text())='Solutions']"));
    private static final SelenideElement ciCdLink = $(By.xpath("//a[contains(text(),'CI/CD')]"));
    private static final SelenideElement contactSalesButton = $(By.xpath("//a[normalize-space(.//span[text()='Contact sales'])]\n"));
    private static final SelenideElement firstNameInput = $(By.xpath("//input[@name='first_name']"));
    private static final SelenideElement lastNameInput = $(By.xpath("//input[@name='last_name']"));


    private String savedFirstName;
    private String savedLastName;

    public void stepsCheckLastFirstName(String firstName, String lastName){
        hoverSolutionButton();
        clickCiCdButton();
        clickContactSalesButton();
        setFirstNameInput(firstName);
        setLastNameInput(lastName);
    }
    public void setFirstNameInput(String firstName){
        firstNameInput.shouldBe(visible).setValue(firstName);
    }
    public void setLastNameInput(String lastName){
        lastNameInput.shouldBe(visible).setValue(lastName);
    }

    public void saveExpectedFirstLastName(String firstName, String lastName) {
        this.savedFirstName = firstName;
        this.savedLastName = lastName;
    }

    public  String getActualFirstName(){
        return firstNameInput.shouldBe(visible).getValue();
    }
    public String getActualLastName(){
        return lastNameInput.shouldBe(visible).getValue();
    }

    public void verifyFirstNameInput() {
        assertThat(getActualFirstName())
                .as("First name incorrect")
                .isEqualTo(savedFirstName);
    }
    public void verifyLastNameInput() {
        assertThat(getActualLastName())
                .as("Last name incorrect")
                .isEqualTo(savedLastName);
    }


    public void hoverSolutionButton(){
        solutionsButton.shouldBe(visible).hover();
    }
    public void clickCiCdButton(){
        ciCdLink.shouldBe(visible).click();
    }
    public void clickContactSalesButton(){
        contactSalesButton.scrollTo();
        contactSalesButton.shouldBe(visible).click();
    }

}


