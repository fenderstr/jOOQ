/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.oracle.OracleDataType;
import org.jooq.util.oracle.sys.Sys;
import org.jooq.util.oracle.sys.tables.records.AllProceduresRecord;


/**
 * This class is generated by jOOQ.
 *
 * Description of all procedures available to the user
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllProcedures extends TableImpl<AllProceduresRecord> {

	private static final long serialVersionUID = 878596948;

	/**
	 * The singleton instance of ALL_PROCEDURES
	 */
	public static final AllProcedures ALL_PROCEDURES = new AllProcedures();

	/**
	 * The class holding records for this type
	 */
	private static final Class<AllProceduresRecord> __RECORD_TYPE = AllProceduresRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AllProceduresRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<AllProceduresRecord, String> OWNER = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "OWNER", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * Name of the object : top level function/procedure/package name
	 */
	public static final TableField<AllProceduresRecord, String> OBJECT_NAME = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "OBJECT_NAME", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * Name of the procedure
	 */
	public static final TableField<AllProceduresRecord, String> PROCEDURE_NAME = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "PROCEDURE_NAME", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * Is it an aggregate function ?
	 */
	public static final TableField<AllProceduresRecord, String> AGGREGATE = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "AGGREGATE", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * Is it a pipelined table function ?
	 */
	public static final TableField<AllProceduresRecord, String> PIPELINED = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "PIPELINED", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * Name of the owner of the implementation type (if any)
	 */
	public static final TableField<AllProceduresRecord, String> IMPLTYPEOWNER = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "IMPLTYPEOWNER", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * Name of the implementation type (if any)
	 */
	public static final TableField<AllProceduresRecord, String> IMPLTYPENAME = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "IMPLTYPENAME", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * Is the procedure parallel enabled ?
	 */
	public static final TableField<AllProceduresRecord, String> PARALLEL = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "PARALLEL", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AllProceduresRecord, String> INTERFACE = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "INTERFACE", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AllProceduresRecord, String> DETERMINISTIC = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "DETERMINISTIC", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * An uncommented item
	 */
	public static final TableField<AllProceduresRecord, String> AUTHID = new TableFieldImpl<AllProceduresRecord, String>(SQLDialect.ORACLE, "AUTHID", OracleDataType.VARCHAR2, ALL_PROCEDURES);

	/**
	 * No further instances allowed
	 */
	private AllProcedures() {
		super(SQLDialect.ORACLE, "ALL_PROCEDURES", Sys.SYS);
	}
}
