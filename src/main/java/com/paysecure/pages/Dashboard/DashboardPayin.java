package com.paysecure.pages.Dashboard;

import com.paysecure.actiondriver.ActionDriver;
import com.paysecure.base.baseClass;
import com.paysecure.xpath.Dashboard.DashboardPayinLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DashboardPayin {

	private By payin = By.xpath(DashboardPayinLocators.payin);
	private By dashboard = By.xpath(DashboardPayinLocators.dashboard);

//verify all headers
	private By filters = By.xpath(DashboardPayinLocators.filters);
	private By quickInsights = By.xpath(DashboardPayinLocators.quickInsights);
	private By analytics = By.xpath(DashboardPayinLocators.analytics);
	private By topPaymentsMethods = By.xpath(DashboardPayinLocators.topPaymentsMethods);
	private By regionWisePayments = By.xpath(DashboardPayinLocators.regionWisePayments);
	private By summary = By.xpath(DashboardPayinLocators.summary);
	private By quickInsightQuantity = By.xpath(DashboardPayinLocators.quickInsightQuantity);

//Quick insights
	// private By
	// quickInsightInsighter=By.xpath(DashboardPayinLocators.quickInsightInsighter);
	@FindBy(xpath = "//h6[@class='sc-fhHczv bGBovy sc-cNwwfj aZYDm']")
	private List<WebElement> quickInsightInsighter;
	private By editQuickInsights = By.xpath(DashboardPayinLocators.editQuickInsights);
	private By approvalRate = By.xpath(DashboardPayinLocators.approvalRate);
	private By approvedAmount = By.xpath(DashboardPayinLocators.approvedAmount);
	private By averageOrderAmount = By.xpath(DashboardPayinLocators.averageOrderAmount);
	private By totalTransactions = By.xpath(DashboardPayinLocators.totalTransactions);

	private By ApprovalRate = By.xpath(DashboardPayinLocators.ApprovalRate);
	private By ApprovedAmount = By.xpath(DashboardPayinLocators.ApprovedAmount);
	private By AverageOrderAmount = By.xpath(DashboardPayinLocators.AverageOrderAmount);
	private By TotalTransactions = By.xpath(DashboardPayinLocators.TotalTransactions);
	private By insightsTotaltext = By.xpath(DashboardPayinLocators.insightsTotaltext);
	
	private By ChargebackCount = By.xpath(DashboardPayinLocators.ChargebackCount);
	private By ChargebackPercentage = By.xpath(DashboardPayinLocators.ChargebackPercentage);
	private By ErrorRate = By.xpath(DashboardPayinLocators.ErrorRate);
	private By PendingTransactions = By.xpath(DashboardPayinLocators.PendingTransactions);
	private By RefundAmount = By.xpath(DashboardPayinLocators.RefundAmount);
	private By RefundCount = By.xpath(DashboardPayinLocators.RefundCount);
	private By RefundPercentage = By.xpath(DashboardPayinLocators.RefundPercentage);
	
	//cancel button , discard and save button
	private By cancelButton = By.xpath(DashboardPayinLocators.cancelButton);
	private By discardButton = By.xpath(DashboardPayinLocators.discardButton);
	private By saveButton = By.xpath(DashboardPayinLocators.saveButton);
	
	//flters applied
	private By filtersApplied = By.xpath(DashboardPayinLocators.filtersApplied);
	private By selectCurrency = By.xpath(DashboardPayinLocators.selectCurrency);
	private By AED = By.xpath(DashboardPayinLocators.AED);
	private By ALL = By.xpath(DashboardPayinLocators.ALL);
	private By resetFilter = By.xpath(DashboardPayinLocators.resetFilter);
	private By clearAll = By.xpath(DashboardPayinLocators.clearAll);
	private By discard = By.xpath(DashboardPayinLocators.discard);
	private By apply = By.xpath(DashboardPayinLocators.apply);
	private By searchCurrencttextfield = By.xpath(DashboardPayinLocators.searchCurrencttextfield);
	
	//select status
	private By status = By.xpath(DashboardPayinLocators.status);
	private By selectStatus = By.xpath(DashboardPayinLocators.selectStatus);
	private By Cancelled = By.xpath(DashboardPayinLocators.Cancelled);
	private By Chargeback = By.xpath(DashboardPayinLocators.Chargeback);
	private By howmuchFilterApplied=By.xpath(DashboardPayinLocators.howmuchFilterApplied);
	private By paymentMethod=By.xpath(DashboardPayinLocators.paymentMethod);
	
	//handle date picker
	private By datePicker=By.xpath(DashboardPayinLocators.datePicker);
	private By previousMonthLeftFirst=By.xpath(DashboardPayinLocators.previousMonthLeftFirst);
	private By previousMonthRightFirst=By.xpath(DashboardPayinLocators.previousMonthRightFirst);
	private By nextMonthLeftFirst=By.xpath(DashboardPayinLocators.nextMonthLeftFirst);
	private By nextMonthRightFirst=By.xpath(DashboardPayinLocators.nextMonthRightFirst);
	private By applyButton=By.xpath(DashboardPayinLocators.applyButton);
	private By fromDate=By.xpath(DashboardPayinLocators.fromDate);
	private By toDate=By.xpath(DashboardPayinLocators.toDate);
	
	private By startTimeFrom=By.xpath(DashboardPayinLocators.startTimeFrom);
	private By startTimeTo=By.xpath(DashboardPayinLocators.startTimeTo);
	private By endTimeFrom=By.xpath(DashboardPayinLocators.endTimeFrom);
	private By endTimeTo=By.xpath(DashboardPayinLocators.endTimeTo);
	
	//Analytics
	private By addTochart=By.xpath(DashboardPayinLocators.addTochart);
	private By cancelOnAnalytics=By.xpath(DashboardPayinLocators.cancelOnAnalytics);
	private By saveOnAnalytics=By.xpath(DashboardPayinLocators.saveOnAnalytics);
	
	private By groupByBrandname=By.xpath(DashboardPayinLocators.groupByBrandname);
	private By grpByBrndName=By.xpath(DashboardPayinLocators.grpByBrndName);
	private By groupByPSP=By.xpath(DashboardPayinLocators.groupByPSP);
	private By groupByTrustScore=By.xpath(DashboardPayinLocators.groupByTrustScore);
	private By removeChartButton=By.xpath(DashboardPayinLocators.removeChartButton);
	private By removeChart=By.xpath(DashboardPayinLocators.removeChart);
	private By cancelRemoveChart=By.xpath(DashboardPayinLocators.cancelRemoveChart);
	private By confirmRemoveChart=By.xpath(DashboardPayinLocators.confirmRemoveChart);
	

	
	
	@FindBy(xpath="//div[@class='sc-kaCbt kECrGG']/label")private List<WebElement> totalInsights;
	@FindBy(xpath="//label[@class='sc-gByRMG dsMAuj']")private List<WebElement>  unselectedInsights;
	@FindBy(xpath="(//div[@class='sc-eKrodz vCZsQ'])[1]/div")private List<WebElement> allCurrencies;
	@FindBy(xpath="((//button[contains(@id,'dropdown-')])[2]//div[1]//div)[1]/span")private List<WebElement>  selectedCurrencies;
//    @FindBy(xpath="")private WebElement fromDate;
//    @FindBy(xpath="")private WebElement toDate;
	private ActionDriver actionDriver;
	private WebDriver driver;

	// page factory constructor
	public DashboardPayin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.actionDriver = new ActionDriver(driver);
	}

	public void checkPayinButtonIsClickableOrNot() {
		boolean clickable = actionDriver.isEnabled(payin);
		Assert.assertTrue(clickable, "Payin button is not clickable!");
		Reporter.log("Checking if Payin button is clickable: " + clickable, true);
	}

	public void clickOnPayInButton() {
		actionDriver.clickUsingJS(payin);
		Reporter.log("Clicked on 'Payin' button successfully.", true);
	}

	public void checkUserIsOnTheDsshboardPage() {
		WebDriver driver=baseClass.getDriver();
		driver.manage().window().setSize(new Dimension(1280,720));
		boolean isDashboardVisible = actionDriver.isDisplayed(dashboard);
		Reporter.log("Checking if Dashboard page is displayed: " + isDashboardVisible, true);

		Assert.assertTrue(isDashboardVisible, "User is not on the Dashboard page");
		Reporter.log("User is successfully on the Dashboard page.", true);

		actionDriver.scrollToElement(quickInsights);

	}

	public void verifyAllHeadersInPayIn() {
		Reporter.log("=== Verifying all headers in PayIn Dashboard ===", true);

		boolean isFiltersHeadersIsDisplayed = actionDriver.isDisplayed(filters);
		Reporter.log("Filters header displayed: " + isFiltersHeadersIsDisplayed, true);
		Assert.assertTrue(isFiltersHeadersIsDisplayed, "Filters header is not displayed");

		actionDriver.scrollToElement(quickInsights);
		boolean isQuickInsightsHeaderDisplayed = actionDriver.isDisplayed(quickInsights);
		Reporter.log("Quick Insights header displayed: " + isQuickInsightsHeaderDisplayed, true);
		Assert.assertTrue(isQuickInsightsHeaderDisplayed, "Quick Insights header is not displayed");

		actionDriver.scrollToElement(analytics);
		boolean isAnalyticsHeaderDisplayed = actionDriver.isDisplayed(analytics);
		Reporter.log("Analytics header displayed: " + isAnalyticsHeaderDisplayed, true);
		Assert.assertTrue(isAnalyticsHeaderDisplayed, "Analytics header is not displayed");

		actionDriver.scrollToElement(topPaymentsMethods);
		boolean isTopPaymentsMethodsHeaderDisplayed = actionDriver.isDisplayed(topPaymentsMethods);
		Reporter.log("Top Payment Methods header displayed: " + isTopPaymentsMethodsHeaderDisplayed, true);
		Assert.assertTrue(isTopPaymentsMethodsHeaderDisplayed, "Top Payment Methods header is not displayed");

		actionDriver.scrollToElement(regionWisePayments);
		boolean isRegionWisePaymentsHeaderDisplayed = actionDriver.isDisplayed(regionWisePayments);
		Reporter.log("Region-wise Payments header displayed: " + isRegionWisePaymentsHeaderDisplayed, true);
		Assert.assertTrue(isRegionWisePaymentsHeaderDisplayed, "Region-wise Payments header is not displayed");

		actionDriver.scrollToElement(summary);
		boolean isSummaryHeaderDisplayed = actionDriver.isDisplayed(summary);
		Reporter.log("Summary header displayed: " + isSummaryHeaderDisplayed, true);
		Assert.assertTrue(isSummaryHeaderDisplayed, "Summary header is not displayed");

		Reporter.log("All headers in PayIn Dashboard verified successfully.", true);
	}

	public void verifyDefaultSizeForQuickInsighter() {
		Reporter.log("=== Verifying default Quick Insights size ===", true);

		WebDriver driver = baseClass.getDriver();
		List<WebElement> quickInsightInsighters = driver
				.findElements(By.xpath("//h6[@class='sc-fhHczv bGBovy sc-cNwwfj aZYDm']"));

		ArrayList<String> quickInsightContainer = new ArrayList<>();
		for (WebElement quick : quickInsightInsighters) {
			quickInsightContainer.add(quick.getText().trim());
		}

		int displayedQuickInsightsCount = quickInsightContainer.size();
		Reporter.log("Displayed Quick Insights count: " + displayedQuickInsightsCount, true);

		String quickQtn = actionDriver.getText(quickInsightQuantity);
		String qtn = quickQtn.replaceAll("[^0-9]", "");
		int quickQuantity = Integer.parseInt(qtn);
		Reporter.log("Quick Insights quantity text: " + quickQtn + " | Extracted number: " + quickQuantity, true);

		Assert.assertEquals(quickQuantity, displayedQuickInsightsCount, "Quick Insights count mismatch — expected: "
				+ quickQuantity + ", actual: " + displayedQuickInsightsCount);

		Reporter.log("Quick Insights count verified successfully (" + quickQuantity + ")", true);
	}

	public void editQuickInsightAndCheckIt() {
		Reporter.log("Checking if 'Edit Quick Insights' button is enabled...", true);
		Assert.assertTrue(actionDriver.isEnabled(editQuickInsights), "'Edit Quick Insights' button is not enabled!");

		Reporter.log("'Edit Quick Insights' button is enabled.", true);

		actionDriver.scrollToElement(editQuickInsights);
		Reporter.log("Scrolled to 'Edit Quick Insights' button.", true);

		actionDriver.click(editQuickInsights);
		Reporter.log("Clicked on 'Edit Quick Insights' button.", true);
	}

	String aprRate;
	String aprAMount;
	String avgOrderAmt;
	String totalTxn;

	public void allContentOfQuickInsights() {
		aprRate = actionDriver.getText(approvalRate);
		aprAMount = actionDriver.getText(approvedAmount);
		avgOrderAmt = actionDriver.getText(averageOrderAmount);
		totalTxn = actionDriver.getText(totalTransactions);

		Reporter.log("Captured Quick Insights data:", true);
		Reporter.log("Approval Rate: " + aprRate, true);
		Reporter.log("Approved Amount: " + aprAMount, true);
		Reporter.log("Average Order Amount: " + avgOrderAmt, true);
		Reporter.log("Total Transactions: " + totalTxn, true);
	}

	public void verifyAllHeadersInEditQuickSights() {
		actionDriver.scrollToElement(AverageOrderAmount);
		String AprRate = actionDriver.getText(ApprovalRate);
		String AprAMount = actionDriver.getText(ApprovedAmount);
		String AvgOrderAmt = actionDriver.getText(AverageOrderAmount);
		String TotalTxn = actionDriver.getText(TotalTransactions);

		Reporter.log("Verifying Quick Insights data after edit:", true);
		Reporter.log("Approval Rate (expected vs actual): " + aprRate + " | " + AprRate, true);
		Reporter.log("Approved Amount (expected vs actual): " + aprAMount + " | " + AprAMount, true);
		Reporter.log("Average Order Amount (expected vs actual): " + avgOrderAmt + " | " + AvgOrderAmt, true);
		Reporter.log("Total Transactions (expected vs actual): " + totalTxn + " | " + TotalTxn, true);

		Assert.assertEquals(aprRate, AprRate, "Approval Rate mismatch!");
		Assert.assertEquals(aprAMount, AprAMount, "Approved Amount mismatch!");
		Assert.assertEquals(avgOrderAmt, AvgOrderAmt, "Average Order Amount mismatch!");
		Assert.assertEquals(totalTxn, TotalTxn, "Total Transactions mismatch!");

		Reporter.log("All Quick Insights values are verified successfully.", true);
	}

	public void verifyAlreadySelectedQuickInsightsIsInDisableStateInEditQuickSetting() {
		WebDriver driver = baseClass.getDriver();
		Reporter.log("Verifying 'Quick Insights' checkboxes are in disabled state...", true);

		actionDriver.scrollToElement(ApprovedAmount);
		// All insight names
		String[] quickInsights = { "Approval Rate", "Approved Amount", "Average Order Amount", "Total Transactions" };

		for (String insight : quickInsights) {
			// Locate the <input> for each label text (the actual checkbox)
			WebElement checkbox = driver
					.findElement(By.xpath("//p[normalize-space()='" + insight + "']/preceding::input[1]"));

			// Check for disabled attribute
			String disabled = checkbox.getAttribute("disabled");

			Reporter.log(insight + " → disabled attribute value: " + disabled, true);

			// Verify the checkbox is disabled
			Assert.assertNotNull(disabled, insight + " checkbox should be disabled but is not.");

			Reporter.log("" + insight + " is in disabled state.", true);
		}
	}

	public void clickOnEditQuickSetting() {
		actionDriver.clickUsingJS(editQuickInsights);
		Reporter.log("Clicked on 'Edit Quick Insights' button.", true);

	}
	public void verifyInsideSelected() {
	    List<String> tatInsight = new ArrayList<>();

	    // Collect all insight texts
	    for (WebElement selectedInsights : totalInsights) { 
	        tatInsight.add(selectedInsights.getText().trim());
	    }

	    int total = tatInsight.size();
	    Reporter.log("Total insights in DOM: " + total, true);

	    int totalUnselectedInsights = unselectedInsights.size();
	    Reporter.log("Total unselected insights: " + totalUnselectedInsights, true);

	    int totalSelectedInsights = total - totalUnselectedInsights;
	    Reporter.log("Calculated selected insights: " + totalSelectedInsights, true);

	    // Convert number to string for comparison
	    String textIns = Integer.toString(totalSelectedInsights);

	    // Get text from the UI (e.g. "5/11 insights selected")
	    String textInsides = actionDriver.getText(insightsTotaltext).trim();
	    Reporter.log("Text fetched from UI: " + textInsides, true);

	    // Validation
	    if (textInsides.contains(textIns)) {
	        Reporter.log("✅ PASS: UI correctly displays " + textIns + " insights selected.", true);
	    } else {
	        Reporter.log("❌ FAIL: Expected '" + textIns + "' selected, but found: " + textInsides, true);
	    }

	    // Add assertion to fail the test if mismatch
	    Assert.assertTrue(
	        textInsides.contains(textIns),
	        "Mismatch: Expected " + textIns + " selected insights, but found text: " + textInsides
	    );
	}
	
	public void checkAllOtherInsidesIsInCLickableState() {
	    Reporter.log("===== Verifying all 'Insights' clickable states =====", true);

	    // Chargeback Count
	    boolean chargebackCountIsClickable = actionDriver.isEnabled(ChargebackCount);
	    Reporter.log("Chargeback Count clickable: " + chargebackCountIsClickable, true);
	    Assert.assertTrue(chargebackCountIsClickable, "Chargeback Count is not clickable!");

	    // Chargeback Percentage
	    boolean chargebackPercentageIsClickable = actionDriver.isEnabled(ChargebackPercentage);
	    Reporter.log("Chargeback Percentage clickable: " + chargebackPercentageIsClickable, true);
	    Assert.assertTrue(chargebackPercentageIsClickable, "Chargeback Percentage is not clickable!");

	    // Error Rate
	    boolean errorRateIsClickable = actionDriver.isEnabled(ErrorRate);
	    Reporter.log("Error Rate clickable: " + errorRateIsClickable, true);
	    Assert.assertTrue(errorRateIsClickable, "Error Rate is not clickable!");

	    // Pending Transactions
	    boolean pendingTransactionsIsClickable = actionDriver.isEnabled(PendingTransactions);
	    Reporter.log("Pending Transactions clickable: " + pendingTransactionsIsClickable, true);
	    Assert.assertTrue(pendingTransactionsIsClickable, "Pending Transactions is not clickable!");

	    // Refund Amount
	    boolean refundAmountIsClickable = actionDriver.isEnabled(RefundAmount);
	    Reporter.log("Refund Amount clickable: " + refundAmountIsClickable, true);
	    Assert.assertTrue(refundAmountIsClickable, "Refund Amount is not clickable!");

	    // Refund Count
	    boolean refundCountIsClickable = actionDriver.isEnabled(RefundCount);
	    Reporter.log("Refund Count clickable: " + refundCountIsClickable, true);
	    Assert.assertTrue(refundCountIsClickable, "Refund Count is not clickable!");

	    // Refund Percentage
	    boolean refundPercentageIsClickable = actionDriver.isEnabled(RefundPercentage);
	    Reporter.log("Refund Percentage clickable: " + refundPercentageIsClickable, true);
	    Assert.assertTrue(refundPercentageIsClickable, "Refund Percentage is not clickable!");

	    Reporter.log("✅ All insights are clickable as expected.", true);
	    Reporter.log("===== Clickable state verification completed =====", true);
	}
                        
	
	public void verifyCancelButtonINQuickInsights() {
	    Reporter.log("===== Verifying Cancel button in Quick Insights =====", true);

//	    if (actionDriver.isDisplayed(cancelButton) && actionDriver.isEnabled(cancelButton)) {
//	        Reporter.log("Cancel button is displayed and enabled.", true);
	        actionDriver.clickUsingJS(cancelButton);
	        Reporter.log("Clicked on Cancel button successfully.", true);
//	    } else {
//	        Reporter.log("Cancel button is either not displayed or not enabled.", true);
//	    }

	    Reporter.log("===== Cancel button verification completed =====", true);
	}

	public void verifyDiscardButtonINQuickInsights() {
	    Reporter.log("===== Verifying Discard button in Quick Insights =====", true);

//	    if (actionDriver.isDisplayed(discardButton) && actionDriver.isEnabled(discardButton)) {
//	        Reporter.log("Discard button is displayed and enabled.", true);
	        actionDriver.clickUsingJS(discardButton);
	        Reporter.log("Clicked on Discard button successfully.", true);
//	    } else {
//	        Reporter.log("Discard button is either not displayed or not enabled.", true);
//	    }

	    Reporter.log("===== Discard button verification completed =====", true);
	}

	public void verifSaveButtonINQuickInsights() {
	    Reporter.log("===== Verifying Save button in Quick Insights =====", true);

//	    if (actionDriver.isDisplayed(saveButton) && actionDriver.isEnabled(saveButton)) {
//	        Reporter.log("Save button is displayed and enabled.", true);
	        actionDriver.clickUsingJS(saveButton);
	        Reporter.log("Clicked on Save button successfully.", true);
//	    } else {
//	        Reporter.log("Save button is either not displayed or not enabled.", true);
//	    }

	    Reporter.log("===== Save button verification completed =====", true);
	}
	
	
	public void clickOnFilters() {
	    // Click on Filters
	    actionDriver.clickUsingJS(filtersApplied);
	    Reporter.log("User clicked on the 'Filters Applied' button", true);

	    // Verify that the currency dropdown is displayed
	    boolean isCurrencyDropdownVisible = actionDriver.isDisplayed(selectCurrency);
	    Reporter.log("Checking if 'Select Currency' dropdown is displayed: " + isCurrencyDropdownVisible, true);
	    Assert.assertTrue(isCurrencyDropdownVisible, "'Select Currency' dropdown is not visible after clicking Filters");
	}

	public void clickOnTheSelectCurrencyField() {
	    // Open the currency dropdown
	    actionDriver.clickUsingJS(selectCurrency);
	    Reporter.log("User clicked on 'Select Currency' dropdown", true);
	}

	public void verifyAllCurrenciesDisplays() {
		clickOnTheSelectCurrencyField();

	    // Collect all displayed currency texts
	    List<String> allCurrenciesList = new ArrayList<>();
	    for (WebElement currency : allCurrencies) {
	        String text = currency.getText().trim();
	        if (!text.isEmpty()) {
	            allCurrenciesList.add(text);
	        }
	    }

	    // Log currency names (optional for debug)
	    Reporter.log("Total currencies found: " + allCurrenciesList.size(), true);
	    for (String currency : allCurrenciesList) {
	        Reporter.log("Currency: " + currency, true);
	    }

	    // Validation: List should not be empty
	    Assert.assertFalse(allCurrenciesList.isEmpty(), "No currencies found in dropdown");
	    Reporter.log("Verified currency dropdown is not empty", true);

	    // Validation: Expected count (e.g., 170)
	    int totalSizeCurrency = allCurrenciesList.size();
	    Assert.assertEquals(totalSizeCurrency, 170, "Currency size mismatch — Expected 170, Found " + totalSizeCurrency);
	    Reporter.log("Verified total number of currencies matches expected count: " + totalSizeCurrency, true);
	}
	
	
	public void AddSingleCurrencyAndVerify() {
	    // Step 1: Click on AED currency option
	    actionDriver.clickUsingJS(AED);
	    Reporter.log("User clicked on the AED currency option", true);


	    // Step 2: Collect all selected currencies displayed in the search field
	    List<String> selCurr = new ArrayList<>();
	    for (WebElement sc : selectedCurrencies) {
	        String text = sc.getText().trim();
	        String cleanText = text.replace("×", "");
	        selCurr.add(cleanText.trim());
	    }
	    Reporter.log("Collected selected currencies after cleaning: " + selCurr, true);

	    Reporter.log("Collected selected currencies from the UI: " + selCurr, true);

	    // Step 3: Get the first selected currency
	    String firstSelectedCurrency = selCurr.get(0);
	    Reporter.log("First selected currency from the list is: " + firstSelectedCurrency, true);


	    // Step 4: Verify that the first selected currency is AED
	    Assert.assertEquals(firstSelectedCurrency, "AED", 
	        "Expected currency AED is not displayed in the selected list.");
	    Reporter.log("Verified successfully: 'AED' currency is displayed in the search field", true);

	}

	public void resetFilter() {
	    actionDriver.clickUsingJS(resetFilter);
	    Reporter.log("User clicked on the 'Reset Filter' button", true);
	}

	public void clearAllFilter() {
	    actionDriver.clickUsingJS(clearAll);
	    Reporter.log("User clicked on the 'Clear All' button to remove all applied filters", true);
	}

	public void discardFilter() {
	    actionDriver.clickUsingJS(discard);
	    Reporter.log("User clicked on the 'Discard' button — changes will not be saved", true);
	}

	public void applyFilter() {
	    actionDriver.clickUsingJS(apply);
	    Reporter.log("User clicked on the 'Apply Filter' button to apply selected filters", true);
	}

	public void searchCurrecyThroughSearchField(String partialCurrencyName, String currency) {
	    // Step 1: Click on the currency search field
	    clickOnTheSelectCurrencyField();
	    Reporter.log("User clicked on the 'Select Currency' field", true);

	    // Step 2: Enter partial currency name in the search text field
	    actionDriver.enterText(searchCurrencttextfield, partialCurrencyName);
	    Reporter.log("User entered partial currency name: '" + partialCurrencyName + "' in the search field", true);

	    // Step 3: Collect all currencies that appeared in the dropdown
	    List<String> appearCurrency = new ArrayList<>();
	    for (WebElement appearAllCurrencies : allCurrencies) {
	        appearCurrency.add(appearAllCurrencies.getText().trim());
	    }
	    Reporter.log("Currencies appeared in dropdown: " + appearCurrency, true);

	    // Step 4: Verify if the expected currency is present in the search results
	    boolean isCurrencyFound = appearCurrency.contains(currency);
	    Reporter.log("Is currency '" + currency + "' displayed in search results? -> " + isCurrencyFound, true);

	    Assert.assertTrue(isCurrencyFound, "Currency '" + currency + "' is not displayed in the search results after entering '" + partialCurrencyName + "'");
	    Reporter.log("Verified successfully: Currency '" + currency + "' is displayed in the search results", true);
	}

	public void AddMultipleCurrencyAndVerify() {
	    // Step 1: Click on AED currency option
	    actionDriver.clickUsingJS(AED);
	    Reporter.log("User clicked on the AED currency option", true);
	    
	    actionDriver.clickUsingJS(ALL);
	    Reporter.log("User clicked on the ALL currency option", true);

	    // Step 2: Collect all selected currencies displayed in the search field
	    List<String> selCurr = new ArrayList<>();
	    for (WebElement sc : selectedCurrencies) {
	        String text = sc.getText().trim();
	        String cleanText = text.replace("×", "");
	        selCurr.add(cleanText.trim());
	    }
	    Reporter.log("Collected selected currencies after cleaning: " + selCurr, true);

	    Reporter.log("Collected selected currencies from the UI: " + selCurr, true);

	    // Step 3: Get the first selected currency
	    String firstSelectedCurrency = selCurr.get(0);
	    Reporter.log("First selected currency from the list is: " + firstSelectedCurrency, true);
	    
	    String secondSelectedCurrency = selCurr.get(1);
	    Reporter.log("First selected currency from the list is: " + firstSelectedCurrency, true);

	    // Step 4: Verify that the first selected currency is AED
	    Assert.assertEquals(firstSelectedCurrency, "AED", 
	        "Expected currency AED is not displayed in the selected list.");
	    Reporter.log("Verified successfully: 'AED' currency is displayed in the search field", true);
	    
	    Assert.assertEquals(secondSelectedCurrency, "ALL", 
		        "Expected currency AED is not displayed in the selected list.");
		    Reporter.log("Verified successfully: 'AED' currency is displayed in the search field", true);
	}
	
	public void verifyClearAllFilterForCurrency() {
	    // Step 1: Select AED and ALL currencies
	    actionDriver.clickUsingJS(AED);
	    Reporter.log("User clicked on the 'AED' currency option", true);
	    
	    actionDriver.clickUsingJS(ALL);
	    Reporter.log("User clicked on the 'ALL' currency option", true);

	    // Step 2: Collect all selected currencies before clearing
	    List<String> selCurr = new ArrayList<>();
	    for (WebElement sc : selectedCurrencies) {
	        String text = sc.getText().trim();
	        String cleanText = text.replace("×", "");
	        selCurr.add(cleanText.trim());
	    }
	    Reporter.log("Selected currencies before clearing: " + selCurr, true);
	    Reporter.log("Total selected currencies before clearing: " + selCurr.size(), true);

	    // Step 3: Click on 'Clear All' to remove selected currencies
	    clearAllFilter();
	    Reporter.log("User clicked on the 'Clear All' button to remove all applied currency filters", true);

	    // Step 4: Collect selected currencies again after clearing
	    List<String> selCurrAfterClear = new ArrayList<>();
	    for (WebElement sc : selectedCurrencies) {
	        String text = sc.getText().trim();
	        String cleanText = text.replace("×", "");
	        selCurrAfterClear.add(cleanText.trim());
	    }
	    Reporter.log("Selected currencies after clearing: " + selCurrAfterClear, true);
	    Reporter.log("Total selected currencies after clearing: " + selCurrAfterClear.size(), true);

	    // Step 5: Verification - Assert that list before and after clearing are different
	    Assert.assertNotEquals(selCurr, selCurrAfterClear, 
	        "Clear All filter did not remove the selected currencies as expected.");
	    Reporter.log("Verified successfully: 'Clear All' filter removed all selected currencies", true);
	}

	public void clickOnStatusFilter() {
	    // Step 1: Click on the 'Status' filter
	    actionDriver.clickUsingJS(status);
	    Reporter.log("User clicked on the 'Status' filter option", true);
	}

	public void clickOnSelectStatusSearchField() {
	    // Step 2: Open the 'Select Status' dropdown field
	    actionDriver.clickUsingJS(selectStatus);
	    Reporter.log("User clicked on the 'Select Status' dropdown field", true);

	    // Step 3: Select 'Chargeback' status option
	    actionDriver.clickUsingJS(Chargeback);
	    Reporter.log("User selected the 'Chargeback' status from the dropdown", true);

	    // Step 4: Select 'Cancelled' status option
	    actionDriver.clickUsingJS(Cancelled);
	    Reporter.log("User selected the 'Cancelled' status from the dropdown", true);
	}
	
	public void howmanyFiltersApplied() {
		String applyiedFIlterQty = actionDriver.getText(howmuchFilterApplied);
		System.out.println(applyiedFIlterQty);
	}
	
	public void clickOnPaymentMethod() {
	    actionDriver.clickUsingJS(paymentMethod);
	    Reporter.log("User clicked on the Payment Method dropdown.", true);
	}

	public void handleDatePicker() {
	    Reporter.log("User opened the date picker.", true);

	    actionDriver.clickUsingJS(datePicker);
	    Reporter.log("User clicked on the Date Picker field.", true);

	    actionDriver.clickUsingJS(previousMonthLeftFirst);
	    Reporter.log("User clicked on the previous month (left side) in Date Picker.", true);

	    actionDriver.clickUsingJS(previousMonthRightFirst);
	    Reporter.log("User clicked on the previous month (right side) in Date Picker.", true);

	    actionDriver.clickUsingJS(previousMonthLeftFirst);
	    Reporter.log("User again clicked on the previous month (left side) in Date Picker.", true);

	    actionDriver.clickUsingJS(previousMonthRightFirst);
	    Reporter.log("User again clicked on the previous month (right side) in Date Picker.", true);

	    actionDriver.clickUsingJS(nextMonthLeftFirst);
	    Reporter.log("User clicked on the next month (left side) in Date Picker.", true);

	    actionDriver.clickUsingJS(nextMonthRightFirst);
	    Reporter.log("User clicked on the next month (right side) in Date Picker.", true);
	}

	
	String selectedFromDate;
	String selectedToDate;

	public void selectCustomDateRange() {
	    Reporter.log("User is selecting a custom date range.", true);

	    // Capture and log the initially selected 'From Date'
	    selectedFromDate = actionDriver.getText(fromDate);
	    Reporter.log("Captured 'From Date' before applying range: " + selectedFromDate, true);

	    // Click on 'From Date'
	    actionDriver.clickUsingJS(fromDate);
	    Reporter.log("User clicked on the 'From Date' field.", true);

	    // Capture and log the initially selected 'To Date'
	    selectedToDate = actionDriver.getText(toDate);
	    Reporter.log("Captured 'To Date' before applying range: " + selectedToDate, true);

	    // Click on 'To Date'
	    actionDriver.clickUsingJS(toDate);
	    Reporter.log("User clicked on the 'To Date' field.", true);

	    // Apply the date range
	    actionDriver.clickUsingJS(applyButton);
	    Reporter.log("User clicked on the 'Apply' button to apply the selected date range.", true);

	    // Verify that the applied date matches the selected range
	    String appliedDate = actionDriver.getText(datePicker);
	    Reporter.log("Displayed 'Applied Date' after applying range: " + appliedDate, true);

	    if (appliedDate.contains(selectedFromDate) && appliedDate.contains(selectedToDate)) {
	        Reporter.log("PASS: Applied date range includes both 'From Date' (" + selectedFromDate + 
	                     ") and 'To Date' (" + selectedToDate + ").", true);
	    } else {
	        Reporter.log("FAIL: Applied date range does not match the selected range — Expected From: " + 
	                     selectedFromDate + ", To: " + selectedToDate + ", but got: " + appliedDate, true);
	    }
	}


	public void verifyAllDropdownIsMultiselectable() {
//		
//	    actionDriver.clickUsingJS(datePicker);
//	    Reporter.log("User clicked on the Date Picker field.", true);
		
		actionDriver.scrollToElement(applyButton);
	    Reporter.log("Verifying whether all time dropdowns are multi-selectable.", true);

	    boolean isStartTimeFromIsMultiSelectable = actionDriver.isMultiple(startTimeFrom);
                            

	    boolean isStartTimeToIsMultiSelectable = actionDriver.isMultiple(startTimeTo);


	    boolean isEndTimeFromIsMultiSelectable = actionDriver.isMultiple(endTimeFrom);


	    boolean isEndTimeToIsMultiSelectable = actionDriver.isMultiple(endTimeTo);


        Assert.assertFalse(isStartTimeFromIsMultiSelectable);
        Assert.assertFalse(isStartTimeToIsMultiSelectable);
        Assert.assertFalse(isEndTimeFromIsMultiSelectable);
        Assert.assertFalse(isEndTimeToIsMultiSelectable);
	}
	
	
	public void verifyStartFromAndEndFromDropdown() {
	    actionDriver.clickUsingJS(datePicker);
	    Reporter.log("User clicked on the Date Picker field.", true);
	    Reporter.log("===== Verifying all dropdown options for Start Time and End Time =====", true);

	    // Start Time From
	    List<String> startFromOptions = actionDriver.getDropdownOptions(startTimeFrom);
	    boolean isStartFromContains21 = startFromOptions.contains("21");
	    int allStartFromSize = startFromOptions.size();
	    Reporter.log("Start Time From dropdown contains '21': " + isStartFromContains21, true);
	    Reporter.log("Total options in Start Time From dropdown: " + allStartFromSize, true);
	    Reporter.log("All Start Time From dropdown options: " + startFromOptions, true);

	    // Start Time To
	    List<String> startToOptions = actionDriver.getDropdownOptions(startTimeTo);
	    boolean isStartToContains21 = startToOptions.contains("21");
	    int allStartToSize = startToOptions.size();
	    Reporter.log("Start Time To dropdown contains '21': " + isStartToContains21, true);
	    Reporter.log("Total options in Start Time To dropdown: " + allStartToSize, true);
	    Reporter.log("All Start Time To dropdown options: " + startToOptions, true);

	    // End Time From
	    List<String> endFromOptions = actionDriver.getDropdownOptions(endTimeFrom);
	    boolean isEndFromContains21 = endFromOptions.contains("21");
	    int allEndFromSize = endFromOptions.size();
	    Reporter.log("End Time From dropdown contains '21': " + isEndFromContains21, true);
	    Reporter.log("Total options in End Time From dropdown: " + allEndFromSize, true);
	    Reporter.log("All End Time From dropdown options: " + endFromOptions, true);

	    // End Time To
	    List<String> endTimeToOptions = actionDriver.getDropdownOptions(endTimeTo);
	    boolean isEndToContains21 = endTimeToOptions.contains("21");
	    int endTimeToSize = endTimeToOptions.size();
	    Reporter.log("End Time To dropdown contains '21': " + isEndToContains21, true);
	    Reporter.log("Total options in End Time To dropdown: " + endTimeToSize, true);
	    Reporter.log("All End Time To dropdown options: " + endTimeToOptions, true);

	    Reporter.log("===== Dropdown verification completed successfully =====", true);
	}
	public void selectStartAndEndTime(String starttimeFrom, String starttimeTo, String endtimeFrom, String endtimeTo) throws InterruptedException {
	    Reporter.log("===== Selecting Start and End Time from dropdowns =====", true);

	    actionDriver.clickUsingJS(datePicker);
	    Reporter.log("User clicked on the Date Picker field.", true);
	    // Select Start Time From
	    Thread.sleep(2500);
	    actionDriver.selectByVisibleText(startTimeFrom, starttimeFrom);
	    Reporter.log("User selected 'Start Time From' as: " + starttimeFrom, true);
	    Thread.sleep(2500);
	    // Select Start Time To
	    actionDriver.selectByVisibleText(startTimeTo, starttimeTo);
	    Reporter.log("User selected 'Start Time To' as: " + starttimeTo, true);
	    Thread.sleep(2500);
	    // Select End Time From
	    actionDriver.selectByVisibleText(endTimeFrom, endtimeFrom);
	    Reporter.log("User selected 'End Time From' as: " + endtimeFrom, true);
	    Thread.sleep(2500);
	    // Select End Time To
	    actionDriver.selectByVisibleText(endTimeTo, endtimeTo);
	    Reporter.log("User selected 'End Time To' as: " + endtimeTo, true);

	    Reporter.log("===== Successfully selected all Start and End Time dropdown values =====", true);
	}

	public void openChartofAnalytics() {
	    actionDriver.scrollToElement(addTochart);
	    Reporter.log("Scrolled to 'Add to Chart' button", true);

	    actionDriver.clickUsingJS(addTochart);
	    Reporter.log("Clicked on 'Add to Chart' button", true);
	}

	public void checkCancelAndSaveButtonAfterClickOnAddToCartButton() {
	    boolean isCancelDisplayed = actionDriver.isDisplayed(cancelOnAnalytics);
	    boolean isSaveDisplayed = actionDriver.isDisplayed(saveOnAnalytics);

	    if (isCancelDisplayed && isSaveDisplayed) {
	        Reporter.log("'Cancel' and 'Save' buttons are displayed after clicking 'Add to Chart'", true);
	    } else {
	        Reporter.log("'Cancel' and 'Save' buttons are not displayed after clicking 'Add to Chart'", true);
	    }
	}

	public void verifyClickOnTheCancelButtonAndCheck() {
	    actionDriver.click(cancelOnAnalytics);
	    Reporter.log("Clicked on 'Cancel' button in Analytics", true);

	    openChartofAnalytics();
	    Reporter.log("Reopened the Analytics chart after cancel action", true);

	    actionDriver.clickUsingJS(saveOnAnalytics);
	    Reporter.log("Clicked on 'Save' button in Analytics", true);
	}

	
	public void checkBrandnameIsBydefaultSelected() throws InterruptedException {
		Thread.sleep(2000);
		actionDriver.scrollToElement(groupByBrandname);
		Thread.sleep(2000);
	    boolean gpByBrandname = actionDriver.isDisplayed(groupByBrandname);

	    Reporter.log("Checking if 'Group by Brandname' is displayed by default: " + gpByBrandname, true);
	    System.out.println("Group by Brandname default visibility: " + gpByBrandname);

	    Assert.assertTrue(gpByBrandname, "Group by brandname is not selected by default!!!");
	    Reporter.log("'Group by Brandname' is selected by default", true);
	}

	
	public void removeChartFromAnalytics() throws InterruptedException {
		actionDriver.scrollToElement(removeChartButton);
		actionDriver.clickUsingJS(removeChartButton);
		actionDriver.clickUsingJS(removeChart);
		Thread.sleep(2000);
		actionDriver.clickUsingJS(removeChartButton);
	}

	public void handleGroupByDropdown() throws InterruptedException {
		actionDriver.clickUsingJS(groupByBrandname);
		Thread.sleep(2000);
		actionDriver.clickUsingJS(groupByPSP);
		
		
	}
	
    }
