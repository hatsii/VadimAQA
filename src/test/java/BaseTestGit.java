import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestGit {
    @BeforeAll
    public static void setConfigurationGit(){
        Configuration.baseUrl = "https://github.com";
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}
