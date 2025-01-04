import PageObject.GitLoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitLoginPageTest extends BaseTestGit{

@Test
    public void SuccessAuthOperationGit(){
    GitLoginPage GitLoginPage = new GitLoginPage();
    Selenide.open("/session");
    GitLoginPage.SuccessAuthOperation("hatsii", "vadimbolt2304");
}

}
