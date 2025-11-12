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
		lp = new loginPage(getDriver());
		lp.login();
		dp = new DashboardPayin(getDriver());
	}

	@Test
	public void navigateUpToPayIn() {
		dp.checkPayinButtonIsClickableOrNot();
		dp.checkUserIsOnTheDsshboardPage();
		dp.verifyAllHeadersInPayIn();

	}

	@Test
	public void verifyQuickInsights() {
		dp.verifyDefaultSizeForQuickInsighter();
		dp.allContentOfQuickInsights();
		dp.editQuickInsightAndCheckIt();
		dp.verifyAllHeadersInEditQuickSights();

	}

	@Test
	public void verifyDisableFieldFromEditQuickInsights() {
		dp.clickOnEditQuickSetting();
		dp.verifyAlreadySelectedQuickInsightsIsInDisableStateInEditQuickSetting();
	}
	
	
	@Test
	public void verifySelectedInsights() {
		dp.clickOnEditQuickSetting();
		dp.verifyInsideSelected();
		dp.checkAllOtherInsidesIsInCLickableState();
	}
	
	@Test
	public void verifyCancelButton() throws InterruptedException {
		dp.clickOnEditQuickSetting();
		dp.verifyCancelButtonINQuickInsights();

	}

	@Test
	public void verifyDiscardAndSaveButton() {
		dp.clickOnEditQuickSetting();
		dp.verifyDiscardButtonINQuickInsights();
	}

	@Test
	public void verifySaveButton() {
		dp.clickOnEditQuickSetting();
		dp.verifSaveButtonINQuickInsights();
	}
	
	
	@Test
	public void verifyCurrencyFilter() {
		dp.clickOnFilters();
		dp.verifyAllCurrenciesDisplays();
		dp.AddSingleCurrencyAndVerify();
	}
	
	@Test
	public void verifyIfUserSelectedMultipleCurrencyAndverify() {
		dp.clickOnFilters();
		dp.verifyAllCurrenciesDisplays();
		dp.AddMultipleCurrencyAndVerify();
	}
	
	@Test
	public void verifySuggestionAppearOnThecurrencySearchField() {
		dp.clickOnFilters();
		dp.searchCurrecyThroughSearchField("USD", "USD");//user check suggestions appear based on the currency search 
	}
	
	@Test
	public void verifyClearAllFilter() {
		dp.clickOnFilters();
		dp.clickOnTheSelectCurrencyField();
		dp.verifyClearAllFilterForCurrency();
		dp.clickOnStatusFilter();
		dp.clickOnSelectStatusSearchField();
		dp.clearAllFilter();
	}
	
	
	@Test
	public void verifyDiscardButton() {
		dp.clickOnFilters();
		dp.clickOnStatusFilter();
		dp.clickOnSelectStatusSearchField();
		dp.discardFilter();
		
	}
	
	@Test
	public void verifyResetFilter() {
		dp.clickOnFilters();
		dp.clickOnStatusFilter();
		dp.clickOnSelectStatusSearchField();	
		dp.resetFilter();
	}
	
	@Test
	public void verifyApplyButton() {
		dp.clickOnFilters();
		dp.clickOnStatusFilter();
		dp.clickOnSelectStatusSearchField();	
		dp.applyFilter();
		dp.howmanyFiltersApplied();
	}
	
	@Test
	public void verifyDropodwnIsCloseWhenUserClickOnTheOutSide() {
		dp.clickOnFilters();
		dp.clickOnStatusFilter();
		dp.clickOnSelectStatusSearchField();	
		
	}
	
	@Test
	public void handleDatePicker() throws InterruptedException {
	//	dp.handleDatePicker();
	//	dp.verifyAllDropdownIsMultiselectable();
	//
		dp.verifyStartFromAndEndFromDropdown();
	    dp.selectCustomDateRange();
	}
	
	//--------------------------------Analytics----------------------------
	
	@Test
	public void verifyChartsOnAnalytics() throws InterruptedException {
		dp.openChartofAnalytics();
		dp.checkCancelAndSaveButtonAfterClickOnAddToCartButton();
		dp.verifyClickOnTheCancelButtonAndCheck();
		dp.checkBrandnameIsBydefaultSelected();
		dp.removeChartFromAnalytics();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
