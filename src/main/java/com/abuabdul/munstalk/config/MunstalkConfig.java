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
package com.abuabdul.munstalk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.abuabdul.munstalk.dao.MunstalkDAO;
import com.abuabdul.munstalk.dao.MunstalkDAOImpl;
import com.abuabdul.munstalk.service.MunstalkService;
import com.abuabdul.munstalk.service.MunstalkServiceImpl;

/**
 * @author abuabdul
 *
 */
@Configuration
public class MunstalkConfig {

	private static final String APPCONFIG_FILE_NAME = "Appconfig.properties";

	@Autowired
	private MongoTemplate mongoTemplate;

	@Bean
	public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
		PropertyPlaceholderConfigurer propertyConfigurer = new PropertyPlaceholderConfigurer();
		propertyConfigurer.setLocation(new ClassPathResource(APPCONFIG_FILE_NAME));
		propertyConfigurer.setIgnoreResourceNotFound(false);
		propertyConfigurer.setIgnoreUnresolvablePlaceholders(true);
		propertyConfigurer.setSearchSystemEnvironment(true);
		propertyConfigurer.setSystemPropertiesMode(PropertyPlaceholderConfigurer.SYSTEM_PROPERTIES_MODE_OVERRIDE);
		return propertyConfigurer;
	}

	@Bean
	public MunstalkDAO munstalkDAO() {
		return new MunstalkDAOImpl(mongoTemplate);
	}

	@Bean
	public MunstalkService munstalkService() {
		return new MunstalkServiceImpl(munstalkDAO());
	}
}
