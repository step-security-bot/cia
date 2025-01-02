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
// Generated on: 2019.02.24 at 11:40:07 PM CET
//


package com.hack23.cia.model.external.riksdagen.dokumentstatus.impl;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * The Class DocumentStatusContainer.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatusContainer", propOrder = {
    "document",
    "documentProposal",
    "documentActivityContainer",
    "documentDetailContainer",
    "documentAttachmentContainer",
    "documentReferenceContainer",
    "documentPersonReferenceContainer",
    "documentCategory"
})
@Entity(name = "DocumentStatusContainer")
@Table(name = "DOCUMENT_STATUS_CONTAINER")
@Inheritance(strategy = InheritanceType.JOINED)
public class DocumentStatusContainer
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** The document. */
    @XmlElement(name = "dokument", required = true)
    protected DocumentData document;

    /** The document proposal. */
    @XmlElement(name = "dokforslag", required = true)
    protected DocumentProposalContainer documentProposal;

    /** The document activity container. */
    @XmlElement(name = "dokaktivitet", required = true)
    protected DocumentActivityContainer documentActivityContainer;

    /** The document detail container. */
    @XmlElement(name = "dokuppgift", required = true)
    protected DocumentDetailContainer documentDetailContainer;

    /** The document attachment container. */
    @XmlElement(name = "dokbilaga", required = true)
    protected DocumentAttachmentContainer documentAttachmentContainer;

    /** The document reference container. */
    @XmlElement(name = "dokreferens", required = true)
    protected DocumentReferenceContainer documentReferenceContainer;

    /** The document person reference container. */
    @XmlElement(name = "dokintressent", required = true)
    protected DocumentPersonReferenceContainer documentPersonReferenceContainer;

    /** The document category. */
    @XmlElement(name = "dokkategori", required = true)
    protected String documentCategory;

    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the document.
	 *
	 * @return the document
	 */
    @ManyToOne(targetEntity = DocumentData.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_DOCUMENT_STATUS_CON_0")
    public DocumentData getDocument() {
        return document;
    }

    /**
	 * Sets the document.
	 *
	 * @param value the new document
	 */
    public void setDocument(final DocumentData value) {
        this.document = value;
    }

    /**
	 * Gets the document proposal.
	 *
	 * @return the document proposal
	 */
    @ManyToOne(targetEntity = DocumentProposalContainer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_PROPOSAL_DOCUMENT_S_0")
    public DocumentProposalContainer getDocumentProposal() {
        return documentProposal;
    }

    /**
	 * Sets the document proposal.
	 *
	 * @param value the new document proposal
	 */
    public void setDocumentProposal(final DocumentProposalContainer value) {
        this.documentProposal = value;
    }

    /**
	 * Gets the document activity container.
	 *
	 * @return the document activity container
	 */
    @ManyToOne(targetEntity = DocumentActivityContainer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_ACTIVITY_CONTAINER__0")
    public DocumentActivityContainer getDocumentActivityContainer() {
        return documentActivityContainer;
    }

    /**
	 * Sets the document activity container.
	 *
	 * @param value the new document activity container
	 */
    public void setDocumentActivityContainer(final DocumentActivityContainer value) {
        this.documentActivityContainer = value;
    }

    /**
	 * Gets the document detail container.
	 *
	 * @return the document detail container
	 */
    @ManyToOne(targetEntity = DocumentDetailContainer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_DETAIL_CONTAINER_DO_0")
    public DocumentDetailContainer getDocumentDetailContainer() {
        return documentDetailContainer;
    }

    /**
	 * Sets the document detail container.
	 *
	 * @param value the new document detail container
	 */
    public void setDocumentDetailContainer(final DocumentDetailContainer value) {
        this.documentDetailContainer = value;
    }

    /**
	 * Gets the document attachment container.
	 *
	 * @return the document attachment container
	 */
    @ManyToOne(targetEntity = DocumentAttachmentContainer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_ATTACHMENT_CONTAINE_0")
    public DocumentAttachmentContainer getDocumentAttachmentContainer() {
        return documentAttachmentContainer;
    }

    /**
	 * Sets the document attachment container.
	 *
	 * @param value the new document attachment container
	 */
    public void setDocumentAttachmentContainer(final DocumentAttachmentContainer value) {
        this.documentAttachmentContainer = value;
    }

    /**
	 * Gets the document reference container.
	 *
	 * @return the document reference container
	 */
    @ManyToOne(targetEntity = DocumentReferenceContainer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_REFERENCE_CONTAINER_0")
    public DocumentReferenceContainer getDocumentReferenceContainer() {
        return documentReferenceContainer;
    }

    /**
	 * Sets the document reference container.
	 *
	 * @param value the new document reference container
	 */
    public void setDocumentReferenceContainer(final DocumentReferenceContainer value) {
        this.documentReferenceContainer = value;
    }

    /**
	 * Gets the document person reference container.
	 *
	 * @return the document person reference container
	 */
    @ManyToOne(targetEntity = DocumentPersonReferenceContainer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENT_PERSON_REFERENCE_CO_1")
    public DocumentPersonReferenceContainer getDocumentPersonReferenceContainer() {
        return documentPersonReferenceContainer;
    }

    /**
	 * Sets the document person reference container.
	 *
	 * @param value the new document person reference container
	 */
    public void setDocumentPersonReferenceContainer(final DocumentPersonReferenceContainer value) {
        this.documentPersonReferenceContainer = value;
    }

    /**
	 * Gets the document category.
	 *
	 * @return the document category
	 */
    @Basic
    @Column(name = "DOCUMENT_CATEGORY")
    public String getDocumentCategory() {
        return documentCategory;
    }

    /**
	 * Sets the document category.
	 *
	 * @param value the new document category
	 */
    public void setDocumentCategory(final String value) {
        this.documentCategory = value;
    }

    /**
	 * With document.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocument(final DocumentData value) {
        setDocument(value);
        return this;
    }

    /**
	 * With document proposal.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocumentProposal(final DocumentProposalContainer value) {
        setDocumentProposal(value);
        return this;
    }

    /**
	 * With document activity container.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocumentActivityContainer(final DocumentActivityContainer value) {
        setDocumentActivityContainer(value);
        return this;
    }

    /**
	 * With document detail container.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocumentDetailContainer(final DocumentDetailContainer value) {
        setDocumentDetailContainer(value);
        return this;
    }

    /**
	 * With document attachment container.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocumentAttachmentContainer(final DocumentAttachmentContainer value) {
        setDocumentAttachmentContainer(value);
        return this;
    }

    /**
	 * With document reference container.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocumentReferenceContainer(final DocumentReferenceContainer value) {
        setDocumentReferenceContainer(value);
        return this;
    }

    /**
	 * With document person reference container.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocumentPersonReferenceContainer(final DocumentPersonReferenceContainer value) {
        setDocumentPersonReferenceContainer(value);
        return this;
    }

    /**
	 * With document category.
	 *
	 * @param value the value
	 * @return the document status container
	 */
    public DocumentStatusContainer withDocumentCategory(final String value) {
        setDocumentCategory(value);
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
