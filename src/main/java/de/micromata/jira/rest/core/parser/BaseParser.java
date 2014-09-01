/*
 * Copyright 2013 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.micromata.jira.rest.core.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.micromata.jira.rest.core.domain.BaseBean;
import de.micromata.jira.rest.core.util.JsonConstants;
import de.micromata.jira.rest.core.util.JsonElementUtil;
import de.micromata.jira.rest.core.util.URIParser;

import java.net.URI;

/**
 * @author Christian Schulze
 * @author Vitali Filippow
 */
public class BaseParser implements JsonConstants {

    public static void parseBaseProperties(BaseBean bean, JsonObject object) {

        JsonElement idElement = object.get(PROP_ID);
        if (JsonElementUtil.checkNotNull(idElement) == true) {
            long id = idElement.getAsLong();
            bean.setId(id);
        }
        JsonElement selfElement = object.get(PROP_SELF);
        if (JsonElementUtil.checkNotNull(selfElement) == true) {
            String self = selfElement.getAsString();
            URI uri = URIParser.parseStringToURI(self);
            bean.setSelf(uri);
        }
        JsonElement nameElement = object.get(PROP_NAME);
        if (JsonElementUtil.checkNotNull(nameElement) == true) {
            String name = nameElement.getAsString();
            bean.setName(name);
        }
    }
}