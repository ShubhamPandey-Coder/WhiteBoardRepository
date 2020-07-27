package com.amdocs.mecbrowsertool.dao.impl;

import java.sql.Connection;

import org.springframework.stereotype.Repository;

import com.amdocs.mecbrowsertool.dao.DBQueriesDao;
import com.amdocs.mecbrowsertool.model.DBCredentials;



@Repository
public class DBQueriesDaoImpl implements DBQueriesDao {

	@Override
	public Connection getDbConnection(DBCredentials dbcredentials) {
		return null;
		//return getConnection(dbcredentials);
	}

	/*private Connection getConnection(DBCredentials dbcredentials) {
		try {
			String cString = null;
			cString = "jdbc:oracle:thin:" + dbcredentials.getDbuser() + "/" + dbcredentials.getDbpassword() + "@"
					+ dbcredentials.getDbserver() + ":" + dbcredentials.getDbportnum() + ":"
					+ dbcredentials.getDbinstance();
			DriverManager.registerDriver(new OracleDriver());
			// this.connection=DriverManager.getConnection(cString);
			return DriverManager.getConnection(cString);
		} catch (Exception e) {
              throw new DbConnectionException("EX_MT_1001","Eroor In  connection",null);
		}
	}*/
}
