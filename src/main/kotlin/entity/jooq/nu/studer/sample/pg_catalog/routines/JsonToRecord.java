/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Record;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonToRecord extends AbstractRoutine<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.json_to_record.RETURN_VALUE</code>.
     */
    public static final Parameter<Record> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.RECORD, false, false);

    /**
     * The parameter <code>pg_catalog.json_to_record._1</code>.
     */
    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.VARCHAR, false, true);

    /**
     * Create a new routine call instance
     */
    public JsonToRecord() {
        super("json_to_record", PgCatalog.PG_CATALOG, SQLDataType.RECORD);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<String> field) {
        setField(_1, field);
    }
}
