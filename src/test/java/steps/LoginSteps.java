package steps;

import io.qameta.allure.Step;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;
    private HomePage homePage;


    @Step
    public void navigateToLoginPage(){
        loginPage.open();

    }

    @Step
    public boolean loginWithValidCredentials(String email, String password) {
        loginPage.typeUserEmailField(email);
        loginPage.typePasswordField(password);
        loginPage.clickLoginButton();
        return homePage.checkLogin();
    }

}
