package com.att.qa.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.att.qa.common.CommonFunction;

public class HomePage {

	CommonFunction commons;

	public HomePage(WebDriver driver, CommonFunction commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;

	}

	@FindBy(xpath = "//input[@id='z1-searchfield']")
	WebElement searchElement;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickingSearch;

	@FindBy(xpath = "//button[@class='_1zYaL btn-large btn-primary btn-arrow']")
	WebElement shopNoWebElement;

	@FindBy(xpath = "//input[@id='Silver']")
	WebElement colorSelectElement;

	@FindBy(xpath = "(//div[@class='jsx-3595842764 flex full-width font-regular type-base color-ui-black  mar-b-none'])[1]")
	WebElement capacityElement;

	@FindBy(xpath = "//div[text()='Full retail price']")
	WebElement priceOption;

	@FindBy(xpath = "//button[@class='btn btn-primary-2 false bg-functional-blue color-ui-white btn-large btn-full-width']")
	WebElement continueButtonElement;

	@FindBy(xpath = "(//button[@class='btn  false btn-secondary btn-small btn-full-width JBIsG pad-l-xs pad-r-xs pad-t-none pad-b-none'])      [1]")
	WebElement newCustomerElement;

	@FindBy(xpath = "//button[@value='nonMixAndMatch']")
	WebElement otherPlanElement;

	@FindBy(xpath = "//body[@class='bg-ui-background-gray attgn-page']")
	WebElement selectPlanElement;

	@FindBy(xpath = "//button[@class='btn btn-primary-2 false btn-large btn-full-width bg-functional-blue color-ui-white']")
	WebElement continu1Element;

	@FindBy(xpath = "//button[text()='Go to cart']")
	WebElement goToCartElement;

	public void searchField(String value) {
		commons.inputValues(searchElement, value);

	}

	public void clickMagnifier() {
		commons.click(clickingSearch);
	}

	public void clickShopNow() {
		commons.click(shopNoWebElement);
	}

	public void chooseColor() {
		commons.click(colorSelectElement);
	}

	public void selectCapacity() {
		commons.click(capacityElement);
	}

	public void selectPrice() {
		commons.click(priceOption);
	}

	public void clickingContinue() {
		commons.click(continueButtonElement);
	}

	public void newCustomerButton() {
		commons.click(newCustomerElement);
	}

	public void choosePlan() {
		commons.click(otherPlanElement);
	}

	public void selectAttPlan() {
		commons.click(selectPlanElement);
	}

	public void continueButton2() {
		commons.click(continu1Element);
	}

	public void cartButton() {
		commons.click(goToCartElement);
	}

	public void homepageSteps(String value) {

		searchField(value);
		clickMagnifier();
		clickShopNow();
		chooseColor();
		selectCapacity();
		selectPrice();
		clickingContinue();
		newCustomerButton();
		choosePlan();
		selectAttPlan();
		continueButton2();
		cartButton();

	}

}
