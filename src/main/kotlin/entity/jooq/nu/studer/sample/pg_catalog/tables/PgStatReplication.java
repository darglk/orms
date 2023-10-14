/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.tables;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatReplication extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_replication</code>
     */
    public static final PgStatReplication PG_STAT_REPLICATION = new PgStatReplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_replication.pid</code>.
     */
    public final TableField<Record, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usesysid</code>.
     */
    public final TableField<Record, Long> USESYSID = createField(DSL.name("usesysid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.usename</code>.
     */
    public final TableField<Record, String> USENAME = createField(DSL.name("usename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.application_name</code>.
     */
    public final TableField<Record, String> APPLICATION_NAME = createField(DSL.name("application_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_addr</code>.
     */
    public final TableField<Record, String> CLIENT_ADDR = createField(DSL.name("client_addr"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_hostname</code>.
     */
    public final TableField<Record, String> CLIENT_HOSTNAME = createField(DSL.name("client_hostname"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.client_port</code>.
     */
    public final TableField<Record, Integer> CLIENT_PORT = createField(DSL.name("client_port"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_start</code>.
     */
    public final TableField<Record, OffsetDateTime> BACKEND_START = createField(DSL.name("backend_start"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.backend_xmin</code>.
     */
    public final TableField<Record, Long> BACKEND_XMIN = createField(DSL.name("backend_xmin"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.state</code>.
     */
    public final TableField<Record, String> STATE = createField(DSL.name("state"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> SENT_LSN = createField(DSL.name("sent_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> WRITE_LSN = createField(DSL.name("write_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> FLUSH_LSN = createField(DSL.name("flush_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> REPLAY_LSN = createField(DSL.name("replay_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.write_lag</code>.
     */
    public final TableField<Record, YearToSecond> WRITE_LAG = createField(DSL.name("write_lag"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.flush_lag</code>.
     */
    public final TableField<Record, YearToSecond> FLUSH_LAG = createField(DSL.name("flush_lag"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.replay_lag</code>.
     */
    public final TableField<Record, YearToSecond> REPLAY_LAG = createField(DSL.name("replay_lag"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_priority</code>.
     */
    public final TableField<Record, Integer> SYNC_PRIORITY = createField(DSL.name("sync_priority"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.sync_state</code>.
     */
    public final TableField<Record, String> SYNC_STATE = createField(DSL.name("sync_state"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_replication.reply_time</code>.
     */
    public final TableField<Record, OffsetDateTime> REPLY_TIME = createField(DSL.name("reply_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatReplication(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgStatReplication(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_replication" as  SELECT s.pid,
         s.usesysid,
         u.rolname AS usename,
         s.application_name,
         s.client_addr,
         s.client_hostname,
         s.client_port,
         s.backend_start,
         s.backend_xmin,
         w.state,
         w.sent_lsn,
         w.write_lsn,
         w.flush_lsn,
         w.replay_lsn,
         w.write_lag,
         w.flush_lag,
         w.replay_lag,
         w.sync_priority,
         w.sync_state,
         w.reply_time
        FROM ((pg_stat_get_activity(NULL::integer) s(datid, pid, usesysid, application_name, state, query, wait_event_type, wait_event, xact_start, query_start, backend_start, state_change, client_addr, client_hostname, client_port, backend_xid, backend_xmin, backend_type, ssl, sslversion, sslcipher, sslbits, ssl_client_dn, ssl_client_serial, ssl_issuer_dn, gss_auth, gss_princ, gss_enc, gss_delegation, leader_pid, query_id)
          JOIN pg_stat_get_wal_senders() w(pid, state, sent_lsn, write_lsn, flush_lsn, replay_lsn, write_lag, flush_lag, replay_lag, sync_priority, sync_state, reply_time) ON ((s.pid = w.pid)))
          LEFT JOIN pg_authid u ON ((s.usesysid = u.oid)));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication</code> table
     * reference
     */
    public PgStatReplication(String alias) {
        this(DSL.name(alias), PG_STAT_REPLICATION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_replication</code> table
     * reference
     */
    public PgStatReplication(Name alias) {
        this(alias, PG_STAT_REPLICATION);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_replication</code> table reference
     */
    public PgStatReplication() {
        this(DSL.name("pg_stat_replication"), null);
    }

    public <O extends Record> PgStatReplication(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_STAT_REPLICATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatReplication as(String alias) {
        return new PgStatReplication(DSL.name(alias), this);
    }

    @Override
    public PgStatReplication as(Name alias) {
        return new PgStatReplication(alias, this);
    }

    @Override
    public PgStatReplication as(Table<?> alias) {
        return new PgStatReplication(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatReplication rename(String name) {
        return new PgStatReplication(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatReplication rename(Name name) {
        return new PgStatReplication(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatReplication rename(Table<?> name) {
        return new PgStatReplication(name.getQualifiedName(), null);
    }
}
