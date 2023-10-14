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
public class PgExtensionUpdatePaths extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_extension_update_paths</code>
     */
    public static final PgExtensionUpdatePaths PG_EXTENSION_UPDATE_PATHS = new PgExtensionUpdatePaths();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.source</code>.
     */
    public final TableField<Record, String> SOURCE = createField(DSL.name("source"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.target</code>.
     */
    public final TableField<Record, String> TARGET = createField(DSL.name("target"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.path</code>.
     */
    public final TableField<Record, String> PATH = createField(DSL.name("path"), SQLDataType.CLOB, this, "");

    private PgExtensionUpdatePaths(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR)
        });
    }

    private PgExtensionUpdatePaths(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_extension_update_paths</code> table
     * reference
     */
    public PgExtensionUpdatePaths(String alias) {
        this(DSL.name(alias), PG_EXTENSION_UPDATE_PATHS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_extension_update_paths</code> table
     * reference
     */
    public PgExtensionUpdatePaths(Name alias) {
        this(alias, PG_EXTENSION_UPDATE_PATHS);
    }

    /**
     * Create a <code>pg_catalog.pg_extension_update_paths</code> table
     * reference
     */
    public PgExtensionUpdatePaths() {
        this(DSL.name("pg_extension_update_paths"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgExtensionUpdatePaths as(String alias) {
        return new PgExtensionUpdatePaths(DSL.name(alias), this, parameters);
    }

    @Override
    public PgExtensionUpdatePaths as(Name alias) {
        return new PgExtensionUpdatePaths(alias, this, parameters);
    }

    @Override
    public PgExtensionUpdatePaths as(Table<?> alias) {
        return new PgExtensionUpdatePaths(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgExtensionUpdatePaths rename(String name) {
        return new PgExtensionUpdatePaths(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgExtensionUpdatePaths rename(Name name) {
        return new PgExtensionUpdatePaths(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgExtensionUpdatePaths rename(Table<?> name) {
        return new PgExtensionUpdatePaths(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgExtensionUpdatePaths call(
          String name
    ) {
        PgExtensionUpdatePaths result = new PgExtensionUpdatePaths(DSL.name("pg_extension_update_paths"), null, new Field[] {
            DSL.val(name, SQLDataType.VARCHAR)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgExtensionUpdatePaths call(
          Field<String> name
    ) {
        PgExtensionUpdatePaths result = new PgExtensionUpdatePaths(DSL.name("pg_extension_update_paths"), null, new Field[] {
            name
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}