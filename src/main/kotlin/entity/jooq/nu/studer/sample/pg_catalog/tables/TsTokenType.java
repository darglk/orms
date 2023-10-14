/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TsTokenType extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.ts_token_type</code>
     */
    public static final TsTokenType TS_TOKEN_TYPE = new TsTokenType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.ts_token_type.tokid</code>.
     */
    public final TableField<Record, Integer> TOKID = createField(DSL.name("tokid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.ts_token_type.alias</code>.
     */
    public final TableField<Record, String> ALIAS = createField(DSL.name("alias"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.ts_token_type.description</code>.
     */
    public final TableField<Record, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private TsTokenType(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private TsTokenType(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.ts_token_type</code> table reference
     */
    public TsTokenType(String alias) {
        this(DSL.name(alias), TS_TOKEN_TYPE);
    }

    /**
     * Create an aliased <code>pg_catalog.ts_token_type</code> table reference
     */
    public TsTokenType(Name alias) {
        this(alias, TS_TOKEN_TYPE);
    }

    /**
     * Create a <code>pg_catalog.ts_token_type</code> table reference
     */
    public TsTokenType() {
        this(DSL.name("ts_token_type"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public TsTokenType as(String alias) {
        return new TsTokenType(DSL.name(alias), this, parameters);
    }

    @Override
    public TsTokenType as(Name alias) {
        return new TsTokenType(alias, this, parameters);
    }

    @Override
    public TsTokenType as(Table<?> alias) {
        return new TsTokenType(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsTokenType rename(String name) {
        return new TsTokenType(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsTokenType rename(Name name) {
        return new TsTokenType(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public TsTokenType rename(Table<?> name) {
        return new TsTokenType(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public TsTokenType call(
          Long parserOid
    ) {
        TsTokenType result = new TsTokenType(DSL.name("ts_token_type"), null, new Field[] {
            DSL.val(parserOid, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public TsTokenType call(
          Field<Long> parserOid
    ) {
        TsTokenType result = new TsTokenType(DSL.name("ts_token_type"), null, new Field[] {
            parserOid
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
