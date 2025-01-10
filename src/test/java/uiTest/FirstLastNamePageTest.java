package uiTest;

import PageObject.FirstLastNamePage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstLastNamePageTest extends BaseTestGit {
    @Test
    public void stepsFirstLastNameTest() {
        Selenide.open("/");
        FirstLastNamePage firstLastNamePage = new FirstLastNamePage();
        firstLastNamePage.stepsCheckLastFirstName("Vadim", "Tatarnikov");
        firstLastNamePage.expectedFirstLastNameInput();

    }
}