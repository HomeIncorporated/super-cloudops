/*
 * Copyright 2017 ~ 2025 the original author or authors. <wanglsir@gmail.com, 983708408@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wl4g.devops.tool.common.codec;

import static java.lang.System.out;

import java.util.UUID;

import static com.wl4g.devops.tool.common.codec.CheckSums.*;
import com.wl4g.devops.tool.common.lang.TypeConverts;

public class ChechSumsTests {

	public static void main(String[] args) {
		// out.println(TypeConverts.safeLongToInt(crc32String(UUID.randomUUID().toString())));
		out.println(Math.abs((int) crc32String(UUID.randomUUID().toString())));
		out.println(TypeConverts.safeLongToInt(crc16String(UUID.randomUUID().toString())));
	}

}
