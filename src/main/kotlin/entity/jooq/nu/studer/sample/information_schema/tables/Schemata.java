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
public class Schemata extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.schemata</code>
     */
    public static final Schemata SCHEMATA = new Schemata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.schemata.catalog_name</code>.
     */
    public final TableField<Record, String> CATALOG_NAME = createField(DSL.name("catalog_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.schemata.schema_name</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("schema_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.schemata.schema_owner</code>.
     */
    public final TableField<Record, String> SCHEMA_OWNER = createField(DSL.name("schema_owner"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_CATALOG = createField(DSL.name("default_character_set_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_SCHEMA = createField(DSL.name("default_character_set_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.schemata.default_character_set_name</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("default_character_set_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.schemata.sql_path</code>.
     */
    public final TableField<Record, String> SQL_PATH = createField(DSL.name("sql_path"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private Schemata(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Schemata(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "schemata" as  SELECT (current_database())::information_schema.sql_identifier AS catalog_name,
          (n.nspname)::information_schema.sql_identifier AS schema_name,
          (u.rolname)::information_schema.sql_identifier AS schema_owner,
          (NULL::name)::information_schema.sql_identifier AS default_character_set_catalog,
          (NULL::name)::information_schema.sql_identifier AS default_character_set_schema,
          (NULL::name)::information_schema.sql_identifier AS default_character_set_name,
          (NULL::character varying)::information_schema.character_data AS sql_path
         FROM pg_namespace n,
          pg_authid u
        WHERE ((n.nspowner = u.oid) AND (pg_has_role(n.nspowner, 'USAGE'::text) OR has_schema_privilege(n.oid, 'CREATE, USAGE'::text)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.schemata</code> table
     * reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>information_schema.schemata</code> table
     * reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    /**
     * Create a <code>information_schema.schemata</code> table reference
     */
    public Schemata() {
        this(DSL.name("schemata"), null);
    }

    public <O extends Record> Schemata(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SCHEMATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    @Override
    public Schemata as(Table<?> alias) {
        return new Schemata(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(String name) {
        return new Schemata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(Name name) {
        return new Schemata(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schemata rename(Table<?> name) {
        return new Schemata(name.getQualifiedName(), null);
    }
}
