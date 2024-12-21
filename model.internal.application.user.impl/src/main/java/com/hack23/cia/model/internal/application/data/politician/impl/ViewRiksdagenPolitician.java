//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.25 at 12:05:09 AM CET
//

package com.hack23.cia.model.internal.application.data.politician.impl;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;

// TODO: Auto-generated Javadoc
/**
 * <p>
 * Java class for ViewRiksdagenPolitician complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="ViewRiksdagenPolitician"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="party" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bornYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="firstAssignmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lastAssignmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="totalDaysServed" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedParliament" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedCommittee" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedGovernment" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedEu" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeEu" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeGovernment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeCommittee" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeParliament" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeParty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activeSpeaker" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="totalDaysServedSpeaker" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalDaysServedParty" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalPartyAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalMinistryAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalCommitteeAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalSpeakerAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentPartyAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentMinistryAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentCommitteeAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentSpeakerAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenPolitician", propOrder = { "personId", "firstName", "lastName", "party", "gender",
		"bornYear", "totalAssignments", "currentAssignments", "firstAssignmentDate", "lastAssignmentDate",
		"totalDaysServed", "totalDaysServedParliament", "totalDaysServedCommittee", "totalDaysServedGovernment",
		"totalDaysServedEu", "active", "activeEu", "activeGovernment", "activeCommittee", "activeParliament",
		"activeParty", "activeSpeaker", "totalDaysServedSpeaker", "totalDaysServedParty", "totalPartyAssignments",
		"totalMinistryAssignments", "totalCommitteeAssignments", "totalSpeakerAssignments", "currentPartyAssignments",
		"currentMinistryAssignments", "currentCommitteeAssignments", "currentSpeakerAssignments",
		"totalCommitteeSubstituteAssignments", "currentCommitteeSubstituteAssignments",
		"totalDaysServedCommitteeSubstitute", "totalCommitteeLeadershipAssignments",
		"currentCommitteeLeadershipAssignments", "totalDaysServedCommitteeLeadership" })
@Entity(name = "ViewRiksdagenPolitician")
@Table(name = "VIEW_RIKSDAGEN_POLITICIAN")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenPolitician implements ModelObject {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The person id. */
	@XmlElement(required = true)
	protected String personId;

	/** The first name. */
	@XmlElement(required = true)
	protected String firstName;

	/** The last name. */
	@XmlElement(required = true)
	protected String lastName;

	/** The party. */
	@XmlElement(required = true)
	protected String party;

	/** The gender. */
	@XmlElement(required = true)
	protected String gender;

	/** The born year. */
	protected int bornYear;

	/** The total assignments. */
	protected long totalAssignments;

	/** The current assignments. */
	protected long currentAssignments;

	/** The first assignment date. */
	@XmlElement(required = true, type = String.class, nillable = true)
	@XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
	@XmlSchemaType(name = "date")
	protected Date firstAssignmentDate;

	/** The last assignment date. */
	@XmlElement(required = true, type = String.class, nillable = true)
	@XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
	@XmlSchemaType(name = "date")
	protected Date lastAssignmentDate;

	/** The total days served. */
	protected long totalDaysServed;

	/** The total days served parliament. */
	protected long totalDaysServedParliament;

	/** The total days served committee. */
	protected long totalDaysServedCommittee;

	/** The total days served government. */
	protected long totalDaysServedGovernment;

	/** The total days served eu. */
	protected long totalDaysServedEu;

	/** The active. */
	protected boolean active;

	/** The active eu. */
	protected boolean activeEu;

	/** The active government. */
	protected boolean activeGovernment;

	/** The active committee. */
	protected boolean activeCommittee;

	/** The active parliament. */
	protected boolean activeParliament;

	/** The active party. */
	protected boolean activeParty;

	/** The active speaker. */
	protected boolean activeSpeaker;

	/** The total days served speaker. */
	protected long totalDaysServedSpeaker;

	/** The total days served party. */
	protected long totalDaysServedParty;

	/** The total party assignments. */
	protected long totalPartyAssignments;

	/** The total ministry assignments. */
	protected long totalMinistryAssignments;

	/** The total committee assignments. */
	protected long totalCommitteeAssignments;

	/** The total speaker assignments. */
	protected long totalSpeakerAssignments;

	/** The current party assignments. */
	protected long currentPartyAssignments;

	/** The current ministry assignments. */
	protected long currentMinistryAssignments;

	/** The current committee assignments. */
	protected long currentCommitteeAssignments;

	/** The current speaker assignments. */
	protected long currentSpeakerAssignments;

	/** The total committee substitute assignments. */
	protected long totalCommitteeSubstituteAssignments;

	/** The current committee substitute assignments. */
	protected long currentCommitteeSubstituteAssignments;

	/** The total days served committee substitute. */
	protected long totalDaysServedCommitteeSubstitute;

	/** The total committee leadership assignments. */
	protected long totalCommitteeLeadershipAssignments;

	/** The current committee leadership assignments. */
	protected long currentCommitteeLeadershipAssignments;

	/** The total days served committee leadership. */
	protected long totalDaysServedCommitteeLeadership;

	/**
	 * Gets the value of the personId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	@Id
	@Column(name = "PERSON_ID")
	public String getPersonId() {
		return personId;
	}

	/**
	 * Sets the value of the personId property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setPersonId(final String value) {
		this.personId = value;
	}

	/**
	 * Gets the value of the firstName property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	@Basic
	@Column(name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of the firstName property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setFirstName(final String value) {
		this.firstName = value;
	}

	/**
	 * Gets the value of the lastName property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	@Basic
	@Column(name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of the lastName property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setLastName(final String value) {
		this.lastName = value;
	}

	/**
	 * Gets the value of the party property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	@Basic
	@Column(name = "PARTY")
	public String getParty() {
		return party;
	}

	/**
	 * Sets the value of the party property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setParty(final String value) {
		this.party = value;
	}

	/**
	 * Gets the value of the gender property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	@Basic
	@Column(name = "GENDER")
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the value of the gender property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setGender(final String value) {
		this.gender = value;
	}

	/**
	 * Gets the value of the bornYear property.
	 *
	 * @return the born year
	 */
	@Basic
	@Column(name = "BORN_YEAR", precision = 10, scale = 0)
	public int getBornYear() {
		return bornYear;
	}

	/**
	 * Sets the value of the bornYear property.
	 *
	 * @param value the new born year
	 */
	public void setBornYear(final int value) {
		this.bornYear = value;
	}

	/**
	 * Gets the value of the totalAssignments property.
	 *
	 * @return the total assignments
	 */
	@Basic
	@Column(name = "TOTAL_ASSIGNMENTS", precision = 20)
	public long getTotalAssignments() {
		return totalAssignments;
	}

	/**
	 * Sets the value of the totalAssignments property.
	 *
	 * @param value the new total assignments
	 */
	public void setTotalAssignments(final long value) {
		this.totalAssignments = value;
	}

	/**
	 * Gets the value of the currentAssignments property.
	 *
	 * @return the current assignments
	 */
	@Basic
	@Column(name = "CURRENT_ASSIGNMENTS", precision = 20)
	public long getCurrentAssignments() {
		return currentAssignments;
	}

	/**
	 * Sets the value of the currentAssignments property.
	 *
	 * @param value the new current assignments
	 */
	public void setCurrentAssignments(final long value) {
		this.currentAssignments = value;
	}

	/**
	 * Gets the value of the firstAssignmentDate property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	@Basic
	@Column(name = "FIRST_ASSIGNMENT_DATE")
	@Temporal(TemporalType.DATE)
	public Date getFirstAssignmentDate() {
		return firstAssignmentDate;
	}

	/**
	 * Sets the value of the firstAssignmentDate property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setFirstAssignmentDate(final Date value) {
		this.firstAssignmentDate = value;
	}

	/**
	 * Gets the value of the lastAssignmentDate property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	@Basic
	@Column(name = "LAST_ASSIGNMENT_DATE")
	@Temporal(TemporalType.DATE)
	public Date getLastAssignmentDate() {
		return lastAssignmentDate;
	}

	/**
	 * Sets the value of the lastAssignmentDate property.
	 *
	 * @param value allowed object is {@link String }
	 *
	 */
	public void setLastAssignmentDate(final Date value) {
		this.lastAssignmentDate = value;
	}

	/**
	 * Gets the value of the totalDaysServed property.
	 *
	 * @return the total days served
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED", precision = 20)
	public long getTotalDaysServed() {
		return totalDaysServed;
	}

	/**
	 * Sets the value of the totalDaysServed property.
	 *
	 * @param value the new total days served
	 */
	public void setTotalDaysServed(final long value) {
		this.totalDaysServed = value;
	}

	/**
	 * Gets the value of the totalDaysServedParliament property.
	 *
	 * @return the total days served parliament
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_PARLIAMENT", precision = 20)
	public long getTotalDaysServedParliament() {
		return totalDaysServedParliament;
	}

	/**
	 * Sets the value of the totalDaysServedParliament property.
	 *
	 * @param value the new total days served parliament
	 */
	public void setTotalDaysServedParliament(final long value) {
		this.totalDaysServedParliament = value;
	}

	/**
	 * Gets the value of the totalDaysServedCommittee property.
	 *
	 * @return the total days served committee
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_COMMITTEE", precision = 20)
	public long getTotalDaysServedCommittee() {
		return totalDaysServedCommittee;
	}

	/**
	 * Sets the value of the totalDaysServedCommittee property.
	 *
	 * @param value the new total days served committee
	 */
	public void setTotalDaysServedCommittee(final long value) {
		this.totalDaysServedCommittee = value;
	}

	/**
	 * Gets the value of the totalDaysServedGovernment property.
	 *
	 * @return the total days served government
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_GOVERNMENT", precision = 20)
	public long getTotalDaysServedGovernment() {
		return totalDaysServedGovernment;
	}

	/**
	 * Sets the value of the totalDaysServedGovernment property.
	 *
	 * @param value the new total days served government
	 */
	public void setTotalDaysServedGovernment(final long value) {
		this.totalDaysServedGovernment = value;
	}

	/**
	 * Gets the value of the totalDaysServedEu property.
	 *
	 * @return the total days served eu
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_EU", precision = 20)
	public long getTotalDaysServedEu() {
		return totalDaysServedEu;
	}

	/**
	 * Sets the value of the totalDaysServedEu property.
	 *
	 * @param value the new total days served eu
	 */
	public void setTotalDaysServedEu(final long value) {
		this.totalDaysServedEu = value;
	}

	/**
	 * Gets the value of the active property.
	 *
	 * @return true, if is active
	 */
	@Basic
	@Column(name = "ACTIVE")
	public boolean isActive() {
		return active;
	}

	/**
	 * Sets the value of the active property.
	 *
	 * @param value the new active
	 */
	public void setActive(final boolean value) {
		this.active = value;
	}

	/**
	 * Gets the value of the activeEu property.
	 *
	 * @return true, if is active eu
	 */
	@Basic
	@Column(name = "ACTIVE_EU")
	public boolean isActiveEu() {
		return activeEu;
	}

	/**
	 * Sets the value of the activeEu property.
	 *
	 * @param value the new active eu
	 */
	public void setActiveEu(final boolean value) {
		this.activeEu = value;
	}

	/**
	 * Gets the value of the activeGovernment property.
	 *
	 * @return true, if is active government
	 */
	@Basic
	@Column(name = "ACTIVE_GOVERNMENT")
	public boolean isActiveGovernment() {
		return activeGovernment;
	}

	/**
	 * Sets the value of the activeGovernment property.
	 *
	 * @param value the new active government
	 */
	public void setActiveGovernment(final boolean value) {
		this.activeGovernment = value;
	}

	/**
	 * Gets the value of the activeCommittee property.
	 *
	 * @return true, if is active committee
	 */
	@Basic
	@Column(name = "ACTIVE_COMMITTEE")
	public boolean isActiveCommittee() {
		return activeCommittee;
	}

	/**
	 * Sets the value of the activeCommittee property.
	 *
	 * @param value the new active committee
	 */
	public void setActiveCommittee(final boolean value) {
		this.activeCommittee = value;
	}

	/**
	 * Gets the value of the activeParliament property.
	 *
	 * @return true, if is active parliament
	 */
	@Basic
	@Column(name = "ACTIVE_PARLIAMENT")
	public boolean isActiveParliament() {
		return activeParliament;
	}

	/**
	 * Sets the value of the activeParliament property.
	 *
	 * @param value the new active parliament
	 */
	public void setActiveParliament(final boolean value) {
		this.activeParliament = value;
	}

	/**
	 * Gets the value of the activeParty property.
	 *
	 * @return true, if is active party
	 */
	@Basic
	@Column(name = "ACTIVE_PARTY")
	public boolean isActiveParty() {
		return activeParty;
	}

	/**
	 * Sets the value of the activeParty property.
	 *
	 * @param value the new active party
	 */
	public void setActiveParty(final boolean value) {
		this.activeParty = value;
	}

	/**
	 * Gets the value of the activeSpeaker property.
	 *
	 * @return true, if is active speaker
	 */
	@Basic
	@Column(name = "ACTIVE_SPEAKER")
	public boolean isActiveSpeaker() {
		return activeSpeaker;
	}

	/**
	 * Sets the value of the activeSpeaker property.
	 *
	 * @param value the new active speaker
	 */
	public void setActiveSpeaker(final boolean value) {
		this.activeSpeaker = value;
	}

	/**
	 * Gets the value of the totalDaysServedSpeaker property.
	 *
	 * @return the total days served speaker
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_SPEAKER", precision = 20)
	public long getTotalDaysServedSpeaker() {
		return totalDaysServedSpeaker;
	}

	/**
	 * Sets the value of the totalDaysServedSpeaker property.
	 *
	 * @param value the new total days served speaker
	 */
	public void setTotalDaysServedSpeaker(final long value) {
		this.totalDaysServedSpeaker = value;
	}

	/**
	 * Gets the value of the totalDaysServedParty property.
	 *
	 * @return the total days served party
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_PARTY", precision = 20)
	public long getTotalDaysServedParty() {
		return totalDaysServedParty;
	}

	/**
	 * Sets the value of the totalDaysServedParty property.
	 *
	 * @param value the new total days served party
	 */
	public void setTotalDaysServedParty(final long value) {
		this.totalDaysServedParty = value;
	}

	/**
	 * Gets the value of the totalPartyAssignments property.
	 *
	 * @return the total party assignments
	 */
	@Basic
	@Column(name = "TOTAL_PARTY_ASSIGNMENTS", precision = 20)
	public long getTotalPartyAssignments() {
		return totalPartyAssignments;
	}

	/**
	 * Sets the value of the totalPartyAssignments property.
	 *
	 * @param value the new total party assignments
	 */
	public void setTotalPartyAssignments(final long value) {
		this.totalPartyAssignments = value;
	}

	/**
	 * Gets the value of the totalMinistryAssignments property.
	 *
	 * @return the total ministry assignments
	 */
	@Basic
	@Column(name = "TOTAL_MINISTRY_ASSIGNMENTS", precision = 20)
	public long getTotalMinistryAssignments() {
		return totalMinistryAssignments;
	}

	/**
	 * Sets the value of the totalMinistryAssignments property.
	 *
	 * @param value the new total ministry assignments
	 */
	public void setTotalMinistryAssignments(final long value) {
		this.totalMinistryAssignments = value;
	}

	/**
	 * Gets the value of the totalCommitteeAssignments property.
	 *
	 * @return the total committee assignments
	 */
	@Basic
	@Column(name = "TOTAL_COMMITTEE_ASSIGNMENTS", precision = 20)
	public long getTotalCommitteeAssignments() {
		return totalCommitteeAssignments;
	}

	/**
	 * Sets the value of the totalCommitteeAssignments property.
	 *
	 * @param value the new total committee assignments
	 */
	public void setTotalCommitteeAssignments(final long value) {
		this.totalCommitteeAssignments = value;
	}

	/**
	 * Gets the value of the totalSpeakerAssignments property.
	 *
	 * @return the total speaker assignments
	 */
	@Basic
	@Column(name = "TOTAL_SPEAKER_ASSIGNMENTS", precision = 20)
	public long getTotalSpeakerAssignments() {
		return totalSpeakerAssignments;
	}

	/**
	 * Sets the value of the totalSpeakerAssignments property.
	 *
	 * @param value the new total speaker assignments
	 */
	public void setTotalSpeakerAssignments(final long value) {
		this.totalSpeakerAssignments = value;
	}

	/**
	 * Gets the value of the currentPartyAssignments property.
	 *
	 * @return the current party assignments
	 */
	@Basic
	@Column(name = "CURRENT_PARTY_ASSIGNMENTS", precision = 20)
	public long getCurrentPartyAssignments() {
		return currentPartyAssignments;
	}

	/**
	 * Sets the value of the currentPartyAssignments property.
	 *
	 * @param value the new current party assignments
	 */
	public void setCurrentPartyAssignments(final long value) {
		this.currentPartyAssignments = value;
	}

	/**
	 * Gets the value of the currentMinistryAssignments property.
	 *
	 * @return the current ministry assignments
	 */
	@Basic
	@Column(name = "CURRENT_MINISTRY_ASSIGNMENTS", precision = 20)
	public long getCurrentMinistryAssignments() {
		return currentMinistryAssignments;
	}

	/**
	 * Sets the value of the currentMinistryAssignments property.
	 *
	 * @param value the new current ministry assignments
	 */
	public void setCurrentMinistryAssignments(final long value) {
		this.currentMinistryAssignments = value;
	}

	/**
	 * Gets the value of the currentCommitteeAssignments property.
	 *
	 * @return the current committee assignments
	 */
	@Basic
	@Column(name = "CURRENT_COMMITTEE_ASSIGNMENTS", precision = 20)
	public long getCurrentCommitteeAssignments() {
		return currentCommitteeAssignments;
	}

	/**
	 * Sets the value of the currentCommitteeAssignments property.
	 *
	 * @param value the new current committee assignments
	 */
	public void setCurrentCommitteeAssignments(final long value) {
		this.currentCommitteeAssignments = value;
	}

	/**
	 * Gets the value of the currentSpeakerAssignments property.
	 *
	 * @return the current speaker assignments
	 */
	@Basic
	@Column(name = "CURRENT_SPEAKER_ASSIGNMENTS", precision = 20)
	public long getCurrentSpeakerAssignments() {
		return currentSpeakerAssignments;
	}

	/**
	 * Gets the total committee substitute assignments.
	 *
	 * @return the total committee substitute assignments
	 */
	@Basic
	@Column(name = "TOTAL_COMMITTEE_SUBSTITUTE_ASSIGNMENTS", precision = 20)
	public long getTotalCommitteeSubstituteAssignments() {
		return totalCommitteeSubstituteAssignments;
	}

	/**
	 * Sets the total committee substitute assignments.
	 *
	 * @param value the new total committee substitute assignments
	 */
	public void setTotalCommitteeSubstituteAssignments(final long value) {
		this.totalCommitteeSubstituteAssignments = value;
	}

	/**
	 * Gets the current committee substitute assignments.
	 *
	 * @return the current committee substitute assignments
	 */
	@Basic
	@Column(name = "CURRENT_COMMITTEE_SUBSTITUTE_ASSIGNMENTS", precision = 20)
	public long getCurrentCommitteeSubstituteAssignments() {
		return currentCommitteeSubstituteAssignments;
	}

	/**
	 * Sets the current committee substitute assignments.
	 *
	 * @param value the new current committee substitute assignments
	 */
	public void setCurrentCommitteeSubstituteAssignments(final long value) {
		this.currentCommitteeSubstituteAssignments = value;
	}

	/**
	 * Gets the total days served committee substitute.
	 *
	 * @return the total days served committee substitute
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_COMMITTEE_SUBSTITUTE", precision = 20)
	public long getTotalDaysServedCommitteeSubstitute() {
		return totalDaysServedCommitteeSubstitute;
	}

	/**
	 * Sets the total days served committee substitute.
	 *
	 * @param value the new total days served committee substitute
	 */
	public void setTotalDaysServedCommitteeSubstitute(final long value) {
		this.totalDaysServedCommitteeSubstitute = value;
	}

	/**
	 * Gets the total committee leadership assignments.
	 *
	 * @return the total committee leadership assignments
	 */
	@Basic
	@Column(name = "TOTAL_COMMITTEE_LEADERSHIP_ASSIGNMENTS", precision = 20)
	public long getTotalCommitteeLeadershipAssignments() {
		return totalCommitteeLeadershipAssignments;
	}

	/**
	 * Sets the total committee leadership assignments.
	 *
	 * @param value the new total committee leadership assignments
	 */
	public void setTotalCommitteeLeadershipAssignments(final long value) {
		this.totalCommitteeLeadershipAssignments = value;
	}

	/**
	 * Gets the current committee leadership assignments.
	 *
	 * @return the current committee leadership assignments
	 */
	@Basic
	@Column(name = "CURRENT_COMMITTEE_LEADERSHIP_ASSIGNMENTS", precision = 20)
	public long getCurrentCommitteeLeadershipAssignments() {
		return currentCommitteeLeadershipAssignments;
	}

	/**
	 * Sets the current committee leadership assignments.
	 *
	 * @param value the new current committee leadership assignments
	 */
	public void setCurrentCommitteeLeadershipAssignments(final long value) {
		this.currentCommitteeLeadershipAssignments = value;
	}

	/**
	 * Gets the total days served committee leadership.
	 *
	 * @return the total days served committee leadership
	 */
	@Basic
	@Column(name = "TOTAL_DAYS_SERVED_COMMITTEE_LEADERSHIP", precision = 20)
	public long getTotalDaysServedCommitteeLeadership() {
		return totalDaysServedCommitteeLeadership;
	}

	/**
	 * Sets the total days served committee leadership.
	 *
	 * @param value the new total days served committee leadership
	 */
	public void setTotalDaysServedCommitteeLeadership(final long value) {
		this.totalDaysServedCommitteeLeadership = value;
	}

	/**
	 * Sets the value of the currentSpeakerAssignments property.
	 *
	 * @param value the new current speaker assignments
	 */
	public void setCurrentSpeakerAssignments(final long value) {
		this.currentSpeakerAssignments = value;
	}

	/**
	 * With person id.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withPersonId(final String value) {
		setPersonId(value);
		return this;
	}

	/**
	 * With first name.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withFirstName(final String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * With last name.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withLastName(final String value) {
		setLastName(value);
		return this;
	}

	/**
	 * With party.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withParty(final String value) {
		setParty(value);
		return this;
	}

	/**
	 * With gender.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withGender(final String value) {
		setGender(value);
		return this;
	}

	/**
	 * With born year.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withBornYear(final int value) {
		setBornYear(value);
		return this;
	}

	/**
	 * With total assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalAssignments(final long value) {
		setTotalAssignments(value);
		return this;
	}

	/**
	 * With current assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withCurrentAssignments(final long value) {
		setCurrentAssignments(value);
		return this;
	}

	/**
	 * With first assignment date.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withFirstAssignmentDate(final Date value) {
		setFirstAssignmentDate(value);
		return this;
	}

	/**
	 * With last assignment date.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withLastAssignmentDate(final Date value) {
		setLastAssignmentDate(value);
		return this;
	}

	/**
	 * With total days served.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalDaysServed(final long value) {
		setTotalDaysServed(value);
		return this;
	}

	/**
	 * With total days served parliament.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalDaysServedParliament(final long value) {
		setTotalDaysServedParliament(value);
		return this;
	}

	/**
	 * With total days served committee.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalDaysServedCommittee(final long value) {
		setTotalDaysServedCommittee(value);
		return this;
	}

	/**
	 * With total days served government.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalDaysServedGovernment(final long value) {
		setTotalDaysServedGovernment(value);
		return this;
	}

	/**
	 * With total days served eu.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalDaysServedEu(final long value) {
		setTotalDaysServedEu(value);
		return this;
	}

	/**
	 * With active.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withActive(final boolean value) {
		setActive(value);
		return this;
	}

	/**
	 * With active eu.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withActiveEu(final boolean value) {
		setActiveEu(value);
		return this;
	}

	/**
	 * With active government.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withActiveGovernment(final boolean value) {
		setActiveGovernment(value);
		return this;
	}

	/**
	 * With active committee.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withActiveCommittee(final boolean value) {
		setActiveCommittee(value);
		return this;
	}

	/**
	 * With active parliament.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withActiveParliament(final boolean value) {
		setActiveParliament(value);
		return this;
	}

	/**
	 * With active party.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withActiveParty(final boolean value) {
		setActiveParty(value);
		return this;
	}

	/**
	 * With active speaker.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withActiveSpeaker(final boolean value) {
		setActiveSpeaker(value);
		return this;
	}

	/**
	 * With total days served speaker.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalDaysServedSpeaker(final long value) {
		setTotalDaysServedSpeaker(value);
		return this;
	}

	/**
	 * With total days served party.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalDaysServedParty(final long value) {
		setTotalDaysServedParty(value);
		return this;
	}

	/**
	 * With total party assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalPartyAssignments(final long value) {
		setTotalPartyAssignments(value);
		return this;
	}

	/**
	 * With total ministry assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalMinistryAssignments(final long value) {
		setTotalMinistryAssignments(value);
		return this;
	}

	/**
	 * With total committee assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalCommitteeAssignments(final long value) {
		setTotalCommitteeAssignments(value);
		return this;
	}

	/**
	 * With total speaker assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withTotalSpeakerAssignments(final long value) {
		setTotalSpeakerAssignments(value);
		return this;
	}

	/**
	 * With current party assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withCurrentPartyAssignments(final long value) {
		setCurrentPartyAssignments(value);
		return this;
	}

	/**
	 * With current ministry assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withCurrentMinistryAssignments(final long value) {
		setCurrentMinistryAssignments(value);
		return this;
	}

	/**
	 * With current committee assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withCurrentCommitteeAssignments(final long value) {
		setCurrentCommitteeAssignments(value);
		return this;
	}

	/**
	 * With current speaker assignments.
	 *
	 * @param value the value
	 * @return the view riksdagen politician
	 */
	public ViewRiksdagenPolitician withCurrentSpeakerAssignments(final long value) {
		setCurrentSpeakerAssignments(value);
		return this;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
