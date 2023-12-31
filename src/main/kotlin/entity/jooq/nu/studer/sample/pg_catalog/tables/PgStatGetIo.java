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
public class PgStatGetIo extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_get_io</code>
     */
    public static final PgStatGetIo PG_STAT_GET_IO = new PgStatGetIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_io.backend_type</code>.
     */
    public final TableField<Record, String> BACKEND_TYPE = createField(DSL.name("backend_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.object</code>.
     */
    public final TableField<Record, String> OBJECT = createField(DSL.name("object"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.context</code>.
     */
    public final TableField<Record, String> CONTEXT = createField(DSL.name("context"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.reads</code>.
     */
    public final TableField<Record, Long> READS = createField(DSL.name("reads"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.read_time</code>.
     */
    public final TableField<Record, Double> READ_TIME = createField(DSL.name("read_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.writes</code>.
     */
    public final TableField<Record, Long> WRITES = createField(DSL.name("writes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.write_time</code>.
     */
    public final TableField<Record, Double> WRITE_TIME = createField(DSL.name("write_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.writebacks</code>.
     */
    public final TableField<Record, Long> WRITEBACKS = createField(DSL.name("writebacks"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.writeback_time</code>.
     */
    public final TableField<Record, Double> WRITEBACK_TIME = createField(DSL.name("writeback_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.extends</code>.
     */
    public final TableField<Record, Long> EXTENDS = createField(DSL.name("extends"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.extend_time</code>.
     */
    public final TableField<Record, Double> EXTEND_TIME = createField(DSL.name("extend_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.op_bytes</code>.
     */
    public final TableField<Record, Long> OP_BYTES = createField(DSL.name("op_bytes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.hits</code>.
     */
    public final TableField<Record, Long> HITS = createField(DSL.name("hits"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.evictions</code>.
     */
    public final TableField<Record, Long> EVICTIONS = createField(DSL.name("evictions"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.reuses</code>.
     */
    public final TableField<Record, Long> REUSES = createField(DSL.name("reuses"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.fsyncs</code>.
     */
    public final TableField<Record, Long> FSYNCS = createField(DSL.name("fsyncs"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.fsync_time</code>.
     */
    public final TableField<Record, Double> FSYNC_TIME = createField(DSL.name("fsync_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_io.stats_reset</code>.
     */
    public final TableField<Record, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatGetIo(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgStatGetIo(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_io</code> table reference
     */
    public PgStatGetIo(String alias) {
        this(DSL.name(alias), PG_STAT_GET_IO);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_io</code> table reference
     */
    public PgStatGetIo(Name alias) {
        this(alias, PG_STAT_GET_IO);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_get_io</code> table reference
     */
    public PgStatGetIo() {
        this(DSL.name("pg_stat_get_io"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatGetIo as(String alias) {
        return new PgStatGetIo(DSL.name(alias), this, parameters);
    }

    @Override
    public PgStatGetIo as(Name alias) {
        return new PgStatGetIo(alias, this, parameters);
    }

    @Override
    public PgStatGetIo as(Table<?> alias) {
        return new PgStatGetIo(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetIo rename(String name) {
        return new PgStatGetIo(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetIo rename(Name name) {
        return new PgStatGetIo(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetIo rename(Table<?> name) {
        return new PgStatGetIo(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetIo call() {
        PgStatGetIo result = new PgStatGetIo(DSL.name("pg_stat_get_io"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
