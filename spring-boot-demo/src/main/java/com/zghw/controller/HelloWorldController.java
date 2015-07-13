package com.zghw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zghw.config.ProductPushConfig;
import com.zghw.config.PushConfig;
import com.zghw.domain.PushManageIos;
import com.zghw.service.PushService;

@RestController
public class HelloWorldController {
	@Autowired
	private PushService service;

	@RequestMapping("/")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/sp")
	public String sp() {
		ProductPushConfig config = service.systemConfig();
		PushConfig sp = config.getSpConfig();
		return sp.getMessage() + " : " + sp.getMaxCount() + " : "
				+ sp.getIsEnv();
	}

	@RequestMapping("/al")
	public String abc() {
		ProductPushConfig config = service.systemConfig();
		PushConfig al = config.getAlConfig();
		return al.getMessage() + " : " + al.getMaxCount() + " : "
				+ al.getIsEnv();
	}

	@RequestMapping("/ios")
	public String pushManageIos() {
		String result = "";
		List<PushManageIos> list = service.getPushManageIos();
		for (PushManageIos info : list) {
			System.out.println("sdfdsf");
			result += info.getId() + "  ";
			result += info.getShowTime() + "  ";
			result += info.getPushType() + "  ";
		}
		return result;
	}
}
