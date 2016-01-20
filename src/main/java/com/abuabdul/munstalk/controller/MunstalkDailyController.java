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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abuabdul.munstalk.service.MunstalkService;

/**
 * @author abuabdul
 *
 */
@Controller
public class MunstalkDailyController {

	private static final Logger log = LogManager.getLogger(MunstalkDailyController.class.getName());

	private MunstalkService munstalkService;

	@RequestMapping(value = "/muns/munstalkDaily.go")
	public String munstalkChat(ModelMap model) {
		log.debug("Entering munstalkChat() in " + this.getClass().getName());
		// try {
		model.addAttribute("munstalkChatWindow", new Object());
		return "munstalkChat";
		/*
		 * } catch (MunstalkServiceException mse) { log.debug(
		 * "MunstalkServiceException - " + mse.getMessage()); throw new
		 * MunstalkException(mse.getMessage()); }
		 */
	}

}
