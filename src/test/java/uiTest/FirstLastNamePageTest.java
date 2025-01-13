package uiTest;

import PageObject.FirstLastNamePage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstLastNamePageTest extends BaseTestGit {
    @Test
    public void stepsFirstNameTest() {
        Selenide.open("/");
        FirstLastNamePage firstLastNamePage = new FirstLastNamePage();
        firstLastNamePage.stepsCheckLastFirstName("Vadim", "Tatarnikov");
        firstLastNamePage.saveExpectedFirstName("Vadim");
        firstLastNamePage.saveExpectedLastName("Tatarnikov");
        firstLastNamePage.verifyFirstNameInput();

    }
    @Test
    public void stepsLastNameTest() {
        Selenide.open("/");
        FirstLastNamePage firstLastNamePage = new FirstLastNamePage();
        firstLastNamePage.stepsCheckLastFirstName("Vadim", "Tatarnikov");
        firstLastNamePage.saveExpectedFirstName("Vadim");
        firstLastNamePage.saveExpectedLastName("Tatarnikov");
        firstLastNamePage.verifyLastNameInput();

    }
}