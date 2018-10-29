package com.sunny.common.response;

import java.util.List;

public class APIResponse {

	private String status;
	private List<String> message;
	private Object content;

	public APIResponse(){}

	public APIResponse(String status, List<String> message, Object content) {
		this.status = status;
		this.message = message;
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getMessage() {
		return message;
	}

	public void setMessage(List<String> message) {
		this.message = message;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
