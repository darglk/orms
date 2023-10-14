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
public class PgStatAllTables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_all_tables</code>
     */
    public static final PgStatAllTables PG_STAT_ALL_TABLES = new PgStatAllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.relid</code>.
     */
    public final TableField<Record, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.schemaname</code>.
     */
    public final TableField<Record, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.relname</code>.
     */
    public final TableField<Record, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.seq_scan</code>.
     */
    public final TableField<Record, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_seq_scan</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_SEQ_SCAN = createField(DSL.name("last_seq_scan"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.seq_tup_read</code>.
     */
    public final TableField<Record, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.idx_scan</code>.
     */
    public final TableField<Record, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_idx_scan</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_IDX_SCAN = createField(DSL.name("last_idx_scan"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.idx_tup_fetch</code>.
     */
    public final TableField<Record, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_ins</code>.
     */
    public final TableField<Record, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_upd</code>.
     */
    public final TableField<Record, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_del</code>.
     */
    public final TableField<Record, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_hot_upd</code>.
     */
    public final TableField<Record, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_tup_newpage_upd</code>.
     */
    public final TableField<Record, Long> N_TUP_NEWPAGE_UPD = createField(DSL.name("n_tup_newpage_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_live_tup</code>.
     */
    public final TableField<Record, Long> N_LIVE_TUP = createField(DSL.name("n_live_tup"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_dead_tup</code>.
     */
    public final TableField<Record, Long> N_DEAD_TUP = createField(DSL.name("n_dead_tup"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_all_tables.n_mod_since_analyze</code>.
     */
    public final TableField<Record, Long> N_MOD_SINCE_ANALYZE = createField(DSL.name("n_mod_since_analyze"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.n_ins_since_vacuum</code>.
     */
    public final TableField<Record, Long> N_INS_SINCE_VACUUM = createField(DSL.name("n_ins_since_vacuum"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_vacuum</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_VACUUM = createField(DSL.name("last_vacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_autovacuum</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_AUTOVACUUM = createField(DSL.name("last_autovacuum"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_analyze</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_ANALYZE = createField(DSL.name("last_analyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.last_autoanalyze</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_AUTOANALYZE = createField(DSL.name("last_autoanalyze"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.vacuum_count</code>.
     */
    public final TableField<Record, Long> VACUUM_COUNT = createField(DSL.name("vacuum_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.autovacuum_count</code>.
     */
    public final TableField<Record, Long> AUTOVACUUM_COUNT = createField(DSL.name("autovacuum_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.analyze_count</code>.
     */
    public final TableField<Record, Long> ANALYZE_COUNT = createField(DSL.name("analyze_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_all_tables.autoanalyze_count</code>.
     */
    public final TableField<Record, Long> AUTOANALYZE_COUNT = createField(DSL.name("autoanalyze_count"), SQLDataType.BIGINT, this, "");

    private PgStatAllTables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgStatAllTables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_all_tables" as  SELECT c.oid AS relid,
          n.nspname AS schemaname,
          c.relname,
          pg_stat_get_numscans(c.oid) AS seq_scan,
          pg_stat_get_lastscan(c.oid) AS last_seq_scan,
          pg_stat_get_tuples_returned(c.oid) AS seq_tup_read,
          (sum(pg_stat_get_numscans(i.indexrelid)))::bigint AS idx_scan,
          max(pg_stat_get_lastscan(i.indexrelid)) AS last_idx_scan,
          ((sum(pg_stat_get_tuples_fetched(i.indexrelid)))::bigint + pg_stat_get_tuples_fetched(c.oid)) AS idx_tup_fetch,
          pg_stat_get_tuples_inserted(c.oid) AS n_tup_ins,
          pg_stat_get_tuples_updated(c.oid) AS n_tup_upd,
          pg_stat_get_tuples_deleted(c.oid) AS n_tup_del,
          pg_stat_get_tuples_hot_updated(c.oid) AS n_tup_hot_upd,
          pg_stat_get_tuples_newpage_updated(c.oid) AS n_tup_newpage_upd,
          pg_stat_get_live_tuples(c.oid) AS n_live_tup,
          pg_stat_get_dead_tuples(c.oid) AS n_dead_tup,
          pg_stat_get_mod_since_analyze(c.oid) AS n_mod_since_analyze,
          pg_stat_get_ins_since_vacuum(c.oid) AS n_ins_since_vacuum,
          pg_stat_get_last_vacuum_time(c.oid) AS last_vacuum,
          pg_stat_get_last_autovacuum_time(c.oid) AS last_autovacuum,
          pg_stat_get_last_analyze_time(c.oid) AS last_analyze,
          pg_stat_get_last_autoanalyze_time(c.oid) AS last_autoanalyze,
          pg_stat_get_vacuum_count(c.oid) AS vacuum_count,
          pg_stat_get_autovacuum_count(c.oid) AS autovacuum_count,
          pg_stat_get_analyze_count(c.oid) AS analyze_count,
          pg_stat_get_autoanalyze_count(c.oid) AS autoanalyze_count
         FROM ((pg_class c
           LEFT JOIN pg_index i ON ((c.oid = i.indrelid)))
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
        WHERE (c.relkind = ANY (ARRAY['r'::"char", 't'::"char", 'm'::"char", 'p'::"char"]))
        GROUP BY c.oid, n.nspname, c.relname;
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_all_tables</code> table
     * reference
     */
    public PgStatAllTables(String alias) {
        this(DSL.name(alias), PG_STAT_ALL_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_all_tables</code> table
     * reference
     */
    public PgStatAllTables(Name alias) {
        this(alias, PG_STAT_ALL_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_all_tables</code> table reference
     */
    public PgStatAllTables() {
        this(DSL.name("pg_stat_all_tables"), null);
    }

    public <O extends Record> PgStatAllTables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_STAT_ALL_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatAllTables as(String alias) {
        return new PgStatAllTables(DSL.name(alias), this);
    }

    @Override
    public PgStatAllTables as(Name alias) {
        return new PgStatAllTables(alias, this);
    }

    @Override
    public PgStatAllTables as(Table<?> alias) {
        return new PgStatAllTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatAllTables rename(String name) {
        return new PgStatAllTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatAllTables rename(Name name) {
        return new PgStatAllTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatAllTables rename(Table<?> name) {
        return new PgStatAllTables(name.getQualifiedName(), null);
    }
}
