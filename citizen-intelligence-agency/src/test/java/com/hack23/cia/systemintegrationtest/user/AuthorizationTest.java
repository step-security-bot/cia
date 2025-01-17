package com.hack23.cia.systemintegrationtest.user;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hack23.cia.systemintegrationtest.AbstractUITest;
import com.hack23.cia.systemintegrationtest.categories.IntegrationTest;
import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.AdminViews;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.CommonsViews;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;

@Category(IntegrationTest.class)
public class AuthorizationTest extends AbstractUITest {

	@Test(timeout = DEFAULT_TIMEOUT)
	public void shouldDenyAccessToAdminPages() {
		// Try accessing admin pages without login
		pageVisit.visitDirectPage(new PageModeMenuCommand(AdminViews.ADMIN_AGENT_OPERATIONVIEW_NAME, ""));
		pageVisit.verifyPageContent("Access denied");

		pageVisit.visitDirectPage(new PageModeMenuCommand(AdminViews.ADMIN_MONITORING_VIEW_NAME, ""));
		pageVisit.verifyPageContent("Access denied");

	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void shouldAllowAccessToPublicPages() {
		// Public pages should be accessible without login
		pageVisit.visitDirectPage(new PageModeMenuCommand(CommonsViews.MAIN_VIEW_NAME, ""));
		pageVisit.verifyPageContent("Welcome");

		pageVisit.visitDirectPage(new PageModeMenuCommand(UserViews.POLITICIAN_VIEW_NAME, ""));
		pageVisit.verifyPageContent("Politicians");

	}
}
