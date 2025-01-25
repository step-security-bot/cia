package com.hack23.cia.web.impl.ui.application.views.common.menufactory.api;

import com.hack23.cia.web.impl.ui.application.views.common.pagelinks.api.PageModeMenuCommand;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.ChartIndicators;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.PageMode;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;

/**
 * The Interface PageCommandCommitteeConstants.
 */
public interface PageCommandCommitteeConstants {

    /** The command committees by party. */
    PageModeMenuCommand COMMAND_COMMITTEES_BY_PARTY = new PageModeMenuCommand(
                     UserViews.COMMITTEE_RANKING_VIEW_NAME,
                     PageMode.CHARTS, ChartIndicators.COMMITTEESBYPARTY.toString());

    /** The command current committees by party days served. */
    PageModeMenuCommand COMMAND_CURRENT_COMMITTEES_BY_PARTY_DAYS_SERVED = new PageModeMenuCommand(
                     UserViews.COMMITTEE_RANKING_VIEW_NAME,
                     PageMode.CHARTS, ChartIndicators.CURRENTCOMMITTEESBYPARTYDAYSSERVED.toString());

    /** The command charts current committees. */
    PageModeMenuCommand COMMAND_CHARTS_CURRENT_COMMITTEES = new PageModeMenuCommand(
                     UserViews.PARTY_RANKING_VIEW_NAME, PageMode.CHARTS,
                     ChartIndicators.CURRENTCOMMITTEES.toString());
}
