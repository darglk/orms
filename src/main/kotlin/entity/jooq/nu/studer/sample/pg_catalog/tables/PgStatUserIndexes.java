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
public class PgStatUserIndexes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_user_indexes</code>
     */
    public static final PgStatUserIndexes PG_STAT_USER_INDEXES = new PgStatUserIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.relid</code>.
     */
    public final TableField<Record, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.indexrelid</code>.
     */
    public final TableField<Record, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.schemaname</code>.
     */
    public final TableField<Record, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.relname</code>.
     */
    public final TableField<Record, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.indexrelname</code>.
     */
    public final TableField<Record, String> INDEXRELNAME = createField(DSL.name("indexrelname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_scan</code>.
     */
    public final TableField<Record, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.last_idx_scan</code>.
     */
    public final TableField<Record, OffsetDateTime> LAST_IDX_SCAN = createField(DSL.name("last_idx_scan"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_tup_read</code>.
     */
    public final TableField<Record, Long> IDX_TUP_READ = createField(DSL.name("idx_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_indexes.idx_tup_fetch</code>.
     */
    public final TableField<Record, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    private PgStatUserIndexes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgStatUserIndexes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_user_indexes" as  SELECT relid,
          indexrelid,
          schemaname,
          relname,
          indexrelname,
          idx_scan,
          last_idx_scan,
          idx_tup_read,
          idx_tup_fetch
         FROM pg_stat_all_indexes
        WHERE ((schemaname <> ALL (ARRAY['pg_catalog'::name, 'information_schema'::name])) AND (schemaname !~ '^pg_toast'::text));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_indexes</code> table
     * reference
     */
    public PgStatUserIndexes(String alias) {
        this(DSL.name(alias), PG_STAT_USER_INDEXES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_indexes</code> table
     * reference
     */
    public PgStatUserIndexes(Name alias) {
        this(alias, PG_STAT_USER_INDEXES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_user_indexes</code> table reference
     */
    public PgStatUserIndexes() {
        this(DSL.name("pg_stat_user_indexes"), null);
    }

    public <O extends Record> PgStatUserIndexes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_STAT_USER_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatUserIndexes as(String alias) {
        return new PgStatUserIndexes(DSL.name(alias), this);
    }

    @Override
    public PgStatUserIndexes as(Name alias) {
        return new PgStatUserIndexes(alias, this);
    }

    @Override
    public PgStatUserIndexes as(Table<?> alias) {
        return new PgStatUserIndexes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserIndexes rename(String name) {
        return new PgStatUserIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserIndexes rename(Name name) {
        return new PgStatUserIndexes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserIndexes rename(Table<?> name) {
        return new PgStatUserIndexes(name.getQualifiedName(), null);
    }
}