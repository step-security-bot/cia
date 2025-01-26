package com.hack23.cia.web.impl.ui.application.views.common.menufactory.api.pagecommands;

import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.ChartIndicators;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;

/**
 * The Interface PageCommandCommitteeRankingConstants.
 */
public interface PageCommandCommitteeRankingConstants {


    /** The command committees link. */
    PageModeMenuCommand COMMAND_COMMITTEES_LINK = new PageModeMenuCommand(
            UserViews.COMMITTEE_RANKING_VIEW_NAME, PageMode.DATAGRID);


    /** The command committee ranking datagrid. */
    PageModeMenuCommand COMMAND_COMMITTEE_RANKING_DATAGRID = new PageModeMenuCommand(
                     UserViews.COMMITTEE_RANKING_VIEW_NAME, PageMode.DATAGRID);

    /** The command committee ranking overview. */
    PageModeMenuCommand COMMAND_COMMITTEE_RANKING_OVERVIEW = new PageModeMenuCommand(
                     UserViews.COMMITTEE_RANKING_VIEW_NAME, PageMode.OVERVIEW);

    /** The command all committees by headcount. */
    PageModeMenuCommand COMMAND_ALL_COMMITTEES_BY_HEADCOUNT = new PageModeMenuCommand(
                     UserViews.COMMITTEE_RANKING_VIEW_NAME,
                     PageMode.CHARTS, ChartIndicators.ALLCOMMITTEESBYHEADCOUNT.toString());

    /** The command current committees by headcount. */
    PageModeMenuCommand COMMAND_CURRENT_COMMITTEES_BY_HEADCOUNT = new PageModeMenuCommand(
                     UserViews.COMMITTEE_RANKING_VIEW_NAME,
                     PageMode.CHARTS, ChartIndicators.CURRENTCOMMITTEESBYHEADCOUNT.toString());

    /** The committee ranking command pagevisit history. */
    PageModeMenuCommand COMMITTEE_RANKING_COMMAND_PAGEVISIT_HISTORY = new PageModeMenuCommand(
                     UserViews.COMMITTEE_RANKING_VIEW_NAME, PageMode.PAGEVISITHISTORY);


    /** The command charts current committees. */
    PageModeMenuCommand COMMAND_CHARTS_CURRENT_COMMITTEES = new PageModeMenuCommand(
        UserViews.COMMITTEE_RANKING_VIEW_NAME, PageMode.CHARTS, "CURRENT_COMMITTEES");

}
