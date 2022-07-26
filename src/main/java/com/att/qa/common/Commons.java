package com.att.qa.common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.att.qa.reporting.Loggers;

public class Commons {
	public void click(WebElement element) {
		try {
			element.click();
			Loggers.getLog(element + "  : ----> This element has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.getLog(element + "  :  This element not found");
			Assert.fail();

		}

	}
}
