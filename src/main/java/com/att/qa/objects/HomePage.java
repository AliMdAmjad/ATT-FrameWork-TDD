package com.att.qa.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.att.qa.common.Commons;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='z1-searchfield']")
	WebElement searchElement;
	
	@FindBy(xpath = "(//span[@class='att-search-highlight'])[1]")
	WebElement clickingSearch;
	
	@FindBy(xpath = "//input[@id='Silver']")
	WebElement colorSelectElement;
	
	@FindBy(xpath = "(//div[@class='jsx-3595842764 flex full-width font-regular type-base color-ui-black  mar-b-none'])[1]") WebElement capacityElement;
	
	@FindBy(xpath = "(//div[@class='jsx-3086675332 radio-button-skin line-h-md  btn flex btn-full-width flex-column pad-xs pad-xs'])[6]") WebElement priceOption;
	
	@FindBy(xpath = "//button[@class='btn btn-primary-2 false bg-functional-blue color-ui-white btn-large btn-full-width']") WebElement continueButtonElement;

	@FindBy(xpath = "(//button[@class='btn  false btn-secondary btn-small btn-full-width JBIsG pad-l-xs pad-r-xs pad-t-none pad-b-none'])[1]") WebElement newCustomerElement;
	
	@FindBy(xpath ="//button[@value='nonMixAndMatch']") WebElement otherPlanElement;
	
	
	
	

	
	
	public void searchField(Commons ca) {
		ca.inputValues(searchElement, "iPhone 13 pro max");

	}
	
	public void clickMagnifier(Commons ca) {
		ca.click(clickingSearch);
	}
	
	public void chooseColor(Commons ca) {
		ca.click(colorSelectElement);
	}
	
	public void selectCapacity(Commons ca) {
		ca.click(capacityElement);
	}
	
	public void selectPrice(Commons ca) {
		ca.click(priceOption);
	}
	
	public void clickingContinue(Commons ca) {
		ca.click(continueButtonElement);
	}
	
	public void newCustomerButton(Commons ca) {
		ca.click(newCustomerElement);
	}
	
	public void choosePlan(Commons ca) {
		ca.click(otherPlanElement);
	}
	
	
	

}
