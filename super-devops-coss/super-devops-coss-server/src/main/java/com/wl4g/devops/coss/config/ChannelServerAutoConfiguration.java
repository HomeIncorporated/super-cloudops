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
package com.wl4g.devops.coss.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wl4g.devops.coss.startup.ChannelCossServer;
import com.wl4g.devops.coss.startup.CossServerBootsstrap;
import com.wl4g.devops.coss.startup.NettyChannelCossServer;

/**
 * {@link ChannelServerAutoConfiguration}
 *
 * @author Wangl.sir <wanglsir@gmail.com, 983708408@qq.com>
 * @version v1.0 2020年6月17日
 * @since
 */
@Configuration
public class ChannelServerAutoConfiguration {

	@Bean
	public ChannelServerProperties channelServerProperties() {
		return new ChannelServerProperties();
	}

	@Bean
	public ChannelCossServer nettyChannelCossServer(ChannelServerProperties config) {
		return new NettyChannelCossServer(config);
	}

	@Bean
	public CossServerBootsstrap cossServerBootsstrap(ChannelServerProperties config, List<ChannelCossServer> servers) {
		return new CossServerBootsstrap(config, servers);
	}

}
