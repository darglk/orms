/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog.routines;


import java.time.OffsetDateTime;

import nu.studer.sample.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatFile1 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_stat_file.filename</code>.
     */
    public static final Parameter<String> FILENAME = Internal.createParameter("filename", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_file.size</code>.
     */
    public static final Parameter<Long> SIZE = Internal.createParameter("size", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_file.access</code>.
     */
    public static final Parameter<OffsetDateTime> ACCESS = Internal.createParameter("access", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_file.modification</code>.
     */
    public static final Parameter<OffsetDateTime> MODIFICATION = Internal.createParameter("modification", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_file.change</code>.
     */
    public static final Parameter<OffsetDateTime> CHANGE = Internal.createParameter("change", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_file.creation</code>.
     */
    public static final Parameter<OffsetDateTime> CREATION = Internal.createParameter("creation", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.pg_stat_file.isdir</code>.
     */
    public static final Parameter<Boolean> ISDIR = Internal.createParameter("isdir", SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public PgStatFile1() {
        super("pg_stat_file", PgCatalog.PG_CATALOG);

        addInParameter(FILENAME);
        addOutParameter(SIZE);
        addOutParameter(ACCESS);
        addOutParameter(MODIFICATION);
        addOutParameter(CHANGE);
        addOutParameter(CREATION);
        addOutParameter(ISDIR);
        setOverloaded(true);
    }

    /**
     * Set the <code>filename</code> parameter IN value to the routine
     */
    public void setFilename(String value) {
        setValue(FILENAME, value);
    }

    /**
     * Get the <code>size</code> parameter OUT value from the routine
     */
    public Long getSize() {
        return get(SIZE);
    }

    /**
     * Get the <code>access</code> parameter OUT value from the routine
     */
    public OffsetDateTime getAccess() {
        return get(ACCESS);
    }

    /**
     * Get the <code>modification</code> parameter OUT value from the routine
     */
    public OffsetDateTime getModification() {
        return get(MODIFICATION);
    }

    /**
     * Get the <code>change</code> parameter OUT value from the routine
     */
    public OffsetDateTime getChange() {
        return get(CHANGE);
    }

    /**
     * Get the <code>creation</code> parameter OUT value from the routine
     */
    public OffsetDateTime getCreation() {
        return get(CREATION);
    }

    /**
     * Get the <code>isdir</code> parameter OUT value from the routine
     */
    public Boolean getIsdir() {
        return get(ISDIR);
    }
}
