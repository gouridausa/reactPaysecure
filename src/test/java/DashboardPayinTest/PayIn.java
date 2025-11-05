package DashboardPayinTest;

import com.paysecure.base.baseClass;
import com.paysecure.pages.Dashboard.DashboardPayin;
import com.paysecure.pages.Login.loginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PayIn extends baseClass {

    loginPage lp;
    DashboardPayin dp;

    private WebDriver driver;
    @BeforeMethod
    public void beforeInvokeBrowser() throws InterruptedException {
        lp= new loginPage(getDriver());
        lp.login();
      dp=new DashboardPayin(getDriver());
    }


@Test
public void navigateUpToPayIn(){
dp.checkPayinButtonIsClickableOrNot();
dp.checkUserIsOnTheDsshboardPage();
dp.verifyAllHeadersInPayIn();

}

@Test
public void verifyQuickInsights(){
    dp.verifyDefaultSizeForQuickInsighter();
    dp.allContentOfQuickInsights();
    dp.editQuickInsightAndCheckIt();
    dp.verifyAllHeadersInEditQuickSights();

}
@Test
public void verifyDisableFieldFromEditQuickInsights(){
        dp.clickOnEditQuickSetting();
    dp.verifyAlreadySelectedQuickInsightsIsInDisableStateInEditQuickSetting();
}










}
