package com.zghw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.zghw.config.ProductPushConfig;
import com.zghw.config.PushConfig;
import com.zghw.service.PushService;

@Component
public class CommandLine implements CommandLineRunner {

	@Autowired
	private PushService service;

	public void run(String... arg0) throws Exception {
		ProductPushConfig config = service.systemConfig();
		PushConfig sp=config.getSpConfig();
		PushConfig al=config.getAlConfig();
		System.out.println(sp.getMessage()+" : "+sp.getMaxCount()+" : "+sp.getIsEnv());
		System.out.println(al.getMessage()+" : "+al.getMaxCount()+" : "+al.getIsEnv());
	}

}
