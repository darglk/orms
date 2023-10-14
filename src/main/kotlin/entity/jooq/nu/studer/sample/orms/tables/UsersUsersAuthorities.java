/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.orms.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.orms.Indexes;
import nu.studer.sample.orms.Keys;
import nu.studer.sample.orms.Orms;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class UsersUsersAuthorities extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>orms.users_users_authorities</code>
     */
    public static final UsersUsersAuthorities USERS_USERS_AUTHORITIES = new UsersUsersAuthorities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>orms.users_users_authorities.user_id</code>.
     */
    public final TableField<Record, String> USER_ID = createField(DSL.name("user_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>orms.users_users_authorities.authority_id</code>.
     */
    public final TableField<Record, String> AUTHORITY_ID = createField(DSL.name("authority_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    private UsersUsersAuthorities(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UsersUsersAuthorities(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>orms.users_users_authorities</code> table
     * reference
     */
    public UsersUsersAuthorities(String alias) {
        this(DSL.name(alias), USERS_USERS_AUTHORITIES);
    }

    /**
     * Create an aliased <code>orms.users_users_authorities</code> table
     * reference
     */
    public UsersUsersAuthorities(Name alias) {
        this(alias, USERS_USERS_AUTHORITIES);
    }

    /**
     * Create a <code>orms.users_users_authorities</code> table reference
     */
    public UsersUsersAuthorities() {
        this(DSL.name("users_users_authorities"), null);
    }

    public <O extends Record> UsersUsersAuthorities(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USERS_USERS_AUTHORITIES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Orms.ORMS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.USERS_AUTHORITIES_IDX);
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.USERS_USERS_AUTHORITIES__USERS_USERS_AUTHORITIES_USER_ID_FKEY, Keys.USERS_USERS_AUTHORITIES__USERS_USERS_AUTHORITIES_AUTHORITY_ID_FKEY);
    }

    private transient UsersUsers _usersUsers;
    private transient UsersAuthorities _usersAuthorities;

    /**
     * Get the implicit join path to the <code>orms.users_users</code> table.
     */
    public UsersUsers usersUsers() {
        if (_usersUsers == null)
            _usersUsers = new UsersUsers(this, Keys.USERS_USERS_AUTHORITIES__USERS_USERS_AUTHORITIES_USER_ID_FKEY);

        return _usersUsers;
    }

    /**
     * Get the implicit join path to the <code>orms.users_authorities</code>
     * table.
     */
    public UsersAuthorities usersAuthorities() {
        if (_usersAuthorities == null)
            _usersAuthorities = new UsersAuthorities(this, Keys.USERS_USERS_AUTHORITIES__USERS_USERS_AUTHORITIES_AUTHORITY_ID_FKEY);

        return _usersAuthorities;
    }

    @Override
    public UsersUsersAuthorities as(String alias) {
        return new UsersUsersAuthorities(DSL.name(alias), this);
    }

    @Override
    public UsersUsersAuthorities as(Name alias) {
        return new UsersUsersAuthorities(alias, this);
    }

    @Override
    public UsersUsersAuthorities as(Table<?> alias) {
        return new UsersUsersAuthorities(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersUsersAuthorities rename(String name) {
        return new UsersUsersAuthorities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersUsersAuthorities rename(Name name) {
        return new UsersUsersAuthorities(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersUsersAuthorities rename(Table<?> name) {
        return new UsersUsersAuthorities(name.getQualifiedName(), null);
    }
}
