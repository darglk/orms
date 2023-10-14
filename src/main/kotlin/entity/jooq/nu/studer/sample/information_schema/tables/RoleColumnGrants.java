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
public class RoleColumnGrants extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_column_grants</code>
     */
    public static final RoleColumnGrants ROLE_COLUMN_GRANTS = new RoleColumnGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.role_column_grants.grantor</code>.
     */
    public final TableField<Record, String> GRANTOR = createField(DSL.name("grantor"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_column_grants.grantee</code>.
     */
    public final TableField<Record, String> GRANTEE = createField(DSL.name("grantee"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_column_grants.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.privilege_type</code>.
     */
    public final TableField<Record, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_column_grants.is_grantable</code>.
     */
    public final TableField<Record, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleColumnGrants(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private RoleColumnGrants(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_column_grants" as  SELECT grantor,
          grantee,
          table_catalog,
          table_schema,
          table_name,
          column_name,
          privilege_type,
          is_grantable
         FROM information_schema.column_privileges
        WHERE (((grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.role_column_grants</code>
     * table reference
     */
    public RoleColumnGrants(String alias) {
        this(DSL.name(alias), ROLE_COLUMN_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_column_grants</code>
     * table reference
     */
    public RoleColumnGrants(Name alias) {
        this(alias, ROLE_COLUMN_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_column_grants</code> table
     * reference
     */
    public RoleColumnGrants() {
        this(DSL.name("role_column_grants"), null);
    }

    public <O extends Record> RoleColumnGrants(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ROLE_COLUMN_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleColumnGrants as(String alias) {
        return new RoleColumnGrants(DSL.name(alias), this);
    }

    @Override
    public RoleColumnGrants as(Name alias) {
        return new RoleColumnGrants(alias, this);
    }

    @Override
    public RoleColumnGrants as(Table<?> alias) {
        return new RoleColumnGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(String name) {
        return new RoleColumnGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(Name name) {
        return new RoleColumnGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(Table<?> name) {
        return new RoleColumnGrants(name.getQualifiedName(), null);
    }
}
