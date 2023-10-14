/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import java.util.UUID;

import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenRandomUuid extends AbstractRoutine<UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.gen_random_uuid.RETURN_VALUE</code>.
     */
    public static final Parameter<UUID> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.UUID, false, false);

    /**
     * Create a new routine call instance
     */
    public GenRandomUuid() {
        super("gen_random_uuid", PgCatalog.PG_CATALOG, SQLDataType.UUID);

        setReturnParameter(RETURN_VALUE);
    }
}
