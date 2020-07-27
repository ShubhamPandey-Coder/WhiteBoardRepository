package com.amdocs.mecbrowsertool.exception;

import org.springframework.stereotype.Component;

@Component
public class DbConnectionException extends RuntimeException {
    private static final long serialVersionUID = 299540453117503122L;
    
    private String statusCode;
    private String description;
    private String details;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public DbConnectionException(String statusCode, String description, String details) {
		super();
		this.statusCode = statusCode;
		this.description = description;
		this.details = details;
	}
    
	public DbConnectionException(){
		super();
	}
}
