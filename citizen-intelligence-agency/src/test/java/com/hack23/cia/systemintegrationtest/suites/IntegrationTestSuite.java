package com.hack23.cia.systemintegrationtest.suites;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;

import com.hack23.cia.systemintegrationtest.CitizenIntelligenceAgencyServer;
import com.hack23.cia.systemintegrationtest.admin.configuration.AdminConfigurationTest;
import com.hack23.cia.systemintegrationtest.admin.data.AdminDataTest;
import com.hack23.cia.systemintegrationtest.admin.operations.AdminOperationsTest;
import com.hack23.cia.systemintegrationtest.admin.security.AdminSecurityTest;
import com.hack23.cia.systemintegrationtest.ui.UserPageVisit;
import com.hack23.cia.systemintegrationtest.ui.WebDriverFactory;
import com.hack23.cia.systemintegrationtest.user.home.UserHomeTest;

/**
 * The Class IntegrationTestSuite.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    AdminConfigurationTest.class,
    AdminDataTest.class,
    AdminOperationsTest.class,
    AdminSecurityTest.class,
    UserHomeTest.class
})
public class IntegrationTestSuite {

	/** The Constant BASE_URL. */
	protected static final String BASE_URL = System.getProperty("system.test.target.url",
			CitizenIntelligenceAgencyServer.ACCESS_URL);

	/** The driver. */
	protected static WebDriver driver;


	/** The page visit. */
	protected static UserPageVisit pageVisit;

	protected static final boolean usingExternalServer;

	/** The Constant webDriverMap. */
	static {
		final String systemTestTargetUrlProperty = System.getProperty("system.test.target.url");
		if (systemTestTargetUrlProperty != null && systemTestTargetUrlProperty.isEmpty()) {
			usingExternalServer = true;
		} else {
			usingExternalServer = false;
		}



		CitizenIntelligenceAgencyServer.setEnv("CIA_APP_ENCRYPTION_PASSWORD", "allhaildiscordia");
	}

	/**
	 * Global setup.
	 */
	@BeforeClass
	public static void globalSetup() {
		driver = WebDriverFactory.createDriver();
		pageVisit = new UserPageVisit(driver);
	}

	/**
	 * Global teardown.
	 */
	@AfterClass
	public static void globalTeardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	/**
	 * Start server.
	 *
	 * @throws Exception
	 *                   the exception
	 */
	@BeforeClass
	public static final synchronized void startServer() throws Exception {
		if (!usingExternalServer) {
			CitizenIntelligenceAgencyServer.startTestServer();
		}
	}

	/**
	 * Stop server.
	 *
	 * @throws Exception
	 *                   the exception
	 */
	@AfterClass
	public static final synchronized void stopServer() throws Exception {
		if (!usingExternalServer) {
			CitizenIntelligenceAgencyServer.stopTestServer();
		}
	}

	@After
	public void cleanBrowser() {
		pageVisit.cleanBrowser();
	}


}
