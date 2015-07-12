package com.zghw.config;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "push")
public class ProductPushConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	private PushConfig spConfig;
	private PushConfig alConfig;

	public PushConfig getSpConfig() {
		return spConfig;
	}

	public void setSpConfig(PushConfig spConfig) {
		this.spConfig = spConfig;
	}

	public PushConfig getAlConfig() {
		return alConfig;
	}

	public void setAlConfig(PushConfig alConfig) {
		this.alConfig = alConfig;
	}

}
