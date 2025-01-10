package uiTest;

import PageObject.GitLoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitLoginPageTest extends BaseTestGit {

    @Test
    public  void mistakeAuthOperationGit(){
    GitLoginPage gitLoginPage = new GitLoginPage();
    Selenide.open("/session");
    gitLoginPage.mistakeAuthOperation("hatsiiMistake", "123456");
    }

    @Test
    public void successAuthOperationGit(){
    GitLoginPage gitLoginPage = new GitLoginPage();
    Selenide.open("/session");
    gitLoginPage.successAuthOperation("hatsii", "vadimbolt2304");
}

}
