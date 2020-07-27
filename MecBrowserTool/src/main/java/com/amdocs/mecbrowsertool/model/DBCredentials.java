package com.amdocs.mecbrowsertool.model;

import org.springframework.stereotype.Component;

@Component
public class DBCredentials {
	
	String dbuser;
	String dbpassword;
	String dbinstance;
	String dbserver;
	Integer dbportnum;
	
	public String getDbuser() {
		return dbuser;
	}
	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}
	public String getDbpassword() {
		return dbpassword;
	}
	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}
	public String getDbinstance() {
		return dbinstance;
	}
	public void setDbinstance(String dbinstance) {
		this.dbinstance = dbinstance;
	}
	public String getDbserver() {
		return dbserver;
	}
	public void setDbserver(String dbserver) {
		this.dbserver = dbserver;
	}
	public Integer getDbportnum() {
		return dbportnum;
	}
	public void setDbportnum(Integer dbportnum) {
		this.dbportnum = dbportnum;
	}
	@Override
	public String toString() {
		return "DBCredentials [dbuser=" + dbuser + ", dbpassword=" + dbpassword + ", dbinstance=" + dbinstance
				+ ", dbserver=" + dbserver + ", dbportnum=" + dbportnum + "]";
	}
}
