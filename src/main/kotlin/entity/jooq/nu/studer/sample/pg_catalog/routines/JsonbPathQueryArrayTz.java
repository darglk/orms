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
public class JsonbPathQueryArrayTz extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.jsonb_path_query_array_tz.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_path_query_array_tz.target</code>.
     */
    public static final Parameter<String> TARGET = Internal.createParameter("target", SQLDataType.VARCHAR, false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> PATH = Internal.createParameter("path", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\""), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_path_query_array_tz.vars</code>.
     */
    public static final Parameter<String> VARS = Internal.createParameter("vars", SQLDataType.VARCHAR.defaultValue(DSL.field(DSL.raw("'{}'::jsonb"), SQLDataType.VARCHAR)), true, false);

    /**
     * The parameter <code>pg_catalog.jsonb_path_query_array_tz.silent</code>.
     */
    public static final Parameter<Boolean> SILENT = Internal.createParameter("silent", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public JsonbPathQueryArrayTz() {
        super("jsonb_path_query_array_tz", PgCatalog.PG_CATALOG, SQLDataType.VARCHAR);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TARGET);
        addInParameter(PATH);
        addInParameter(VARS);
        addInParameter(SILENT);
    }

    /**
     * Set the <code>target</code> parameter IN value to the routine
     */
    public void setTarget(String value) {
        setValue(TARGET, value);
    }

    /**
     * Set the <code>target</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTarget(Field<String> field) {
        setField(TARGET, field);
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    public void setPath(Object value) {
        setValue(PATH, value);
    }

    /**
     * Set the <code>path</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setPath(Field<Object> field) {
        setField(PATH, field);
    }

    /**
     * Set the <code>vars</code> parameter IN value to the routine
     */
    public void setVars(String value) {
        setValue(VARS, value);
    }

    /**
     * Set the <code>vars</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setVars(Field<String> field) {
        setField(VARS, field);
    }

    /**
     * Set the <code>silent</code> parameter IN value to the routine
     */
    public void setSilent(Boolean value) {
        setValue(SILENT, value);
    }

    /**
     * Set the <code>silent</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setSilent(Field<Boolean> field) {
        setField(SILENT, field);
    }
}
