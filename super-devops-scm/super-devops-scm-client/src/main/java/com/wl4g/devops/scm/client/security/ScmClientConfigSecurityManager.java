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
package com.wl4g.devops.scm.client.security;

import com.wl4g.devops.scm.session.ConfigSecurityManagerSupport;
import com.wl4g.devops.tool.common.crypto.asymmetric.AsymmetricCryptor;
import com.wl4g.devops.tool.common.crypto.asymmetric.spec.KeyPairSpec;
import com.wl4g.devops.tool.common.crypto.symmetric.AES128ECBPKCS5;

/**
 * {@link ScmClientConfigSecurityManager}
 *
 * @author Wangl.sir <wanglsir@gmail.com, 983708408@qq.com>
 * @version v1.0 2020年5月26日
 * @since
 */
public class ScmClientConfigSecurityManager extends ConfigSecurityManagerSupport {

	protected ScmClientConfigSecurityManager(AsymmetricCryptor asymmeCryptor, AES128ECBPKCS5 alg) {
		super(asymmeCryptor, alg);
	}

	protected String generateClientSecretKey() {
		KeyPairSpec keyPairSpec = asymmeCryptor.generateKeyPair();
		return keyPairSpec.getHexString();
	}

}
