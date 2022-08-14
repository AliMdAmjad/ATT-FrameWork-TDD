package com.att.qa.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.att.qa.common.CommonFunction;

public class InternetPage {
	
	CommonFunction commons;

	public InternetPage(WebDriver driver, CommonFunction commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
	}
	
	@FindBy(xpath = "//a[@class='z1-tier1-links z1-link' and @title='Internet']")
	WebElement clickinternetElement;
	
	
	public void internetMenu() {
		commons.click(clickinternetElement);
	}
	
	
	
	
	
	public void internetPageSteps() {
		internetMenu();
		
	}
	
	
	
	
	
	

}
