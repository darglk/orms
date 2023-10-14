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
public class PgStatGetSlru extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_get_slru</code>
     */
    public static final PgStatGetSlru PG_STAT_GET_SLRU = new PgStatGetSlru();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.blks_zeroed</code>.
     */
    public final TableField<Record, Long> BLKS_ZEROED = createField(DSL.name("blks_zeroed"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.blks_hit</code>.
     */
    public final TableField<Record, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.blks_read</code>.
     */
    public final TableField<Record, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.blks_written</code>.
     */
    public final TableField<Record, Long> BLKS_WRITTEN = createField(DSL.name("blks_written"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.blks_exists</code>.
     */
    public final TableField<Record, Long> BLKS_EXISTS = createField(DSL.name("blks_exists"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.flushes</code>.
     */
    public final TableField<Record, Long> FLUSHES = createField(DSL.name("flushes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.truncates</code>.
     */
    public final TableField<Record, Long> TRUNCATES = createField(DSL.name("truncates"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_slru.stats_reset</code>.
     */
    public final TableField<Record, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatGetSlru(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgStatGetSlru(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_slru</code> table
     * reference
     */
    public PgStatGetSlru(String alias) {
        this(DSL.name(alias), PG_STAT_GET_SLRU);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_slru</code> table
     * reference
     */
    public PgStatGetSlru(Name alias) {
        this(alias, PG_STAT_GET_SLRU);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_get_slru</code> table reference
     */
    public PgStatGetSlru() {
        this(DSL.name("pg_stat_get_slru"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatGetSlru as(String alias) {
        return new PgStatGetSlru(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStatGetSlru as(Name alias) {
        return new PgStatGetSlru(alias, this, parameters);
    }

    @Override
    public PgStatGetSlru as(Table<?> alias) {
        return new PgStatGetSlru(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetSlru rename(String name) {
        return new PgStatGetSlru(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetSlru rename(Name name) {
        return new PgStatGetSlru(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetSlru rename(Table<?> name) {
        return new PgStatGetSlru(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetSlru call() {
        PgStatGetSlru result = new PgStatGetSlru(DSL.name("pg_stat_get_slru"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
