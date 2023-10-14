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
public class UdtPrivileges extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.udt_privileges</code>
     */
    public static final UdtPrivileges UDT_PRIVILEGES = new UdtPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.udt_privileges.grantor</code>.
     */
    public final TableField<Record, String> GRANTOR = createField(DSL.name("grantor"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.grantee</code>.
     */
    public final TableField<Record, String> GRANTEE = createField(DSL.name("grantee"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public final TableField<Record, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public final TableField<Record, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_name</code>.
     */
    public final TableField<Record, String> UDT_NAME = createField(DSL.name("udt_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public final TableField<Record, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public final TableField<Record, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), nu.studer.sample.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private UdtPrivileges(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UdtPrivileges(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "udt_privileges" as  SELECT (u_grantor.rolname)::information_schema.sql_identifier AS grantor,
          (grantee.rolname)::information_schema.sql_identifier AS grantee,
          (current_database())::information_schema.sql_identifier AS udt_catalog,
          (n.nspname)::information_schema.sql_identifier AS udt_schema,
          (t.typname)::information_schema.sql_identifier AS udt_name,
          ('TYPE USAGE'::character varying)::information_schema.character_data AS privilege_type,
          (
              CASE
                  WHEN (pg_has_role(grantee.oid, t.typowner, 'USAGE'::text) OR t.grantable) THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_grantable
         FROM ( SELECT pg_type.oid,
                  pg_type.typname,
                  pg_type.typnamespace,
                  pg_type.typtype,
                  pg_type.typowner,
                  (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::"char", pg_type.typowner)))).grantor AS grantor,
                  (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::"char", pg_type.typowner)))).grantee AS grantee,
                  (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::"char", pg_type.typowner)))).privilege_type AS privilege_type,
                  (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::"char", pg_type.typowner)))).is_grantable AS is_grantable
                 FROM pg_type) t(oid, typname, typnamespace, typtype, typowner, grantor, grantee, prtype, grantable),
          pg_namespace n,
          pg_authid u_grantor,
          ( SELECT pg_authid.oid,
                  pg_authid.rolname
                 FROM pg_authid
              UNION ALL
               SELECT (0)::oid AS oid,
                  'PUBLIC'::name) grantee(oid, rolname)
        WHERE ((t.typnamespace = n.oid) AND (t.typtype = 'c'::"char") AND (t.grantee = grantee.oid) AND (t.grantor = u_grantor.oid) AND (t.prtype = 'USAGE'::text) AND (pg_has_role(u_grantor.oid, 'USAGE'::text) OR pg_has_role(grantee.oid, 'USAGE'::text) OR (grantee.rolname = 'PUBLIC'::name)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table
     * reference
     */
    public UdtPrivileges(String alias) {
        this(DSL.name(alias), UDT_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table
     * reference
     */
    public UdtPrivileges(Name alias) {
        this(alias, UDT_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges() {
        this(DSL.name("udt_privileges"), null);
    }

    public <O extends Record> UdtPrivileges(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, UDT_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UdtPrivileges as(String alias) {
        return new UdtPrivileges(DSL.name(alias), this);
    }

    @Override
    public UdtPrivileges as(Name alias) {
        return new UdtPrivileges(alias, this);
    }

    @Override
    public UdtPrivileges as(Table<?> alias) {
        return new UdtPrivileges(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(String name) {
        return new UdtPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(Name name) {
        return new UdtPrivileges(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(Table<?> name) {
        return new UdtPrivileges(name.getQualifiedName(), null);
    }
}