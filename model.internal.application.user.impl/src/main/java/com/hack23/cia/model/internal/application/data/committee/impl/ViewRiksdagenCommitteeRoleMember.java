//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.25 at 12:05:09 AM CET
//


package com.hack23.cia.model.internal.application.data.committee.impl;


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


/**
 * <p>Java class for ViewRiksdagenCommitteeRoleMember complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ViewRiksdagenCommitteeRoleMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="role_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="from_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="to_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="person_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="party" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="total_days_served" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenCommitteeRoleMember", propOrder = {
	    "roleId",
	    "detail",
	    "roleCode",
	    "firstName",
	    "lastName",
	    "fromDate",
	    "toDate",
	    "personId",
	    "party",
	    "totalDaysServed",
	    "active",
	    "totalDocuments",
	    "documentsLastYear",
	    "totalCommitteeReports",
	    "totalStatements",
	    "totalInitiatives",
	    "activityLevel",
	    "roleType",
	    "committeeType"
	})
@Entity(name = "ViewRiksdagenCommitteeRoleMember")
@Table(name = "VIEW_RIKSDAGEN_COMMITTEE_ROLE_MEMBER")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenCommitteeRoleMember
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	protected long roleId;
    @XmlElement(required = true)
    protected String detail;
    @XmlElement(name = "role_code", required = true)
    protected String roleCode;
    @XmlElement(name = "first_name", required = true)
    protected String firstName;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(name = "from_date", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date fromDate;
    @XmlElement(name = "to_date", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date toDate;
    @XmlElement(name = "person_id", required = true)
    protected String personId;
    @XmlElement(required = true)
    protected String party;
    @XmlElement(name = "total_days_served")
    protected int totalDaysServed;
    protected boolean active;

    protected long totalDocuments;
    protected long documentsLastYear;
    protected long totalCommitteeReports;
    protected long totalStatements;
    protected long totalInitiatives;
    @XmlElement(required = true)
    protected String activityLevel;
    @XmlElement(required = true)
    protected String roleType;
    @XmlElement(required = true)
    protected String committeeType;

    /**
     * Gets the value of the roleId property.
     *
     */
    @Id
    @Column(name = "ROLE_ID")
    public long getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     *
     */
    public void setRoleId(final long value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the detail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "DETAIL")
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDetail(final String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the roleCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "ROLE_CODE")
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRoleCode(final String value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
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
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(final String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
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
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(final String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the fromDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFromDate(final Date value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    public Date getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToDate(final Date value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the personId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "PERSON_ID")
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPersonId(final String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the party property.
     *
     * @return
     *     possible object is
     *     {@link String }
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
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParty(final String value) {
        this.party = value;
    }

    /**
     * Gets the value of the totalDaysServed property.
     *
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED", precision = 10, scale = 0)
    public int getTotalDaysServed() {
        return totalDaysServed;
    }

    /**
     * Sets the value of the totalDaysServed property.
     *
     */
    public void setTotalDaysServed(final int value) {
        this.totalDaysServed = value;
    }

    /**
     * Gets the value of the active property.
     *
     */
    @Basic
    @Column(name = "ACTIVE")
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     *
     */
    public void setActive(final boolean value) {
        this.active = value;
    }

    public ViewRiksdagenCommitteeRoleMember withRoleId(final long value) {
        setRoleId(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withDetail(final String value) {
        setDetail(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withRoleCode(final String value) {
        setRoleCode(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withFirstName(final String value) {
        setFirstName(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withLastName(final String value) {
        setLastName(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withFromDate(final Date value) {
        setFromDate(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withToDate(final Date value) {
        setToDate(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withPersonId(final String value) {
        setPersonId(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withParty(final String value) {
        setParty(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withTotalDaysServed(final int value) {
        setTotalDaysServed(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withActive(final boolean value) {
        setActive(value);
        return this;
    }

    @Basic
    @Column(name = "TOTAL_DOCUMENTS", precision = 20)
    public long getTotalDocuments() {
        return totalDocuments;
    }

    public void setTotalDocuments(final long value) {
        this.totalDocuments = value;
    }

    @Basic
    @Column(name = "DOCUMENTS_LAST_YEAR", precision = 20)
    public long getDocumentsLastYear() {
        return documentsLastYear;
    }

    public void setDocumentsLastYear(final long value) {
        this.documentsLastYear = value;
    }

    @Basic
    @Column(name = "TOTAL_COMMITTEE_REPORTS", precision = 20)
    public long getTotalCommitteeReports() {
        return totalCommitteeReports;
    }

    public void setTotalCommitteeReports(final long value) {
        this.totalCommitteeReports = value;
    }

    @Basic
    @Column(name = "TOTAL_STATEMENTS", precision = 20)
    public long getTotalStatements() {
        return totalStatements;
    }

    public void setTotalStatements(final long value) {
        this.totalStatements = value;
    }

    @Basic
    @Column(name = "TOTAL_INITIATIVES", precision = 20)
    public long getTotalInitiatives() {
        return totalInitiatives;
    }

    public void setTotalInitiatives(final long value) {
        this.totalInitiatives = value;
    }

    @Basic
    @Column(name = "ACTIVITY_LEVEL")
    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(final String value) {
        this.activityLevel = value;
    }

    @Basic
    @Column(name = "ROLE_TYPE")
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(final String value) {
        this.roleType = value;
    }

    @Basic
    @Column(name = "COMMITTEE_TYPE")
    public String getCommitteeType() {
        return committeeType;
    }

    public void setCommitteeType(final String value) {
        this.committeeType = value;
    }

    // Additional builder pattern methods for new fields
    public ViewRiksdagenCommitteeRoleMember withTotalDocuments(final long value) {
        setTotalDocuments(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withDocumentsLastYear(final long value) {
        setDocumentsLastYear(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withTotalCommitteeReports(final long value) {
        setTotalCommitteeReports(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withTotalStatements(final long value) {
        setTotalStatements(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withTotalInitiatives(final long value) {
        setTotalInitiatives(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withActivityLevel(final String value) {
        setActivityLevel(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withRoleType(final String value) {
        setRoleType(value);
        return this;
    }

    public ViewRiksdagenCommitteeRoleMember withCommitteeType(final String value) {
        setCommitteeType(value);
        return this;
    }

    @Override
    public final String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public final boolean equals(final Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public final int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}