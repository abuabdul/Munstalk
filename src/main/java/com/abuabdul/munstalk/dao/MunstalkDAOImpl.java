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
package com.abuabdul.munstalk.dao;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.abuabdul.munstalk.document.model.MunstalkGlobalAvatar;

/**
 * @author abuabdul
 *
 */
public class MunstalkDAOImpl implements MunstalkDAO {

	private MongoTemplate mongoTemplate;

	public MunstalkDAOImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public List<MunstalkGlobalAvatar> findGlobalAvatar() {
		return mongoTemplate.findAll(MunstalkGlobalAvatar.class);
	}

	@Override
	public void saveGlobalAvatar(MunstalkGlobalAvatar avatar) {
		mongoTemplate.save(avatar);
	}

}
