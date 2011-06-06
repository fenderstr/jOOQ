/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.util.oracle.sys.tables.AllConsColumns;


/**
 * This class is generated by jOOQ.
 *
 * Information about accessible columns in constraint definitions
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllConsColumnsRecord extends TableRecordImpl<AllConsColumnsRecord> {

	private static final long serialVersionUID = -1599022201;

	/**
	 * Owner of the constraint definition
	 */
	public void setOwner(String value) {
		setValue(AllConsColumns.OWNER, value);
	}

	/**
	 * Owner of the constraint definition
	 */
	public String getOwner() {
		return getValue(AllConsColumns.OWNER);
	}

	/**
	 * Name associated with the constraint definition
	 */
	public void setConstraintName(String value) {
		setValue(AllConsColumns.CONSTRAINT_NAME, value);
	}

	/**
	 * Name associated with the constraint definition
	 */
	public String getConstraintName() {
		return getValue(AllConsColumns.CONSTRAINT_NAME);
	}

	/**
	 * Name associated with table with constraint definition
	 */
	public void setTableName(String value) {
		setValue(AllConsColumns.TABLE_NAME, value);
	}

	/**
	 * Name associated with table with constraint definition
	 */
	public String getTableName() {
		return getValue(AllConsColumns.TABLE_NAME);
	}

	/**
	 * Name associated with column or attribute of object column specified in the constraint definition
	 */
	public void setColumnName(String value) {
		setValue(AllConsColumns.COLUMN_NAME, value);
	}

	/**
	 * Name associated with column or attribute of object column specified in the constraint definition
	 */
	public String getColumnName() {
		return getValue(AllConsColumns.COLUMN_NAME);
	}

	/**
	 * Original position of column or attribute in definition
	 */
	public void setPosition(BigDecimal value) {
		setValue(AllConsColumns.POSITION, value);
	}

	/**
	 * Original position of column or attribute in definition
	 */
	public BigDecimal getPosition() {
		return getValue(AllConsColumns.POSITION);
	}
	/**
	 * Create a detached AllConsColumnsRecord
	 */
	public AllConsColumnsRecord() {
		super(AllConsColumns.ALL_CONS_COLUMNS);
	}
}
