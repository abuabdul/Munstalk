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
package com.abuabdul.munstalk.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author abuabdul
 *
 */
public class MunstalkDailyControllerTest {

	@InjectMocks
	private MunstalkDailyController munstalkDailyController;

	private MockMvc mockmvc;

	@BeforeMethod
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockmvc = standaloneSetup(munstalkDailyController).build();
	}

	@Test
	public void munstalkAvatars() throws Exception {
		mockmvc.perform(post("/muns/avatars.go")).andExpect(status().isOk())
				.andExpect(model().attributeExists("munstalkChatWindow")).andExpect(view().name("munstalkAvatar"));
	}

	@Test
	public void munstalkChat() throws Exception {
		mockmvc.perform(post("/muns/munstalkDaily.go")).andExpect(status().isOk())
				.andExpect(model().attributeExists("munstalkChatWindow")).andExpect(view().name("munstalkChat"));
	}

}
