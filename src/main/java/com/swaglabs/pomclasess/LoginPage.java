package com.swaglabs.pomclasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility {

	
		//declaration
	@FindBy(xpath="//input[@id='user-name']")private WebElement untxt; 
	@FindBy(xpath="//input[@id='password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	    //initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
		}
	//getters
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//Business Library
	public void loginToApp(String un,String pwd) {
		 untxt.sendKeys(un);
		 pwdtxt.sendKeys(pwd);
		 loginBtn.click();
	}
	}
	
	
	
	
	

