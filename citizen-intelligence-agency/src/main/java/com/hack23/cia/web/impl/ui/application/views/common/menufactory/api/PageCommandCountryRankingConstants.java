package com.hack23.cia.web.impl.ui.application.views.common.menufactory.api;

import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;

/**
 * The Interface PageCommandCountryRankingConstants.
 */
public interface PageCommandCountryRankingConstants {

    /** The command country ranking overview. */
    // Standardize to: COMMAND_[VIEW]_[ACTION]
    PageModeMenuCommand COMMAND_COUNTRY_RANKING_OVERVIEW = new PageModeMenuCommand(
                     UserViews.COUNTRY_RANKING_VIEW_NAME, PageMode.OVERVIEW);

    /** The command country ranking pagevisit history. */
    // Should be: COMMAND_COUNTRY_RANKING_PAGEVISIT_HISTORY for consistency
    PageModeMenuCommand COMMAND_COUNTRY_RANKING_PAGEVISIT_HISTORY = new PageModeMenuCommand(
                     UserViews.COUNTRY_RANKING_VIEW_NAME, PageMode.PAGEVISITHISTORY);

}
