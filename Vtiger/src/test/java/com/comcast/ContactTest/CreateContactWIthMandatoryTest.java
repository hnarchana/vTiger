package com.comcast.ContactTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateContactWIthMandatoryTest
{
	
	@Test
	public void createContactTest() {
		WebDriverManager.chromedriver();
		System.out.println("create contact");
	}
	
	@Test
	public void createContactwithPhoneTest() {
		System.out.println("create contact with phone");
	}
	
}
