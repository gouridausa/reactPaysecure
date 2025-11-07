package com.paysecure.xpath.Dashboard;

public class DashboardPayinLocators {

    public static final String payin="//p[normalize-space()='Payin']";
    public static final String dashboard="//h5[text()='Dashboard']";

//verify all headers in paiy in dashboard
    public static final String filters="//div[text()='Filters']";
    public static final String quickInsights="//h5[contains(text(),'Quick Insights')]";

    public static final String analytics="//h5[text()='Analytics']";
    public static final String topPaymentsMethods="//h5[text()='Top payment methods']";
    public static final String regionWisePayments="//h5[text()='Region wise payments']";
    public static final String summary="//h5[text()='Summary']";

    //verify quick insights
    public static final String quickInsightInsighter="//h6[@class='sc-fhHczv bGBovy sc-cNwwfj aZYDm']";
    public static final String quickInsightQuantity="//h5[contains(text(),'Quick Insights')]";
    public static final  String editQuickInsights="//button[@class='sc-bRKDuR ifRTKL']";
    public static final  String approvalRate="//h6[text()='Approval Rate']";
    public static final  String approvedAmount="//h6[text()='Approved Amount']";
    public static final  String averageOrderAmount="//h6[text()='Average Order Amount']";
    public static final  String totalTransactions="//h6[text()='Total Transactions']";

    //edit quick insights
    public static final String ApprovalRate="//p[normalize-space()='Approval Rate']/ancestor::label[1]";
    public static final  String ApprovedAmount="//p[text()='Approved Amount']";
    public static final  String AverageOrderAmount="//p[text()='Average Order Amount']";
    public static final  String TotalTransactions="//p[text()='Total Transactions']";
    public static final String insightsTotaltext="//p[contains(text(),'insights selected')]";
   
    //check quick insides all 7 are clickable or not 
    public static final String ChargebackCount="//p[contains(text(),'insights selected')]";
    public static final String ChargebackPercentage="//p[contains(text(),'insights selected')]";
    public static final String ErrorRate="//p[contains(text(),'insights selected')]";
    public static final String PendingTransactions="//p[contains(text(),'insights selected')]";
    public static final String RefundAmount="//p[contains(text(),'insights selected')]";
    public static final String RefundCount="//p[contains(text(),'insights selected')]";
    public static final String RefundPercentage="//p[contains(text(),'insights selected')]";
    
    
    //cancel button , discard and save button
    public static final String cancelButton="//button[@aria-label='Close modal']";
    public static final String discardButton="(//button[@class='sc-bRKDuR gLGWkt'])[3]";
    public static final String saveButton="//span[text()='Save']";
    
    //filters
    public static final String filtersApplied="//span[text()=' Filters applied']";
    public static final String selectCurrency="//span[text()='Select Currency']";
    public static final String AED="//span[text()='AED']";
    public static final String ALL="//span[text()='ALL']";
    
    //reset filter
    public static final String resetFilter="//span[text()='Reset filter']";
    public static final String clearAll="//span[text()='Clear All']";
    public static final String discard="//span[text()='Discard']";
    public static final String apply="(//span[text()='Apply'])[1]";
    
    public static final String searchCurrencttextfield="(//input[contains(@id,'input')])[2]";
    
    //status filter
    public static final String status="//p[text()='Status']";
    public static final String selectStatus="//span[text()='Select Status']";
    public static final String Cancelled="//span[text()='Cancelled']";
    public static final String Chargeback="//span[text()='Chargeback']";
    public static final String howmuchFilterApplied="//span[contains(text(),'Filters applied')]";
    public static final String paymentMethod="//p[text()='Payment Methods']";
    
    //handle date picker
    public static final String datePicker="//span[contains(@class,'sc-boKDdR')]";
    public static final String previousMonthLeftFirst="(//button[@class='sc-ixcdjX gMqwwH'])[1]";
    public static final String previousMonthRightFirst="(//button[@class='sc-ixcdjX gMqwwH'])[2]";
    public static final String nextMonthLeftFirst="(//button[@class='sc-ixcdjX gMqwwH'])[3]";
    public static final String nextMonthRightFirst="(//button[@class='sc-ixcdjX gMqwwH'])[4]";
    public static final String fromDate="(//button[text()='25'])[1]";
    public static final String toDate="(//button[text()='28'])[2]";
    public static final String applyButton="(//span[text()='Apply'])[2]";

    public static final String startTimeFrom="(//select[@class='sc-jDJeIs jqTIdZ'])[1]";
    public static final String startTimeTo="(//select[@class='sc-jDJeIs jqTIdZ'])[2]";
    public static final String endTimeFrom="(//select[@class='sc-jDJeIs jqTIdZ'])[3]";
    public static final String endTimeTo="(//select[@class='sc-jDJeIs jqTIdZ'])[4]";
    
    
}
