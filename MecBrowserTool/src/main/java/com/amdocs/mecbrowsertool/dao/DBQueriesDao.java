package com.amdocs.mecbrowsertool.dao;

import java.sql.Connection;

import org.springframework.stereotype.Repository;

import com.amdocs.mecbrowsertool.model.DBCredentials;
@Repository
public interface DBQueriesDao {

	public Connection getDbConnection(DBCredentials dbcredentials);
}
