package com.att.qa.test.homePage;

import org.testng.annotations.Test;
import com.att.qa.base.BaseClass;

public class TestDeals extends BaseClass {

	@Test
	public void searchBox() {
		hp.searchField(ca);
		hp.clickMagnifier(ca);
		hp.chooseColor(ca);
		hp.selectCapacity(ca);
		hp.selectPrice(ca);
		hp.clickingContinue(ca);
		hp.newCustomerButton(ca);
		hp.choosePlan(ca);

	}
}
