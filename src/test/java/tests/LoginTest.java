package tests;


import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import steps.LoginSteps;
import util.BaseTest;

import static util.constants.ACCOUNT_USER_PASS;
import static util.constants.ACCOUNT_USER_NAME;

public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        Assert.assertTrue(loginSteps.loginWithValidCredentials(ACCOUNT_USER_NAME, ACCOUNT_USER_PASS));
    }



}
