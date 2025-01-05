package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class FirstLastNamePage {
    private static final SelenideElement solutionsButton = $(By.xpath("//button[text()='Solutions']"));
    private static final SelenideElement ciCdLink = $(By.xpath("//a[contains(text(),'CI/CD')]"));
    private static final SelenideElement contactSalesButton = $(By.xpath("//a[contains(text(),'Contact sales')]"));
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

        this.savedFirstName = firstName;
        this.savedLastName = lastName;
    }

    public void expectedFirstLastNameInput() {
        String actualFirstName = firstNameInput.shouldBe(visible).getValue();
        String actualLastName = lastNameInput.shouldBe(visible).getValue();

        assertThat(actualFirstName)
                .as("First name incorrect")
                .isEqualTo(savedFirstName);

        assertThat(actualLastName)
                .as("Last name incorrect")
                .isEqualTo(savedLastName);
    }
    public void hoverSolutionButton(){
        solutionsButton.hover().shouldBe(visible);
    }
    public void clickCiCdButton(){
        ciCdLink.shouldBe(visible).click();
    }
    public void clickContactSalesButton(){
        contactSalesButton.shouldBe(visible).click();
    }
    public void setFirstNameInput(String firstName){
        firstNameInput.shouldBe(visible).setValue(firstName);
    }
    public void setLastNameInput(String lastName){
        lastNameInput.shouldBe(visible).setValue(lastName);
    }
}


