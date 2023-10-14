/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.orms.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.orms.Keys;
import nu.studer.sample.orms.Orms;

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
public class UsersAuthorities extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>orms.users_authorities</code>
     */
    public static final UsersAuthorities USERS_AUTHORITIES = new UsersAuthorities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>orms.users_authorities.id</code>.
     */
    public final TableField<Record, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>orms.users_authorities.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    private UsersAuthorities(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UsersAuthorities(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>orms.users_authorities</code> table reference
     */
    public UsersAuthorities(String alias) {
        this(DSL.name(alias), USERS_AUTHORITIES);
    }

    /**
     * Create an aliased <code>orms.users_authorities</code> table reference
     */
    public UsersAuthorities(Name alias) {
        this(alias, USERS_AUTHORITIES);
    }

    /**
     * Create a <code>orms.users_authorities</code> table reference
     */
    public UsersAuthorities() {
        this(DSL.name("users_authorities"), null);
    }

    public <O extends Record> UsersAuthorities(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USERS_AUTHORITIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Orms.ORMS;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.USERS_AUTHORITIES_PKEY;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.USERS_AUTHORITIES_NAME_KEY);
    }

    @Override
    public UsersAuthorities as(String alias) {
        return new UsersAuthorities(DSL.name(alias), this);
    }

    @Override
    public UsersAuthorities as(Name alias) {
        return new UsersAuthorities(alias, this);
    }

    @Override
    public UsersAuthorities as(Table<?> alias) {
        return new UsersAuthorities(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersAuthorities rename(String name) {
        return new UsersAuthorities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersAuthorities rename(Name name) {
        return new UsersAuthorities(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersAuthorities rename(Table<?> name) {
        return new UsersAuthorities(name.getQualifiedName(), null);
    }
}