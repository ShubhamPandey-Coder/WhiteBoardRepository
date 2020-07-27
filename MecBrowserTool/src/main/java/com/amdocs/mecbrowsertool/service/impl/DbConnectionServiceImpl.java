package com.amdocs.mecbrowsertool.service.impl;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.mecbrowsertool.dao.DBQueriesDao;
import com.amdocs.mecbrowsertool.exception.DbConnectionException;
import com.amdocs.mecbrowsertool.model.DBCredentials;
import com.amdocs.mecbrowsertool.model.Response;
import com.amdocs.mecbrowsertool.service.DbConnectionService;
import com.amdocs.mecbrowsertool.util.ConfigUtility;
import com.amdocs.mecbrowsertool.util.DbConnectionUtility;

@Service
public class DbConnectionServiceImpl implements DbConnectionService {

	@Autowired
	DBQueriesDao DBQueriesDao;

	@Autowired
	DbConnectionUtility dbConnectionUtility;
	@Autowired
	ConfigUtility properties;

	@Override
	public Response getDbConnection(DBCredentials objDBCredentials, HttpServletRequest request) {
		try {
			HttpSession session = dbConnectionUtility.getSession(request);
			Connection conn = null;
			String userid = objDBCredentials.getDbuser();
			conn = dbConnectionUtility.getConnectionfromSession(session, objDBCredentials);
			if (conn == null) {
				conn = DBQueriesDao.getDbConnection(objDBCredentials);
				session.putValue(objDBCredentials.toString(), conn);
				return new Response("SU_MT_1001", properties.getProperty("SU_MT_1001"), "S", conn);
			} else {
				return new Response("SU_MT_1001", properties.getProperty("SU_MT_1001"), "S", conn);
			}
		} catch (DbConnectionException e) {
			return new Response(e.getStatusCode(), e.getDescription(), "E", e.getCause());
		} catch (Exception e) {
			return new Response("EX_MT_1002", properties.getProperty("EX_MT_1002"), "E", e.getCause());
		}
	}

}
