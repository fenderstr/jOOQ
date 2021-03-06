/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaCategoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaCategoryRecord> implements org.jooq.Record3<java.lang.Byte, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 216915168;

	/**
	 * Setter for <code>sakila.category.category_id</code>. 
	 */
	public void setCategoryId(java.lang.Byte value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.category.category_id</code>. 
	 */
	public java.lang.Byte getCategoryId() {
		return (java.lang.Byte) getValue(0);
	}

	/**
	 * Setter for <code>sakila.category.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.category.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.category.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.category.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Byte> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Byte, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Byte, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field1() {
		return org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY.CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value1() {
		return getCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SakilaCategoryRecord
	 */
	public SakilaCategoryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY);
	}
}
