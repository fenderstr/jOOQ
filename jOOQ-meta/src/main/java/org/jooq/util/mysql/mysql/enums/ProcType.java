/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;


import javax.annotation.Generated;

import org.jooq.EnumType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public enum ProcType implements EnumType {

	FUNCTION("FUNCTION"),

	PROCEDURE("PROCEDURE"),

	;

	private final String literal;

	private ProcType(String literal) {
		this.literal = literal;
	}

	@Override
	public String getName() {
		return "proc_type";
	}

	@Override
	public String getLiteral() {
		return literal;
	}
}
