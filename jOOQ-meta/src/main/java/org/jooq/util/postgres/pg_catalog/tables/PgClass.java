/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.8.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgClass extends TableImpl<Record> {

	private static final long serialVersionUID = -1454094151;

	/**
	 * The reference instance of <code>pg_catalog.pg_class</code>
	 */
	public static final PgClass PG_CLASS = new PgClass();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_class.relname</code>.
	 */
	public final TableField<Record, String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relnamespace</code>.
	 */
	public final TableField<Record, Long> RELNAMESPACE = createField("relnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltype</code>.
	 */
	public final TableField<Record, Long> RELTYPE = createField("reltype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reloftype</code>.
	 */
	public final TableField<Record, Long> RELOFTYPE = createField("reloftype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relowner</code>.
	 */
	public final TableField<Record, Long> RELOWNER = createField("relowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relam</code>.
	 */
	public final TableField<Record, Long> RELAM = createField("relam", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relfilenode</code>.
	 */
	public final TableField<Record, Long> RELFILENODE = createField("relfilenode", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltablespace</code>.
	 */
	public final TableField<Record, Long> RELTABLESPACE = createField("reltablespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relpages</code>.
	 */
	public final TableField<Record, Integer> RELPAGES = createField("relpages", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltuples</code>.
	 */
	public final TableField<Record, Float> RELTUPLES = createField("reltuples", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relallvisible</code>.
	 */
	public final TableField<Record, Integer> RELALLVISIBLE = createField("relallvisible", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reltoastrelid</code>.
	 */
	public final TableField<Record, Long> RELTOASTRELID = createField("reltoastrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhasindex</code>.
	 */
	public final TableField<Record, Boolean> RELHASINDEX = createField("relhasindex", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relisshared</code>.
	 */
	public final TableField<Record, Boolean> RELISSHARED = createField("relisshared", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relpersistence</code>.
	 */
	public final TableField<Record, String> RELPERSISTENCE = createField("relpersistence", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relkind</code>.
	 */
	public final TableField<Record, String> RELKIND = createField("relkind", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relnatts</code>.
	 */
	public final TableField<Record, Short> RELNATTS = createField("relnatts", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relchecks</code>.
	 */
	public final TableField<Record, Short> RELCHECKS = createField("relchecks", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhasoids</code>.
	 */
	public final TableField<Record, Boolean> RELHASOIDS = createField("relhasoids", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhaspkey</code>.
	 */
	public final TableField<Record, Boolean> RELHASPKEY = createField("relhaspkey", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhasrules</code>.
	 */
	public final TableField<Record, Boolean> RELHASRULES = createField("relhasrules", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhastriggers</code>.
	 */
	public final TableField<Record, Boolean> RELHASTRIGGERS = createField("relhastriggers", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relhassubclass</code>.
	 */
	public final TableField<Record, Boolean> RELHASSUBCLASS = createField("relhassubclass", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relrowsecurity</code>.
	 */
	public final TableField<Record, Boolean> RELROWSECURITY = createField("relrowsecurity", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relforcerowsecurity</code>.
	 */
	public final TableField<Record, Boolean> RELFORCEROWSECURITY = createField("relforcerowsecurity", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relispopulated</code>.
	 */
	public final TableField<Record, Boolean> RELISPOPULATED = createField("relispopulated", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relreplident</code>.
	 */
	public final TableField<Record, String> RELREPLIDENT = createField("relreplident", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relfrozenxid</code>.
	 */
	public final TableField<Record, Long> RELFROZENXID = createField("relfrozenxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relminmxid</code>.
	 */
	public final TableField<Record, Long> RELMINMXID = createField("relminmxid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.relacl</code>.
	 */
	public final TableField<Record, String[]> RELACL = createField("relacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_class.reloptions</code>.
	 */
	public final TableField<Record, String[]> RELOPTIONS = createField("reloptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

	/**
	 * Create a <code>pg_catalog.pg_class</code> table reference
	 */
	public PgClass() {
		this("pg_class", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_class</code> table reference
	 */
	public PgClass(String alias) {
		this(alias, PG_CLASS);
	}

	private PgClass(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private PgClass(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgClass as(String alias) {
		return new PgClass(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PgClass rename(String name) {
		return new PgClass(name, null);
	}
}
