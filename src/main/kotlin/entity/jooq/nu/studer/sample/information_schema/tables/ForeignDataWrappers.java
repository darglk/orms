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
public class ForeignDataWrappers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.foreign_data_wrappers</code>
     */
    public static final ForeignDataWrappers FOREIGN_DATA_WRAPPERS = new ForeignDataWrappers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_CATALOG = createField(DSL.name("foreign_data_wrapper_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_NAME = createField(DSL.name("foreign_data_wrapper_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.authorization_identifier</code>.
     */
    public final TableField<Record, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.library_name</code>.
     */
    public final TableField<Record, String> LIBRARY_NAME = createField(DSL.name("library_name"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    public final TableField<Record, String> FOREIGN_DATA_WRAPPER_LANGUAGE = createField(DSL.name("foreign_data_wrapper_language"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private ForeignDataWrappers(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ForeignDataWrappers(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "foreign_data_wrappers" as  SELECT foreign_data_wrapper_catalog,
         foreign_data_wrapper_name,
         authorization_identifier,
         (NULL::character varying)::information_schema.character_data AS library_name,
         foreign_data_wrapper_language
        FROM information_schema._pg_foreign_data_wrappers w;
        """));
    }

    /**
     * Create an aliased <code>information_schema.foreign_data_wrappers</code>
     * table reference
     */
    public ForeignDataWrappers(String alias) {
        this(DSL.name(alias), FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_data_wrappers</code>
     * table reference
     */
    public ForeignDataWrappers(Name alias) {
        this(alias, FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create a <code>information_schema.foreign_data_wrappers</code> table
     * reference
     */
    public ForeignDataWrappers() {
        this(DSL.name("foreign_data_wrappers"), null);
    }

    public <O extends Record> ForeignDataWrappers(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, FOREIGN_DATA_WRAPPERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ForeignDataWrappers as(String alias) {
        return new ForeignDataWrappers(DSL.name(alias), this);
    }

    @Override
    public ForeignDataWrappers as(Name alias) {
        return new ForeignDataWrappers(alias, this);
    }

    @Override
    public ForeignDataWrappers as(Table<?> alias) {
        return new ForeignDataWrappers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignDataWrappers rename(String name) {
        return new ForeignDataWrappers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignDataWrappers rename(Name name) {
        return new ForeignDataWrappers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignDataWrappers rename(Table<?> name) {
        return new ForeignDataWrappers(name.getQualifiedName(), null);
    }
}
