package com.paysecure.payinDashboard;

import com.paysecure.base.baseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.paysecure.pages.Login.loginPage;

import org.openqa.selenium.WebDriver;
public class LoginTest extends baseClass {
    loginPage lp;

    private WebDriver driver;
    @BeforeMethod
   public void setupFor() throws InterruptedException {
      lp= new loginPage(getDriver());
        lp.login();
   }
@Test
public void  loginTestCases(){
lp.checkUrlContainsReact();
}

















}
