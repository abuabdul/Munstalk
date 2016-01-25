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

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abuabdul.munstalk.document.model.MunstalkGlobalAvatar;
import com.abuabdul.munstalk.service.MunstalkService;

/**
 * @author abuabdul
 *
 */
@Controller
public class MunstalkDailyController {

	private static final Logger log = LogManager.getLogger(MunstalkDailyController.class.getName());

	@Autowired
	private MunstalkService munstalkService;

	@RequestMapping(value = "/muns/avatars.go")
	public String munstalkAvatars(ModelMap model) {
		log.debug("Entering munstalkAvatars() in " + this.getClass().getName());
		List<MunstalkGlobalAvatar> globalAvatars = munstalkService.fetchGlobalAvatar();
		if (!globalAvatars.isEmpty()) {
			MunstalkGlobalAvatar avatar = globalAvatars.get(0);
			if (StringUtils.isNotEmpty(avatar.getAbuRepresentation())
					&& StringUtils.isNotEmpty(avatar.getMunsRepresentation())) {
				return "munstalkChat";
			}
			if (StringUtils.isNotEmpty(avatar.getAbuRepresentation())
					|| StringUtils.isNotEmpty(avatar.getMunsRepresentation())) {
				model.addAttribute("munstalkAvatar", new MunstalkGlobalAvatar());
				return "munstalkAvatar";
			}
		}
		model.addAttribute("munstalkAvatar", new MunstalkGlobalAvatar());
		return "munstalkAvatar";
	}

	@RequestMapping(value = "/muns/incarnate/avatar.go", method = RequestMethod.POST)
	public String munstalkSelectAvatar(@ModelAttribute("munstalkAvatar") MunstalkGlobalAvatar avatar) {
		log.debug("Entering munstalkSelectAvatar() in " + this.getClass().getName());
		munstalkService.enrollGlobalAvatar(avatar);
		return "redirect:/muns/munstalkDaily.go";
	}

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
