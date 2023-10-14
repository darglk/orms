/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.pg_catalog;


import nu.studer.sample.pg_catalog.tables.PgAuthMembers;
import nu.studer.sample.pg_catalog.tables.PgClass;
import nu.studer.sample.pg_catalog.tables.PgConstraint;
import nu.studer.sample.pg_catalog.tables.PgDepend;
import nu.studer.sample.pg_catalog.tables.PgIndex;
import nu.studer.sample.pg_catalog.tables.PgInherits;
import nu.studer.sample.pg_catalog.tables.PgPublicationRel;
import nu.studer.sample.pg_catalog.tables.PgShdepend;
import nu.studer.sample.pg_catalog.tables.PgStatisticExt;
import nu.studer.sample.pg_catalog.tables.PgTrigger;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in pg_catalog.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PG_AUTH_MEMBERS_GRANTOR_INDEX = Internal.createIndex(DSL.name("pg_auth_members_grantor_index"), PgAuthMembers.PG_AUTH_MEMBERS, new OrderField[] { PgAuthMembers.PG_AUTH_MEMBERS.GRANTOR }, false);
    public static final Index PG_CLASS_TBLSPC_RELFILENODE_INDEX = Internal.createIndex(DSL.name("pg_class_tblspc_relfilenode_index"), PgClass.PG_CLASS, new OrderField[] { PgClass.PG_CLASS.RELTABLESPACE, PgClass.PG_CLASS.RELFILENODE }, false);
    public static final Index PG_CONSTRAINT_CONNAME_NSP_INDEX = Internal.createIndex(DSL.name("pg_constraint_conname_nsp_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.CONNAME, PgConstraint.PG_CONSTRAINT.CONNAMESPACE }, false);
    public static final Index PG_CONSTRAINT_CONPARENTID_INDEX = Internal.createIndex(DSL.name("pg_constraint_conparentid_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.CONPARENTID }, false);
    public static final Index PG_CONSTRAINT_CONTYPID_INDEX = Internal.createIndex(DSL.name("pg_constraint_contypid_index"), PgConstraint.PG_CONSTRAINT, new OrderField[] { PgConstraint.PG_CONSTRAINT.CONTYPID }, false);
    public static final Index PG_DEPEND_DEPENDER_INDEX = Internal.createIndex(DSL.name("pg_depend_depender_index"), PgDepend.PG_DEPEND, new OrderField[] { PgDepend.PG_DEPEND.CLASSID, PgDepend.PG_DEPEND.OBJID, PgDepend.PG_DEPEND.OBJSUBID }, false);
    public static final Index PG_DEPEND_REFERENCE_INDEX = Internal.createIndex(DSL.name("pg_depend_reference_index"), PgDepend.PG_DEPEND, new OrderField[] { PgDepend.PG_DEPEND.REFCLASSID, PgDepend.PG_DEPEND.REFOBJID, PgDepend.PG_DEPEND.REFOBJSUBID }, false);
    public static final Index PG_INDEX_INDRELID_INDEX = Internal.createIndex(DSL.name("pg_index_indrelid_index"), PgIndex.PG_INDEX, new OrderField[] { PgIndex.PG_INDEX.INDRELID }, false);
    public static final Index PG_INHERITS_PARENT_INDEX = Internal.createIndex(DSL.name("pg_inherits_parent_index"), PgInherits.PG_INHERITS, new OrderField[] { PgInherits.PG_INHERITS.INHPARENT }, false);
    public static final Index PG_PUBLICATION_REL_PRPUBID_INDEX = Internal.createIndex(DSL.name("pg_publication_rel_prpubid_index"), PgPublicationRel.PG_PUBLICATION_REL, new OrderField[] { PgPublicationRel.PG_PUBLICATION_REL.PRPUBID }, false);
    public static final Index PG_SHDEPEND_DEPENDER_INDEX = Internal.createIndex(DSL.name("pg_shdepend_depender_index"), PgShdepend.PG_SHDEPEND, new OrderField[] { PgShdepend.PG_SHDEPEND.DBID, PgShdepend.PG_SHDEPEND.CLASSID, PgShdepend.PG_SHDEPEND.OBJID, PgShdepend.PG_SHDEPEND.OBJSUBID }, false);
    public static final Index PG_SHDEPEND_REFERENCE_INDEX = Internal.createIndex(DSL.name("pg_shdepend_reference_index"), PgShdepend.PG_SHDEPEND, new OrderField[] { PgShdepend.PG_SHDEPEND.REFCLASSID, PgShdepend.PG_SHDEPEND.REFOBJID }, false);
    public static final Index PG_STATISTIC_EXT_RELID_INDEX = Internal.createIndex(DSL.name("pg_statistic_ext_relid_index"), PgStatisticExt.PG_STATISTIC_EXT, new OrderField[] { PgStatisticExt.PG_STATISTIC_EXT.STXRELID }, false);
    public static final Index PG_TRIGGER_TGCONSTRAINT_INDEX = Internal.createIndex(DSL.name("pg_trigger_tgconstraint_index"), PgTrigger.PG_TRIGGER, new OrderField[] { PgTrigger.PG_TRIGGER.TGCONSTRAINT }, false);
}
