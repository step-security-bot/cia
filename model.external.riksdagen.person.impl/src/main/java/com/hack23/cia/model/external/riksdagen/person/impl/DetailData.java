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
// Generated on: 2019.02.24 at 11:39:56 PM CET
//


package com.hack23.cia.model.external.riksdagen.person.impl;

import javax.persistence.Basic;
import javax.persistence.Column;
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
 * The Class DetailData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailData", propOrder = {
    "intressentId",
    "detailType",
    "detail",
    "code"
})
@Entity(name = "DetailData")
@Table(name = "DETAIL_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class DetailData
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** The intressent id. */
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;

    /** The detail type. */
    @XmlElement(name = "typ", required = true)
    protected String detailType;

    /** The detail. */
    @XmlElement(name = "uppgift", required = true)
    protected String detail;

    /** The code. */
    @XmlElement(name = "kod", required = true)
    protected String code;

    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the intressent id.
	 *
	 * @return the intressent id
	 */
    @Basic
    @Column(name = "INTRESSENT_ID")
    public String getIntressentId() {
        return intressentId;
    }

    /**
	 * Sets the intressent id.
	 *
	 * @param value the new intressent id
	 */
    public void setIntressentId(final String value) {
        this.intressentId = value;
    }

    /**
	 * Gets the detail type.
	 *
	 * @return the detail type
	 */
    @Basic
    @Column(name = "DETAIL_TYPE")
    public String getDetailType() {
        return detailType;
    }

    /**
	 * Sets the detail type.
	 *
	 * @param value the new detail type
	 */
    public void setDetailType(final String value) {
        this.detailType = value;
    }

    /**
	 * Gets the detail.
	 *
	 * @return the detail
	 */
    @Basic
    @Column(name = "DETAIL", length = 65536)
    public String getDetail() {
        return detail;
    }

    /**
	 * Sets the detail.
	 *
	 * @param value the new detail
	 */
    public void setDetail(final String value) {
        this.detail = value;
    }

    /**
	 * Gets the code.
	 *
	 * @return the code
	 */
    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    /**
	 * Sets the code.
	 *
	 * @param value the new code
	 */
    public void setCode(final String value) {
        this.code = value;
    }

    /**
	 * With intressent id.
	 *
	 * @param value the value
	 * @return the detail data
	 */
    public DetailData withIntressentId(final String value) {
        setIntressentId(value);
        return this;
    }

    /**
	 * With detail type.
	 *
	 * @param value the value
	 * @return the detail data
	 */
    public DetailData withDetailType(final String value) {
        setDetailType(value);
        return this;
    }

    /**
	 * With detail.
	 *
	 * @param value the value
	 * @return the detail data
	 */
    public DetailData withDetail(final String value) {
        setDetail(value);
        return this;
    }

    /**
	 * With code.
	 *
	 * @param value the value
	 * @return the detail data
	 */
    public DetailData withCode(final String value) {
        setCode(value);
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
