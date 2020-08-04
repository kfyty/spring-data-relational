/*
 * Copyright 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.r2dbc.connectionfactory.init;

import org.springframework.dao.DataAccessException;
import org.springframework.lang.Nullable;

/**
 * Root of the hierarchy of data access exceptions that are related to processing of SQL scripts.
 *
 * @author Mark Paluch
 * @deprecated since 1.2 in favor of Spring R2DBC. Use {@link org.springframework.r2dbc.connection.init.ScriptException}
 *             instead.
 */
@Deprecated
public abstract class ScriptException extends DataAccessException {

	/**
	 * Creates a new {@link ScriptException}.
	 *
	 * @param message the detail message.
	 */
	public ScriptException(String message) {
		super(message);
	}

	/**
	 * Creates a new {@link ScriptException}.
	 *
	 * @param message the detail message.
	 * @param cause the root cause.
	 */
	public ScriptException(String message, @Nullable Throwable cause) {
		super(message, cause);
	}
}
