package com.hack23.cia.web.impl.ui.application.views.user.govermentbody.pagemode;

/**
 * Constants for the government body view pages.
 */
public interface GovernmentBodyViewConstants extends
    GovernmentBodyDescriptionConstants,
    GovernmentBodyHeaderConstants,
    GovernmentBodyGridConstants,
    GovernmentBodyLayoutConstants,
    GovernmentBodySectionConstants,
    GovernmentBodyIconConstants {

    /** The government body view. */
    // View Names
    String GOVERNMENT_BODY_VIEW = "Government Body View";

    /** The government body ranking view. */
    String GOVERNMENT_BODY_RANKING_VIEW = "Government Body Rankings";

    /** The org number property. */
    // Grid Properties
    String ORG_NUMBER_PROPERTY = "orgNumber";

    /** The government bodies. */
    String GOVERNMENT_BODIES = "Government bodies";

    /** The default year. */
    int DEFAULT_YEAR = 2024;

    /** The visit government body. */
    // View Actions
    String VISIT_GOVERNMENT_BODY = "VISIT_GOVERNMENT_BODY";

    /** The visit government ranking. */
    String VISIT_GOVERNMENT_RANKING = "VISIT_GOVERNMENT_RANKING";
}
