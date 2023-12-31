/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.Keys;
import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgForeignTable extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_table</code>
     */
    public static final PgForeignTable PG_FOREIGN_TABLE = new PgForeignTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public final TableField<Record, Long> FTRELID = createField(DSL.name("ftrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public final TableField<Record, Long> FTSERVER = createField(DSL.name("ftserver"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public final TableField<Record, String[]> FTOPTIONS = createField(DSL.name("ftoptions"), SQLDataType.CLOB.array(), this, "");

    private PgForeignTable(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignTable(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_table</code> table
     * reference
     */
    public PgForeignTable(String alias) {
        this(DSL.name(alias), PG_FOREIGN_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_table</code> table
     * reference
     */
    public PgForeignTable(Name alias) {
        this(alias, PG_FOREIGN_TABLE);
    }

    /**
     * Create a <code>pg_catalog.pg_foreign_table</code> table reference
     */
    public PgForeignTable() {
        this(DSL.name("pg_foreign_table"), null);
    }

    public <O extends Record> PgForeignTable(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_FOREIGN_TABLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_FOREIGN_TABLE_RELID_INDEX;
    }

    @Override
    public PgForeignTable as(String alias) {
        return new PgForeignTable(DSL.name(alias), this);
    }

    @Override
    public PgForeignTable as(Name alias) {
        return new PgForeignTable(alias, this);
    }

    @Override
    public PgForeignTable as(Table<?> alias) {
        return new PgForeignTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignTable rename(String name) {
        return new PgForeignTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignTable rename(Name name) {
        return new PgForeignTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignTable rename(Table<?> name) {
        return new PgForeignTable(name.getQualifiedName(), null);
    }
}
