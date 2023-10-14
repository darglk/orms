/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLsWaldir extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_waldir</code>
     */
    public static final PgLsWaldir PG_LS_WALDIR = new PgLsWaldir();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_waldir.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_waldir.size</code>.
     */
    public final TableField<Record, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_waldir.modification</code>.
     */
    public final TableField<Record, OffsetDateTime> MODIFICATION = createField(DSL.name("modification"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLsWaldir(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgLsWaldir(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_waldir</code> table reference
     */
    public PgLsWaldir(String alias) {
        this(DSL.name(alias), PG_LS_WALDIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_waldir</code> table reference
     */
    public PgLsWaldir(Name alias) {
        this(alias, PG_LS_WALDIR);
    }

    /**
     * Create a <code>pg_catalog.pg_ls_waldir</code> table reference
     */
    public PgLsWaldir() {
        this(DSL.name("pg_ls_waldir"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLsWaldir as(String alias) {
        return new PgLsWaldir(DSL.name(alias), this, parameters);
    }

    @Override
    public PgLsWaldir as(Name alias) {
        return new PgLsWaldir(alias, this, parameters);
    }

    @Override
    public PgLsWaldir as(Table<?> alias) {
        return new PgLsWaldir(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsWaldir rename(String name) {
        return new PgLsWaldir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsWaldir rename(Name name) {
        return new PgLsWaldir(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsWaldir rename(Table<?> name) {
        return new PgLsWaldir(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgLsWaldir call() {
        PgLsWaldir result = new PgLsWaldir(DSL.name("pg_ls_waldir"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
