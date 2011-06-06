/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.util.db2.syscat.tables.Attributes;
import org.jooq.util.db2.syscat.tables.Columns;
import org.jooq.util.db2.syscat.tables.Datatypes;
import org.jooq.util.db2.syscat.tables.Funcparms;
import org.jooq.util.db2.syscat.tables.Functions;
import org.jooq.util.db2.syscat.tables.Keycoluse;
import org.jooq.util.db2.syscat.tables.Procedures;
import org.jooq.util.db2.syscat.tables.Procparms;
import org.jooq.util.db2.syscat.tables.References;
import org.jooq.util.db2.syscat.tables.Sequences;
import org.jooq.util.db2.syscat.tables.Tabconst;
import org.jooq.util.db2.syscat.tables.Tables;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Syscat extends SchemaImpl {

	private static final long serialVersionUID = -120367959;

	/**
	 * The singleton instance of SYSCAT
	 */
	public static final Syscat SYSCAT = new Syscat();

	/**
	 * No further instances allowed
	 */
	private Syscat() {
		super(SQLDialect.DB2, "SYSCAT");
	}

	@Override
	public final List<Table<?>> getTables() {
		return Arrays.<Table<?>>asList(
			Attributes.ATTRIBUTES,
			Columns.COLUMNS,
			Datatypes.DATATYPES,
			Funcparms.FUNCPARMS,
			Functions.FUNCTIONS,
			Keycoluse.KEYCOLUSE,
			Procedures.PROCEDURES,
			Procparms.PROCPARMS,
			References.REFERENCES,
			Sequences.SEQUENCES,
			Tabconst.TABCONST,
			Tables.TABLES);
	}
}
