package com.zghw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zghw.config.ProductPushConfig;

@Component
public class PushService {
	@Autowired
	private ProductPushConfig config;

	public ProductPushConfig systemConfig() {
		return config;
	}
}
