package com.amdocs.mecbrowsertool.service;

import javax.servlet.http.HttpServletRequest;

import com.amdocs.mecbrowsertool.model.DBCredentials;
import com.amdocs.mecbrowsertool.model.Response;

public interface DbConnectionService {
	
	public Response getDbConnection(DBCredentials objDBCredentials, HttpServletRequest request);

}
