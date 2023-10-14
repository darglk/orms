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
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.view_table_usage</code>
     */
    public static final ViewTableUsage VIEW_TABLE_USAGE = new ViewTableUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.view_table_usage.view_catalog</code>.
     */
    public final TableField<Record, String> VIEW_CATALOG = createField(DSL.name("view_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_table_usage.view_schema</code>.
     */
    public final TableField<Record, String> VIEW_SCHEMA = createField(DSL.name("view_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_table_usage.view_name</code>.
     */
    public final TableField<Record, String> VIEW_NAME = createField(DSL.name("view_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.view_table_usage.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_table_usage.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.view_table_usage.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ViewTableUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableUsage(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_table_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS view_catalog,
          (nv.nspname)::information_schema.sql_identifier AS view_schema,
          (v.relname)::information_schema.sql_identifier AS view_name,
          (current_database())::information_schema.sql_identifier AS table_catalog,
          (nt.nspname)::information_schema.sql_identifier AS table_schema,
          (t.relname)::information_schema.sql_identifier AS table_name
         FROM pg_namespace nv,
          pg_class v,
          pg_depend dv,
          pg_depend dt,
          pg_class t,
          pg_namespace nt
        WHERE ((nv.oid = v.relnamespace) AND (v.relkind = 'v'::"char") AND (v.oid = dv.refobjid) AND (dv.refclassid = ('pg_class'::regclass)::oid) AND (dv.classid = ('pg_rewrite'::regclass)::oid) AND (dv.deptype = 'i'::"char") AND (dv.objid = dt.objid) AND (dv.refobjid <> dt.refobjid) AND (dt.classid = ('pg_rewrite'::regclass)::oid) AND (dt.refclassid = ('pg_class'::regclass)::oid) AND (dt.refobjid = t.oid) AND (t.relnamespace = nt.oid) AND (t.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'p'::"char"])) AND pg_has_role(t.relowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.view_table_usage</code> table
     * reference
     */
    public ViewTableUsage(String alias) {
        this(DSL.name(alias), VIEW_TABLE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.view_table_usage</code> table
     * reference
     */
    public ViewTableUsage(Name alias) {
        this(alias, VIEW_TABLE_USAGE);
    }

    /**
     * Create a <code>information_schema.view_table_usage</code> table reference
     */
    public ViewTableUsage() {
        this(DSL.name("view_table_usage"), null);
    }

    public <O extends Record> ViewTableUsage(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, VIEW_TABLE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ViewTableUsage as(String alias) {
        return new ViewTableUsage(DSL.name(alias), this);
    }

    @Override
    public ViewTableUsage as(Name alias) {
        return new ViewTableUsage(alias, this);
    }

    @Override
    public ViewTableUsage as(Table<?> alias) {
        return new ViewTableUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsage rename(String name) {
        return new ViewTableUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsage rename(Name name) {
        return new ViewTableUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsage rename(Table<?> name) {
        return new ViewTableUsage(name.getQualifiedName(), null);
    }
}
