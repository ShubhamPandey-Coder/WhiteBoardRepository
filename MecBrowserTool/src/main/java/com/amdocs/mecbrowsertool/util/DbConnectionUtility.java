package com.amdocs.mecbrowsertool.util;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.amdocs.mecbrowsertool.model.DBCredentials;

@Component
public class DbConnectionUtility {
	public HttpSession getSession(HttpServletRequest request) {
		HttpSession session = (HttpSession) request.getSession();
		return session;
	}
	
	public Connection getConnectionfromSession(HttpSession session ,DBCredentials objDBCredentials){
		return (Connection)session.getAttribute(objDBCredentials.toString());
	}
}
