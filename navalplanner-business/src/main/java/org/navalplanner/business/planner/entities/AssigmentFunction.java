package org.navalplanner.business.planner.entities;

import org.navalplanner.business.common.BaseEntity;

/**
 *
 * @author Diego Pino García <dpino@igalia.com>
 *
 */
public class AssigmentFunction extends BaseEntity {

    public static AssigmentFunction create() {
        return (AssigmentFunction) create(new AssigmentFunction());
    }

    public AssigmentFunction() {

    }
}
