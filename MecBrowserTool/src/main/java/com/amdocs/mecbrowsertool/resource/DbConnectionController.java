package com.amdocs.mecbrowsertool.resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.mecbrowsertool.model.DBCredentials;
import com.amdocs.mecbrowsertool.model.Response;
import com.amdocs.mecbrowsertool.service.DbConnectionService;

@RestController
public class DbConnectionController {
	@Autowired
	DbConnectionService dbConnectionService;
	@PostMapping("/makeConnection")
	public Response makeDbConnection(@RequestBody DBCredentials objDBCredentials,@RequestHeader HttpHeaders header)
	{
		return null;
	}
	
	@GetMapping("/getconnection")
	public Response getDbConnection(@RequestBody DBCredentials objDBCredentials,HttpServletRequest request){
		return dbConnectionService.getDbConnection(objDBCredentials,request);
	}
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}

}
