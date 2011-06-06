/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema;


import java.sql.Connection;

import javax.annotation.Generated;

import org.jooq.SchemaMapping;
import org.jooq.util.postgres.PostgresFactory;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class InformationSchemaFactory extends PostgresFactory {

	private static final long serialVersionUID = -1196530542;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public InformationSchemaFactory(Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param mapping The schema mapping to use with objects created from this factory
	 */
	public InformationSchemaFactory(Connection connection, SchemaMapping mapping) {
		super(connection, mapping);
	}
}
