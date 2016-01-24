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
package com.abuabdul.munstalk.document.model;

/**
 * @author abuabdul
 *
 */
public class MunstalkGlobalAvatar {

	private boolean munsRepresentation;
	private boolean abuRepresentation;

	public MunstalkGlobalAvatar() {
	}

	/**
	 * @return the munsRepresentation
	 */
	public boolean isMunsRepresentation() {
		return munsRepresentation;
	}

	/**
	 * @param munsRepresentation
	 *            the munsRepresentation to set
	 */
	public void setMunsRepresentation(boolean munsRepresentation) {
		this.munsRepresentation = munsRepresentation;
	}

	/**
	 * @return the abuRepresentation
	 */
	public boolean isAbuRepresentation() {
		return abuRepresentation;
	}

	/**
	 * @param abuRepresentation
	 *            the abuRepresentation to set
	 */
	public void setAbuRepresentation(boolean abuRepresentation) {
		this.abuRepresentation = abuRepresentation;
	}

}
