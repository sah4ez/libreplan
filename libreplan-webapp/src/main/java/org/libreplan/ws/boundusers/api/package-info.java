/*
 * This file is part of LibrePlan
 *
 * Copyright (C) 2012 Igalia, S.L.
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

/**
 * Specification of namespace for REST-based services.
 *
 * @author Manuel Rego Casasnovas <rego@igalia.com>
 */
@jakarta.xml.bind.annotation.XmlSchema(
        elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED,
        namespace = WSCommonGlobalNames.REST_NAMESPACE)

package org.libreplan.ws.boundusers.api;

import org.libreplan.ws.common.api.WSCommonGlobalNames;
