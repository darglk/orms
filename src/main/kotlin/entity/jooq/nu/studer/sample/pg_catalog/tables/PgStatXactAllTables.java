/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


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
public class PgStatXactAllTables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_xact_all_tables</code>
     */
    public static final PgStatXactAllTables PG_STAT_XACT_ALL_TABLES = new PgStatXactAllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    public final TableField<Record, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    public final TableField<Record, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    public final TableField<Record, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    public final TableField<Record, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    public final TableField<Record, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    public final TableField<Record, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    public final TableField<Record, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    public final TableField<Record, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    public final TableField<Record, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    public final TableField<Record, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    public final TableField<Record, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_xact_all_tables.n_tup_newpage_upd</code>.
     */
    public final TableField<Record, Long> N_TUP_NEWPAGE_UPD = createField(DSL.name("n_tup_newpage_upd"), SQLDataType.BIGINT, this, "");

    private PgStatXactAllTables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactAllTables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_xact_all_tables" as  SELECT c.oid AS relid,
          n.nspname AS schemaname,
          c.relname,
          pg_stat_get_xact_numscans(c.oid) AS seq_scan,
          pg_stat_get_xact_tuples_returned(c.oid) AS seq_tup_read,
          (sum(pg_stat_get_xact_numscans(i.indexrelid)))::bigint AS idx_scan,
          ((sum(pg_stat_get_xact_tuples_fetched(i.indexrelid)))::bigint + pg_stat_get_xact_tuples_fetched(c.oid)) AS idx_tup_fetch,
          pg_stat_get_xact_tuples_inserted(c.oid) AS n_tup_ins,
          pg_stat_get_xact_tuples_updated(c.oid) AS n_tup_upd,
          pg_stat_get_xact_tuples_deleted(c.oid) AS n_tup_del,
          pg_stat_get_xact_tuples_hot_updated(c.oid) AS n_tup_hot_upd,
          pg_stat_get_xact_tuples_newpage_updated(c.oid) AS n_tup_newpage_upd
         FROM ((pg_class c
           LEFT JOIN pg_index i ON ((c.oid = i.indrelid)))
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
        WHERE (c.relkind = ANY (ARRAY['r'::"char", 't'::"char", 'm'::"char", 'p'::"char"]))
        GROUP BY c.oid, n.nspname, c.relname;
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_all_tables</code> table
     * reference
     */
    public PgStatXactAllTables(String alias) {
        this(DSL.name(alias), PG_STAT_XACT_ALL_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_all_tables</code> table
     * reference
     */
    public PgStatXactAllTables(Name alias) {
        this(alias, PG_STAT_XACT_ALL_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_xact_all_tables</code> table reference
     */
    public PgStatXactAllTables() {
        this(DSL.name("pg_stat_xact_all_tables"), null);
    }

    public <O extends Record> PgStatXactAllTables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_STAT_XACT_ALL_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatXactAllTables as(String alias) {
        return new PgStatXactAllTables(DSL.name(alias), this);
    }

    @Override
    public PgStatXactAllTables as(Name alias) {
        return new PgStatXactAllTables(alias, this);
    }

    @Override
    public PgStatXactAllTables as(Table<?> alias) {
        return new PgStatXactAllTables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactAllTables rename(String name) {
        return new PgStatXactAllTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactAllTables rename(Name name) {
        return new PgStatXactAllTables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactAllTables rename(Table<?> name) {
        return new PgStatXactAllTables(name.getQualifiedName(), null);
    }
}
