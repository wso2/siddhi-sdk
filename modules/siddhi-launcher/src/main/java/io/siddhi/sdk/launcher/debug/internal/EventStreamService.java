/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.siddhi.sdk.launcher.debug.internal;

import io.siddhi.core.event.Event;
import io.siddhi.query.api.definition.Attribute;
import io.siddhi.sdk.launcher.exception.ResourceNotFoundException;

import java.util.List;

/**
 * Interface which define apis for stream related operations.
 */
public interface EventStreamService {

    public List<String> getStreamNames(String siddhiAppName);

    public List<Attribute> getStreamAttributes(String siddhiAppName, String streamName) throws
            ResourceNotFoundException;

    public void pushEvent(String siddhiAppName, String streamName, Event event);
}
