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

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author abuabdul
 *
 */
@Document(collection = MunstalkGlobalAvatar.GLOBAL_AVATAR)
public class MunstalkGlobalAvatar {

	public static final String GLOBAL_AVATAR = "GlobalAvatar";

	@Id
	private String id;

	private String munsRepresentation;
	private String abuRepresentation;

	public MunstalkGlobalAvatar() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the munsRepresentation
	 */
	public String getMunsRepresentation() {
		return munsRepresentation;
	}

	/**
	 * @param munsRepresentation
	 *            the munsRepresentation to set
	 */
	public void setMunsRepresentation(String munsRepresentation) {
		this.munsRepresentation = munsRepresentation;
	}

	/**
	 * @return the abuRepresentation
	 */
	public String getAbuRepresentation() {
		return abuRepresentation;
	}

	/**
	 * @param abuRepresentation
	 *            the abuRepresentation to set
	 */
	public void setAbuRepresentation(String abuRepresentation) {
		this.abuRepresentation = abuRepresentation;
	}
}
