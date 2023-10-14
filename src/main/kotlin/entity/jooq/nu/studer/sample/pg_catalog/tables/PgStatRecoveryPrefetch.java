/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PgStatRecoveryPrefetch extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_stat_recovery_prefetch</code>
     */
    public static final PgStatRecoveryPrefetch PG_STAT_RECOVERY_PREFETCH = new PgStatRecoveryPrefetch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.stats_reset</code>.
     */
    public final TableField<Record, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.prefetch</code>.
     */
    public final TableField<Record, Long> PREFETCH = createField(DSL.name("prefetch"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.hit</code>.
     */
    public final TableField<Record, Long> HIT = createField(DSL.name("hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.skip_init</code>.
     */
    public final TableField<Record, Long> SKIP_INIT = createField(DSL.name("skip_init"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.skip_new</code>.
     */
    public final TableField<Record, Long> SKIP_NEW = createField(DSL.name("skip_new"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.skip_fpw</code>.
     */
    public final TableField<Record, Long> SKIP_FPW = createField(DSL.name("skip_fpw"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.skip_rep</code>.
     */
    public final TableField<Record, Long> SKIP_REP = createField(DSL.name("skip_rep"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_recovery_prefetch.wal_distance</code>.
     */
    public final TableField<Record, Integer> WAL_DISTANCE = createField(DSL.name("wal_distance"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_recovery_prefetch.block_distance</code>.
     */
    public final TableField<Record, Integer> BLOCK_DISTANCE = createField(DSL.name("block_distance"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_recovery_prefetch.io_depth</code>.
     */
    public final TableField<Record, Integer> IO_DEPTH = createField(DSL.name("io_depth"), SQLDataType.INTEGER, this, "");

    private PgStatRecoveryPrefetch(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgStatRecoveryPrefetch(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_recovery_prefetch" as  SELECT stats_reset,
         prefetch,
         hit,
         skip_init,
         skip_new,
         skip_fpw,
         skip_rep,
         wal_distance,
         block_distance,
         io_depth
        FROM pg_stat_get_recovery_prefetch() s(stats_reset, prefetch, hit, skip_init, skip_new, skip_fpw, skip_rep, wal_distance, block_distance, io_depth);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_recovery_prefetch</code> table
     * reference
     */
    public PgStatRecoveryPrefetch(String alias) {
        this(DSL.name(alias), PG_STAT_RECOVERY_PREFETCH);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_recovery_prefetch</code> table
     * reference
     */
    public PgStatRecoveryPrefetch(Name alias) {
        this(alias, PG_STAT_RECOVERY_PREFETCH);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_recovery_prefetch</code> table
     * reference
     */
    public PgStatRecoveryPrefetch() {
        this(DSL.name("pg_stat_recovery_prefetch"), null);
    }

    public <O extends Record> PgStatRecoveryPrefetch(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_STAT_RECOVERY_PREFETCH);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatRecoveryPrefetch as(String alias) {
        return new PgStatRecoveryPrefetch(DSL.name(alias), this);
    }

    @Override
    public PgStatRecoveryPrefetch as(Name alias) {
        return new PgStatRecoveryPrefetch(alias, this);
    }

    @Override
    public PgStatRecoveryPrefetch as(Table<?> alias) {
        return new PgStatRecoveryPrefetch(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatRecoveryPrefetch rename(String name) {
        return new PgStatRecoveryPrefetch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatRecoveryPrefetch rename(Name name) {
        return new PgStatRecoveryPrefetch(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatRecoveryPrefetch rename(Table<?> name) {
        return new PgStatRecoveryPrefetch(name.getQualifiedName(), null);
    }
}