/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity implements org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITIdentity {

	private static final long serialVersionUID = -1882849332;

	private java.lang.Integer id;
	private java.lang.Integer val;

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.Integer getVal() {
		return this.val;
	}

	@Override
	public void setVal(java.lang.Integer val) {
		this.val = val;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITIdentity from) {
		setId(from.getId());
		setVal(from.getVal());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITIdentity> E into(E into) {
		into.from(this);
		return into;
	}
}
