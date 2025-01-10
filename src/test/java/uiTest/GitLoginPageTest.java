package uiTest;

import PageObject.GitLoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitLoginPageTest extends BaseTestGit {
    public static final String BASE_PATH_GIT = "/session";

    @Test
    public  void mistakeAuthOperationGit(){
    GitLoginPage gitLoginPage = new GitLoginPage();
    Selenide.open(BASE_PATH_GIT);
    gitLoginPage.mistakeAuthOperation("hatsiiMistake", "123456");
    }

    @Test
    public void successAuthOperationGit(){
    GitLoginPage gitLoginPage = new GitLoginPage();
    Selenide.open(BASE_PATH_GIT);
    gitLoginPage.successAuthOperation("hatsii", "vadimbolt2304");
}

}
