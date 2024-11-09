/*
 * This file is part of LibrePlan
 *
 * Copyright (C) 2011 Igalia, S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.libreplan.web.common.components.finders;

import org.libreplan.business.planner.entities.TaskGroup;

/**
 * Different filters for {@link TaskGroup} in company view Gantt.
 *
 * @author Manuel Rego Casasnovas <rego@igalia.com>
 */
public enum TaskGroupFilterEnum implements IFilterEnum {

    Criterion(helperi18n("Criterion")), Label(helperi18n("Label")), ExternalCompany(helperi18n("Customer")), State(
            helperi18n("State")), Code(helperi18n("Code")), CustomerReference(
            helperi18n("Customer Reference")), Resource(helperi18n("Resource"));
    /**
     * Forces to mark the string as needing translation
     */
    private static String helperi18n(String string) {
        return string;
    }

    private String description;

    private TaskGroupFilterEnum(String description) {
        this.description = description;
    }

    public String toString() {
        return this.description;
    }

}
