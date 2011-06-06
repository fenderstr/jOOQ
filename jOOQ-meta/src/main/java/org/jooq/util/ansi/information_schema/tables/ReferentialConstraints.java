/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ansi.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.ansi.information_schema.InformationSchema;
import org.jooq.util.ansi.information_schema.tables.records.ReferentialConstraintsRecord;
import org.jooq.util.hsqldb.HSQLDBDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class ReferentialConstraints extends TableImpl<ReferentialConstraintsRecord> {

	private static final long serialVersionUID = 616298190;

	/**
	 * The singleton instance of REFERENTIAL_CONSTRAINTS
	 */
	public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ReferentialConstraintsRecord> __RECORD_TYPE = ReferentialConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReferentialConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_CATALOG = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "CONSTRAINT_CATALOG", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_SCHEMA = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "CONSTRAINT_SCHEMA", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_NAME = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "CONSTRAINT_NAME", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_CATALOG = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "UNIQUE_CONSTRAINT_CATALOG", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_SCHEMA = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "UNIQUE_CONSTRAINT_SCHEMA", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_NAME = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "UNIQUE_CONSTRAINT_NAME", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> MATCH_OPTION = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "MATCH_OPTION", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UPDATE_RULE = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "UPDATE_RULE", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> DELETE_RULE = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.HSQLDB, "DELETE_RULE", HSQLDBDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private ReferentialConstraints() {
		super(SQLDialect.HSQLDB, "REFERENTIAL_CONSTRAINTS", InformationSchema.INFORMATION_SCHEMA);
	}
}
