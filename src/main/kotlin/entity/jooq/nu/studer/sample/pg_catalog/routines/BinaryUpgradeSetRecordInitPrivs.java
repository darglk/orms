/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BinaryUpgradeSetRecordInitPrivs extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.binary_upgrade_set_record_init_privs._1</code>.
     */
    public static final Parameter<Boolean> _1 = Internal.createParameter("_1", SQLDataType.BOOLEAN, false, true);

    /**
     * Create a new routine call instance
     */
    public BinaryUpgradeSetRecordInitPrivs() {
        super("binary_upgrade_set_record_init_privs", PgCatalog.PG_CATALOG);

        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Boolean value) {
        setValue(_1, value);
    }
}
