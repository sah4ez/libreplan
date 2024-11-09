/*
 * This file is part of LibrePlan
 *
 * Copyright (C) 2013 St. Antoniusziekenhuis
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

package org.libreplan.business.common.entities;

import static org.libreplan.business.i18n.I18nHelper.helperi18n;

/**
 * Simply class to keep constants of {@link ConnectorProperty properties} for LibrePlan {@link Connector connectors}.
 *
 * @author Miciele Ghiorghis <m.ghiorghis@antoniusziekenhuis.nl>
 * @author Manuel Rego Casasnovas <rego@igalia.com>
 * @author Vova Perebykivskyi <vova@libreplan-enterprise.com>
 */
public class PredefinedConnectorProperties {

    // Generic
    public static String ACTIVATED = helperi18n("Activated");
    public static String SERVER_URL = helperi18n("Server URL");
    public static String USERNAME = helperi18n("Username");
    public static String PASSWORD = helperi18n("Password");

    // Specific for Tim
    public static String TIM_NR_DAYS_TIMESHEET = helperi18n("Number of days timesheet to Tim");
    public static String TIM_NR_DAYS_ROSTER = helperi18n("Number of days roster from Tim");
    public static String TIM_PRODUCTIVITY_FACTOR = helperi18n("Productivity factor");
    public static String TIM_DEPARTAMENTS_IMPORT_ROSTER = helperi18n("Department IDs to import toster");

    // Specific for JIRA
    public static String JIRA_LABELS = helperi18n("JIRA labels: comma-separated list of labels or URL");
    public static String JIRA_HOURS_TYPE = helperi18n("Hours type");

    /**
     * Code prefix for different entities integrated with JIRA.
     */
    public static final String JIRA_CODE_PREFIX = "JIRA-";

    // Specific for E-mail
    public static String PROTOCOL = helperi18n("Protocol");
    public static String HOST = helperi18n("Host");
    public static String PORT = helperi18n("Port");
    public static String EMAIL_SENDER = helperi18n("From address (no reply)");
    public static String EMAIL_USERNAME = helperi18n("Username (optional)");
    public static String EMAIL_PASSWORD = helperi18n("Password (optional)");

}
