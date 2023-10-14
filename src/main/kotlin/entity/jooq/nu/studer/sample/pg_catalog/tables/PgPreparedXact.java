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
public class PgPreparedXact extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_prepared_xact</code>
     */
    public static final PgPreparedXact PG_PREPARED_XACT = new PgPreparedXact();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public final TableField<Record, Long> TRANSACTION = createField(DSL.name("transaction"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public final TableField<Record, String> GID = createField(DSL.name("gid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public final TableField<Record, OffsetDateTime> PREPARED = createField(DSL.name("prepared"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public final TableField<Record, Long> OWNERID = createField(DSL.name("ownerid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public final TableField<Record, Long> DBID = createField(DSL.name("dbid"), SQLDataType.BIGINT, this, "");

    private PgPreparedXact(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgPreparedXact(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xact</code> table
     * reference
     */
    public PgPreparedXact(String alias) {
        this(DSL.name(alias), PG_PREPARED_XACT);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_prepared_xact</code> table
     * reference
     */
    public PgPreparedXact(Name alias) {
        this(alias, PG_PREPARED_XACT);
    }

    /**
     * Create a <code>pg_catalog.pg_prepared_xact</code> table reference
     */
    public PgPreparedXact() {
        this(DSL.name("pg_prepared_xact"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgPreparedXact as(String alias) {
        return new PgPreparedXact(DSL.name(alias), this, parameters);
    }

    @Override
    public PgPreparedXact as(Name alias) {
        return new PgPreparedXact(alias, this, parameters);
    }

    @Override
    public PgPreparedXact as(Table<?> alias) {
        return new PgPreparedXact(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXact rename(String name) {
        return new PgPreparedXact(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXact rename(Name name) {
        return new PgPreparedXact(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPreparedXact rename(Table<?> name) {
        return new PgPreparedXact(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgPreparedXact call() {
        PgPreparedXact result = new PgPreparedXact(DSL.name("pg_prepared_xact"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
