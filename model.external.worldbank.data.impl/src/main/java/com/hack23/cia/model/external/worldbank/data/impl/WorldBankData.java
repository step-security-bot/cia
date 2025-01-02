/*
 * Copyright 2010 -2025 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.24 at 11:39:39 PM CET
//


package com.hack23.cia.model.external.worldbank.data.impl;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class WorldBankData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorldBankData", propOrder = {
    "indicator",
    "country",
    "dataValue",
    "yearDate"
})
@Entity(name = "WorldBankData")
@Table(name = "WORLD_BANK_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class WorldBankData
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** The indicator. */
    protected Indicator indicator;

    /** The country. */
    protected Country country;

    /** The data value. */
    @XmlElement(name = "value")
    protected String dataValue;

    /** The year date. */
    @XmlElement(name = "date")
    protected Integer yearDate;

    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the indicator.
	 *
	 * @return the indicator
	 */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "INDICATOR_VALUE")),
        @AttributeOverride(name = "id", column = @Column(name = "INDICATOR_ID"))
    })
    public Indicator getIndicator() {
        return indicator;
    }

    /**
	 * Sets the indicator.
	 *
	 * @param value the new indicator
	 */
    public void setIndicator(final Indicator value) {
        this.indicator = value;
    }

    /**
	 * Gets the country.
	 *
	 * @return the country
	 */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "COUNTRY_VALUE")),
        @AttributeOverride(name = "id", column = @Column(name = "COUNTRY_ID"))
    })
    public Country getCountry() {
        return country;
    }

    /**
	 * Sets the country.
	 *
	 * @param value the new country
	 */
    public void setCountry(final Country value) {
        this.country = value;
    }

    /**
	 * Gets the data value.
	 *
	 * @return the data value
	 */
    @Basic
    @Column(name = "DATA_VALUE")
    public String getDataValue() {
        return dataValue;
    }

    /**
	 * Sets the data value.
	 *
	 * @param value the new data value
	 */
    public void setDataValue(final String value) {
        this.dataValue = value;
    }

    /**
	 * Gets the year date.
	 *
	 * @return the year date
	 */
    @Basic
    @Column(name = "YEAR_DATE", precision = 10, scale = 0)
    public Integer getYearDate() {
        return yearDate;
    }

    /**
	 * Sets the year date.
	 *
	 * @param value the new year date
	 */
    public void setYearDate(final Integer value) {
        this.yearDate = value;
    }

    /**
	 * With indicator.
	 *
	 * @param value the value
	 * @return the world bank data
	 */
    public WorldBankData withIndicator(final Indicator value) {
        setIndicator(value);
        return this;
    }

    /**
	 * With country.
	 *
	 * @param value the value
	 * @return the world bank data
	 */
    public WorldBankData withCountry(final Country value) {
        setCountry(value);
        return this;
    }

    /**
	 * With data value.
	 *
	 * @param value the value
	 * @return the world bank data
	 */
    public WorldBankData withDataValue(final String value) {
        setDataValue(value);
        return this;
    }

    /**
	 * With year date.
	 *
	 * @param value the value
	 * @return the world bank data
	 */
    public WorldBankData withYearDate(final Integer value) {
        setYearDate(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
	public boolean equals(final Object object) {
    	return EqualsBuilder.reflectionEquals(this,object,"hjid");
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
