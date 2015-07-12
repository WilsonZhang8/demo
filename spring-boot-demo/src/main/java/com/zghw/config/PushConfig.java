package com.zghw.config;

import java.io.Serializable;

public class PushConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private int maxCount;
	private boolean isEnv;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public boolean getIsEnv() {
		return isEnv;
	}

	public void setIsEnv(boolean isEnv) {
		this.isEnv = isEnv;
	}

}
