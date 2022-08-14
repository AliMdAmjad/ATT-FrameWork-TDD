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
	
	@FindBy(xpath = "(//span[text()='Internet'])[1]")
	WebElement clickinternetElement;
	
	@FindBy(className = "btn-primary-2 btn-arrow btn-large btn rel")
	WebElement shopInternetElement;
	
	
	public void internetMenu() {
		commons.click(clickinternetElement);
	}
	
	public void internetShopClick() {
		commons.click(shopInternetElement);
	}
	
	
	
	
	
	public void internetPageSteps() {
		internetMenu();
		internetShopClick();
	}
	
	
	
	
	
	

}
