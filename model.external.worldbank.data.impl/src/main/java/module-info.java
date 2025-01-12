/**
 * World Bank Data Module.
 *
 * <p>This module provides implementation for handling data from the World Bank.</p>
 *
 * <p>Key Features:</p>
 * <ul>
 *   <li>Fetching and parsing data</li>
 *   <li>Data transformation and storage</li>
 *   <li>Integration with other World Bank modules</li>
 * </ul>
 *
 * <p>Technologies / Integrations:</p>
 * <ul>
 *   <li>Java Persistence API (JPA)</li>
 *   <li>Hibernate ORM</li>
 *   <li>SLF4J for logging</li>
 * </ul>
 *
 * @see com.hack23.cia.model.common.api
 */
open module com.hack23.cia.model.external.worldbank.data.impl {
	exports com.hack23.cia.model.external.worldbank.data.impl;
	
	requires com.hack23.model.common.api;
    requires transitive com.hack23.cia.model.common.impl;

	requires java.xml.bind;
	requires java.persistence;
	requires org.hibernate.orm.jpamodelgen;
	requires org.slf4j;
	requires org.apache.commons.lang3;
	requires jaxb2.basics.runtime;


}