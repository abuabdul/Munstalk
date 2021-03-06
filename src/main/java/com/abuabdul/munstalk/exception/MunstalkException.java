/*
 * Copyright 2013-2016 abuabdul.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.abuabdul.munstalk.exception;

/**
 * An Application level exception, captures exception message and confine it as
 * RuntimeException so application can handle the exception message delicately
 * using exception resolvers
 * 
 * @author abuabdul
 *
 */
public class MunstalkException extends RuntimeException {

	/**
	 * Default Serial ID
	 */
	private static final long serialVersionUID = 434324L;

	public MunstalkException() {

	}

	public MunstalkException(String message) {
		super(message);
	}

	public MunstalkException(Throwable cause) {
		super(cause);
	}

	public MunstalkException(String message, Throwable cause) {
		super(message, cause);
	}

	public MunstalkException(String message, Error error) {
		super(message, error);
	}
}
