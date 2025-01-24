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
// Generated on: 2019.02.24 at 11:40:02 PM CET
//


package com.hack23.cia.model.external.riksdagen.dokumentlista.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;

/**
 * The Class DocumentContainerElement.
 */
@XmlRootElement(name = "dokumentlista")
@XmlType(name = "DocumentContainerElement", propOrder = {
    "dokument"
})
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "DOCUMENT_CONTAINER_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class DocumentContainerElement implements ModelObject {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "dokument")
    private List<DocumentElement> dokument = new ArrayList<>();

    @XmlAttribute(name = "datum")
    @Column(name = "DATUM")
    private String datum;

    @XmlAttribute(name = "debug")
    @Column(name = "DEBUG")
    private String debug;

    @XmlAttribute(name = "nasta_sida")
    @XmlSchemaType(name = "anyURI")
    @Column(name = "NEXT_PAGE")
    private String nextPage;

    @XmlAttribute(name = "sida")
    @Column(name = "PAGE", precision = 20)
    private BigInteger page;

    @XmlAttribute(name = "sidor")
    @Column(name = "TOTAL_PAGES", precision = 20)
    private BigInteger totalPages;

    @XmlAttribute(name = "skapad")
    @Column(name = "CREATED")
    private String created;

    @XmlAttribute(name = "traff_fran")
    @Column(name = "HITS_FROM", precision = 20)
    private BigInteger hitsFrom;

    @XmlAttribute(name = "traff_till")
    @Column(name = "HITS_TO", precision = 20)
    private BigInteger hitsTo;

    @XmlAttribute(name = "traffar")
    @Column(name = "HITS", precision = 20)
    private BigInteger hits;

    @XmlAttribute(name = "version")
    @Column(name = "DOCUMENT_VERSION")
    private String documentVersion;

    @XmlAttribute(name = "varning")
    @Column(name = "WARNING")
    private String warning;

    
    @XmlAttribute(name = "Hjid")
    private Long hjid;

    // Plain getters and setters without annotations
    @OneToMany(targetEntity = DocumentElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOKUMENT_DOCUMENT_CONTAINER__0")
    public List<DocumentElement> getDokument() {
        return this.dokument;
    }


    public void setDokument(final List<DocumentElement> dokument) {
        this.dokument = dokument;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(final String value) {
        this.datum = value;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(final String value) {
        this.debug = value;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(final String value) {
        this.nextPage = value;
    }

    public BigInteger getPage() {
        return page;
    }

    public void setPage(final BigInteger value) {
        this.page = value;
    }

    public BigInteger getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(final BigInteger value) {
        this.totalPages = value;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(final String value) {
        this.created = value;
    }

    public BigInteger getHitsFrom() {
        return hitsFrom;
    }

    public void setHitsFrom(final BigInteger value) {
        this.hitsFrom = value;
    }

    public BigInteger getHitsTo() {
        return hitsTo;
    }

    public void setHitsTo(final BigInteger value) {
        this.hitsTo = value;
    }

    public BigInteger getHits() {
        return hits;
    }

    public void setHits(final BigInteger value) {
        this.hits = value;
    }

    public String getDocumentVersion() {
        return documentVersion;
    }

    public void setDocumentVersion(final String value) {
        this.documentVersion = value;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(final String value) {
        this.warning = value;
    }

    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    public void setHjid(final Long value) {
        this.hjid = value;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return new EqualsBuilder().append(getDokument().toArray(), ((DocumentContainerElement) obj).getDokument().toArray()).isEquals();
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}