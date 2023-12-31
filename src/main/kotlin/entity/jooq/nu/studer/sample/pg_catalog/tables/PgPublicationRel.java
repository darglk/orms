/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.pg_catalog.Indexes;
import nu.studer.sample.pg_catalog.Keys;
import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgPublicationRel extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_publication_rel</code>
     */
    public static final PgPublicationRel PG_PUBLICATION_REL = new PgPublicationRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication_rel.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public final TableField<Record, Long> PRPUBID = createField(DSL.name("prpubid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public final TableField<Record, Long> PRRELID = createField(DSL.name("prrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> PRQUAL = createField(DSL.name("prqual"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_rel.prattrs</code>.
     */
    public final TableField<Record, Object[]> PRATTRS = createField(DSL.name("prattrs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"nt2vector\"").array(), this, "");

    private PgPublicationRel(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgPublicationRel(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table
     * reference
     */
    public PgPublicationRel(String alias) {
        this(DSL.name(alias), PG_PUBLICATION_REL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table
     * reference
     */
    public PgPublicationRel(Name alias) {
        this(alias, PG_PUBLICATION_REL);
    }

    /**
     * Create a <code>pg_catalog.pg_publication_rel</code> table reference
     */
    public PgPublicationRel() {
        this(DSL.name("pg_publication_rel"), null);
    }

    public <O extends Record> PgPublicationRel(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_PUBLICATION_REL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PG_PUBLICATION_REL_PRPUBID_INDEX);
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_PUBLICATION_REL_OID_INDEX;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX);
    }

    @Override
    public PgPublicationRel as(String alias) {
        return new PgPublicationRel(DSL.name(alias), this);
    }

    @Override
    public PgPublicationRel as(Name alias) {
        return new PgPublicationRel(alias, this);
    }

    @Override
    public PgPublicationRel as(Table<?> alias) {
        return new PgPublicationRel(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationRel rename(String name) {
        return new PgPublicationRel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationRel rename(Name name) {
        return new PgPublicationRel(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationRel rename(Table<?> name) {
        return new PgPublicationRel(name.getQualifiedName(), null);
    }
}
