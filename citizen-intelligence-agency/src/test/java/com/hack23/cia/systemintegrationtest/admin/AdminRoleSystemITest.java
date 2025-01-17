/*
 * Copyright 2010-2025 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.systemintegrationtest.admin;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebElement;

import com.hack23.cia.systemintegrationtest.categories.IntegrationTest;
import com.hack23.cia.web.impl.ui.application.views.admin.AdminViewConstants;
import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.PageCommandAdminConstants;

@Category(IntegrationTest.class)
public final class AdminRoleSystemITest extends AbstractAdminTest {

	// Remove duplicates and keep only specialized tests:
	// - Application Session pagination tests
	// - Data Summary specific operations
	// - Other unique functionality tests

	@Test(timeout = DEFAULT_TIMEOUT)
	public void siteAdminApplicationSessionLastPageTest() throws Exception {
		pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_APPLICATION_SESSION);
		pageVisit.verifyPageContent(AdminViewConstants.ADMIN_APPLICATION_SESSION);
		final WebElement nextPageButton = pageVisit.findButton("last page");
		pageVisit.performClickAction(nextPageButton);
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void siteAdminApplicationSessionNextPageTest() throws Exception {
		pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_APPLICATION_SESSION);
		final WebElement nextPageButton = pageVisit.findButton("next page");
		pageVisit.performClickAction(nextPageButton);
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void visitAdminDataSummaryViewRefreshViewsTest() throws Exception {
		pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_DATASUMMARY);
		final WebElement refreshViewsButton = pageVisit.findButton("Refresh Views");
		assertNotNull("Expect to find a Refresh Views Button", refreshViewsButton);
		pageVisit.performClickAction(refreshViewsButton);
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void visitAdminDataSummaryViewRemoveApplicationHistoryTest() throws Exception {
		pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_DATASUMMARY);
		final WebElement removeApplicationHistoryButton = pageVisit.findButton("Remove Application History");
		assertNotNull("Expect to find a Button", removeApplicationHistoryButton);
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void visitAdminDataSummaryViewRemoveDocumentsTest() throws Exception {
		pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_DATASUMMARY);
		final WebElement removeDocumentsButton = pageVisit.findButton("Remove Documents");
		assertNotNull("Expect to find a Button", removeDocumentsButton);
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void visitAdminDataSummaryViewRemovePoliticianTest() throws Exception {
		pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_DATASUMMARY);
		final WebElement removePoliticiansButton = pageVisit.findButton("Remove Politicians");
		assertNotNull("Expect to find a Button", removePoliticiansButton);
	}

	@Test(timeout = DEFAULT_TIMEOUT)
	public void visitAdminDataSummaryViewUpdateSearchIndexTest() throws Exception {
		pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_DATASUMMARY);
		final WebElement updateSearchIndexButton = pageVisit.findButton("Update Search Index");
		assertNotNull("Expect to find a Update Search Index Button", updateSearchIndexButton);
		pageVisit.performClickAction(updateSearchIndexButton);
	}
}

