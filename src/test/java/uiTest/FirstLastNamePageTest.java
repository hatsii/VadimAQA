package uiTest;

import PageObject.FirstLastNamePage;

public class FirstLastNamePageTest extends BaseTestGit{

    public void stepsFirstLastNameTest(){
        FirstLastNamePage FirstLastNamePage = new FirstLastNamePage();
        FirstLastNamePage.stepsCheckLastFirstName("Vadim","Tatarnikov");
        FirstLastNamePage.expectedFirstLastNameInput();
    }


}
