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
public class PgSettings extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_settings</code>
     */
    public static final PgSettings PG_SETTINGS = new PgSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_settings.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.setting</code>.
     */
    public final TableField<Record, String> SETTING = createField(DSL.name("setting"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.unit</code>.
     */
    public final TableField<Record, String> UNIT = createField(DSL.name("unit"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.category</code>.
     */
    public final TableField<Record, String> CATEGORY = createField(DSL.name("category"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.short_desc</code>.
     */
    public final TableField<Record, String> SHORT_DESC = createField(DSL.name("short_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.extra_desc</code>.
     */
    public final TableField<Record, String> EXTRA_DESC = createField(DSL.name("extra_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.context</code>.
     */
    public final TableField<Record, String> CONTEXT = createField(DSL.name("context"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.vartype</code>.
     */
    public final TableField<Record, String> VARTYPE = createField(DSL.name("vartype"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.source</code>.
     */
    public final TableField<Record, String> SOURCE = createField(DSL.name("source"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.min_val</code>.
     */
    public final TableField<Record, String> MIN_VAL = createField(DSL.name("min_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.max_val</code>.
     */
    public final TableField<Record, String> MAX_VAL = createField(DSL.name("max_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.enumvals</code>.
     */
    public final TableField<Record, String[]> ENUMVALS = createField(DSL.name("enumvals"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_settings.boot_val</code>.
     */
    public final TableField<Record, String> BOOT_VAL = createField(DSL.name("boot_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.reset_val</code>.
     */
    public final TableField<Record, String> RESET_VAL = createField(DSL.name("reset_val"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.sourcefile</code>.
     */
    public final TableField<Record, String> SOURCEFILE = createField(DSL.name("sourcefile"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.sourceline</code>.
     */
    public final TableField<Record, Integer> SOURCELINE = createField(DSL.name("sourceline"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.pending_restart</code>.
     */
    public final TableField<Record, Boolean> PENDING_RESTART = createField(DSL.name("pending_restart"), SQLDataType.BOOLEAN, this, "");

    private PgSettings(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgSettings(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_settings" as  SELECT name,
         setting,
         unit,
         category,
         short_desc,
         extra_desc,
         context,
         vartype,
         source,
         min_val,
         max_val,
         enumvals,
         boot_val,
         reset_val,
         sourcefile,
         sourceline,
         pending_restart
        FROM pg_show_all_settings() a(name, setting, unit, category, short_desc, extra_desc, context, vartype, source, min_val, max_val, enumvals, boot_val, reset_val, sourcefile, sourceline, pending_restart);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings(String alias) {
        this(DSL.name(alias), PG_SETTINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings(Name alias) {
        this(alias, PG_SETTINGS);
    }

    /**
     * Create a <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings() {
        this(DSL.name("pg_settings"), null);
    }

    public <O extends Record> PgSettings(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_SETTINGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgSettings as(String alias) {
        return new PgSettings(DSL.name(alias), this);
    }

    @Override
    public PgSettings as(Name alias) {
        return new PgSettings(alias, this);
    }

    @Override
    public PgSettings as(Table<?> alias) {
        return new PgSettings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSettings rename(String name) {
        return new PgSettings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSettings rename(Name name) {
        return new PgSettings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSettings rename(Table<?> name) {
        return new PgSettings(name.getQualifiedName(), null);
    }
}