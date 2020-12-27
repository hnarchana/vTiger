package com.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home
{
	/**
	 * @author Archana
	 * 
	 */
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
