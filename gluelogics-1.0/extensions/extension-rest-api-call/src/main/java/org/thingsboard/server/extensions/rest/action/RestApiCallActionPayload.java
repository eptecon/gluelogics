/**
 * Copyright © 2016-2017 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.extensions.rest.action;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.thingsboard.server.common.msg.session.MsgType;

import java.io.Serializable;

@Data
@Builder
public class RestApiCallActionPayload implements Serializable {
    private final String actionPath;
    private final String msgBody;
    private final HttpMethod httpMethod;
    private final HttpStatus expectedResultCode;
    private final boolean sync;

    private final Integer requestId;
    private final MsgType msgType;
}