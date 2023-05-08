package com.automation.test;

import com.automation.categories.EmilyTest;
import com.automation.categories.MustafaTest;
import com.automation.categories.RegressionTest;
import com.automation.categories.SmokeTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Locale;

public class LoginTest extends BaseTest{

    @Test
    @Category({RegressionTest.class, SmokeTest.class, MustafaTest.class})
    public void verifyUserCanLogin() {
        System.out.println("verify login successful");
    }
    @Test
    @Category({RegressionTest.class, MustafaTest.class})
    public void verifyUserCanNotLoginWithInvalidCredentials() {
        System.out.println("verify login unsuccessful for invalid credentials");
    }
    @Test
    @Category({RegressionTest.class, EmilyTest.class})
    public void verifyUserCanResetPassword() {
        System.out.println("verify user can reset password");
    }
}
