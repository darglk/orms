/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatForceNextFlush extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a new routine call instance
     */
    public PgStatForceNextFlush() {
        super("pg_stat_force_next_flush", PgCatalog.PG_CATALOG);
    }
}
