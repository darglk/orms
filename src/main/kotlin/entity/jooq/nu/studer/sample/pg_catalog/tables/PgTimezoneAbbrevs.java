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
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTimezoneAbbrevs extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_timezone_abbrevs</code>
     */
    public static final PgTimezoneAbbrevs PG_TIMEZONE_ABBREVS = new PgTimezoneAbbrevs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_timezone_abbrevs.abbrev</code>.
     */
    public final TableField<Record, String> ABBREV = createField(DSL.name("abbrev"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_abbrevs.utc_offset</code>.
     */
    public final TableField<Record, YearToSecond> UTC_OFFSET = createField(DSL.name("utc_offset"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_abbrevs.is_dst</code>.
     */
    public final TableField<Record, Boolean> IS_DST = createField(DSL.name("is_dst"), SQLDataType.BOOLEAN, this, "");

    private PgTimezoneAbbrevs(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgTimezoneAbbrevs(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_timezone_abbrevs" as  SELECT abbrev,
         utc_offset,
         is_dst
        FROM pg_timezone_abbrevs() pg_timezone_abbrevs(abbrev, utc_offset, is_dst);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_timezone_abbrevs</code> table
     * reference
     */
    public PgTimezoneAbbrevs(String alias) {
        this(DSL.name(alias), PG_TIMEZONE_ABBREVS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_timezone_abbrevs</code> table
     * reference
     */
    public PgTimezoneAbbrevs(Name alias) {
        this(alias, PG_TIMEZONE_ABBREVS);
    }

    /**
     * Create a <code>pg_catalog.pg_timezone_abbrevs</code> table reference
     */
    public PgTimezoneAbbrevs() {
        this(DSL.name("pg_timezone_abbrevs"), null);
    }

    public <O extends Record> PgTimezoneAbbrevs(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_TIMEZONE_ABBREVS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgTimezoneAbbrevs as(String alias) {
        return new PgTimezoneAbbrevs(DSL.name(alias), this);
    }

    @Override
    public PgTimezoneAbbrevs as(Name alias) {
        return new PgTimezoneAbbrevs(alias, this);
    }

    @Override
    public PgTimezoneAbbrevs as(Table<?> alias) {
        return new PgTimezoneAbbrevs(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneAbbrevs rename(String name) {
        return new PgTimezoneAbbrevs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneAbbrevs rename(Name name) {
        return new PgTimezoneAbbrevs(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneAbbrevs rename(Table<?> name) {
        return new PgTimezoneAbbrevs(name.getQualifiedName(), null);
    }
}
