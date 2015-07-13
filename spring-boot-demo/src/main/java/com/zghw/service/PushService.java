package com.zghw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zghw.config.ProductPushConfig;
import com.zghw.domain.PushManageIos;
import com.zghw.repository.PushManageIosRepository;

@Service
public class PushService {
	@Autowired
	private ProductPushConfig config;
	@Autowired
	private PushManageIosRepository dao;

	public ProductPushConfig systemConfig() {
		return config;
	}

	public List<PushManageIos> getPushManageIos() {
		return dao.findByProductNum(1L);
	}
}
