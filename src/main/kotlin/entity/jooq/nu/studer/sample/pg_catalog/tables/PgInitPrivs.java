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
public class PgInitPrivs extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_init_privs</code>
     */
    public static final PgInitPrivs PG_INIT_PRIVS = new PgInitPrivs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_init_privs.objoid</code>.
     */
    public final TableField<Record, Long> OBJOID = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_init_privs.classoid</code>.
     */
    public final TableField<Record, Long> CLASSOID = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_init_privs.objsubid</code>.
     */
    public final TableField<Record, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_init_privs.privtype</code>.
     */
    public final TableField<Record, String> PRIVTYPE = createField(DSL.name("privtype"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_init_privs.initprivs</code>.
     */
    public final TableField<Record, String[]> INITPRIVS = createField(DSL.name("initprivs"), SQLDataType.VARCHAR.nullable(false).array(), this, "");

    private PgInitPrivs(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgInitPrivs(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_init_privs</code> table reference
     */
    public PgInitPrivs(String alias) {
        this(DSL.name(alias), PG_INIT_PRIVS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_init_privs</code> table reference
     */
    public PgInitPrivs(Name alias) {
        this(alias, PG_INIT_PRIVS);
    }

    /**
     * Create a <code>pg_catalog.pg_init_privs</code> table reference
     */
    public PgInitPrivs() {
        this(DSL.name("pg_init_privs"), null);
    }

    public <O extends Record> PgInitPrivs(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_INIT_PRIVS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_INIT_PRIVS_O_C_O_INDEX;
    }

    @Override
    public PgInitPrivs as(String alias) {
        return new PgInitPrivs(DSL.name(alias), this);
    }

    @Override
    public PgInitPrivs as(Name alias) {
        return new PgInitPrivs(alias, this);
    }

    @Override
    public PgInitPrivs as(Table<?> alias) {
        return new PgInitPrivs(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgInitPrivs rename(String name) {
        return new PgInitPrivs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgInitPrivs rename(Name name) {
        return new PgInitPrivs(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgInitPrivs rename(Table<?> name) {
        return new PgInitPrivs(name.getQualifiedName(), null);
    }
}
