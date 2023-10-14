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
public class ReferentialConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.referential_constraints</code>
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.referential_constraints.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.unique_constraint_catalog</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_CATALOG = createField(DSL.name("unique_constraint_catalog"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.unique_constraint_schema</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_SCHEMA = createField(DSL.name("unique_constraint_schema"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.unique_constraint_name</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_NAME = createField(DSL.name("unique_constraint_name"), nu.studer.sample.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.match_option</code>.
     */
    public final TableField<Record, String> MATCH_OPTION = createField(DSL.name("match_option"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.update_rule</code>.
     */
    public final TableField<Record, String> UPDATE_RULE = createField(DSL.name("update_rule"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.referential_constraints.delete_rule</code>.
     */
    public final TableField<Record, String> DELETE_RULE = createField(DSL.name("delete_rule"), nu.studer.sample.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private ReferentialConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReferentialConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "referential_constraints" as  SELECT (current_database())::information_schema.sql_identifier AS constraint_catalog,
          (ncon.nspname)::information_schema.sql_identifier AS constraint_schema,
          (con.conname)::information_schema.sql_identifier AS constraint_name,
          (
              CASE
                  WHEN (npkc.nspname IS NULL) THEN NULL::name
                  ELSE current_database()
              END)::information_schema.sql_identifier AS unique_constraint_catalog,
          (npkc.nspname)::information_schema.sql_identifier AS unique_constraint_schema,
          (pkc.conname)::information_schema.sql_identifier AS unique_constraint_name,
          (
              CASE con.confmatchtype
                  WHEN 'f'::"char" THEN 'FULL'::text
                  WHEN 'p'::"char" THEN 'PARTIAL'::text
                  WHEN 's'::"char" THEN 'NONE'::text
                  ELSE NULL::text
              END)::information_schema.character_data AS match_option,
          (
              CASE con.confupdtype
                  WHEN 'c'::"char" THEN 'CASCADE'::text
                  WHEN 'n'::"char" THEN 'SET NULL'::text
                  WHEN 'd'::"char" THEN 'SET DEFAULT'::text
                  WHEN 'r'::"char" THEN 'RESTRICT'::text
                  WHEN 'a'::"char" THEN 'NO ACTION'::text
                  ELSE NULL::text
              END)::information_schema.character_data AS update_rule,
          (
              CASE con.confdeltype
                  WHEN 'c'::"char" THEN 'CASCADE'::text
                  WHEN 'n'::"char" THEN 'SET NULL'::text
                  WHEN 'd'::"char" THEN 'SET DEFAULT'::text
                  WHEN 'r'::"char" THEN 'RESTRICT'::text
                  WHEN 'a'::"char" THEN 'NO ACTION'::text
                  ELSE NULL::text
              END)::information_schema.character_data AS delete_rule
         FROM ((((((pg_namespace ncon
           JOIN pg_constraint con ON ((ncon.oid = con.connamespace)))
           JOIN pg_class c ON (((con.conrelid = c.oid) AND (con.contype = 'f'::"char"))))
           LEFT JOIN pg_depend d1 ON (((d1.objid = con.oid) AND (d1.classid = ('pg_constraint'::regclass)::oid) AND (d1.refclassid = ('pg_class'::regclass)::oid) AND (d1.refobjsubid = 0))))
           LEFT JOIN pg_depend d2 ON (((d2.refclassid = ('pg_constraint'::regclass)::oid) AND (d2.classid = ('pg_class'::regclass)::oid) AND (d2.objid = d1.refobjid) AND (d2.objsubid = 0) AND (d2.deptype = 'i'::"char"))))
           LEFT JOIN pg_constraint pkc ON (((pkc.oid = d2.refobjid) AND (pkc.contype = ANY (ARRAY['p'::"char", 'u'::"char"])) AND (pkc.conrelid = con.confrelid))))
           LEFT JOIN pg_namespace npkc ON ((pkc.connamespace = npkc.oid)))
        WHERE (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'INSERT, UPDATE, REFERENCES'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.referential_constraints</code>
     * table reference
     */
    public ReferentialConstraints(String alias) {
        this(DSL.name(alias), REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.referential_constraints</code>
     * table reference
     */
    public ReferentialConstraints(Name alias) {
        this(alias, REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create a <code>information_schema.referential_constraints</code> table
     * reference
     */
    public ReferentialConstraints() {
        this(DSL.name("referential_constraints"), null);
    }

    public <O extends Record> ReferentialConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REFERENTIAL_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ReferentialConstraints as(String alias) {
        return new ReferentialConstraints(DSL.name(alias), this);
    }

    @Override
    public ReferentialConstraints as(Name alias) {
        return new ReferentialConstraints(alias, this);
    }

    @Override
    public ReferentialConstraints as(Table<?> alias) {
        return new ReferentialConstraints(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferentialConstraints rename(String name) {
        return new ReferentialConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferentialConstraints rename(Name name) {
        return new ReferentialConstraints(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferentialConstraints rename(Table<?> name) {
        return new ReferentialConstraints(name.getQualifiedName(), null);
    }
}
