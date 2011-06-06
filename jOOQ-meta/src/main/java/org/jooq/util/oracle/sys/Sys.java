/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.util.oracle.sys.tables.AllArguments;
import org.jooq.util.oracle.sys.tables.AllColComments;
import org.jooq.util.oracle.sys.tables.AllCollTypes;
import org.jooq.util.oracle.sys.tables.AllConsColumns;
import org.jooq.util.oracle.sys.tables.AllConstraints;
import org.jooq.util.oracle.sys.tables.AllObjects;
import org.jooq.util.oracle.sys.tables.AllProcedures;
import org.jooq.util.oracle.sys.tables.AllSequences;
import org.jooq.util.oracle.sys.tables.AllTabCols;
import org.jooq.util.oracle.sys.tables.AllTabComments;
import org.jooq.util.oracle.sys.tables.AllTypeAttrs;
import org.jooq.util.oracle.sys.tables.AllTypes;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Sys extends SchemaImpl {

	private static final long serialVersionUID = -1766058473;

	/**
	 * The singleton instance of SYS
	 */
	public static final Sys SYS = new Sys();

	/**
	 * No further instances allowed
	 */
	private Sys() {
		super(SQLDialect.ORACLE, "SYS");
	}

	@Override
	public final List<Table<?>> getTables() {
		return Arrays.<Table<?>>asList(
			AllArguments.ALL_ARGUMENTS,
			AllColComments.ALL_COL_COMMENTS,
			AllCollTypes.ALL_COLL_TYPES,
			AllConsColumns.ALL_CONS_COLUMNS,
			AllConstraints.ALL_CONSTRAINTS,
			AllObjects.ALL_OBJECTS,
			AllProcedures.ALL_PROCEDURES,
			AllSequences.ALL_SEQUENCES,
			AllTabCols.ALL_TAB_COLS,
			AllTabComments.ALL_TAB_COMMENTS,
			AllTypeAttrs.ALL_TYPE_ATTRS,
			AllTypes.ALL_TYPES);
	}
}
