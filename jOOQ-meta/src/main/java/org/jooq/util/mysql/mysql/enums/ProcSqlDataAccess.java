/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ProcSqlDataAccess implements org.jooq.EnumType {

	CONTAINS_SQL("CONTAINS_SQL"),

	NO_SQL("NO_SQL"),

	READS_SQL_DATA("READS_SQL_DATA"),

	MODIFIES_SQL_DATA("MODIFIES_SQL_DATA"),

	;

	private final java.lang.String literal;

	private ProcSqlDataAccess(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "proc_sql_data_access";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
