/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.util.h2.information_schema.tables.TypeInfo;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TypeInfoRecord extends TableRecordImpl<TypeInfoRecord> {

	private static final long serialVersionUID = -1765831562;

	/**
	 * An uncommented item
	 */
	public void setTypeName(String value) {
		setValue(TypeInfo.TYPE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTypeName() {
		return getValue(TypeInfo.TYPE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDataType(Integer value) {
		setValue(TypeInfo.DATA_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getDataType() {
		return getValue(TypeInfo.DATA_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setPrecision(Integer value) {
		setValue(TypeInfo.PRECISION, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPrecision() {
		return getValue(TypeInfo.PRECISION);
	}

	/**
	 * An uncommented item
	 */
	public void setPrefix(String value) {
		setValue(TypeInfo.PREFIX, value);
	}

	/**
	 * An uncommented item
	 */
	public String getPrefix() {
		return getValue(TypeInfo.PREFIX);
	}

	/**
	 * An uncommented item
	 */
	public void setSuffix(String value) {
		setValue(TypeInfo.SUFFIX, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSuffix() {
		return getValue(TypeInfo.SUFFIX);
	}

	/**
	 * An uncommented item
	 */
	public void setParams(String value) {
		setValue(TypeInfo.PARAMS, value);
	}

	/**
	 * An uncommented item
	 */
	public String getParams() {
		return getValue(TypeInfo.PARAMS);
	}

	/**
	 * An uncommented item
	 */
	public void setAutoIncrement(Boolean value) {
		setValue(TypeInfo.AUTO_INCREMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public Boolean getAutoIncrement() {
		return getValue(TypeInfo.AUTO_INCREMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setMinimumScale(Short value) {
		setValue(TypeInfo.MINIMUM_SCALE, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getMinimumScale() {
		return getValue(TypeInfo.MINIMUM_SCALE);
	}

	/**
	 * An uncommented item
	 */
	public void setMaximumScale(Short value) {
		setValue(TypeInfo.MAXIMUM_SCALE, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getMaximumScale() {
		return getValue(TypeInfo.MAXIMUM_SCALE);
	}

	/**
	 * An uncommented item
	 */
	public void setRadix(Integer value) {
		setValue(TypeInfo.RADIX, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getRadix() {
		return getValue(TypeInfo.RADIX);
	}

	/**
	 * An uncommented item
	 */
	public void setPos(Integer value) {
		setValue(TypeInfo.POS, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPos() {
		return getValue(TypeInfo.POS);
	}

	/**
	 * An uncommented item
	 */
	public void setCaseSensitive(Boolean value) {
		setValue(TypeInfo.CASE_SENSITIVE, value);
	}

	/**
	 * An uncommented item
	 */
	public Boolean getCaseSensitive() {
		return getValue(TypeInfo.CASE_SENSITIVE);
	}

	/**
	 * An uncommented item
	 */
	public void setNullable(Short value) {
		setValue(TypeInfo.NULLABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getNullable() {
		return getValue(TypeInfo.NULLABLE);
	}

	/**
	 * An uncommented item
	 */
	public void setSearchable(Short value) {
		setValue(TypeInfo.SEARCHABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getSearchable() {
		return getValue(TypeInfo.SEARCHABLE);
	}
	/**
	 * Create a detached TypeInfoRecord
	 */
	public TypeInfoRecord() {
		super(TypeInfo.TYPE_INFO);
	}
}
