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

	@FindBy(xpath ="(//span[text()='Deals'])[1]")
	WebElement dealsElement;

	public void selectDeals(Commons ca) {
		ca.click(dealsElement);

	}

}
