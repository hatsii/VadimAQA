package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;



public class GitLoginPage {

private static final SelenideElement gitLoginInput = $(By.id("login_field"));
private static final SelenideElement gitPasswordInput = $(By.id("password"));
private static final SelenideElement gitSubmitButton = $(By.cssSelector("input[type='submit'].btn.btn-primary.btn-block.js-sign-in-button"));
private static final SelenideElement gitErrorMessage = $(By.className("flash-error"));
private static final SelenideElement checkLogoUser = $("button[data-login='hatsii']");



    public void successAuthOperation(String login,String password){
        setLoginGit(login);
        setPasswordGit(password);
        clickSubmitButtonGit();
        LogoUserVisible();
    }
    public void mistakeAuthOperation(String login,String password){
        setLoginGit(login);
        setPasswordGit(password);
        clickSubmitButtonGit();
        errorMessageVisible();
    }

    public void setLoginGit(String login){
        gitLoginInput.shouldBe(visible).setValue(login);
    }
    public void setPasswordGit(String password){
        gitPasswordInput.shouldBe(visible).setValue(password);
    }
    public void clickSubmitButtonGit(){
        gitSubmitButton.shouldBe(visible).click();
    }
    public void errorMessageVisible  (){
        gitErrorMessage.shouldBe(visible);
    }
    public void LogoUserVisible(){
        checkLogoUser.shouldBe(visible);
    }

}


