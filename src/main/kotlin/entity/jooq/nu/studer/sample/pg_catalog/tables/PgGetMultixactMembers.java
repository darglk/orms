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
public class PgGetMultixactMembers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_get_multixact_members</code>
     */
    public static final PgGetMultixactMembers PG_GET_MULTIXACT_MEMBERS = new PgGetMultixactMembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_multixact_members.xid</code>.
     */
    public final TableField<Record, Long> XID = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_multixact_members.mode</code>.
     */
    public final TableField<Record, String> MODE = createField(DSL.name("mode"), SQLDataType.CLOB, this, "");

    private PgGetMultixactMembers(Name alias, Table<Record> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.BIGINT)
        });
    }

    private PgGetMultixactMembers(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_multixact_members</code> table
     * reference
     */
    public PgGetMultixactMembers(String alias) {
        this(DSL.name(alias), PG_GET_MULTIXACT_MEMBERS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_multixact_members</code> table
     * reference
     */
    public PgGetMultixactMembers(Name alias) {
        this(alias, PG_GET_MULTIXACT_MEMBERS);
    }

    /**
     * Create a <code>pg_catalog.pg_get_multixact_members</code> table reference
     */
    public PgGetMultixactMembers() {
        this(DSL.name("pg_get_multixact_members"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGetMultixactMembers as(String alias) {
        return new PgGetMultixactMembers(DSL.name(alias), this, parameters);
    }

    @Override
    public PgGetMultixactMembers as(Name alias) {
        return new PgGetMultixactMembers(alias, this, parameters);
    }

    @Override
    public PgGetMultixactMembers as(Table<?> alias) {
        return new PgGetMultixactMembers(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetMultixactMembers rename(String name) {
        return new PgGetMultixactMembers(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetMultixactMembers rename(Name name) {
        return new PgGetMultixactMembers(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetMultixactMembers rename(Table<?> name) {
        return new PgGetMultixactMembers(name.getQualifiedName(), null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgGetMultixactMembers call(
          Long multixid
    ) {
        PgGetMultixactMembers result = new PgGetMultixactMembers(DSL.name("pg_get_multixact_members"), null, new Field[] {
            DSL.val(multixid, SQLDataType.BIGINT)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgGetMultixactMembers call(
          Field<Long> multixid
    ) {
        PgGetMultixactMembers result = new PgGetMultixactMembers(DSL.name("pg_get_multixact_members"), null, new Field[] {
            multixid
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
