package test;

import static org.junit.Assert.assertNotNull;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest {

	private WebDriver driver;
	private String remoteDriverUrl = "http://localhost:4444/wd/hub";
	private BasicPOM pom = new BasicPOM();

	@Before
	public void setupTest() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setJavascriptEnabled(true);
		caps.setAcceptInsecureCerts(true);
		caps.acceptInsecureCerts();
		
		
		try {
			driver = new RemoteWebDriver(new URL(remoteDriverUrl), caps);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Test
	public void test1() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test2() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test3() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test4() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test5() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test6() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test7() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test8() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

	@Test
	public void test9() {
		assertNotNull(pom.visitSiteReturnTitle(driver));
	}

}