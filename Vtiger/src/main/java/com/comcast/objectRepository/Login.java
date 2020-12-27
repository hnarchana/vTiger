package com.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Archana
 *
 */
public class Login
{
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	private WebElement userNameEdt;
	
	@FindBy(name = "user_password")
	private WebElement passWordEdt;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	public WebElement getPassWordEdt() {
		return passWordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void loginToApp(String userName, String passWord)
	{
		userNameEdt.sendKeys(userName);
		passWordEdt.sendKeys(passWord);
		loginBtn.click();
	}
	
	

}
