/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTestRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord> implements org.jooq.Record2<java.math.BigDecimal, byte[]>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_725LobTest {

	private static final long serialVersionUID = -1525232607;

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.ID</code>. 
	 */
	@Override
	public void setId(java.math.BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.ID</code>. 
	 */
	@Override
	public java.math.BigDecimal getId() {
		return (java.math.BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.LOB</code>. 
	 */
	@Override
	public void setLob(byte[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.LOB</code>. 
	 */
	@Override
	public byte[] getLob() {
		return (byte[]) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.math.BigDecimal, byte[]> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.math.BigDecimal, byte[]> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.LOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value2() {
		return getLob();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_725LobTest from) {
		setId(from.getId());
		setLob(from.getLob());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_725LobTest> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST);
	}
}