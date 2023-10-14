/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPromote extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_promote.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.pg_promote.wait</code>.
     */
    public static final Parameter<Boolean> WAIT = Internal.createParameter("wait", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), true, false);

    /**
     * The parameter <code>pg_catalog.pg_promote.wait_seconds</code>.
     */
    public static final Parameter<Integer> WAIT_SECONDS = Internal.createParameter("wait_seconds", SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("60"), SQLDataType.INTEGER)), true, false);

    /**
     * Create a new routine call instance
     */
    public PgPromote() {
        super("pg_promote", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(WAIT);
        addInParameter(WAIT_SECONDS);
    }

    /**
     * Set the <code>wait</code> parameter IN value to the routine
     */
    public void setWait(Boolean value) {
        setValue(WAIT, value);
    }

    /**
     * Set the <code>wait</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setWait(Field<Boolean> field) {
        setField(WAIT, field);
    }

    /**
     * Set the <code>wait_seconds</code> parameter IN value to the routine
     */
    public void setWaitSeconds(Integer value) {
        setValue(WAIT_SECONDS, value);
    }

    /**
     * Set the <code>wait_seconds</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setWaitSeconds(Field<Integer> field) {
        setField(WAIT_SECONDS, field);
    }
}
