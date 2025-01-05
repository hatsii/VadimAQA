package uiTest;

import PageObject.GitLoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitLoginPageTest extends BaseTestGit {

@Test

    public  void mistakeAuthOperationGit(){
    GitLoginPage GitLoginPage = new GitLoginPage();
    Selenide.open("/session");
    GitLoginPage.mistakeAuthOperation("hatsiiMistake", "123456");
    }
    @Test
    public void successAuthOperationGit(){
    GitLoginPage GitLoginPage = new GitLoginPage();
    Selenide.open("/session");
    GitLoginPage.successAuthOperation("hatsii", "vadimbolt2304");
}

}
