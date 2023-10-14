/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.orms.tables;


import java.time.OffsetDateTime;
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
public class UsersPasswordResetToken extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>orms.users_password_reset_token</code>
     */
    public static final UsersPasswordResetToken USERS_PASSWORD_RESET_TOKEN = new UsersPasswordResetToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>orms.users_password_reset_token.id</code>.
     */
    public final TableField<Record, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>orms.users_password_reset_token.user_id</code>.
     */
    public final TableField<Record, String> USER_ID = createField(DSL.name("user_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>orms.users_password_reset_token.token</code>.
     */
    public final TableField<Record, String> TOKEN = createField(DSL.name("token"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>orms.users_password_reset_token.created_at</code>.
     */
    public final TableField<Record, OffsetDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(3).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP(3)"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    private UsersPasswordResetToken(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UsersPasswordResetToken(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>orms.users_password_reset_token</code> table
     * reference
     */
    public UsersPasswordResetToken(String alias) {
        this(DSL.name(alias), USERS_PASSWORD_RESET_TOKEN);
    }

    /**
     * Create an aliased <code>orms.users_password_reset_token</code> table
     * reference
     */
    public UsersPasswordResetToken(Name alias) {
        this(alias, USERS_PASSWORD_RESET_TOKEN);
    }

    /**
     * Create a <code>orms.users_password_reset_token</code> table reference
     */
    public UsersPasswordResetToken() {
        this(DSL.name("users_password_reset_token"), null);
    }

    public <O extends Record> UsersPasswordResetToken(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USERS_PASSWORD_RESET_TOKEN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Orms.ORMS;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.USERS_PASSWORD_RESET_TOKEN_PKEY;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.USERS_PASSWORD_RESET_TOKEN__USERS_PASSWORD_RESET_TOKEN_USER_ID_FKEY);
    }

    private transient UsersUsers _usersUsers;

    /**
     * Get the implicit join path to the <code>orms.users_users</code> table.
     */
    public UsersUsers usersUsers() {
        if (_usersUsers == null)
            _usersUsers = new UsersUsers(this, Keys.USERS_PASSWORD_RESET_TOKEN__USERS_PASSWORD_RESET_TOKEN_USER_ID_FKEY);

        return _usersUsers;
    }

    @Override
    public UsersPasswordResetToken as(String alias) {
        return new UsersPasswordResetToken(DSL.name(alias), this);
    }

    @Override
    public UsersPasswordResetToken as(Name alias) {
        return new UsersPasswordResetToken(alias, this);
    }

    @Override
    public UsersPasswordResetToken as(Table<?> alias) {
        return new UsersPasswordResetToken(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersPasswordResetToken rename(String name) {
        return new UsersPasswordResetToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersPasswordResetToken rename(Name name) {
        return new UsersPasswordResetToken(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersPasswordResetToken rename(Table<?> name) {
        return new UsersPasswordResetToken(name.getQualifiedName(), null);
    }
}
