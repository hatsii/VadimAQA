package uiTest;

import PageObject.FirstLastNamePage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstLastNamePageTest extends BaseTestGit {
    @Test
    public void stepsFirstLastNameTest() {
        Selenide.open("/");
        FirstLastNamePage FirstLastNamePage = new FirstLastNamePage();
        FirstLastNamePage.stepsCheckLastFirstName("Vadim", "Tatarnikov");
        FirstLastNamePage.expectedFirstLastNameInput();

    }
}