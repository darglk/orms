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
public class ConstraintColumnUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.constraint_column_usage</code>
     */
    public static final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = new ConstraintColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.constraint_column_usage.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ConstraintColumnUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ConstraintColumnUsage(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "constraint_column_usage" as  SELECT (current_database())::information_schema.sql_identifier AS table_catalog,
          (tblschema)::information_schema.sql_identifier AS table_schema,
          (tblname)::information_schema.sql_identifier AS table_name,
          (colname)::information_schema.sql_identifier AS column_name,
          (current_database())::information_schema.sql_identifier AS constraint_catalog,
          (cstrschema)::information_schema.sql_identifier AS constraint_schema,
          (cstrname)::information_schema.sql_identifier AS constraint_name
         FROM ( SELECT DISTINCT nr.nspname,
                  r.relname,
                  r.relowner,
                  a.attname,
                  nc.nspname,
                  c.conname
                 FROM pg_namespace nr,
                  pg_class r,
                  pg_attribute a,
                  pg_depend d,
                  pg_namespace nc,
                  pg_constraint c
                WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (d.refobjid = r.oid) AND (d.refobjsubid = a.attnum) AND (d.classid = ('pg_constraint'::regclass)::oid) AND (d.objid = c.oid) AND (c.connamespace = nc.oid) AND (c.contype = 'c'::"char") AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])) AND (NOT a.attisdropped))
              UNION ALL
               SELECT nr.nspname,
                  r.relname,
                  r.relowner,
                  a.attname,
                  nc.nspname,
                  c.conname
                 FROM pg_namespace nr,
                  pg_class r,
                  pg_attribute a,
                  pg_namespace nc,
                  pg_constraint c
                WHERE ((nr.oid = r.relnamespace) AND (r.oid = a.attrelid) AND (nc.oid = c.connamespace) AND (r.oid =
                      CASE c.contype
                          WHEN 'f'::"char" THEN c.confrelid
                          ELSE c.conrelid
                      END) AND (a.attnum = ANY (
                      CASE c.contype
                          WHEN 'f'::"char" THEN c.confkey
                          ELSE c.conkey
                      END)) AND (NOT a.attisdropped) AND (c.contype = ANY (ARRAY['p'::"char", 'u'::"char", 'f'::"char"])) AND (r.relkind = ANY (ARRAY['r'::"char", 'p'::"char"])))) x(tblschema, tblname, tblowner, colname, cstrschema, cstrname)
        WHERE pg_has_role(tblowner, 'USAGE'::text);
        """));
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    public ConstraintColumnUsage(String alias) {
        this(DSL.name(alias), CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.constraint_column_usage</code>
     * table reference
     */
    public ConstraintColumnUsage(Name alias) {
        this(alias, CONSTRAINT_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.constraint_column_usage</code> table
     * reference
     */
    public ConstraintColumnUsage() {
        this(DSL.name("constraint_column_usage"), null);
    }

    public <O extends Record> ConstraintColumnUsage(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CONSTRAINT_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ConstraintColumnUsage as(String alias) {
        return new ConstraintColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ConstraintColumnUsage as(Name alias) {
        return new ConstraintColumnUsage(alias, this);
    }

    @Override
    public ConstraintColumnUsage as(Table<?> alias) {
        return new ConstraintColumnUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(String name) {
        return new ConstraintColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(Name name) {
        return new ConstraintColumnUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConstraintColumnUsage rename(Table<?> name) {
        return new ConstraintColumnUsage(name.getQualifiedName(), null);
    }
}