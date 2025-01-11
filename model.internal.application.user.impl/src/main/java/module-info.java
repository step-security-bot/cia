open module com.hack23.cia.model.internal.application.user.impl {
    exports com.hack23.cia.model.internal.application.user.impl;
    exports com.hack23.cia.model.internal.application.system.impl;
    exports com.hack23.cia.model.internal.application.data.committee.impl;
    exports com.hack23.cia.model.internal.application.data.ministry.impl;
    exports com.hack23.cia.model.internal.application.secure.impl;
    exports com.hack23.cia.model.internal.application.data.rules.impl;
    exports  com.hack23.cia.model.internal.application.data.impl;
    exports com.hack23.cia.model.internal.application.data.party.impl;
    exports com.hack23.cia.model.internal.application.data.politician.impl;
    exports com.hack23.cia.model.internal.application.data.document.impl;
    exports com.hack23.cia.model.internal.application.data.audit.impl;
    

	requires com.hack23.model.common.api;
    requires transitive com.hack23.cia.model.common.impl;

	requires java.xml.bind;
	requires java.persistence;
	requires org.hibernate.orm.jpamodelgen;
	requires org.slf4j;
	requires org.apache.commons.lang3;
	requires jaxb2.basics.runtime;
	requires javers.core;
	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;


	
}
