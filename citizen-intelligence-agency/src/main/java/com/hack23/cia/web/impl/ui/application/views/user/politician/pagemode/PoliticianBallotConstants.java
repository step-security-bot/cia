package com.hack23.cia.web.impl.ui.application.views.user.politician.pagemode;

/**
 * The Interface PoliticianBallotConstants.
 */
public interface PoliticianBallotConstants {

    /** The ballot id. */
    String BALLOT_ID = "ballotId";

    /** The column order. */
    String[] COLUMN_ORDER = { "voteDate", "rm", "org", "committeeReport", "title",
            "subTitle", "winner", "embeddedId.concern", "embeddedId.issue", "vote", "won", "rebel", "noWinner",
            "approved", "partyApproved", "againstProposalNumber", "againstProposalParties", "totalVotes",
            "partyTotalVotes", "yesVotes", "partyYesVotes", "noVotes", "partyNoVotes", "partyAbstainVotes",
            "abstainVotes", "partyAbsentVotes", "absentVotes", "bornYear", "partyAvgBornYear", "avgBornYear",
            "ballotType", "decisionType", "ballotId" };

    /** The hide columns. */
    String[] HIDE_COLUMNS = { "label", "endNumber", "publicDate", "createdDate",
            "embeddedId", "partyNoWinner", "partyPercentageYes", "partyPercentageNo", "partyPercentageAbsent",
            "partyPercentageAbstain", "percentageYes", "percentageNo", "percentageAbsent", "percentageAbstain",
            "firstName", "lastName", "party", "ballotId", "decisionType", "ballotType", "againstProposalNumber" };

    /** The nested properties. */
    String[] NESTED_PROPERTIES = { "embeddedId.concern", "embeddedId.issue" };

    /** The committee ballot decision summary. */
    String COMMITTEE_BALLOT_DECISION_SUMMARY = "Committee Ballot Decision Summary";
}
