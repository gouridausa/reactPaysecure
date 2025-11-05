package com.paysecure.pages.Dashboard;

import com.paysecure.actiondriver.ActionDriver;
import com.paysecure.base.baseClass;
import com.paysecure.xpath.Dashboard.DashboardPayinLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class DashboardPayin {

private By payin= By.xpath(DashboardPayinLocators.payin);
private By dashboard=By.xpath(DashboardPayinLocators.dashboard);

//verify all headers
private By filters=By.xpath(DashboardPayinLocators.filters);
    private By quickInsights=By.xpath(DashboardPayinLocators.quickInsights);
    private By analytics=By.xpath(DashboardPayinLocators.analytics);
    private By topPaymentsMethods=By.xpath(DashboardPayinLocators.topPaymentsMethods);
    private By regionWisePayments=By.xpath(DashboardPayinLocators.regionWisePayments);
    private By summary=By.xpath(DashboardPayinLocators.summary);
    private By quickInsightQuantity=By.xpath(DashboardPayinLocators.quickInsightQuantity);


//Quick insights
   // private By quickInsightInsighter=By.xpath(DashboardPayinLocators.quickInsightInsighter);
    @FindBy(xpath="//h6[@class='sc-fhHczv bGBovy sc-cNwwfj aZYDm']") private List<WebElement> quickInsightInsighter;
    private By editQuickInsights=By.xpath(DashboardPayinLocators.editQuickInsights);
    private By approvalRate=By.xpath(DashboardPayinLocators.approvalRate);
    private By approvedAmount=By.xpath(DashboardPayinLocators.approvedAmount);
    private By averageOrderAmount=By.xpath(DashboardPayinLocators.averageOrderAmount);
    private By totalTransactions=By.xpath(DashboardPayinLocators.totalTransactions);

    private By ApprovalRate=By.xpath(DashboardPayinLocators.ApprovalRate);
    private By ApprovedAmount=By.xpath(DashboardPayinLocators.ApprovedAmount);
    private By AverageOrderAmount=By.xpath(DashboardPayinLocators.AverageOrderAmount);
    private By TotalTransactions=By.xpath(DashboardPayinLocators.TotalTransactions);


    private ActionDriver actionDriver;
    private WebDriver driver;

    // page factory constructor
    public DashboardPayin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.actionDriver = new ActionDriver(driver);
    }

    public void checkPayinButtonIsClickableOrNot(){
        boolean clickable = actionDriver.isEnabled(payin);
        Assert.assertTrue(clickable, "Payin button is not clickable!");
        Reporter.log("Checking if Payin button is clickable: " + clickable, true);
    }

    public void clickOnPayInButton(){
        actionDriver.clickUsingJS(payin);
        Reporter.log("Clicked on 'Payin' button successfully.", true);
    }

public void checkUserIsOnTheDsshboardPage(){
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
        List<WebElement> quickInsightInsighters = driver.findElements(
                By.xpath("//h6[@class='sc-fhHczv bGBovy sc-cNwwfj aZYDm']")
        );

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

        Assert.assertEquals(quickQuantity, displayedQuickInsightsCount,
                "Quick Insights count mismatch — expected: " + quickQuantity + ", actual: " + displayedQuickInsightsCount);

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
        WebDriver driver=baseClass.getDriver();
        Reporter.log("Verifying 'Quick Insights' checkboxes are in disabled state...", true);

        actionDriver.scrollToElement(ApprovedAmount);
        // All insight names
        String[] quickInsights = {
                "Approval Rate",
                "Approved Amount",
                "Average Order Amount",
                "Total Transactions"
        };

        for (String insight : quickInsights) {
            // Locate the <input> for each label text (the actual checkbox)
            WebElement checkbox = driver.findElement(
                    By.xpath("//p[normalize-space()='" + insight + "']/preceding::input[1]")
            );

            // Check for disabled attribute
            String disabled = checkbox.getAttribute("disabled");

            Reporter.log(insight + " → disabled attribute value: " + disabled, true);

            // Verify the checkbox is disabled
            Assert.assertNotNull(disabled, insight + " checkbox should be disabled but is not.");

            Reporter.log("✅ " + insight + " is in disabled state.", true);
        }
    }

public void clickOnEditQuickSetting(){
    actionDriver.click(editQuickInsights);
    Reporter.log("Clicked on 'Edit Quick Insights' button.", true);

}












}
