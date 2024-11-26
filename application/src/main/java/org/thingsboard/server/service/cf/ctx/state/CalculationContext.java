/**
 * Copyright © 2016-2024 The Thingsboard Authors
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
package org.thingsboard.server.service.cf.ctx.state;

import lombok.Builder;
import lombok.Data;
import org.thingsboard.script.api.tbel.TbelInvokeService;
import org.thingsboard.server.common.data.cf.configuration.Argument;
import org.thingsboard.server.common.data.cf.configuration.CalculatedFieldConfiguration;
import org.thingsboard.server.common.data.cf.configuration.Output;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.kv.KvEntry;

import java.util.Map;

@Data
@Builder
public class CalculationContext {

    private TenantId tenantId;
    private Map<String, Argument> arguments;
    private Output output;
    private String expression;
    private TbelInvokeService tbelInvokeService;

}
