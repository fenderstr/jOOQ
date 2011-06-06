/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.sybase.SybaseDataType;
import org.jooq.util.sybase.sys.Sys;
import org.jooq.util.sybase.sys.tables.records.SysviewRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Sysview extends TableImpl<SysviewRecord> {

	private static final long serialVersionUID = -384565846;

	/**
	 * The singleton instance of SYSVIEW
	 */
	public static final Sysview SYSVIEW = new Sysview();

	/**
	 * The class holding records for this type
	 */
	private static final Class<SysviewRecord> __RECORD_TYPE = SysviewRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SysviewRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, BigInteger> VIEW_OBJECT_ID = new TableFieldImpl<SysviewRecord, BigInteger>(SQLDialect.SYBASE, "view_object_id", SybaseDataType.UNSIGNEDBIGINT, SYSVIEW);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, String> VIEW_DEF = new TableFieldImpl<SysviewRecord, String>(SQLDialect.SYBASE, "view_def", SybaseDataType.LONGVARCHAR, SYSVIEW);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, Integer> MV_BUILD_TYPE = new TableFieldImpl<SysviewRecord, Integer>(SQLDialect.SYBASE, "mv_build_type", SybaseDataType.TINYINT, SYSVIEW);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, Integer> MV_REFRESH_TYPE = new TableFieldImpl<SysviewRecord, Integer>(SQLDialect.SYBASE, "mv_refresh_type", SybaseDataType.TINYINT, SYSVIEW);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, Integer> MV_USE_IN_OPTIMIZATION = new TableFieldImpl<SysviewRecord, Integer>(SQLDialect.SYBASE, "mv_use_in_optimization", SybaseDataType.TINYINT, SYSVIEW);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, Timestamp> MV_LAST_REFRESHED_AT = new TableFieldImpl<SysviewRecord, Timestamp>(SQLDialect.SYBASE, "mv_last_refreshed_at", SybaseDataType.TIMESTAMP, SYSVIEW);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, Timestamp> MV_KNOWN_STALE_AT = new TableFieldImpl<SysviewRecord, Timestamp>(SQLDialect.SYBASE, "mv_known_stale_at", SybaseDataType.TIMESTAMP, SYSVIEW);

	/**
	 * An uncommented item
	 */
	public static final TableField<SysviewRecord, BigInteger> MV_LAST_REFRESHED_TSN = new TableFieldImpl<SysviewRecord, BigInteger>(SQLDialect.SYBASE, "mv_last_refreshed_tsn", SybaseDataType.UNSIGNEDBIGINT, SYSVIEW);

	/**
	 * No further instances allowed
	 */
	private Sysview() {
		super(SQLDialect.SYBASE, "SYSVIEW", Sys.SYS);
	}
}
