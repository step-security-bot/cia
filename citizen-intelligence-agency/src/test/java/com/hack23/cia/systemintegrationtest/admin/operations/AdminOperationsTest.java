package com.hack23.cia.systemintegrationtest.admin.operations;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebElement;

import com.hack23.cia.systemintegrationtest.admin.AbstractAdminTest;
import com.hack23.cia.systemintegrationtest.categories.IntegrationTest;
import com.hack23.cia.web.impl.ui.application.views.admin.AdminViewConstants;
import com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.PageCommandAdminConstants;

@Category(IntegrationTest.class)
public final class AdminOperationsTest extends AbstractAdminTest {

    @Test(timeout = DEFAULT_TIMEOUT)
    public void verifyAgentOperation() throws Exception {
        pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_AGENT_OPERATION);
        verifyViewContent(
            AdminViewConstants.ADMIN_AGENT_OPERATION_OVERVIEW,
            AdminViewConstants.ADMIN_AGENT_OPERATION,
            AdminViewConstants.ADMIN_AGENT_OPERATION_TASKS_OVERVIEW
        );
        pageVisit.validatePage(PageCommandAdminConstants.COMMAND_AGENT_OPERATION);
    }

    @Test(timeout = DEFAULT_TIMEOUT)
    public void verifyEmailOperation() throws Exception {
        pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_EMAIL);
        pageVisit.verifyPageContent(AdminViewConstants.ADMIN_EMAIL_MANAGEMENT);
        pageVisit.validatePage(PageCommandAdminConstants.COMMAND_EMAIL);
    }

    @Test(timeout = DEFAULT_TIMEOUT)
    public void verifyMonitoringOperation() throws Exception {
        pageVisit.visitDirectPage(PageCommandAdminConstants.COMMAND_MONITORING);
        pageVisit.verifyPageContent(AdminViewConstants.ADMIN_MONITORING);
        pageVisit.validatePage(PageCommandAdminConstants.COMMAND_MONITORING);
    }
}
