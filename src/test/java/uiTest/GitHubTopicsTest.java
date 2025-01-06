package uiTest;

import PageObject.GitHubTopics;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitHubTopicsTest extends BaseTestGit{

    @Test
    public void containedListTopicsTest(){
        Selenide.open("/");
        GitHubTopics GitHubTopics = new GitHubTopics();
        GitHubTopics.containedListTopics();

    }

}
