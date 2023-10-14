/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.pg_catalog.Keys;
import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOperator extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_operator</code>
     */
    public static final PgOperator PG_OPERATOR = new PgOperator();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_operator.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprname</code>.
     */
    public final TableField<Record, String> OPRNAME = createField(DSL.name("oprname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprnamespace</code>.
     */
    public final TableField<Record, Long> OPRNAMESPACE = createField(DSL.name("oprnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprowner</code>.
     */
    public final TableField<Record, Long> OPROWNER = createField(DSL.name("oprowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprkind</code>.
     */
    public final TableField<Record, String> OPRKIND = createField(DSL.name("oprkind"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcanmerge</code>.
     */
    public final TableField<Record, Boolean> OPRCANMERGE = createField(DSL.name("oprcanmerge"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcanhash</code>.
     */
    public final TableField<Record, Boolean> OPRCANHASH = createField(DSL.name("oprcanhash"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprleft</code>.
     */
    public final TableField<Record, Long> OPRLEFT = createField(DSL.name("oprleft"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprright</code>.
     */
    public final TableField<Record, Long> OPRRIGHT = createField(DSL.name("oprright"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprresult</code>.
     */
    public final TableField<Record, Long> OPRRESULT = createField(DSL.name("oprresult"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcom</code>.
     */
    public final TableField<Record, Long> OPRCOM = createField(DSL.name("oprcom"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprnegate</code>.
     */
    public final TableField<Record, Long> OPRNEGATE = createField(DSL.name("oprnegate"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprcode</code>.
     */
    public final TableField<Record, String> OPRCODE = createField(DSL.name("oprcode"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprrest</code>.
     */
    public final TableField<Record, String> OPRREST = createField(DSL.name("oprrest"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_operator.oprjoin</code>.
     */
    public final TableField<Record, String> OPRJOIN = createField(DSL.name("oprjoin"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgOperator(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgOperator(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator(String alias) {
        this(DSL.name(alias), PG_OPERATOR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator(Name alias) {
        this(alias, PG_OPERATOR);
    }

    /**
     * Create a <code>pg_catalog.pg_operator</code> table reference
     */
    public PgOperator() {
        this(DSL.name("pg_operator"), null);
    }

    public <O extends Record> PgOperator(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_OPERATOR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_OPERATOR_OID_INDEX;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_OPERATOR_OPRNAME_L_R_N_INDEX);
    }

    @Override
    public PgOperator as(String alias) {
        return new PgOperator(DSL.name(alias), this);
    }

    @Override
    public PgOperator as(Name alias) {
        return new PgOperator(alias, this);
    }

    @Override
    public PgOperator as(Table<?> alias) {
        return new PgOperator(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOperator rename(String name) {
        return new PgOperator(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOperator rename(Name name) {
        return new PgOperator(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOperator rename(Table<?> name) {
        return new PgOperator(name.getQualifiedName(), null);
    }
}
