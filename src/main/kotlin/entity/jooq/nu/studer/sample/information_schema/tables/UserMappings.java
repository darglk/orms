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
public class UserMappings extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.user_mappings</code>
     */
    public static final UserMappings USER_MAPPINGS = new UserMappings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.user_mappings.authorization_identifier</code>.
     */
    public final TableField<Record, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.user_mappings.foreign_server_catalog</code>.
     */
    public final TableField<Record, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.user_mappings.foreign_server_name</code>.
     */
    public final TableField<Record, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private UserMappings(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UserMappings(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "user_mappings" as  SELECT authorization_identifier,
         foreign_server_catalog,
         foreign_server_name
        FROM information_schema._pg_user_mappings;
        """));
    }

    /**
     * Create an aliased <code>information_schema.user_mappings</code> table
     * reference
     */
    public UserMappings(String alias) {
        this(DSL.name(alias), USER_MAPPINGS);
    }

    /**
     * Create an aliased <code>information_schema.user_mappings</code> table
     * reference
     */
    public UserMappings(Name alias) {
        this(alias, USER_MAPPINGS);
    }

    /**
     * Create a <code>information_schema.user_mappings</code> table reference
     */
    public UserMappings() {
        this(DSL.name("user_mappings"), null);
    }

    public <O extends Record> UserMappings(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USER_MAPPINGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UserMappings as(String alias) {
        return new UserMappings(DSL.name(alias), this);
    }

    @Override
    public UserMappings as(Name alias) {
        return new UserMappings(alias, this);
    }

    @Override
    public UserMappings as(Table<?> alias) {
        return new UserMappings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMappings rename(String name) {
        return new UserMappings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMappings rename(Name name) {
        return new UserMappings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMappings rename(Table<?> name) {
        return new UserMappings(name.getQualifiedName(), null);
    }
}
