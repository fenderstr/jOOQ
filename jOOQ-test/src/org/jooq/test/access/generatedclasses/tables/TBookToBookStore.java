/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStore extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -1435852740;

	/**
	 * The singleton instance of <code>T_BOOK_TO_BOOK_STORE</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.access.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.TBookToBookStoreRecord.class;
	}

	/**
	 * The column <code>T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(16777216), T_BOOK_TO_BOOK_STORE);

	/**
	 * The column <code>T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * The column <code>T_BOOK_TO_BOOK_STORE.STOCK</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("T_BOOK_TO_BOOK_STORE", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}
}
