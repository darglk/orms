/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSafeSnapshotBlockingPids extends AbstractRoutine<Integer[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_safe_snapshot_blocking_pids.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER.array(), false, false);

    /**
     * The parameter <code>pg_catalog.pg_safe_snapshot_blocking_pids._1</code>.
     */
    public static final Parameter<Integer> _1 = Internal.createParameter("_1", SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public PgSafeSnapshotBlockingPids() {
        super("pg_safe_snapshot_blocking_pids", PgCatalog.PG_CATALOG, SQLDataType.INTEGER.array());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Integer value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Integer> field) {
        setField(_1, field);
    }
}