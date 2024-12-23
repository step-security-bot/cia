//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.25 at 12:05:09 AM CET
//


package com.hack23.cia.model.internal.application.data.document.impl;



import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ViewRiksdagenPartyDocumentDailySummary complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ViewRiksdagenPartyDocumentDailySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://document.data.application.internal.model.cia.hack23.com/impl}RiksdagenDocumentPartySummaryEmbeddedId"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenPartyDocumentDailySummary", propOrder = {
	    "embeddedId",
	    "total"
	})
@Entity(name = "ViewRiksdagenPartyDocumentDailySummary")
@Table(name = "View_Riksdagen_Party_Document_Daily_Summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenPartyDocumentDailySummary
    implements ModelObject
{

    /** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The embedded id. */
	@XmlElement(required = true)
    protected RiksdagenDocumentPartySummaryEmbeddedId embeddedId;

    /** The total. */
    protected long total;

    /**
     * Gets the value of the embeddedId property.
     *
     * @return
     *     possible object is
     *     {@link RiksdagenDocumentPartySummaryEmbeddedId }
     *
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "publicDate", column = @Column(name = "EMBEDDED_ID_PUBLIC_DATE")),
        @AttributeOverride(name = "partyShortCode", column = @Column(name = "EMBEDDED_ID_PARTY_SHORT_CODE")),
        @AttributeOverride(name = "documentType", column = @Column(name = "EMBEDDED_ID_DOCUMENT_TYPE"))
    })
    public RiksdagenDocumentPartySummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     *
     * @param value
     *     allowed object is
     *     {@link RiksdagenDocumentPartySummaryEmbeddedId }
     *
     */
    public void setEmbeddedId(final RiksdagenDocumentPartySummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the total property.
     *
     * @return the total
     */
    @Basic
    @Column(name = "TOTAL", precision = 20)
    public long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     *
     * @param value the new total
     */
    public void setTotal(final long value) {
        this.total = value;
    }

    /**
     * With embedded id.
     *
     * @param value the value
     * @return the view riksdagen party document daily summary
     */
    public ViewRiksdagenPartyDocumentDailySummary withEmbeddedId(final RiksdagenDocumentPartySummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    /**
     * With total.
     *
     * @param value the value
     * @return the view riksdagen party document daily summary
     */
    public ViewRiksdagenPartyDocumentDailySummary withTotal(final long value) {
        setTotal(value);
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
