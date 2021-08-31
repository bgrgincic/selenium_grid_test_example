package test;

import org.openqa.selenium.WebDriver;

public class BasicPOM {

	private static final int SLEEP_TIME = 1000;

	public String visitSiteReturnTitle(WebDriver driver) {

		for (int i = 0; i < 60; i++) {
			driver.get("https://github.com/");
			TestUtil.sleep(SLEEP_TIME);
		}

		return driver.getTitle();

	}

}
