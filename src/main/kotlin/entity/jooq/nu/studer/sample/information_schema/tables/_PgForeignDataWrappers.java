/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;

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
public class _PgForeignDataWrappers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_data_wrappers</code>
     */
    public static final _PgForeignDataWrappers _PG_FOREIGN_DATA_WRAPPERS = new _PgForeignDataWrappers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema._pg_foreign_data_wrappers.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_data_wrappers.fdwowner</code>.
     */
    public final TableField<Record, Long> FDWOWNER = createField(DSL.name("fdwowner"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_data_wrappers.fdwoptions</code>.
     */
    public final TableField<Record, String[]> FDWOPTIONS = createField(DSL.name("fdwoptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_data_wrappers.authorization_identifier</code>.
     */
    public final TableField<Record, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_LANGUAGE = createField(DSL.name("foreign_data_wrapper_language"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private _PgForeignDataWrappers(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignDataWrappers(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "_pg_foreign_data_wrappers" as  SELECT w.oid,
          w.fdwowner,
          w.fdwoptions,
          (current_database())::information_schema.sql_identifier AS foreign_data_wrapper_catalog,
          (w.fdwname)::information_schema.sql_identifier AS foreign_data_wrapper_name,
          (u.rolname)::information_schema.sql_identifier AS authorization_identifier,
          ('c'::character varying)::information_schema.character_data AS foreign_data_wrapper_language
         FROM pg_foreign_data_wrapper w,
          pg_authid u
        WHERE ((u.oid = w.fdwowner) AND (pg_has_role(w.fdwowner, 'USAGE'::text) OR has_foreign_data_wrapper_privilege(w.oid, 'USAGE'::text)));
        """));
    }

    /**
     * Create an aliased
     * <code>information_schema._pg_foreign_data_wrappers</code> table reference
     */
    public _PgForeignDataWrappers(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create an aliased
     * <code>information_schema._pg_foreign_data_wrappers</code> table reference
     */
    public _PgForeignDataWrappers(Name alias) {
        this(alias, _PG_FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create a <code>information_schema._pg_foreign_data_wrappers</code> table
     * reference
     */
    public _PgForeignDataWrappers() {
        this(DSL.name("_pg_foreign_data_wrappers"), null);
    }

    public <O extends Record> _PgForeignDataWrappers(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, _PG_FOREIGN_DATA_WRAPPERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignDataWrappers as(String alias) {
        return new _PgForeignDataWrappers(DSL.name(alias), this);
    }

    @Override
    public _PgForeignDataWrappers as(Name alias) {
        return new _PgForeignDataWrappers(alias, this);
    }

    @Override
    public _PgForeignDataWrappers as(Table<?> alias) {
        return new _PgForeignDataWrappers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignDataWrappers rename(String name) {
        return new _PgForeignDataWrappers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignDataWrappers rename(Name name) {
        return new _PgForeignDataWrappers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignDataWrappers rename(Table<?> name) {
        return new _PgForeignDataWrappers(name.getQualifiedName(), null);
    }
}
