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
public class JsonbSet extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.jsonb_set.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_set.jsonb_in</code>.
     */
    public static final Parameter<String> JSONB_IN = Internal.createParameter("jsonb_in", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_set.path</code>.
     */
    public static final Parameter<String[]> PATH = Internal.createParameter("path", SQLDataType.CLOB.array(), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_set.replacement</code>.
     */
    public static final Parameter<String> REPLACEMENT = Internal.createParameter("replacement", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_set.create_if_missing</code>.
     */
    public static final Parameter<Boolean> CREATE_IF_MISSING = Internal.createParameter("create_if_missing", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public JsonbSet() {
        super("jsonb_set", PgCatalog.PG_CATALOG, SQLDataType.VARCHAR);

        setReturnParameter(RETURN_VALUE);
        addInParameter(JSONB_IN);
        addInParameter(PATH);
        addInParameter(REPLACEMENT);
        addInParameter(CREATE_IF_MISSING);
    }

    /**
     * Set the <code>jsonb_in</code> parameter IN value to the routine
     */
    public void setJsonbIn(String value) {
        setValue(JSONB_IN, value);
    }

    /**
     * Set the <code>jsonb_in</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setJsonbIn(Field<String> field) {
        setField(JSONB_IN, field);
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    public void setPath(String[] value) {
        setValue(PATH, value);
    }

    /**
     * Set the <code>path</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setPath(Field<String[]> field) {
        setField(PATH, field);
    }

    /**
     * Set the <code>replacement</code> parameter IN value to the routine
     */
    public void setReplacement(String value) {
        setValue(REPLACEMENT, value);
    }

    /**
     * Set the <code>replacement</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setReplacement(Field<String> field) {
        setField(REPLACEMENT, field);
    }

    /**
     * Set the <code>create_if_missing</code> parameter IN value to the routine
     */
    public void setCreateIfMissing(Boolean value) {
        setValue(CREATE_IF_MISSING, value);
    }

    /**
     * Set the <code>create_if_missing</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public void setCreateIfMissing(Field<Boolean> field) {
        setField(CREATE_IF_MISSING, field);
    }
}
