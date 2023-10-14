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
public class PgSequence extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_sequence</code>
     */
    public static final PgSequence PG_SEQUENCE = new PgSequence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    public final TableField<Record, Long> SEQRELID = createField(DSL.name("seqrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    public final TableField<Record, Long> SEQTYPID = createField(DSL.name("seqtypid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    public final TableField<Record, Long> SEQSTART = createField(DSL.name("seqstart"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    public final TableField<Record, Long> SEQINCREMENT = createField(DSL.name("seqincrement"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    public final TableField<Record, Long> SEQMAX = createField(DSL.name("seqmax"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    public final TableField<Record, Long> SEQMIN = createField(DSL.name("seqmin"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    public final TableField<Record, Long> SEQCACHE = createField(DSL.name("seqcache"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    public final TableField<Record, Boolean> SEQCYCLE = createField(DSL.name("seqcycle"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private PgSequence(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgSequence(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(String alias) {
        this(DSL.name(alias), PG_SEQUENCE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(Name alias) {
        this(alias, PG_SEQUENCE);
    }

    /**
     * Create a <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence() {
        this(DSL.name("pg_sequence"), null);
    }

    public <O extends Record> PgSequence(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_SEQUENCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_SEQUENCE_SEQRELID_INDEX;
    }

    @Override
    public PgSequence as(String alias) {
        return new PgSequence(DSL.name(alias), this);
    }

    @Override
    public PgSequence as(Name alias) {
        return new PgSequence(alias, this);
    }

    @Override
    public PgSequence as(Table<?> alias) {
        return new PgSequence(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(String name) {
        return new PgSequence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(Name name) {
        return new PgSequence(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(Table<?> name) {
        return new PgSequence(name.getQualifiedName(), null);
    }
}