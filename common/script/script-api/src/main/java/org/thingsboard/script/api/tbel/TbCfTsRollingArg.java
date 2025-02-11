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
package org.thingsboard.script.api.tbel;

import lombok.Getter;

import java.util.List;

public class TbCfTsRollingArg implements TbCfArg {

    @Getter
    private final List<TbCfSingleValueArg> values;

    public TbCfTsRollingArg(List<TbCfSingleValueArg> values) {
        this.values = values;
    }

    @Override
    public long memorySize() {
        return values.size() * 8L; //TODO;
    }

    public double max() {
        double max = Double.MIN_VALUE;
        for (TbCfSingleValueArg arg : values) {
            double val = Double.valueOf(arg.getValue().toString());
            if (max < val) {
                max = val;
            }
        }
        return max;
    }

}
