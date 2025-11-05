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
    public static final  String editQuickInsights="//span[text()='Edit insights →']";
    public static final  String approvalRate="//h6[text()='Approval Rate']";
    public static final  String approvedAmount="//h6[text()='Approved Amount']";
    public static final  String averageOrderAmount="//h6[text()='Average Order Amount']";
    public static final  String totalTransactions="//h6[text()='Total Transactions']";

    //edit quick insights
    public static final String ApprovalRate="//p[normalize-space()='Approval Rate']/ancestor::label[1]";
    public static final  String ApprovedAmount="//p[text()='Approved Amount']";
    public static final  String AverageOrderAmount="//p[text()='Average Order Amount']";
    public static final  String TotalTransactions="//p[text()='Total Transactions']";
}
