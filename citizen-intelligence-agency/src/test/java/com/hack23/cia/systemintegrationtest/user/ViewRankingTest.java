package com.hack23.cia.systemintegrationtest.user;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.hack23.cia.systemintegrationtest.AbstractUITest;
import com.hack23.cia.systemintegrationtest.categories.IntegrationTest;
import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;

@Category(IntegrationTest.class)
public class ViewRankingTest extends AbstractUITest {
    private static final int DEFAULT_MAX_RETRIES = 3;


    @Test(timeout = DEFAULT_TIMEOUT)
    public void testViewRanking() throws Exception {
        retryOnFailure(() -> {
            try {
                pageVisit.visitDirectPage(new PageModeMenuCommand(UserViews.GOVERNMENT_BODY_RANKING_VIEW_NAME, ""));
                pageVisit.verifyPageContent("Ranking");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }, DEFAULT_MAX_RETRIES);
    }
}
