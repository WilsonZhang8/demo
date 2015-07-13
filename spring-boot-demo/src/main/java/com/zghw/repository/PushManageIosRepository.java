package com.zghw.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.zghw.domain.PushManageIos;

public interface PushManageIosRepository extends
		Repository<PushManageIos, Long> {
	List<PushManageIos> findByProductNum(Long productNum);
}
