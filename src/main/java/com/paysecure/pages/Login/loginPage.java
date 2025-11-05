package com.paysecure.pages.Login;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.paysecure.actiondriver.ActionDriver;
import com.paysecure.base.baseClass;
import com.paysecure.xpath.loginPageXpath;
public class loginPage {

	private ActionDriver actionDriver;

	private By loginButton = By.xpath(loginPageXpath.submitButton);
	private By id = By.xpath(loginPageXpath.username);
	private By pass = By.xpath(loginPageXpath.password);

	public loginPage(WebDriver driver) {
		this.actionDriver = baseClass.getActionDriver();
	}

	// Method to perform login
	public void login() throws InterruptedException {
		  String userName1 = baseClass.getProp().getProperty("username");
	        String password1 = baseClass.getProp().getProperty("password");
	//	actionDriver.sendKeysWithActions(id,userName);
		actionDriver.enterText(id,userName1);
		Reporter.log("User enter ID in Username field", true);
		actionDriver.enterText(pass,password1);
		Reporter.log("User Enter Password in password field", true);
		
		
		actionDriver.click(loginButton);
		Reporter.log("Click on submit button in login page", true);
		
		  try {
		        Robot robot = new Robot();
		        Thread.sleep(2000); // wait for dialog to appear
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		    } catch (AWTException e) {
		        e.printStackTrace();
		    }

}

public void checkUrlContainsReact(){
	String url = actionDriver.getCurrentURL();
	Assert.assertTrue(url.contains("react.paysecure.net/"),
			"URL validation failed. Expected part not found in: " + url);
	Reporter.log("URL validation passed: " + url, true);
}






}