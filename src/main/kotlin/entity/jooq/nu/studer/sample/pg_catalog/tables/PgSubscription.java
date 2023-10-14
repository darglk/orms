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
public class PgSubscription extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_subscription</code>
     */
    public static final PgSubscription PG_SUBSCRIPTION = new PgSubscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_subscription.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subdbid</code>.
     */
    public final TableField<Record, Long> SUBDBID = createField(DSL.name("subdbid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> SUBSKIPLSN = createField(DSL.name("subskiplsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"").nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subname</code>.
     */
    public final TableField<Record, String> SUBNAME = createField(DSL.name("subname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subowner</code>.
     */
    public final TableField<Record, Long> SUBOWNER = createField(DSL.name("subowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subenabled</code>.
     */
    public final TableField<Record, Boolean> SUBENABLED = createField(DSL.name("subenabled"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subbinary</code>.
     */
    public final TableField<Record, Boolean> SUBBINARY = createField(DSL.name("subbinary"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.substream</code>.
     */
    public final TableField<Record, String> SUBSTREAM = createField(DSL.name("substream"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subtwophasestate</code>.
     */
    public final TableField<Record, String> SUBTWOPHASESTATE = createField(DSL.name("subtwophasestate"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subdisableonerr</code>.
     */
    public final TableField<Record, Boolean> SUBDISABLEONERR = createField(DSL.name("subdisableonerr"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subpasswordrequired</code>.
     */
    public final TableField<Record, Boolean> SUBPASSWORDREQUIRED = createField(DSL.name("subpasswordrequired"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subrunasowner</code>.
     */
    public final TableField<Record, Boolean> SUBRUNASOWNER = createField(DSL.name("subrunasowner"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subconninfo</code>.
     */
    public final TableField<Record, String> SUBCONNINFO = createField(DSL.name("subconninfo"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subslotname</code>.
     */
    public final TableField<Record, String> SUBSLOTNAME = createField(DSL.name("subslotname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subsynccommit</code>.
     */
    public final TableField<Record, String> SUBSYNCCOMMIT = createField(DSL.name("subsynccommit"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.subpublications</code>.
     */
    public final TableField<Record, String[]> SUBPUBLICATIONS = createField(DSL.name("subpublications"), SQLDataType.CLOB.nullable(false).array(), this, "");

    /**
     * The column <code>pg_catalog.pg_subscription.suborigin</code>.
     */
    public final TableField<Record, String> SUBORIGIN = createField(DSL.name("suborigin"), SQLDataType.CLOB, this, "");

    private PgSubscription(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgSubscription(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_subscription</code> table reference
     */
    public PgSubscription(String alias) {
        this(DSL.name(alias), PG_SUBSCRIPTION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_subscription</code> table reference
     */
    public PgSubscription(Name alias) {
        this(alias, PG_SUBSCRIPTION);
    }

    /**
     * Create a <code>pg_catalog.pg_subscription</code> table reference
     */
    public PgSubscription() {
        this(DSL.name("pg_subscription"), null);
    }

    public <O extends Record> PgSubscription(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_SUBSCRIPTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_SUBSCRIPTION_OID_INDEX;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_SUBSCRIPTION_SUBNAME_INDEX);
    }

    @Override
    public PgSubscription as(String alias) {
        return new PgSubscription(DSL.name(alias), this);
    }

    @Override
    public PgSubscription as(Name alias) {
        return new PgSubscription(alias, this);
    }

    @Override
    public PgSubscription as(Table<?> alias) {
        return new PgSubscription(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscription rename(String name) {
        return new PgSubscription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscription rename(Name name) {
        return new PgSubscription(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSubscription rename(Table<?> name) {
        return new PgSubscription(name.getQualifiedName(), null);
    }
}