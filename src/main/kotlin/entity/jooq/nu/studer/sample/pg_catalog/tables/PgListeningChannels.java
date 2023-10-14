/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


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
public class PgListeningChannels extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_listening_channels</code>
     */
    public static final PgListeningChannels PG_LISTENING_CHANNELS = new PgListeningChannels();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>pg_catalog.pg_listening_channels.pg_listening_channels</code>.
     */
    public final TableField<Record, String> PG_LISTENING_CHANNELS_ = createField(DSL.name("pg_listening_channels"), SQLDataType.CLOB, this, "");

    private PgListeningChannels(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgListeningChannels(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_listening_channels</code> table
     * reference
     */
    public PgListeningChannels(String alias) {
        this(DSL.name(alias), PG_LISTENING_CHANNELS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_listening_channels</code> table
     * reference
     */
    public PgListeningChannels(Name alias) {
        this(alias, PG_LISTENING_CHANNELS);
    }

    /**
     * Create a <code>pg_catalog.pg_listening_channels</code> table reference
     */
    public PgListeningChannels() {
        this(DSL.name("pg_listening_channels"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgListeningChannels as(String alias) {
        return new PgListeningChannels(DSL.name(alias), this, parameters);
    }

    @Override
    public PgListeningChannels as(Name alias) {
        return new PgListeningChannels(alias, this, parameters);
    }

    @Override
    public PgListeningChannels as(Table<?> alias) {
        return new PgListeningChannels(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgListeningChannels rename(String name) {
        return new PgListeningChannels(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgListeningChannels rename(Name name) {
        return new PgListeningChannels(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgListeningChannels rename(Table<?> name) {
        return new PgListeningChannels(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgListeningChannels call() {
        PgListeningChannels result = new PgListeningChannels(DSL.name("pg_listening_channels"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
