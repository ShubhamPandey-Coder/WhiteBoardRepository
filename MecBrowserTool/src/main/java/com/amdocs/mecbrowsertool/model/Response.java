package com.amdocs.mecbrowsertool.model;

import org.springframework.stereotype.Component;

@Component
public class Response {
	
	String statusCode;
	String statusDesc;
	String statusType;
	Object details;

	public Response(String statusCode, String statusDesc, String statusType, Object details) {
		this.statusCode = statusCode;
		this.statusDesc = statusDesc;
		this.statusType = statusType;
		this.details = details;
	}
	public Response() {
		super();
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusType() {
		return statusType;
	}
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	public Object getDetails() {
		return details;
	}
	public void setDetails(Object details) {
		this.details = details;
	}

}
