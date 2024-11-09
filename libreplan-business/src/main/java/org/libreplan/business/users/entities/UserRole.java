/*
 * This file is part of LibrePlan
 *
 * Copyright (C) 2009-2010 Fundación para o Fomento da Calidade Industrial e
 *                         Desenvolvemento Tecnolóxico de Galicia
 * Copyright (C) 2010-2012 Igalia, S.L.
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

package org.libreplan.business.users.entities;

import static org.libreplan.business.i18n.I18nHelper.helperi18n;

/**
 * Available user roles.
 *
 * @author Fernando Bellas Permuy <fbellas@udc.es>
 * @author Manuel Rego Casasnovas <rego@igalia.com>
 * @author Vova Perebykivskyi <vova@libreplan-enterprise.com>
 */
public enum UserRole {

    // Access to all pages
    ROLE_SUPERUSER(helperi18n("Superuser")),

    // Web services roles
    ROLE_WS_READER(helperi18n("Web service reader")),
    ROLE_WS_WRITER(helperi18n("Web service writer")),
    ROLE_WS_SUBCONTRACTING(helperi18n("Web service subcontractor operations")),

    // Project operations roles
    ROLE_READ_ALL_PROJECTS(helperi18n("Read all projects")),
    ROLE_EDIT_ALL_PROJECTS(helperi18n("Edit all projects")),
    ROLE_CREATE_PROJECTS(helperi18n("Create projects")),

    // Special role for bound users
    ROLE_BOUND_USER(helperi18n("Bound user")),

    // Page roles
    ROLE_PLANNING(helperi18n("Planning")),
    ROLE_TEMPLATES(helperi18n("Templates")),
    ROLE_IMPORT_PROJECTS(helperi18n("Import projects")),
    ROLE_WORKERS(helperi18n("Workers")),
    ROLE_MACHINES(helperi18n("Machines")),
    ROLE_VIRTUAL_WORKERS(helperi18n("Virtual Workers")),
    ROLE_CALENDARS(helperi18n("Calendars")),
    ROLE_CALENDAR_EXCEPTION_DAYS(helperi18n("Calendar Exception Days")),
    ROLE_CRITERIA(helperi18n("Criteria")),
    ROLE_PROGRESS_TYPES(helperi18n("Progress Types")),
    ROLE_LABELS(helperi18n("Labels")),
    ROLE_MATERIALS(helperi18n("Materials")),
    ROLE_MATERIAL_UNITS(helperi18n("Material Units")),
    ROLE_QUALITY_FORMS(helperi18n("Quality Forms")),
    ROLE_TIMESHEETS(helperi18n("Timesheets")),
    ROLE_TIMESHEETS_TEMPLATES(helperi18n("Timesheets Templates")),
    ROLE_EXPENSES(helperi18n("Expenses")),
    ROLE_COST_CATEGORIES(helperi18n("Cost Categories")),
    ROLE_HOURS_TYPES(helperi18n("Hours Types")),
    ROLE_MAIN_SETTINGS(helperi18n("Main Settings")),
    ROLE_USER_ACCOUNTS(helperi18n("User Accounts")),
    ROLE_PROFILES(helperi18n("Profiles")),
    ROLE_JOB_SCHEDULING(helperi18n("Job Scheduling")),
    ROLE_COMPANIES(helperi18n("Companies")),
    ROLE_SEND_TO_SUBCONTRACTORS(helperi18n("Send To Subcontractors")),
    ROLE_RECEIVED_FROM_SUBCONTRACTORS(helperi18n("Received From Subcontractors")),
    ROLE_SEND_TO_CUSTOMERS(helperi18n("Send To Customers")),
    ROLE_RECEIVED_FROM_CUSTOMERS(helperi18n("Received From Customers")),
    ROLE_TIMESHEET_LINES_LIST(helperi18n("Timesheet Lines List")),
    ROLE_HOURS_WORKED_PER_RESOURCE_REPORT(helperi18n("Hours Worked Per Resource Report")),
    ROLE_TOTAL_WORKED_HOURS_BY_RESOURCE_IN_A_MONTH_REPORT(helperi18n("Total Worked Hours By Resource In A Month Report")),
    ROLE_WORK_AND_PROGRESS_PER_PROJECT_REPORT(helperi18n("Work And Progress Per Project Report")),
    ROLE_WORK_AND_PROGRESS_PER_TASK_REPORT(helperi18n("Work And Progress Per Task Report")),
    ROLE_ESTIMATED_PLANNED_HOURS_PER_TASK_REPORT(helperi18n("Estimated/Planned Hours Per Task Report")),
    ROLE_PROJECT_COSTS_REPORT(helperi18n("Project Costs Report")),
    ROLE_TASK_SCHEDULING_STATUS_IN_PROJECT_REPORT(helperi18n("Task Scheduling Status In Project Report")),
    ROLE_MATERIALS_NEED_AT_DATE_REPORT(helperi18n("Materials Needed At Date Report")),
    ROLE_PROJECT_STATUS_REPORT(helperi18n("Project Status Report")),

    ROLE_EDIT_EMAIL_TEMPLATES(helperi18n("Edit E-mail Templates")),
    ROLE_USE_FILES(helperi18n("Use files for order")),

    ROLE_EMAIL_TASK_ASSIGNED_TO_RESOURCE(helperi18n("Email: task assigned to resource")),
    ROLE_EMAIL_RESOURCE_REMOVED_FROM_TASK(helperi18n("Email: resource removed from task")),
    ROLE_EMAIL_MILESTONE_REACHED(helperi18n("Email: milestone reached")),
    ROLE_EMAIL_TASK_SHOULD_FINISH(helperi18n("Email: task should finish")),
    ROLE_EMAIL_TASK_SHOULD_START(helperi18n("Email: task should start")),
    ROLE_EMAIL_TIMESHEET_DATA_MISSING(helperi18n("Email: timesheet data missing"));

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
